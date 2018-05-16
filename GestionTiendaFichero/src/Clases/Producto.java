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
 * metodos añadidos: 
 * 
 * 		LeerValidarObjetoProducto()
 * 
 * restricciones:No hay
 * 
 */
package Clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

import Excepciones.ExcepcionProducto;
import Interfaces.InterfProducto;

public class Producto implements InterfProducto, Cloneable, Comparable <Producto>,Serializable
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
		nombre=" ";
		precio=0;
		fechaVenta=null;
		cantidad=0;
		peso=0.0;
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
	@Override
	public String getNombre() 
	{
		return nombre;
	}
	@Override
	public void setNombre(String nombre) throws ExcepcionProducto
	{
		this.nombre=nombre;
	}
	
	public double getPrecio() 
	{
		return precio;
	}
	@Override
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
		return (nombre+','+precio+','+fechaVenta+','+cantidad+','+peso);
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
	
	/*
	//interfaz
	prototipo: public Producto LeerValidarObjetoProducto() 
	comentario:sirve para leer y validar el objeto trabajador
	precondiciones: no hay
	entradas:no hay
	salidas:objeto trabajador
	entr/sal:no hay
	postcondiciones:An devolvera el resultado
	*/
	/*
	//resguardo
	public Producto LeerValidarObjetoProducto() 
	{
		Producto producto=null
		System.out.println("En construccion");
		return producto;
	}*/
	
	@Override
	public Producto LeerValidarObjetoProducto() 
	{
		Scanner sc=new Scanner (System.in);
		boolean repetir=false;
		boolean fechaValida=false;
		Fecha fechaCompra=new Fecha();
		Producto producto=new Producto();
		
		//leer el nombre del producto
		sc.nextLine();//para limpiar el buffer
		System.out.println("--------------------------------------------------");
		System.out.println("Introduce el nombre del producto: ");
		try 
		{
			setNombre(sc.nextLine().toUpperCase());
		} catch (ExcepcionProducto e) 
		{
			System.out.println(e);
		}
		
		//leer y validar el precio del producto
		repetir=true;
		while(repetir) 
		{
			System.out.println("Introduce el precio: ");
			try 
			{
				try 
				{
					setPrecio(sc.nextDouble());
				} catch (ExcepcionProducto e) 
				{
					System.out.println(e);
				}
				repetir = false;
			}catch(InputMismatchException ioe) 
			{
				System.out.println(ioe+": Un numero real porfa");
				sc.nextLine();
			}
		}	
		//leer y validar la cantidad del producto
		repetir=true;
		while(repetir) 
		{
			System.out.println("Introduce la cantidad: ");
			try 
			{
				try 
				{
					setCantidad(sc.nextInt());
				} catch (ExcepcionProducto e) 
				{
					System.out.println(e);
				}
				repetir=false;
			}catch(InputMismatchException ioe) 
			{
				sc.nextLine();
				System.out.println(ioe+"Un numero porfa");
			}
		}
		
		//LeerValidarFecha
		do 
		{
			System.out.println("Introduce la fecha de adquisicion ");
			fechaCompra=fechaCompra.LeerValidarFecha();
			
			fechaValida=fechaCompra.ValidarFecha();
		}while(fechaValida!=true);								
		
		//leer y validar el peso del producto
		repetir=true;
		while(repetir) 
		{
			System.out.println("Introduce el peso: ");
			try 
			{
				try 
				{
					setPeso(sc.nextDouble());
				} catch (ExcepcionProducto e) 
				{
					System.out.println(e);
				}
				repetir=false;
			}catch(InputMismatchException ioe) 
			{
				sc.nextLine();
				System.out.println("Un numero porfa");
			}
		}
		
		producto=new Producto(nombre,precio,fechaCompra,cantidad,peso);
		return producto;
		
	}
}
