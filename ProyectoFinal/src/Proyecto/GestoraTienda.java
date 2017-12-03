package Proyecto;
import java.util.*;
public class GestoraTienda 
{	
	
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
	precondiciones: la opcion esta entre 0 y 4
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
			System.out.print("Pulsar 4 para consultar incidencias: ");
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
			System.out.print("Pulsar 2 para avisar sobre un incidete: ");
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
	 prototipo: public int PintaProductos(Producto [] producto)
	 Precondiciones: nada
	 Entradas: un array de productos
	 Salidas: int contador
	 Entr/sal: nada
	 Postcondiciones: AN devolvera el contador y pintara por pantalla los los nombres,los precios y las cantidades de los productos
	 */
	
	//resguardo
	/*
	public static int PintaProductos(Producto [] producto)
	{
		int cont=0;
		System.out.println("En construccion");
		return cont;
		
	}*/
	
	public static void PintaProductos(Producto [] producto)
	{
		for(int i=0;i<producto.length;i++)
		{
			System.out.println("------------------------------------------------");
			System.out.println((i+1)+"-"+producto[i].getNombre()+", "+producto[i].getPrecio()+
					" €, "+producto[i].getCantidad()+" Unidades");
		}
	}
	
	/*
	//interfaz
	prototipo: public static boolean ExsisteProducto(Producto [] producto,String nombre)
	comentario: sirve para ver si el producto que quieremos vender esta en la tienda
	precondiciones: no hay
	entradas:un array de Productos
	salidas: boolean exsiste
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
		for(int i=0; i<producto.length && existe==false;i++){
			if(producto[i].getNombre().equalsIgnoreCase(nombre)==true){
				existe=true;
			}
		}
		return existe;		
	}
	
	/*
	//interfaz
	prototipo: public static double CalculaVenta(Producto [] producto,Fecha fechaIni,Fecha fechaFin)
	comentario:sirve para calcular los gastos diarios de una tienda
	precondiciones: la fecha introducida es correcta
	entradas: Producto [] productosVendidos,Fecha fechaIni,Fecha fechaFin
	salidas:double ventas
	entr/sal:no hay
	postcondiciones:AN devolvera las ventas de un periodo de fechas.
	*/
	/*
	//resguardo
	public static double CalculaVenta(Producto [] producto,Fecha fechaIni,Fecha fechaFin)
	{
		System.out.println("En construccion");
		return 1;
	}*/
	
	public static double CalculaVenta(Producto [] productosVendidos,Fecha fechaIni,Fecha fechaFin)
	{
		int i=0;
		double venta=0.;
		
			for(;i<productosVendidos.length;i++) 
			{
				Producto producto = productosVendidos[i];
				Fecha fechaVenta = producto.getFechaVenta();
				
				if((fechaVenta.compareTo(fechaIni)==1 && fechaVenta.compareTo(fechaFin)==(-1)) ||
				   (fechaVenta.compareTo(fechaIni)==(-1) && fechaVenta.compareTo(fechaFin)==1) ||
				   (fechaVenta.compareTo(fechaIni)==0 || fechaVenta.compareTo(fechaFin)==0)) 
				{
					venta+=productosVendidos[i].getPrecio();
				}
			}
		//System.out.println("Total venta: "+venta+" €");
		return venta;
	}
	
	/*
	//interfaz
	prototipo: public static int ContrataTrabajador(Trabajador trabajador)
	comentario: este metodo sirve para simular a contratar un trabajador
	precondiciones: no hay
	entradas: 
	salidas: int exito
	entr/sal:no hay
	postcondiciones:AN devolvera 1 si se ha hecho y -1 si no.
	*/
	
	/*
	//resguardo
	public static int ContrataTrabajador(Trabajador tarbajador)
	{
		int exito=1;
		System.out.println("En construccion");
		return exito;
	}*/

	public static int ContrataTrabajador(Trabajador trabajador, int tamanio)
	{
		int exito=0;
		Trabajador [] t=new Trabajador[tamanio];
		
		for(int i=0;i<tamanio;i++) 
		{
			/*Producto producto = productosVendidos[i];
			Fecha fechaVenta = producto.getFechaVenta();*/
			
			trabajador=t[i];/**************************************/
			exito=1;
		}
		
		return exito;
	}
	
	/*
	//interfaz
	prototipo: public static int DespideTrabajador(Trabajador [] trabajador)
	comentario:este metodo simula la despedida de un trabajador
	precondiciones: no hay
	entradas: 
	salidas: int exito
	entr/sal:no hay
	postcondiciones:AN devolvera 1 si se ha hecho y -1 si no.
	*/
	
	
	//resguardo
	public static int DespideTrabajador(Trabajador [] tarbajador)
	{
		int exito=1;
		System.out.println("En construccion");
		return exito;
	}
	
	
	/*
	//interfaz
	prototipo: public static void ConsultaIncidencias()
	comentario:este metodo sirve para consultar el libro de quejas
	precondiciones: 
	entradas: 
	salidas: 
	entr/sal:
	postcondiciones:
	*/
	
	
	//resguardo
	public static void ConsultaIncidencias()
	{
		System.out.println("En construccion");
	}
	
	/*
	//interfaz
	prototipo: public static void EncargaProductos()
	comentario:este metodo sirve para rellenar el almacen de productos
	precondiciones: 
	entradas: 
	salidas: 
	entr/sal:
	postcondiciones:
	*/
	
	
	//resguardo
	public static void EncargaProductos()
	{
		System.out.println("En construccion");
	}
	
	/*
	//interfaz
	prototipo: public static void AvisaIncidencias()
	comentario:este metodo sirve para rellenar el almacen de productos
	precondiciones: 
	entradas: 
	salidas: 
	entr/sal:
	postcondiciones:
	*/
	
	
	//resguardo
	public static void AvisaIncidencias()
	{
		System.out.println("En construccion");
	}
	
	/*
	//interfaz
	prototipo: public static Producto [] VendeProducto(Producto [] producto,String nombre,Fecha fechaVenta)
	comentario:sirve para vender un producto
	precondiciones: El producto tiene que estar en la tienda
	entradas: un array de producto y una fecha
	salidas: Producto producto
	entr/sal:no hay
	postcondiciones:AN devolvera .
	*/
	
	
	//resguardo
	public static Producto [] VendeProducto(Producto [] producto,String nombre,Fecha fechaVenta)
	{
		System.out.println("En construccion");
		return producto;
	}
	/*
	public static Producto [] VendeProducto(Producto [] producto,String nombre,Fecha fechaVenta) throws ExcepcionProducto
	{
		
		for(int i=0;i<producto.length;i++)
		{
			
		}
		return producto;
	}*/
	
	/*
	//interfaz
	prototipo: public static void DevuelveProducto(Producto [] producto,String nombre,Fecha fechaVenta)
	comentario:sirve para devolver un producto
	precondiciones: El producto tiene que estar en la tienda
	entradas: un array de producto,el nombre y una fecha
	salidas: Producto producto
	entr/sal:no hay
	postcondiciones:AN devolvera 1 si se ha hecho la devolucion si no -1 .
	*/
	
	
	//resguardo
	public static void DevuelveProducto(Producto [] producto,String nombre,Fecha fechaVenta)
	{
		System.out.println("En construccion");
	}
}