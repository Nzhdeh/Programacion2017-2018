package Proyecto;
import java.util.*;
public class GestoraTienda1 
{	
	static Scanner sc=new Scanner(System.in);
	/*
	//interfaz
	prototipo: public static void MenuPrincipal()
	comentario:sirve para pintar el menu principal 
	precondiciones: la opcion esta entre 0 y 3
	entradas:no hay
	salidas:no hay
	entr/sal:no hay
	postcondiciones:no hay solo pinta en la pantalla el menu
	*/
	/*
	//resguardo
	public static void MenuPrincipal()
	{
		System.out.println("En construccion");
	}*/
	
	public static void MenuPrincipal()
	{	
		System.out.println("-----------------------------------------------");
		System.out.println("Pulsar 0 para Salir ");
		System.out.println("Pulsar 1 si eres el/la Jefe/a ");
		System.out.println("Pulsar 2 si eres el/la Encargado/a ");
		System.out.print("Pulsar 3 si eres el/la Trabajador/a: ");
	}
	
	/*
	//interfaz
	prototipo: public static void MenuJefe()
	comentario:sirve para pintar el menu 
	precondiciones: la opcion esta entre 0 y 5
	entradas:no hay
	salidas:no hay
	entr/sal:no hay
	postcondiciones:no hay solo pinta en la pantalla el menu
	*/
	/*
	//resguardo
	public static void MenuJefe()
	{
		System.out.println("En construccion");
	}*/
	
	public static void MenuJefe()
	{
			System.out.println("-----------------------------------------------");
			System.out.println("Pulsar 0 para Salir ");
			System.out.println("Pulsar 1 para calcular las ventas ");
			System.out.println("Pulsar 2 para contratar un trabajador ");
			System.out.println("Pulsar 3 para despedir a un trabajador ");
			System.out.println("Pulsar 4 para la lista de trabajadores ");
			System.out.println("Pulsar 5 para consultar incidencias: ");
			System.out.print("Pulsar 6 para generar nomina: ");
	}
	
	/*
	//interfaz
	prototipo: public static void MenuEncargado()
	comentario:sirve para pintar el menu
	precondiciones: la opcion esta entre 0 y 2
	entradas:no hay
	salidas:no hay
	entr/sal:no hay
	postcondiciones:no hay solo pinta en la pantalla el menu
	*/
	/*
	//resguardo
	public static void MenuEncargado()
	{
		System.out.println("En construccion");
	}*/
	
	public static void MenuEncargado()
	{
			System.out.println("-----------------------------------------------");
			System.out.println("Pulsar 0 para Salir ");
			System.out.println("Pulsar 1 para encargar productos nuevos ");
			System.out.println("Pulsar 2 para avisar sobre una incidecia ");
			System.out.println("Pulsar 3 para consultar productos en la tienda");
			System.out.print("Pulsar 4 para eliminar la incidencia: ");
	}
	
	/*
	//interfaz
	prototipo: public static void MenuTrabajador()
	comentario:sirve para pintar el menu
	precondiciones: la opcion esta entre 0 y 2
	entradas:no hay
	salidas:no hay
	entr/sal:no hay
	postcondiciones:no hay solo pinta en la pantalla el menu
	*/
	/*
	//resguardo
	public static void MenuTrabajador()
	{
		System.out.println("En construccion");
	}*/
	
	public static void MenuTrabajador()
	{
			System.out.println("-----------------------------------------------");
			System.out.println("Pulsar 0 para Salir ");
			System.out.println("Pulsar 1 para vender productos ");
			System.out.print("Pulsar 2 para hacer una devolucion: ");
	}
	
	

	/*
	 Interfaz
	 prototipo: public static void PintaProductos(Producto [] productosEnTienda)
	 Precondiciones: nada
	 Entradas: un array de productos
	 Salidas: nada
	 Entr/sal: nada
	 Postcondiciones: pintara por pantalla los productos en la tienda
	 */
	
	//resguardo
	/*
	public static void PintaProductos(Producto [] productosEnTienda)
	{
		System.out.println("En construccion");
	}*/
	
	public static void PintarProductos(Producto [] productosEnTienda) throws NullPointerException
	{
		int i=0;
		if(productosEnTienda[i]==null) 
		{
			throw new NullPointerException("No hay productos en La tienda");
		}
		else 
		{
			for(i=0;i<productosEnTienda.length && productosEnTienda[i]!=null;i++)
			{
				System.out.println("------------------------------------------------");
				System.out.println(productosEnTienda[i].toString());
			}
		}
	}
	
	/*
	//interfaz
	prototipo: public static boolean ExsisteProducto(Producto [] producto,String nombre)
	comentario: sirve para ver si el producto que quieremos vender esta en la tienda
	precondiciones: No hay
	entradas:un array de Productos,nombre del producto
	salidas: logico
	entr/sal:no hay
	postcondiciones:AN devolvera true si el producto esta en la tienda false en caso contrario.
	*/
	/*
	//resguardo
	public static boolean ExsisteProducto(Producto [] producto,String nombre)
	{
		boolean exsiste=false;
		System.out.println("En construccion");
		return exsiste;
	}*/
	
	public static boolean ExisteProducto(Producto [] producto,String nombre) throws ExcepcionProducto
	{
		boolean existe=false;
		try 
		{
			for(int i=0; i<producto.length && existe==false;i++){
				if(producto[i].getNombre().equalsIgnoreCase(nombre)==true){
					existe=true;
				}
			}
		}catch(NullPointerException npe) 
		{
			System.out.println("No hay productos disponibles");
		}
		
		return existe;		
	}
	
	/*
	//interfaz
	prototipo: public static double CalculaVenta (Producto [] productosVendidos,Fecha fechaIni,Fecha fechaFin)
	comentario:sirve para calcular los gastos de un periodo de una tienda
	precondiciones: las fechas introducidas son correctas y el array tiene que tener al menos un producto
	entradas: un array de productosVendidos,Fecha fechaIni,Fecha fechaFin
	salidas:double ventas
	entr/sal:no hay
	postcondiciones:AN devolvera las ventas de un periodo de fechas.
	*/
	/*
	//resguardo
	public static double CalculaVenta (Producto [] productosVendidos,Fecha fechaIni,Fecha fechaFin)
	{
		System.out.println("En construccion");
		return 1;
	}*/
	
	public static double CalcularVentas(Producto [] arrayVendido,Fecha fechaIni,Fecha fechaFin)
	{
		int i=0;
		double venta=0.;
		double precio=0.0;
		
		for(i=0;i<arrayVendido.length && arrayVendido[i]!=null;i++) 
		{
			Fecha fechaVenta = arrayVendido[i].getFechaVenta();
			
			if((fechaVenta.compareTo(fechaIni)==1 && fechaVenta.compareTo(fechaFin)==(-1)) ||
			   (fechaVenta.compareTo(fechaIni)==(-1) && fechaVenta.compareTo(fechaFin)==1) ||
			   (fechaVenta.compareTo(fechaIni)==0 || fechaVenta.compareTo(fechaFin)==0)) 
			{
				precio=arrayVendido[i].getPrecio()*arrayVendido[i].getCantidad();
				venta+=precio;
			}
		}
		return venta;
	}

	/*
	//interfaz
	prototipo: public static boolean ExisteTrabajador(Trabajador [] contrataTrabajador,String dni) throws ExcepcionTrabajador
	comentario: sirve para ver si el trabajador exciste
	precondiciones: no hay
	entradas:un array de Trabajadores,el dni 
	salidas: logico
	entr/sal:no hay
	postcondiciones:AN devolvera true si el trabajador existe, false en caso contrario.
	*/
	/*
	//resguardo
	public static boolean ExisteTrabajador(Trabajador [] contrataTrabajador,String dni) throws ExcepcionTrabajador
	{
		boolean exsiste=false;
		System.out.println("En construccion");
		return exsiste;
	}*/
	
	public static boolean ExisteTrabajador(Trabajador [] contrataTrabajador,String dni) throws ExcepcionTrabajador
	{
		boolean existe=false;
		try 
		{
			for(int i=0; i<contrataTrabajador.length && existe==false;i++){
				if(contrataTrabajador[i].getDni().equalsIgnoreCase(dni)==true){
					existe=true;
				}
			}
		}catch(NullPointerException npe) 
		{
			System.out.println("No hay ningun trabajador guardado");
		}
		
		return existe;		
	}
}