package Proyecto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestoraTienda3 
{
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
	
	public static void DevolverProducto(Producto [] arrayVendido,Producto productoDevolucion,Producto[] productosEnTienda) throws ExcepcionProducto 
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
	precondiciones: no hay
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
		
	public static char ValidarDNI(String dni) throws StringIndexOutOfBoundsException
	{
		String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
		char letra=' ';
		int res=0;
		
		if(dni.length()<8) 
		{
			throw new StringIndexOutOfBoundsException("Nueve digitos porfa");
		}else 
		{
			res=Integer.parseInt(dni)%23;
			letra = caracteres.charAt(res);
		}
		
		return letra;
	}
	
	
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
	prototipo: public boolean ExisteDniNie(Trabajador [] trabajadorContratado,String dni)
	comentario:sirve para comprobar la existencia de un dni o un nie
	precondiciones: ninguna
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
	
	public int ExisteDniNie(Trabajador [] trabajadorContratado,String dni) throws ExcepcionTrabajador
	{
		boolean encontrado=false;
		int res=0;
		int i;
		
		for(i=0;i<trabajadorContratado.length && trabajadorContratado[i]!=null && encontrado==false;i++) 
		{
//			if(trabajadorContratado[i]!=null) 
//			{
				if(trabajadorContratado[i].getDni().equals(dni)) 
				{
					encontrado = true;
					res=1;
				}else 
				{
					res=(-1);
				}
//			}
//			else 
//			{
//				throw new ExcepcionTrabajador("No hay trabajadores contratados");
//			}
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
	
	/*
	prototipo: public Producto LeerValidarProductoParaVender(Producto [] productosEnTienda) 
	comentario: sireve para restar dos fechas
	precondiciones: no hay
	entradas: un array
	salidas: un objeto
	postcondiciones: AN devolvera el resultado
	*/
	/*
	
	resguardo
	
	 public Producto LeerValidarProductoParaVender(Producto [] productosEnTienda) 
	{
		Producto p=null
		System.out.println("En construccion");
		return p;
	}*/
	public Producto LeerValidarProductoParaVender(Producto [] productosEnTienda) throws NullPointerException
	{
		Scanner sc=new Scanner(System.in);
		Producto p= new Producto();
		Fecha fechaVenta=new Fecha();
		boolean fechaValida=false,repetir=false;
		int i=0;
		
		if(productosEnTienda[i]!=null) 
		{
			//leer el nombre del producto
			sc.nextLine();//para limpiar el buffer
			System.out.println("--------------------------------------------------");
			System.out.println("Introduce el nombre: ");
			try 
			{
				p.setNombre(sc.nextLine().toUpperCase());
			} catch (ExcepcionProducto e1) 
			{
				System.out.println(e1);
			}
			
			//leer y validar la cantidad 
			repetir=true;
			while(repetir) 
			{
				System.out.println("Introduce la cantidad: ");
				try 
				{
					try 
					{
						p.setCantidad(sc.nextInt());
					} catch (ExcepcionProducto e) 
					{
						System.out.println(e);
					}
					repetir=false;
				}catch(InputMismatchException ioe) 
				{
					sc.nextLine();
					System.out.println("Un numero entero porfa");
				}
			}
			
			//LeerValidarFecha
			do {
				System.out.println("Introduce la fecha de venta ");
				fechaVenta=fechaVenta.LeerValidarFecha();
				
				fechaValida=fechaVenta.ValidarFecha();
			}while(fechaValida!=true);
			
			if(productosEnTienda[i]!=null) 
			{
				//asignar el peso
				try 
				{
					p.setPeso(productosEnTienda[i].getPeso());
				} catch (ExcepcionProducto e) 
				{
					System.out.println(e);
				}
				//asignar el precio
				try
				{
					p.setPrecio(productosEnTienda[i].getPrecio());
				} catch (ExcepcionProducto e) 
				{
					System.out.println(e);
				}
			}
			
			p=new Producto(p.getNombre(),p.getPrecio(),fechaVenta,p.getCantidad(),p.getPeso());
		}
		else 
		{
			throw new NullPointerException("No hay productos en la tienda");
		}
		
		return p;
	}
	
	/*
	prototipo: public Producto LeerValidarProductoParaVender(Producto [] productosEnTienda) 
	comentario: sireve para restar dos fechas
	precondiciones: no hay
	entradas: un array
	salidas: un objeto
	postcondiciones: AN devolvera el resultado
	*/
	/*
	
	resguardo
	
	 public Producto LeerValidarProductoParaVender(Producto [] productosEnTienda) 
	{
		Producto p=null
		System.out.println("En construccion");
		return p;
	}*/
	public Producto LeerValidarProductoParaDevolucion(Producto [] arrayVendido) throws NullPointerException
	{
		Scanner sc=new Scanner(System.in);
		Producto p= new Producto();
		Fecha fechaVenta=new Fecha();
		boolean fechaValida=false,repetir=false;
		int i=0;
		
		if(arrayVendido[i]!=null) 
		{
			//leer el nombre del producto
			sc.nextLine();//para limpiar el buffer
			System.out.println("--------------------------------------------------");
			System.out.println("Introduce el nombre: ");
			try 
			{
				p.setNombre(sc.nextLine().toUpperCase());
			} catch (ExcepcionProducto e1) 
			{
				System.out.println(e1);
			}
			
			//leer y validar la cantidad 
			repetir=true;
			while(repetir) 
			{
				System.out.println("Introduce la cantidad: ");
				try 
				{
					try 
					{
						p.setCantidad(sc.nextInt());
					} catch (ExcepcionProducto e) 
					{
						System.out.println(e);
					}
					repetir=false;
				}catch(InputMismatchException ioe) 
				{
					sc.nextLine();
					System.out.println("Un numero entero porfa");
				}
			}
			
			//LeerValidarFecha
			do {
				System.out.println("Introduce la fecha de venta ");
				fechaVenta=fechaVenta.LeerValidarFecha();
				
				fechaValida=fechaVenta.ValidarFecha();
			}while(fechaValida!=true);
			
			//asignar el peso
			try 
			{
				p.setPeso(arrayVendido[i].getPeso());
			} catch (ExcepcionProducto e) 
			{
				System.out.println(e);
			}
			//asignar el precio
			try
			{
				p.setPrecio(arrayVendido[i].getPrecio());
			} catch (ExcepcionProducto e) 
			{
				System.out.println(e);
			}
			
			p=new Producto(p.getNombre(),p.getPrecio(),fechaVenta,p.getCantidad(),p.getPeso());
		}
		else 
		{
			throw new NullPointerException("No hay productos en la tienda");
		}
		
		return p;
	}
}
