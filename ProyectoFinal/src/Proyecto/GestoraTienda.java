package Proyecto;

public class GestoraTienda 
{
	
	/*
	 Interfaz
	 prototipo: public void pintaProductos(Producto [] producto)
	 Precondiciones: nada
	 Entradas: un array de productos
	 Salidas: nada, pinta por pantalla
	 Entr/sal: nada
	 Postcondiciones: pintados por pantalla los los nombres de los productos
	 */
	public static void pintaProductos(Producto [] producto)
	{
		int cont=0;
		for(Producto p:producto)
		{
			System.out.println("------------------------------------------------");
			System.out.println((cont+1)+" "+p.getNombre()+", "+p.getPrecio()+" €");
			cont++;
		}
	}
	
	
	/*
	//interfaz
	prototipo: public static void PreguntarSeguir(int opcion)
	comentario:sirve para preguntar si el usuario quiere seguir o no
	precondiciones: la opcion esta entre el 0 y 4
	entradas:int opcion
	salidas:no hay
	entr/sal:no hay
	postcondiciones:Asociado al nombre devolvera S si quiere seguir y N en caso contrario
	
	
	//resguardo
	public static void PreguntarSeguir(int opcion)
	{
		System.out.println("En construccion");
	}*/
	
	public static void PreguntarSeguir(int opcion)
	{
			System.out.println("-----------------------------------------------");
			System.out.print("Realmente quieres seguir? s/n: ");	
	}
	
	/*
	//interfaz
	prototipo: public static void MenuPrincipal()
	comentario:sirve para pintar el menu principal 
	precondiciones: no hay
	entradas:int opcion
	salidas:no hay
	entr/sal:no hay
	postcondiciones:no hay
	*/
	/*
	//resguardo
	public static void MenuPrincipal()
	{
		System.out.println("En construccion");
	}*/
	
	public static void MenuPrincipal()
	{		
		//do
		//{
			System.out.println("-----------------------------------------------");
			System.out.println("Pulsar 0 para Salir ");
			System.out.println("Pulsar 1 si eres el/la Jefe/a ");
			System.out.println("Pulsar 2 si eres el/la Encargado/a ");
			System.out.println("Pulsar 3 si eres el/la Trabajador/a ");
			//opcion=sc.nextInt();
		//}while(opcion<0 || opcion>3);
	}
	
	/*
	//interfaz
	prototipo: public static void MenuJefe(int opcion)
	comentario:sirve para pintar el menu 
	precondiciones: no hay
	entradas:no hay
	salidas:no hay
	entr/sal:no hay
	postcondiciones:no hay
	*/
	/*
	//resguardo
	public static void MenuJefe(int opcion)
	{
		System.out.println("En construccion");
	}*/
	
	public static void MenuJefe(int opcion)
	{
		//do
		//{
			System.out.println("-----------------------------------------------");
			System.out.println("Pulsar 0 para Salir ");
			System.out.println("Pulsar 1 para la tienda 1 ");
			System.out.println("Pulsar 2 para la tienda 2 ");
			System.out.println("Pulsar 3 para la tienda 3 ");
			System.out.println("Pulsar 4 para contratar un trabajador ");
			System.out.println("Pulsar 5 para despedir a un trabajador ");
			System.out.print("Pulsar 6 para consultar incidencias ");
			//opcion=sc.nextInt();
		//}while(opcion<0 || opcion>5);
	}
	
	/*
	//interfaz
	prototipo: public static void MenuEncargado(int opcion)
	comentario:sirve para pintar el menu
	precondiciones: no hay
	entradas:no hay
	salidas:no hay
	entr/sal:no hay
	postcondiciones:no hay
	*/
	/*
	//resguardo
	public static void MenuEncargado(int opcion)
	{
		System.out.println("En construccion");
	}*/
	
	public static void MenuEncargado(int opcion)
	{
		//do
		//{
			System.out.println("-----------------------------------------------");
			System.out.println("Pulsar 0 para Salir ");
			System.out.println("Pulsar 1 para la tienda 1 ");
			System.out.println("Pulsar 2 para la tienda 2 ");
			System.out.println("Pulsar 3 para la tienda 3 ");
			System.out.print("Pulsar 4 para avisar sobre un incidete ");
			//opcion=sc.nextInt();
		//}while(opcion<0 || opcion>5);
	}
	
	/*
	//interfaz
	prototipo: public static void MenuTrabajador(int opcion)
	comentario:sirve para pintar el menu
	precondiciones: no hay
	entradas:no hay
	salidas:no hay
	entr/sal:no hay
	postcondiciones:no hay
	*/
	/*
	//resguardo
	public static void MenuTrabajador(int opcion)
	{
		System.out.println("En construccion");
	}*/
	
	public static void MenuTrabajador(int opcion)
	{
		//do
		//{
			System.out.println("-----------------------------------------------");
			System.out.println("Pulsar 0 para Salir ");
			System.out.println("Pulsar 1 para la tienda 1 ");
			System.out.println("Pulsar 2 para la tienda 2 ");
			System.out.print("Pulsar 3 para la tienda 3 ");
			//opcion=sc.nextInt();
		//}while(opcion<0 || opcion>5);
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
	
	public static boolean ExisteProducto(Producto [] producto,String nombre){
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
	prototipo: public static Producto [] VenderProducto(Producto [] producto,String nombre,Fecha fechaVenta)
	comentario:sirve para vender un producto
	precondiciones: El producto tiene que estar en la tienda
	entradas: un array de producto y una fecha
	salidas: 
	entr/sal:no hay
	postcondiciones:AN devolvera .
	*/
	
	/*
	//resguardo
	public static Producto [] VenderProducto(Producto [] producto,String nombre,Fecha fechaVenta)
	{
		System.out.println("En construccion");
		return 1;
	}*/
	
	public static Producto [] VenderProducto(Producto [] producto,String nombre,Fecha fechaVenta) throws ExcepcionProducto
	{
		
		for(int i=0;i<producto.length;i++)
		{
			
		}
		return producto;
	}
	
	/*
	//interfaz
	prototipo: public static double CalcularVenta(Producto producto,Fecha fechaIni,Fecha fechaFin)
	comentario:sirve para calcular los gastos diarios de una tienda
	precondiciones: no hay
	entradas:objeto Producto
	salidas:double dastos
	entr/sal:no hay
	postcondiciones:AN devolvera el gasto diario.
	*/
	/*
	//resguardo
	public static double CalcularVenta(Producto producto,Fecha fechaIni,Fecha fechaFin)
	{
		System.out.println("En construccion");
		return 1;
	}*/
	
	public static double CalcularVenta(Producto [] producto,Fecha fechaIni,Fecha fechaFin,int cantidad)
	{
		//fechaIni=new Fecha();
		//fechaFin=new Fecha();
		//producto=new Producto[15];
		double venta=0.;
		
		for(int i=0;i<producto.length;i++) 
		{
			venta+=producto[i].getPrecio()*cantidad;
		}
		
		//System.out.println("Total venta: "+venta);
		return venta;
	}
}
