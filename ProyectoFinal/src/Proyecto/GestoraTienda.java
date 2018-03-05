package Proyecto;
import java.util.*;
public class GestoraTienda 
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
	//interfaz
	prototipo: public Fecha LeerValidarFecha() 
	comentario:sirve para leer y validar una fecha
	precondiciones:no hay
	entradas:no hay
	salidas:una fecha
	entr/sal:no hay
	postcondiciones:AN devolvera la fecha
	*/
	/*
	//resguardo
	public Fecha LeerValidarFecha() 
	{
		Fecha f=null;
		System.out.println("En construccion");
		return f;
	}*/
	
	public Fecha LeerValidarFecha() 
	{
		boolean repetir=false;
		Fecha f=new Fecha();
		
		repetir=true;
		while(repetir)
		{
			System.out.println("Introduce el dia: ");
			try 
			{
				f.setDia(sc.nextInt());
				repetir = false;
			}catch (ExcepcionFecha e) 
			{
				System.out.println(e);
			} catch (InputMismatchException e) 
			{
				System.out.println(e+": Un numero entero");
				sc.nextLine();
			}
		}
		
		
		repetir=true;
		while(repetir)
		{
			System.out.println("Introduce el mes: ");
			try 
			{
				f.setMes(sc.nextInt());
				repetir = false;
			}catch (ExcepcionFecha e) 
			{
				System.out.println(e);
			} catch (InputMismatchException e) 
			{
				System.out.println(e+": Un numero entero");
				sc.nextLine();
			}
		}
		
		
		repetir=true;
		while(repetir)
		{
			System.out.println("Introduce el anio: ");
			try 
			{
				f.setAnio(sc.nextInt());
				repetir = false;
			}catch (ExcepcionFecha e) 
			{
				System.out.println(e);
			} catch (InputMismatchException e) 
			{
				System.out.println(e+": Un numero entero");
				sc.nextLine();
			}
		}
		return f;
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
	
	public static void PintaProductos(Producto [] productosEnTienda) throws NullPointerException
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
	
	public static double CalculaVenta(Producto [] productosVendidos,Fecha fechaIni,Fecha fechaFin)
	{
		int i=0;
		double venta=0.;
		double precio=0.0;
		
		for(i=0;i<productosVendidos.length;i++) 
		{
			Fecha fechaVenta = productosVendidos[i].getFechaVenta();
			
			if((fechaVenta.compareTo(fechaIni)==1 && fechaVenta.compareTo(fechaFin)==(-1)) ||
			   (fechaVenta.compareTo(fechaIni)==(-1) && fechaVenta.compareTo(fechaFin)==1) ||
			   (fechaVenta.compareTo(fechaIni)==0 || fechaVenta.compareTo(fechaFin)==0)) 
			{
				precio=productosVendidos[i].getPrecio()*productosVendidos[i].getCantidad();
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
	
	/*
	//interfaz
	prototipo: public static Trabajador [] ContrataTrabajador(Trabajador [] trabajadorContratado,Trabajador t)
	comentario: este metodo sirve para simular incerta a un trabajador en el sistema
	precondiciones: no hay
	entradas: un objeto trabajador
	salidas: no hay
	entr/sal:un array de trabajadores
	postcondiciones: AN devolvera a los trabajadores contratados
	*/
	
	/*
	//resguardo
	public static Trabajador [] ContrataTrabajador(Trabajador [] trabajadorContratado,Trabajador t)
	{
		System.out.println("En construccion");
		return trabajadorContratado;
	}*/
	
	public static Trabajador [] ContrataTrabajador(Trabajador [] trabajadorContratado,Trabajador t) 
	{
		boolean contratado=false;
		int i=0 ;
		
		for(i=0;i<trabajadorContratado.length && contratado==false;i++) 
		{
			if(trabajadorContratado[i]==null) 
			{
				trabajadorContratado[i]=t;
				contratado=true;
			}
		}
		
		if(trabajadorContratado.length==i && contratado==false) 
		{
			System.out.println("Array lleno,no se puede contratar mas trabajadores");
		}
		return trabajadorContratado;
	}
	
	/*
	//interfaz
	prototipo: public static void ConsultarTrabajadorContratado(Trabajador [] trabajadorContratado)
	comentario: este metodo sirve para ver a todos los trabajadores contratados
	precondiciones: El array debe tener al menos un trabajador
	entradas: un array de trabajadores
	salidas: no hay
	entr/sal:no hay
	postcondiciones:No hay, solo pinta la lista de trabajadores
	*/
	
	/*
	//resguardo
	public static void ConsultarTrabajadorContratado(Trabajador [] trabajadorContratado)
	{
		System.out.println("En construccion");
	}*/
	
	public static void ConsultarTrabajadorContratado(Trabajador [] trabajadorContratado)
	{
		for(int i=0;i<trabajadorContratado.length && trabajadorContratado[i]!=null;i++) 
		{
			System.out.println("------------------------------------------------");
			System.out.println(trabajadorContratado[i]);
		}
	}
	
	/*
	//interfaz
	prototipo: public static boolean DespideTrabajador(Trabajador [] contrataTrabajador,String dni) 
	comentario:este metodo simula la despedida de un trabajador
	precondiciones: El objeto trabajador tiene que existir
	entradas: array de trabajadores, dni o nie
	salidas: logico
	entr/sal: no hay
	postcondiciones: AN devolvera true si el trabajador se ha eliminado y false si no.
	*/
	
	/*
	//resguardo
	public static boolean DespideTrabajador(Trabajador [] contrataTrabajador,String dni)
	{
		booleant res=false;
		System.out.println("En construccion");
		return res;
	}*/
	
	public static boolean DespideTrabajador(Trabajador [] contrataTrabajador,String dni) throws ExcepcionTrabajador
	{
		boolean resultado=false;
		try 
		{
			for(int i=0;i<contrataTrabajador.length && resultado==false;i++) 
			{
				if(contrataTrabajador[i].getDni().equals(dni)) 
				{
					for (int j=i;j<contrataTrabajador.length-1;j++) 
					{
						contrataTrabajador[j]=contrataTrabajador[j+1];
					}
					contrataTrabajador[contrataTrabajador.length-1]=null;
					resultado=true;
				}
			}
		}catch(NullPointerException npe) 
		{
			System.out.println(npe+": Array vacio");
		}
		return resultado;
	}
	
	/*
	//interfaz
	prototipo: public static void ConsultaIncidencias(Incidencia [] denuncia))
	comentario:este metodo sirve para consultar las incidencias
	precondiciones: no hay
	entradas: un array de objeto Incidencia
	salidas: no hay
	entr/sal: no hay
	postcondiciones: no hay,solo pinta por pantalla las incidencias
	*/
	
	/*
	//resguardo
	public static void ConsultaIncidencias(Incidencia [] denuncia))
	{
		System.out.println("En construccion");
	}*/
	
	public void ConsultaIncidencias(Incidencia [] denuncia)
	{
		try 
		{
			for(int i=0;i<denuncia.length && denuncia[i]!=null;i++) 
			{
				System.out.println(denuncia[i]);
			}
		}catch(NullPointerException npe) 
		{
			System.out.println("---------------------------------------");
			System.out.println("No hay nada en el array");
		}
		
	}
	
	
	/*
	//interfaz
	prototipo: public static Producto [] EncargaProductos(Producto [] productosEnTienda,Producto productoParaTienda)
	comentario:este metodo sirve para rellenar el almacen de productos
	precondiciones: no hay
	entradas:  un objeto Producto
	salidas: no hay
	entr/sal: array de productos
	postcondiciones: AN devolvera un array de productos 
	*/
	
	/*
	//resguardo
	public static Producto [] EncargaProductos(Producto [] productosEnTienda,Producto productoParaTienda)
	{
		System.out.println("En construccion");
		return productoTienda;
	}*/
	
	public static Producto [] EncargaProductos(Producto [] productosEnTienda,Producto productoParaTienda)
	{
		int i=0;
		boolean comprar=false;
		
		for(;i<productosEnTienda.length && comprar==false;i++) 
		{
			if(productosEnTienda[i]==null) 
			{
				productosEnTienda[i]=(productoParaTienda);
				comprar=true;
			}
		}
		
		return productosEnTienda;
	}
	
	/*
	//interfaz
	prototipo: public Incidencia [] AvisaIncidencias(Incidencia incidencia,Incidencia [] clienteDenuncia )
	comentario:este metodo sirve para avisar qualquier incidencia
	precondiciones: No hay
	entradas: un objeto
	salidas: no hay
	entr/sal:un array
	postcondiciones:AN devolvera el array de incidencias
	*/
	
	/*
	//resguardo
	public Incidencia [] AvisaIncidencias(Incidencia incidencia,Incidencia [] clienteDenuncia )
	{
		System.out.println("En construccion");
		return clienteDenuncia[0];
	}*/
	
	public Incidencia [] AvisaIncidencias(Incidencia incidencia,Incidencia [] clienteDenuncia )
	{	
		boolean insertado=false;
		int i=0; 
		
		for(i=0;i<clienteDenuncia.length && insertado==false;i++) 
		{
			if(clienteDenuncia[i]==null) 
			{
				clienteDenuncia[i]=incidencia;
				insertado=true;
			}
		}
		if(insertado==false || clienteDenuncia[i]!=null) 
		{
			System.out.println("Array lleno. No se puede incertar mas incidencias.");
		}
		
		return clienteDenuncia;
	}

	/*
	//interfaz
	prototipo: public boolean EliminarIncidencia(Incidencia [] clienteDenuncia,int idIncidencia) 
	comentario:este metodo sirve para eliminar las incidencias 
	precondiciones: array lleno
	entradas: un entero y un array de incidencia
	salidas: logico
	entr/sal:no hay
	postcondiciones:AN true si se ha eliminado ,false en caso contrario
	*/
	
	/*
	//resguardo
	public boolean EliminarIncidencia(Incidencia [] clienteDenuncia,int idIncidencia) 
	{
		System.out.println("En construccion");
		return true;
	}*/
	
	public boolean EliminarIncidencia(Incidencia [] denuncia,int idIncidencia) 
	{
        boolean resultado = false;
       
        for (int i = 0; i < denuncia.length && resultado==false; i++) 
        {
    		 if (denuncia[i].getId() == idIncidencia) 
             {
                 for (int j = i; j < denuncia.length - 1; j++) 
                 {
                 	denuncia[j] = denuncia[j+1];
                 }
                 denuncia[denuncia.length - 1] = null;
                 resultado = true;
             }
        }
	        
        return resultado;
    }	
	
	/*
	//interfaz
	prototipo: public static Producto [] VendeProducto(Producto [] productos,Producto producto,Producto [] arrayVendido)
	comentario: sirve para vender un producto
	precondiciones: no hay
	entradas: un objeto producto,dos arrays de productos
	salidas: no hay
	entr/sal: un array de producto
	postcondiciones:AN devolvera el array de productos vendidos
	*/
	
	/*
	//resguardo
	public static Producto [] VendeProducto(Producto [] productos,Producto producto,Producto [] arrayVendido)
	{
		System.out.println("En construccion");
		return arrayVendido[0];
	}*/
	
	public static Producto [] VendeProducto(Producto [] productos,Producto producto,Producto [] arrayVendido) throws ExcepcionProducto
	{
		int i=0;
		
		if(productos[i]==null) 
		{
			throw new ExcepcionProducto("No hay productos");
		}else
		{
			arrayVendido[i]=(new Producto(producto));
			productos[i].setCantidad(productos[i].getCantidad()-producto.getCantidad());
		}
		return arrayVendido;
	}
	
	/*
	//interfaz
	prototipo: public static void DevuelveProducto(Producto [] arrayVendido,Producto productoDevolucion,Producto[] productosEnTienda)
	comentario:sirve para devolver los productos vendidos
	precondiciones: El producto tiene que haberse vendido antes
	entradas: dos arrays de producto,y un objeto Producto
	salidas: no hay
	entr/sal:no hay
	postcondiciones:No hay
	*/
	
	/*
	//resguardo
	public static void DevuelveProducto(ArrayList <Producto> arrayVendido,Producto productoDevolucion,ArrayList <Producto> producto)
	{
		System.out.println("En construccion");
		return 1;
	}*/
	
	public static void DevuelveProducto(Producto [] arrayVendido,Producto productoDevolucion,Producto[] productosEnTienda) throws ExcepcionProducto 
	{
		//int devuelto=0;
		int i=0;
		
		arrayVendido[i].setCantidad(arrayVendido[i].getCantidad()-productoDevolucion.getCantidad());
		productosEnTienda[i].setCantidad(productosEnTienda[i].getCantidad()+productoDevolucion.getCantidad());
	}
	
	/*
	//interfaz
	prototipo: public static char ValidarDNI(String dni)
	comentario:sirve para validar un dni
	precondiciones: el tamaño de la cadena es de 9,el ultimo caracter es una letra entre A y Z,
					los demas digitos son numeros de entre 0 y 9
	entradas: una cadena
	salidas: un caracter
	entr/sal:no hay
	postcondiciones:AN devolvera la letra correspondiente a los digitos introducidos .
	*/
	
	/*
	//resguardo
	public static char ValidarDNI(String dni)
	{
		System.out.println("En construccion");
		return a;
	}*/
		
	public static char ValidarDNI(String dni) 
	{
		String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
		char letra=' ';
		int res=0;
		
		res=Integer.parseInt(dni)%23;
		letra = caracteres.charAt(res);
		
		return letra;
	}
	
	/*
	//interfaz
	prototipo: public static char ValidarCIF(String cif)
	comentario:sirve para validar un cif
	precondiciones: el tamaño de la cadena es de 9,el primer caracter es una letra entre A y Z,
					los demas digitos son numeros de entre 0 y 9
	entradas: una cadena
	salidas: un caracter
	entr/sal:no hay
	postcondiciones:AN devolvera la letra correspondiente a los digitos introducidos .
	*/
	
	/*
	//resguardo
	public static char ValidarCIF(String dni)
	{
		System.out.println("En construccion");
		return a;
	}*/
	/*	
	public static char ValidarCIF(String cif) 
	{
		String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
		char letra=' ';
		int res=0;
		
		cif=cif.substring(1, 8);
		
		res=Integer.parseInt(cif)%23;
		letra = caracteres.charAt(res);
		
		return letra;
	}*/
	
	/*
	//interfaz
	prototipo: public static char ValidarNIE(String dni)
	comentario:sirve para validar un nie
	precondiciones: el tamaño de la cadena es de 9,el primer digito es 'X', 'Y' o 'Z',
					el ultimo caracter es una letra entre A y Z,los demas digitos son numeros de entre 0 y 9
	entradas: una cadena
	salidas: un caracter
	entr/sal:no hay
	postcondiciones:AN devolvera la letra correspondiente a los digitos introducidos .
	*/
	
	/*
	//resguardo
	public static char ValidarNIE(String dni)
	{
		System.out.println("En construccion");
		return a;
	}*/
		
	public static char ValidarNIE(String dni) 
	{
		String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
		char letra=' ';
		int res=0;
		
		if(dni.charAt(0)=='X') 
		{
			dni='0'+dni.substring(1,8);
			
			res=Integer.parseInt(dni.substring(1, 8))%23;
			letra = caracteres.charAt(res);
		}else if(dni.charAt(0)=='Y') 
		{
			dni='1'+dni.substring(1,8);
			
			res=Integer.parseInt(dni.substring(0, 8))%23;
			letra = caracteres.charAt(res);
		}else if(dni.charAt(0)=='Z') 
		{
			dni='2'+dni.substring(1,8);
			
			res=Integer.parseInt(dni.substring(0, 8))%23;
			letra = caracteres.charAt(res);
		}
		
		return letra;
	}
	
	/*
	//interfaz
	prototipo: public boolean ExisteDniNie(Trabajador [] trabajadorContratado,String dni)
	comentario:sirve para comprobar la existencia de un dni o un nie
	precondiciones: ninguno
	entradas: un array,una cadena
	salidas: un logico
	entr/sal:no hay
	postcondiciones:AN devolvera true si el documento de identidad ya existe y false si no.
	*/
	
	/*
	//resguardo
	public boolean ExisteDniNie(Trabajador [] trabajadorContratado,String dni)
	{
		System.out.println("En construccion");
		return true;
	}*/
	
	public boolean ExisteDniNie(Trabajador [] trabajadorContratado,String dni)
	{
		boolean res=false;
		
		for(int i=0;i<trabajadorContratado.length;i++) 
		{
			if(trabajadorContratado[i]!=null) 
			{
				if(trabajadorContratado[i].getDni().equals(dni)) 
				{
					res=true;
				}
			}
		}
		return res;
	}
	
	/*
	//interfaz
	prototipo: public boolean ExisteEncargado(Trabajador [] trabajadorContratado) 
	comentario:sirve para comprobar si hay un encargado contratado
	precondiciones: el array tiene que tener al menos un ubjeto
	entradas: un array
	salidas: un logico
	entr/sal:no hay
	postcondiciones:AN devolvera true si hay un encargado y false si no.
	*/
	
	/*
	//resguardo
	public boolean ExisteEncargado(Trabajador [] trabajadorContratado) 
	{
		System.out.println("En construccion");
		return true;
	}*/
	
	public boolean ExisteEncargado(Trabajador [] trabajadorContratado) 
	{
		boolean res=false;
		
		for(int i=0;i<trabajadorContratado.length && res==false;i++) 
		{
			if(trabajadorContratado[i].getCARGO()==TipoCargo.ENCARGADO) 
			{
				res=true;
			}
		}
		
		return res;
	}
	/*
	//interfaz
	prototipo: public boolean ExisteVendedor(Trabajador [] contrataTrabajador) 
	comentario:sirve para comprobar si hay un encargado contratado
	precondiciones: el array tiene que tener al menos un ubjeto
	entradas: un array
	salidas: un logico
	entr/sal:no hay
	postcondiciones:AN devolvera true si hay un encargado y false si no.
	*/
	
	/*
	//resguardo
	public boolean ExisteVendedor(Trabajador [] contrataTrabajador) 
	{
		System.out.println("En construccion");
		return true;
	}*/
	
	public boolean ExisteVendedor(Trabajador [] contrataTrabajador) 
	{
		boolean res=false;
		
		for(int i=0;i<contrataTrabajador.length && res==false;i++) 
		{
			if(contrataTrabajador[i].getCARGO()==TipoCargo.VENDEDOR) 
			{
				res=true;
			}
		}
		
		return res;
	}
	
	/*
	prototipo: public Fecha RestarFecha(Fecha fechaIni,Fecha fechaFin) 
	comentario: sireve para restar dos fechas
	precondiciones:La fechaFin > fechaIni
	entradas: dos fechas
	salidas: un entero
	postcondiciones: AN devolvera el resultado
	*/
	/*
	
	resguardo
	
	public Fecha RestarFecha(Fecha fechaIni,Fecha fechaFin) 
	{
		int res=0;
		System.out.println("En construccion");
		return res;
	}*/
	
	public int RestarFecha(Fecha fechaIni,Fecha fechaFin) 
	{
		int anio=0;
		int mes=0;
		int dia=0;
		Fecha fechaResultante=new Fecha();
		
		if(fechaIni.getAnio()>=fechaFin.getAnio() && fechaIni.getMes()>=fechaFin.getMes() && fechaIni.getDia()>=fechaFin.getDia()) 
		{
			anio=fechaIni.getAnio()-fechaFin.getAnio();
			mes=fechaIni.getMes()-fechaFin.getMes();
			dia=fechaIni.getDia()-fechaFin.getDia();
		}
		else if(fechaIni.getAnio()>=fechaFin.getAnio() && fechaIni.getMes()>=fechaFin.getMes() && fechaIni.getDia()<fechaFin.getDia()) 
		{
			anio=fechaIni.getAnio()-fechaFin.getAnio();
			mes=fechaIni.getMes()-fechaFin.getMes();
			dia=fechaFin.getDia()-fechaIni.getDia();
		}
		else if(fechaIni.getAnio()>=fechaFin.getAnio() && fechaIni.getMes()<fechaFin.getMes() && fechaIni.getDia()<fechaFin.getDia()) 
		{
			anio=fechaIni.getAnio()-fechaFin.getAnio();
			mes=fechaFin.getMes()-fechaIni.getMes();
			dia=fechaFin.getDia()-fechaIni.getDia();
		}
		else if(fechaIni.getAnio()<fechaFin.getAnio() && fechaIni.getMes()<fechaFin.getMes() && fechaIni.getDia()>=fechaFin.getDia()) 
		{
			anio=fechaFin.getAnio()-fechaIni.getAnio();
			mes=fechaFin.getMes()-fechaIni.getMes();
			dia=fechaIni.getDia()-fechaFin.getDia();
		}
		else if(fechaIni.getAnio()<fechaFin.getAnio() && fechaIni.getMes()>=fechaFin.getMes() && fechaIni.getDia()>=fechaFin.getDia()) 
		{
			anio=fechaFin.getAnio()-fechaIni.getAnio();
			mes=fechaIni.getMes()-fechaFin.getMes();
			dia=fechaIni.getDia()-fechaFin.getDia();
		}
		else if(fechaIni.getAnio()<fechaFin.getAnio() && fechaIni.getMes()>=fechaFin.getMes() && fechaIni.getDia()<fechaFin.getDia()) 
		{
			anio=fechaFin.getAnio()-fechaIni.getAnio();
			mes=fechaIni.getMes()-fechaFin.getMes();
			dia=fechaFin.getDia()-fechaIni.getDia();
		}
		else 
		{
			anio=fechaFin.getAnio()-fechaIni.getAnio();
			mes=fechaFin.getMes()-fechaIni.getMes();
			dia=fechaFin.getDia()-fechaIni.getDia();
		}
		
		fechaResultante=new Fecha(dia,mes,anio);
		return fechaResultante.getDia();
	}
}