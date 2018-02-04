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
			System.out.print("Pulsar 5 para consultar incidencias: ");
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
			System.out.print("Pulsar 3 para consultar productos en la tienda: ");
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
	 prototipo: public void PintaProductos(Producto [] producto)
	 Precondiciones: nada
	 Entradas: un array de productos
	 Salidas: nada
	 Entr/sal: nada
	 Postcondiciones:pintara por pantalla los los nombres,los precios y las cantidades de los productos
	 */
	
	//resguardo
	/*
	public static void PintaProductos(Producto [] producto)
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
			/*System.out.println((i+1)+"-"+producto[i].getNombre()+" , "+producto[i].getPrecio()+
					" €, "+producto[i].getCantidad()+" , "+producto[i].getPeso()+" kg");*/
			
			System.out.println(producto[i].toString());
		}
	}
	
	/*
	//interfaz
	prototipo: public static boolean ExsisteProducto(Producto [] producto,String nombre)
	comentario: sirve para ver si el producto que quieremos vender esta en la tienda
	precondiciones: el array tiene que tener al menos un producto
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
		for(int i=0; i<producto.length;i++){
			if(producto[i].getNombre().equalsIgnoreCase(nombre)==true){
				existe=true;
			}
		}
		return existe;		
	}
	
	/*
	//interfaz
	prototipo: public static double CalculaVenta(Producto [] producto,Fecha fechaIni,Fecha fechaFin)
	comentario:sirve para calcular los gastos de un periodo de una tienda
	precondiciones: las fechas introducidas son correctas y el array lleno
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
		return venta;
	}

	/*
	//interfaz
	prototipo: public static boolean ExisteTrabajador(ArrayList<Trabajador> contrataTrabajador,String dni)
	comentario: sirve para ver si el trabajador exciste
	precondiciones: array lleno
	entradas:un ArrayList de Trabajadores
	salidas: logico
	entr/sal:no hay
	postcondiciones:AN devolvera true si el trabajador existe, false en caso contrario.
	*/
	/*
	//resguardo
	public static boolean ExisteTrabajador(ArrayList<Trabajador> contrataTrabajador,String dni) throws ExcepcionTrabajador
	{
		boolean exsiste=false;
		System.out.println("En construccion");
		return exsiste;
	}*/
	
	public static boolean ExisteTrabajador(ArrayList<Trabajador> contrataTrabajador,String dni) throws ExcepcionTrabajador
	{
		boolean existe=false;
		for(int i=0; i<contrataTrabajador.size() /*&& existe==false*/;i++){
			if(contrataTrabajador.get(i).getDni().equalsIgnoreCase(dni)==true){
				existe=true;
			}
		}
		return existe;		
	}
	
	/*
	//interfaz
	prototipo: public static ArrayList<Trabajador> ContrataTrabajador(ArrayList<Trabajador> trabajador)
	comentario: este metodo sirve para simular a contratar un trabajador
	precondiciones: no hay
	entradas: un ArrayList de trabajadores
	salidas: un ArrayList de trabajadores
	entr/sal:no hay
	postcondiciones:AN devolvera a los trabajadores contratados
	*/
	
	/*
	//resguardo
	public static ArrayList<Trabajador> ContrataTrabajador(ArrayList<Trabajador> trabajador)
	{
		ArrayList <Trabajador> trabajadorContratado=new ArrayList <Trabajador>();
		System.out.println("En construccion");
		return trabajadorContratado;
	}*/
	
	public static ArrayList<Trabajador> ContrataTrabajador(ArrayList<Trabajador> trabajador)
	{
		ArrayList <Trabajador> trabajadorContratado=new ArrayList <Trabajador>();
		
		for(int i=0;i<trabajador.size();i++) 
		{
			trabajadorContratado.add(trabajador.get(i));
		}
		
		return trabajadorContratado;
	}
	
	
	/*
	//interfaz
	prototipo: public static void ConsultarTrabajadorContratado(ArrayList<Trabajador> trabajadorContratado)
	comentario: este metodo sirve para ver a todos los trabajadores contratados
	precondiciones: El array debe tener al menos un trabajador
	entradas: un ArrayList de trabajadores
	salidas: no hay
	entr/sal:no hay
	postcondiciones:No hay, solo pinta la lista de trabajadores
	*/
	
	/*
	//resguardo
	public static void ConsultarTrabajadorContratado(ArrayList<Trabajador> trabajadorContratado)
	{
		System.out.println("En construccion");
	}*/
	public static void ConsultarTrabajadorContratado(ArrayList<Trabajador> trabajadorContratado)
	{
		for(int i=0;i<trabajadorContratado.size();i++) 
		{
			System.out.println("------------------------------------------------");
			System.out.println(trabajadorContratado.get(i));
		}
	}
	
	/*
	//interfaz
	prototipo: public static void DespideTrabajador(ArrayList<Trabajador> contrataTrabajador,String dni) 
	comentario:este metodo simula la despedida de un trabajador
	precondiciones: el array lleno
	entradas: ArrayList de trabajadores
	salidas: no hay
	entr/sal: no hay
	postcondiciones:nada
	*/
	
	/*
	//resguardo
	public static void DespideTrabajador(ArrayList<Trabajador> contrataTrabajador,String dni) 
	{
		ArrayList <Trabajador> tarbajador=new ArrayList <Trabajador>();
		System.out.println("En construccion");
		return tarbajador;
	}*/
	
	public static void DespideTrabajador(ArrayList<Trabajador> contrataTrabajador,String dni) throws ExcepcionTrabajador
	{
		for(int i=0;i<contrataTrabajador.size();i++) 
		{
			if(contrataTrabajador.get(i).getDni().equals(dni)) 
			{
				contrataTrabajador.remove(i);
			}
		}
		//return contrataTrabajador;
	}
	
	
	/*
	//interfaz
	prototipo: public static void ConsultaIncidencias()
	comentario:este metodo sirve para consultar el libro de quejas
	precondiciones: no hay
	entradas: un array
	salidas: no hay
	entr/sal: no hay
	postcondiciones: no hay,solo pinta por pantalla las incidencias
	*/
	
	
	//resguardo
	public static void ConsultaIncidencias(String [] denuncia)
	{
		//String incidencia="";
		
		//denuncia=AvisaIncidencias(incidencia);
		for(int i=0;i<denuncia.length;i++) 
		{
			System.out.println(denuncia[i]);
		}
	}
	
	/***********************Corregido**************************/
	
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
	
	/*
	//resguardo
	public static void EncargaProductos()
	{
		System.out.println("En construccion");
	}*/
	
	public static void EncargaProductos(Producto [] producto)
	{
		Producto [] productoEncargado = new Producto[producto.length];
		
		for(int i=0;i<producto.length;i++) 
		{
			productoEncargado[i]=producto[i];
		}
	}
	
	/*
	//interfaz
	prototipo: public static void AvisaIncidencias()
	comentario:este metodo sirve para rellenar el almacen de productos
	precondiciones: No hay
	entradas: un array de cadenas
	salidas: un array de cadenas
	entr/sal:no hay
	postcondiciones:AN devolvera el array de incidencias
	*/
	
	/*
	//resguardo
	public static void AvisaIncidencias()
	{
		System.out.println("En construccion");
	}*/
	
	public static String [] AvisaIncidencias(String [] clienteDenuncia)
	{
		String [] denuncia = new String [5];
		
		for(int i=0;i<clienteDenuncia.length;i++) 
		{
			denuncia[i]=clienteDenuncia[i];
		}
		
		return denuncia;
	}
	
	/*
	//interfaz
	prototipo: public static void ConsultarProductosTienda(Producto [] producto)
	comentario:sirve para consultar los productos en la tienda
	precondiciones: no hay
	entradas: un array de producto
	salidas: no hay
	entr/sal:no hay
	postcondiciones:no hay, solo pinta en pantalla
	*/
	/*
	//resguardo
	public static void ConsultarProductosTienda(Producto [] producto) 
	{
		System.out.println("En construccion");
	}*/
	
	public static void ConsultarProductosTienda(Producto [] producto) 
	{
		for(int i=0;i<producto.length;i++) 
		{
			System.out.println(producto[i]);
		}
	}
	
	
	/*
	//interfaz
	prototipo: public static Producto [] VendeProducto(Producto [] producto,int cantidad)
	comentario: sirve para vender un producto
	precondiciones: El producto tiene que estar en la tienda
	entradas: un array de producto y la cantidad a vender
	salidas: un array de producto
	entr/sal:no hay
	postcondiciones:AN devolvera el array de productos vendidos
	*/
	
	/*
	//resguardo
	public static Producto [] VendeProducto(Producto [] producto,int cantidad)
	{
		System.out.println("En construccion");
		return producto;
	}*/
	
	public static Producto [] VendeProducto(Producto [] producto,int cantidad) throws ExcepcionProducto
	{
		Producto [] productoVendido=new Producto[10];
		
		for(int i=0;i<producto.length;i++)
		{
	    	productoVendido[i]=producto[i];
	    	producto[i].setCantidad(producto[i].getCantidad()-cantidad);
		}
		return productoVendido;
	}
	
	/*
	//interfaz
	prototipo: public static Producto [] DevuelveProducto(Producto [] productoVendido,int cantidad)
	comentario:sirve para devolver los productos vendidos
	precondiciones: El producto tiene que haberse vendido antes
	entradas: un array de producto,y la cantidad a devolver
	salidas: un array de producto
	entr/sal:no hay
	postcondiciones:AN devolvera 1 si se ha hecho la devolucion si no -1 .
	*/
	
	/*
	//resguardo
	public static Producto [] DevuelveProducto(Producto [] productoVendido,int cantidad)
	{
		System.out.println("En construccion");
	}*/
	
	public static int DevuelveProducto(Producto [] productoVendido,int cantidad) throws ExcepcionProducto 
	{
		int devuelto=0;
		int i=0;
		Producto [] producto=new Producto[10];
		
		for(;i<productoVendido.length;i++)
		{
			producto[i]=productoVendido[i];
	    	producto[i].setCantidad(producto[i].getCantidad()+cantidad);
		}
		if(producto[i]==productoVendido[i]) 
		{
			devuelto=1;
		}else 
		{
			devuelto=(-1);
		}
		return devuelto;
	}
}
