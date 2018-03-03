/**Nombre de la clase: Producto
 * 
 * propiedades basicas: 
 * 					Nombre: tipo String,consultable, modificable
 * 					precio: tipo double,consultable,modificable
 * 					fechaVenta: tipo Fecha,consultable
 * 					descripcion: tipo String,consultable, modificable
 * 					peso: tipo double, consultable
 * 
 * Propiedades derivadas: No hay
 * 
 * INTERFAZ DE LA CLASE 
 * 
 * GETTERS Y SETTERS
 * 
 * public String getNombre()
 * public void setNombre(String nombre)
 * 
 * public double getPrecio()
 * public void setPrecio(double precio)
 * 
 * public Fecha getFechaVenta()
 * 
 * public String getDescripcion()
 * public void setDescripcion(String descripcion)
 * 
 * public double getPeso()
 * 
 * metodos añadidos: No hay
 * 
 * restricciones:No hay
 * 
 */
package Proyecto;

public class Producto implements Cloneable, Comparable <Producto>
{
	private String nombre;
	private double precio;
	private Fecha fechaVenta;
	private String descripcion;
	private double peso;
	
	//constructores
	
	//por defecto
	public Producto() 
	{
		String nombre=" ";
		double precio=0;
		Fecha fechaVenta=null;
		String descripcion=" ";
		double peso=0.0;
	}
	
	//sobrecargado
	public Producto(String nombre,double precio,Fecha fechaVenta,String descripcion,double peso) throws ExcepcionProducto 
	{
		if(precio<=0) 
		{
			throw new ExcepcionProducto("El precio no puede ser menor o igul que cero");
		}
		else if(peso<=0) 
		{
			throw new ExcepcionProducto("El peso no puede ser menor o igul que cero");
		}
		else 
		{
			this.nombre=nombre;
			this.precio=precio;
			this.fechaVenta=fechaVenta;
			this.descripcion=descripcion;
			this.peso=peso;
		}
	}
	
	//de copia
	public Producto(Producto producto) 
	{
		this.nombre=producto.getNombre();
		this.precio=producto.getPrecio();
		this.fechaVenta=producto.getFechaVenta();
		this.descripcion=producto.getDescripcion();
		this.peso=producto.getPeso();
	}
	
	//getters y setters
	
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre=nombre;
	}
	
	public double getPrecio() 
	{
		return precio;
	}
	
	public void setPrecio(double precio) 
	{
		this.precio=precio;
	}
	
	public Fecha getFechaVenta() 
	{
		return fechaVenta;
	}
	
	public String getDescripcion() 
	{
		return descripcion;
	}
	public void setDescripcion(String descripcion) 
	{
		this.descripcion=descripcion;
	}
	
	public double getPeso() 
	{
		return peso;
	}
	
	
	//metodos heredados
	
	@Override
	public String toString() 
	{
		return ("Nombre: "+nombre+'\n'+"Precio: "+precio+" €"+'\n'+"Fecha de Venta: "+fechaVenta+'\n'+
				"Descripcion: "+descripcion+'\n'+"Peso: "+peso+" kg");
	}
	
	@Override
	public int hashCode() 
	{
		return (int)(1000*getPrecio()*getPeso()/1000);
	}
	
	@Override
	public Producto clone() 
	{
		Producto clon=null;
		
		try 
		{
			clon=(Producto) super.clone();
		}
		catch(CloneNotSupportedException error) 
		{
			System.out.println("Error.No se puede clonar");
		}
		
		return clon;
	}
	
	//los productos son iguales si el nombre,el precio,la descripcion y el peso de ellos son iguales
	@Override
	public boolean equals(Object o) 
	{
		boolean res=false;
		
		if(o!=null && o instanceof Producto) 
		{
			Producto producto=(Producto) o;
			
			if(this.getNombre()==producto.getNombre() && this.getPrecio()==producto.getPrecio() && this.getDescripcion()==producto.getDescripcion()
					&& this.getPeso()==producto.getPeso()) 
			{
				res=true;
			}
		}
		return res;
	}
	
	//condicion de comparacion: nombre y precio
	@Override
	public int compareTo(Producto p) 
	{
		int comparar=0;
		
		if(this.getPrecio()>p.getPrecio() || this.getNombre()!=p.getNombre()) 
		{
			comparar=1;
		}
		else if(this.getPrecio()<p.getPrecio() || this.getNombre()!=p.getNombre()) 
		{
			comparar=(-1);
		}
		
		return comparar;
	}
}
