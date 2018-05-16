package Gestoras;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import Clases.Fecha;
import Clases.MiObjectOutputStream;
import Clases.Producto;
import Clases.TipoCargo;
import Clases.Trabajador;
import Excepciones.ExcepcionProducto;
import Excepciones.ExcepcionTrabajador;
import Interfaces.InterfProducto;
import Utilidades.Util;

public class GestionTrabajador 
{
	/*
	//interfaz
	prototipo: public void LeerFicheroTrabajador()
	comentario: sirve para leer un fichero
	precondiciones: no hay
	entradas: un archivo File
	salidas: no hay
	entr/sal: no hay
	postcondiciones:No hay,solo pintara por pantalla los objetos del archivo
	*/
	/*
	//resguardo
	public void LeerFicheroTrabajador()
	{
		System.out.println("En construccion");
	}*/

	public void LeerFicheroTrabajador()
    {
		File ficheroParaBuscar=null;

        FileInputStream fis = null;
        ObjectInputStream ois = null;


	        try {

	        	ficheroParaBuscar = new File("src\\Ficheros\\trabajadorContratado.dat");

	            fis = new FileInputStream(ficheroParaBuscar);
	            ois = new ObjectInputStream(fis);

	        }
	        catch(FileNotFoundException e)
	        {
	            e.printStackTrace();
	        }
	        catch(IOException e)
	        {
	            e.printStackTrace();
	        }


	        try
	        {
	            Object aux = ois.readObject();

	            while (aux!=null) 
	            {
	                if (aux instanceof Trabajador)
	                {
	                	if(((Trabajador) aux).getSexo()!='*')
	                    System.out.println(aux);
	                }
	                aux = ois.readObject();
	            }
	            ois.close();
	        }
	        catch (EOFException e1)
	        {
	            System.out.println ("");
	        }
	        catch (Exception e2)
	        {
	            e2.printStackTrace();
	        }
	        finally 
	        {
	            try 
	            {
	                ois.close();
	                fis.close();
	            }catch (IOException e)
	            {
	                e.printStackTrace();
	            }
	        }
    }
	
	
	/*
	//interfaz
	prototipo:public void EliminarTrabajadorPorMarca(String dniABorrar) 
	comentario: sirve para marcar un trabajador para borrar
	precondiciones: no hay
	entradas: String dni
	salidas: no hay
	entr/sal: no hay
	postcondiciones:Fichero modificado
	*/
	/*
	//resguardo
	public void EliminarTrabajadorPorMarca(String dniABorrar)  
	{
		System.out.println("En construccion");
	}*/
	
	public void EliminarTrabajadorPorMarca(String dniABorrar) 
	{		
		
		
		FileOutputStream fos1=null;
		ObjectOutputStream oos=null;
		
		FileOutputStream fos2=null;
		MiObjectOutputStream moos=null;
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		boolean primeraLectura=false;
		
		Trabajador tMarcado=null;
		
		File trabajadorMovimiento=null;
		File trabajador=null;
		
		try 
		{
			trabajador= new File("src\\Ficheros\\trabajadorContratado.dat");
			trabajadorMovimiento = new File("src\\Ficheros\\trabajadorContratadoMov.dat");
			
			if(!trabajadorMovimiento.exists()) 
			{
				fos1=new FileOutputStream(trabajadorMovimiento);
				oos=new ObjectOutputStream(fos1);
				
				primeraLectura=true;
			}
			else 
			{
				fos2=new FileOutputStream(trabajadorMovimiento,true);
				moos=new MiObjectOutputStream(fos2);
			}
			
			fis = new FileInputStream(trabajador);
            ois = new ObjectInputStream(fis);
			
			Object aux= ois.readObject();//lectura del primero
			
			while(aux!=null) 
			{
				if(aux instanceof Trabajador) 
				{
					tMarcado=(Trabajador)aux;
					
					
					if(tMarcado.getDni().equals(dniABorrar)) 
					{
						tMarcado.setSexo('*');//cambio el atributo por un *
	
						if(primeraLectura) //escribiria el bojeto marcado tambien
						{
							oos.writeObject(tMarcado);
						}
						else 
						{
							moos.writeUnshared(tMarcado);
						}
					}
					else 
					{
						if(primeraLectura) 
							{
								oos.writeObject(tMarcado);
							}
							else 
							{
								moos.writeUnshared(tMarcado);
							}
					}
				}
				
				aux = ois.readObject();
			}
		}
		catch (EOFException e1)
        {
            System.out.println ("");
        }
        catch (Exception e2)
        {
            e2.printStackTrace();
        }
		finally 
		{
			try 
			{
				if(primeraLectura) 
				{
					oos.close();
					fos1.close();
				}
				else 
				{
					moos.close();
					fos2.close();
				}
				
				ois.close();
				fis.close();
			}
			catch(IOException e) 
			{
				 e.printStackTrace();
			}
		}
		
		trabajador.delete();//elimino el antiguo
		
		//sustituyo el nuevo
		
		Path aMover = Paths.get("src\\Ficheros\\trabajadorContratadoMov.dat");
		Path renombrado = Paths.get("src\\Ficheros\\trabajadorContratado.dat");
		
		try 
		{
			Files.move(aMover, renombrado, StandardCopyOption.REPLACE_EXISTING);
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	/*
	//interfaz
	prototipo: public void OrdenarFicheroTrabajadorContratado()  
	comentario: sirve para ordenar el fichero de movimiento
	precondiciones: el fichero debe existir y estar lleno
	entradas: no hay
	salidas: no hay
	entr/sal: no hay
	postcondiciones:fichero ordenado
	*/
	/*
	//resguardo
	public void OrdenarFicheroTrabajadorContratado() 
	{
		System.out.println("En construccion");
	}*/
	
	public void OrdenarFicheroTrabajadorContratado() 
	{
		Util util= new Util();
		
		File rutatrabajadorContratado=null;
		File rutatrabajadorContratadoMovimiento=null;
		
		FileOutputStream fos1=null;
		ObjectOutputStream oos=null;
		
		FileOutputStream fos2=null;
		MiObjectOutputStream moos=null;
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		Trabajador nuevo=null;
		
		ArrayList<Trabajador> paraOrdenar=new ArrayList<>();
		
		Object siguente =null;
		
		
		try 
		{
			rutatrabajadorContratado = new File("src\\Ficheros\\trabajadorContratado.dat");
			rutatrabajadorContratadoMovimiento = new File("src\\Ficheros\\trabajadorContratadoMovimiento.dat");
			
			fis= new FileInputStream(rutatrabajadorContratado);
			ois= new ObjectInputStream(fis);
			
			fos1= new FileOutputStream(rutatrabajadorContratadoMovimiento);
			oos= new ObjectOutputStream(fos1);
			
			fos2= new FileOutputStream(rutatrabajadorContratadoMovimiento,true);
			moos= new MiObjectOutputStream(fos2);
			
			siguente=ois.readObject();
			
			while(siguente!=null) 
			{
				if(siguente instanceof Trabajador) 
				{
					nuevo= (Trabajador) siguente;
					paraOrdenar.add(nuevo);
				}
				siguente=ois.readObject();
			}
		}
		catch(EOFException e) 
		{
			System.out.println("Fin de fichero");;
		}
		catch (ClassNotFoundException e) 
		{
			//e.printStackTrace();
		}
		catch(IOException e) 
		{
			//e.printStackTrace();
		}
		finally 
		{
			try 
			{
				ois.close();
				fis.close();
			}
			catch(IOException e) 
			{
				//e.printStackTrace();
			}
		}
		
		//vamos a ordenar
		
		util.BurbujaList(paraOrdenar);
		
		try 
		{
			for(int i=0;i<paraOrdenar.size();i++) 
			{
				if(i==0) 
				{
					oos.writeObject(paraOrdenar.get(i));
				}
				else 
				{
					moos.writeUnshared(paraOrdenar.get(i));
				}
			}
		}
		catch(EOFException e) 
		{
			e.printStackTrace();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				ois.close();
				fis.close();
				
				oos.close();
				fos1.close();
				
				moos.close();
				fos2.close();
			}
			catch(IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		rutatrabajadorContratado.delete();//elimino el antiguo
		
		//sustituyo el nuevo
		
		Path aMover = Paths.get("src\\Ficheros\\trabajadorContratadoMovimiento.dat");
		Path renombrado = Paths.get("src\\Ficheros\\trabajadorContratado.dat");
		
		try 
		{
			Files.move(aMover, renombrado, StandardCopyOption.REPLACE_EXISTING);
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	/*
	//interfaz
	prototipo: public boolean ExisteVendedor()
	comentario: sirve para ver si tiene un vendedor contratado
	precondiciones: no hay
	entradas: no hay
	salidas: no hay
	entr/sal: no hay
	postcondiciones:AN devolvera true si existe y false si no
	*/
	/*
	//resguardo
	public boolean ExisteVendedor()
	{
		System.out.println("En construccion");
		return true;
	}*/

	public boolean ExisteVendedor()
    {
		File ficheroTrabajadorContratado=new File("src\\Ficheros\\trabajadorContratado.dat");
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		
		boolean encontrado=false;
		Trabajador t=null;
		
		try 
		{
			fis = new FileInputStream(ficheroTrabajadorContratado);
			ois = new ObjectInputStream(fis);

		} 
		catch(FileNotFoundException e) 
		{
			System.out.println("Fichero no encontrado");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			Object aux=ois.readObject();
			
			while(aux!=null) 
			{
				if(aux instanceof Trabajador) 
				{
					if(((Trabajador) aux).getCARGO()==TipoCargo.VENDEDOR) 
					{
						encontrado=true;
					}
				}
				aux=ois.readObject();
			}
		}
		catch (EOFException e) 
		{
			System.out.println("");
		}
		catch (Exception e) 
		{
				e.printStackTrace();
		}
		finally 
		{
			try 
			{
				if (fis != null)
					fis.close();
			} 
			catch (IOException ex) 
			{
				ex.printStackTrace();
			}

		}
		
		return encontrado;
		
    }
	
	/*
	//interfaz
	prototipo: public boolean ExisteEncargado()
	comentario: sirve para ver si tiene un encargado contratado
	precondiciones: no hay
	entradas: no hay
	salidas: no hay
	entr/sal: no hay
	postcondiciones:AN devolvera true si existe y false si no
	*/
	/*
	//resguardo
	public boolean ExisteEncargado()
	{
		System.out.println("En construccion");
		return true;
	}*/

	public boolean ExisteEncargado()
    {
		File ficheroTrabajadorContratado=new File("src\\Ficheros\\trabajadorContratado.dat");
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		
		boolean encontrado=false;

		try 
		{
			fis = new FileInputStream(ficheroTrabajadorContratado);
			ois = new ObjectInputStream(fis);

		} 
		catch(FileNotFoundException e) 
		{
			System.out.println("Fichero no encontrado");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			Object aux=ois.readObject();
			
			while(aux!=null) 
			{
				if(aux instanceof Trabajador) 
				{
					if(((Trabajador) aux).getCARGO()==TipoCargo.ENCARGADO)
					encontrado=true;
				}
				aux=ois.readObject();
			}
		}
		catch (EOFException e) 
		{
			System.out.println("");
		}
		catch (Exception e) 
		{
				//e.printStackTrace();
		}
		finally 
		{
			try 
			{
				if (fis != null)
					fis.close();
			} 
			catch (IOException ex) 
			{
				ex.printStackTrace();
			}

		}
		
		return encontrado;
		
    }
	
	/*
	//interfaz
	prototipo: public boolean ExisteTrabajador(String dni)
	comentario: sirve para leer ver si existe un trabajador en concreto
	precondiciones: no hay
	entradas: String dni
	salidas: logico
	entr/sal: no hay
	postcondiciones:AN devolvera true si existe y false si no
	*/
	/*
	//resguardo
	public boolean ExisteTrabajador(String dni)
	{
		System.out.println("En construccion");
		return true;
	}*/

	public boolean ExisteTrabajador(String dni)
    {
		File ficheroTrabajadorContratado=new File("src\\Ficheros\\trabajadorContratado.dat");
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		
		boolean encontrado=false;
		Trabajador t=null;

		try 
		{
			fis = new FileInputStream(ficheroTrabajadorContratado);
			ois = new ObjectInputStream(fis);

		} 
		catch(FileNotFoundException e) 
		{
			System.out.println("Fichero no encontrado");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			Object aux=ois.readObject();
			
			while(aux!=null) 
			{
				if(aux instanceof Trabajador) 
				{
					t=(Trabajador)aux;
					if(t.getDni().equals(dni))
					encontrado=true;
				}
				aux=ois.readObject();
			}
		}
		catch (EOFException e) 
		{
			System.out.println("");
		}
		catch (Exception e) 
		{
				e.printStackTrace();
		}
		finally 
		{
			try 
			{
				if (fis != null)
					fis.close();
			} 
			catch (IOException ex) 
			{
				ex.printStackTrace();
			}

		}
		
		return encontrado;
		
    }
	
	/*
	prototipo: public Producto LeerValidarProductoParaVender(File productosEnTienda) 
	comentario: sireve para leer productos que queremos vender
	precondiciones: no hay
	entradas: File productosEnTienda
	salidas: un objeto
	postcondiciones: AN devolvera el resultado
	*/
	/*
	
	resguardo
	
	 public Producto LeerValidarProductoParaVender(File productosEnTienda) 
	 {
		Producto p=null
		System.out.println("En construccion");
		return p;
	 }*/
	public Producto LeerValidarProductoParaVender(File productosEnTienda) throws NullPointerException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		Scanner sc=new Scanner(System.in);
		
		Producto p= new Producto();
		Fecha fechaVenta=new Fecha();
		boolean fechaValida=false,repetir=false;
		//int i=0;
		
		if(productosEnTienda!=null) 
		{
			//leer el nombre del producto
			System.out.println("--------------------------------------------------");
			System.out.println("Introduce el nombre: ");
			try 
			{
				try 
				{
					p.setNombre(br.readLine().toUpperCase());
				} catch (IOException e) 
				{}
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
						p.setCantidad(Integer.parseInt (br.readLine()));
					} catch (ExcepcionProducto e) 
					{
						System.out.println(e);
					}
					repetir=false;
				}catch(IOException ioe) 
				{
					try 
					{
						br.readLine();
					} catch (IOException e) 
					{
					}
					System.out.println("Un numero entero porfa");
				}
			}
			
			//LeerValidarFecha
			do {
				System.out.println("Introduce la fecha de venta ");
				fechaVenta=fechaVenta.LeerValidarFecha();
				
				fechaValida=fechaVenta.ValidarFecha();
			}while(fechaValida!=true);
			
			
			try 
			{
				System.out.println("Introduce el peso ");
				try {
					p.setPeso(sc.nextDouble());
				} catch (NumberFormatException e) 
				{
					e.printStackTrace();
				}
			} catch (ExcepcionProducto e) 
			{
				System.out.println(e);
			}
			
			try
			{
				System.out.println("Introduce el precio ");
				try 
				{
					p.setPrecio(sc.nextDouble());
				} catch (NumberFormatException e) 
				{
					e.printStackTrace();
				}
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
	
	/*
	//interfaz
	prototipo: public  char ValidarDNI(String dni)
	comentario:sirve para validar un dni
	precondiciones: el ultimo caracter es una letra entre A y Z,los demas digitos son numeros de entre 0 y 9
	entradas: una cadena
	salidas: un caracter
	entr/sal:no hay
	postcondiciones:AN devolvera la letra correspondiente a los digitos introducidos .
	*/
	
	/*
	//resguardo
	public  char ValidarDNI(String dni)
	{
		System.out.println("En construccion");
		return a;
	}*/
		
	public char ValidarDNI(String dni) throws StringIndexOutOfBoundsException
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
	prototipo: public  char ValidarNIE(String dni)
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
	public  char ValidarNIE(String dni)
	{
		System.out.println("En construccion");
		return a;
	}*/
		
	public char ValidarNIE(String dni) 
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
	prototipo: public boolean ExisteDniNie(String dni)
	comentario: sirve para ver si el dni ya esta registrado
	precondiciones: fichero lleno
	entradas: String dni
	salidas: no hay
	entr/sal: no hay
	postcondiciones:AN devolvera true si existe y false si no
	*/
	/*
	//resguardo
	public boolean ExisteDniNie(String dni)
	{
		System.out.println("En construccion");
		return true;
	}*/

	public boolean ExisteDniNie(String dni)
    {
		File ficheroTrabajadorContratado=new File("src\\Ficheros\\trabajadorContratado.dat");
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		
		boolean encontrado=false;
		Trabajador t=null;
		
		try 
		{
			fis = new FileInputStream(ficheroTrabajadorContratado);
			ois = new ObjectInputStream(fis);

		} 
		catch(FileNotFoundException e) 
		{
			System.out.println("Fichero no encontrado");
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		try 
		{
			Object aux=ois.readObject();
			
			if(aux!=null) 
			{
				while(aux!=null) 
				{
					if(aux instanceof Trabajador) 
					{
						if(((Trabajador) aux).getDni().equals(dni))
						encontrado=true;
					}
					aux=ois.readObject();
				}
			}
			else 
			{
				encontrado=false;
			}
		}
		catch (EOFException e) 
		{
			System.out.println("");
		}
		catch (Exception e) 
		{
			//e.printStackTrace();
		}
		finally 
		{
			try 
			{
				if (fis != null)
					fis.close();
			} 
			catch (IOException ex) 
			{
				ex.printStackTrace();
			}

		}
		
		return encontrado;
		
    }
}
