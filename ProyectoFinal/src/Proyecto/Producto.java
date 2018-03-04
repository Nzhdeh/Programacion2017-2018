/**Nombre de la clase: Producto
 * 
 * propiedades basicas: 
 * 					Nombre: tipo String,consultable, modificable
 * 					precio: tipo double,consultable,modificable
 * 					fechaVenta: tipo Fecha,consultable
 * 					cantidad: tipo String,consultable, modificable
 * 					peso: tipo double, consultable,modificable
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
 * public String getCantidad()
 * public void setCantidad(String cantidad)
 * 
 * public double getPeso()
 * public void setPeso()
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
	private int cantidad;
	private double peso;
	
	//constructores
	
	//por defecto
	public Producto() 
	{
		String nombre=" ";
		double precio=0;
		Fecha fechaVenta=null;
		int cantidad=0;
		double peso=0.0;
	}
	
	//sobrecargado
	public Producto(String nombre,double precio,Fecha fechaVenta,int cantidad,double peso)
	{
		this.nombre=nombre;
		this.precio=precio;
		this.fechaVenta=fechaVenta;
		this.cantidad=cantidad;
		this.peso=peso;
	}
	
	//de copia
	public Producto(Producto producto) 
	{
		this.nombre=producto.getNombre();
		this.precio=producto.getPrecio();
		this.fechaVenta=producto.fechaVenta;
		this.cantidad=producto.getCantidad();
		this.peso=producto.getPeso();
	}
	
	//getters y setters
	
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) throws ExcepcionProducto
	{
		this.nombre=nombre;
	}
	
	public double getPrecio() 
	{
		return precio;
	}
	
	public void setPrecio(double precio) throws ExcepcionProducto
	{
		if(precio>=0) 
		{
			this.precio=precio;
		}else 
		{
			throw new ExcepcionProducto("El precio no puede ser menor que cero");
		}
		
	}
	
	public Fecha getFechaVenta() 
	{
		fechaVenta.getDia();
		fechaVenta.getMes();
		fechaVenta.getAnio();
		
		return fechaVenta;
	}
	/*
	//Patron delegacion
	public int getFechaVentaDia() 
	{
		return fechaVenta.getDia();
	}

	public int getFechaVentatMes() 
	{
		return fechaVenta.getMes();
	}

	public int getFechaVentaAnio() 
	{
		return fechaVenta.getAnio();
	}
	//Fin Patron delegacion
	*/
	public int getCantidad() 
	{
		return cantidad;
	}

	public void setCantidad(int cantidad) throws ExcepcionProducto
	{
		if(cantidad<0) 
		{
			throw new ExcepcionProducto("La cantidad no puede ser negativo");
		}else 
		{
			this.cantidad=cantidad;
		}
	}
	
	public double getPeso() 
	{
		return peso;
	}
	public void setPeso(double peso) throws ExcepcionProducto 
	{
		if(peso<0) 
		{
			throw new ExcepcionProducto("El peso no puede menor que cero");
		}else 
		{
			this.peso=peso;
		}
	}
	
	
	//metodos heredados
	
	@Override
	public String toString() 
	{
		return (nombre+','+precio+" €"+','+fechaVenta+','+cantidad+','+peso+" kg");
	}
	
	@Override
	public int hashCode() 
	{
		return (int)(16152821*getPrecio()*getPeso()/1000);
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
	
	//los productos son iguales si el nombre,el precio y el peso de ellos son iguales
	@Override
	public boolean equals(Object o) 
	{
		boolean res=false;
		
		if(o!=null && o instanceof Producto) 
		{
			Producto producto=(Producto) o;
			
			if(this.getNombre()==producto.getNombre() && this.getPrecio()==producto.getPrecio()
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
		
		if((this.getPrecio()>p.getPrecio() && this.getNombre()!=p.getNombre()) ||
			this.getPrecio()>p.getPrecio() || this.getNombre()!=p.getNombre()) 
		{
			comparar=1;
		}
		else if(this.getPrecio()<p.getPrecio() && this.getNombre()!=p.getNombre()||
				this.getPrecio()<p.getPrecio() || this.getNombre()!=p.getNombre()) 
		{
			comparar=(-1);
		}
		
		return comparar;
	}
}
