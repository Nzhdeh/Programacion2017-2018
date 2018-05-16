package Gestoras;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.InputMismatchException;
import java.util.Scanner;

import Clases.Fecha;
import Clases.MiObjectOutputStream;
import Clases.Producto;
import Clases.Trabajador;
import Excepciones.ExcepcionProducto;
import Interfaces.InterfProducto;

public class GestionProducto 
{
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
	
//	public static Producto [] VenderProducto(Producto [] productos,Producto producto,Producto [] arrayVendido) throws ExcepcionProducto
//	{
//		int i=0;
//		
//		if(productos[i]==null) 
//		{
//			throw new ExcepcionProducto("No hay productos");
//		}else
//		{
//			arrayVendido[i]=(new Producto(producto));
//			productos[i].setCantidad(productos[i].getCantidad()-producto.getCantidad());
//		}
//		return arrayVendido;
//	}
	
	
	/*
	//interfaz
	prototipo: public void LeerFicheroProductoComprado(File ficheroParaBuscar)
	comentario: sirve para leer un fichero
	precondiciones: no hay
	entradas: un archivo File
	salidas: no hay
	entr/sal: no hay
	postcondiciones:No hay,solo pintara por pantalla los objetos del archivo
	*/
	/*
	//resguardo
	public void LeerFichero(File ficheroParaBuscar)
	{
		System.out.println("En construccion");
	}*/

	public void LeerFicheroProductoComprado(File ficheroParaBuscar)
    {
		ObjectInputStream ois = null;
		FileInputStream fis = null;

		try 
		{
			fis = new FileInputStream(ficheroParaBuscar);
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
				if(aux instanceof Producto) 
				{
					System.out.println(aux);
				}
				aux=ois.readObject();
			}
		}
		catch (EOFException e) 
		{
			System.out.println("Fin de fichero");
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
    }
	
	
	/*
	//interfaz
	prototipo: public void VenderProducto(Producto productoAVender)  
	comentario: sirve para simular la venta de un producto
	precondiciones: el fichero productoComprado debe estar lleno
	entradas: Producto productoAVender
	salidas: no hay
	entr/sal: no hay
	postcondiciones:fichero modificado
	*/
	/*
	//resguardo
	 public void VenderProducto(Producto productoAVender)  
	 {
		System.out.println("En construccion");
	 }*/
	
	public void VenderProducto(Producto productoAVender) 
	{
		File comprado=null;
		File compradoMov=null;
		
		FileOutputStream fos1=null;
		ObjectOutputStream oos=null;
		
		FileOutputStream fos2=null;
		MiObjectOutputStream moos=null;
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		Producto productoComprado=null;
		
		boolean primeraLectura=false;
		
		try 
		{
			comprado = new File("src\\Ficheros\\productoComprado.dat");
			compradoMov = new File("src\\Ficheros\\productoCompradoMov.dat");
			
			if(!compradoMov.exists()) 
			{
				fos1=new FileOutputStream(compradoMov);
				oos=new ObjectOutputStream(fos1);
				
				primeraLectura=true;
			}
			else 
			{
				fos2=new FileOutputStream(compradoMov,true);
				moos=new MiObjectOutputStream(fos2);
			}
			
			fis = new FileInputStream(comprado);
            ois = new ObjectInputStream(fis);
			
			Object aux= ois.readObject();//lectura del primero
			
			while(aux!=null) 
			{
				if(aux instanceof Producto) 
				{
					productoComprado=(Producto)aux;
					
					
					if(productoAVender.getNombre().equalsIgnoreCase(productoComprado.getNombre()) && productoAVender.getPeso()==productoComprado.getPeso()
							&& productoAVender.getPrecio()==productoComprado.getPrecio()) 
					{
						productoComprado.setCantidad(productoComprado.getCantidad()-productoAVender.getCantidad());
						
						if(primeraLectura) 
						{
							oos.writeObject(productoComprado);
						}
						else 
						{
							moos.writeUnshared(productoComprado);
						}
					}
					else 
					{
						if(primeraLectura) 
						{
							oos.writeObject(productoComprado);
						}
						else 
						{
							moos.writeUnshared(productoComprado);
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
		
		comprado.delete();//elimino el antiguo
		
		//sustituyo el nuevo
		
		Path aMover = Paths.get("src\\Ficheros\\productoCompradoMov.dat");
		Path renombrado = Paths.get("src\\Ficheros\\productoComprado.dat");
		
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
	prototipo: public void VenderProducto2(Producto productoAVender)  
	comentario: sirve para simular la venta de un producto
	precondiciones: el fichero productoComprado debe estar lleno
	entradas:Producto productoAVender
	salidas: no hay
	entr/sal: no hay
	postcondiciones:fichero modificado
	*/
	/*
	//resguardo
	 public void VenderProducto2(Producto productoAVender)  
	 {
		System.out.println("En construccion");
	 }*/
	
	public void VenderProducto2(Producto productoAVender) 
	{
		File vendido=null;
		File vendidoMov=null;
		
		FileOutputStream fos1=null;
		ObjectOutputStream oos=null;
		
		FileOutputStream fos2=null;
		MiObjectOutputStream moos=null;
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		Producto productoVendido=null;
		
		boolean primeraLectura=false;
		
		try 
		{
			vendido = new File("src\\Ficheros\\productoVendido.dat");
			vendidoMov = new File("src\\Ficheros\\productoVendidoMov.dat");
			
			if(!vendidoMov.exists()) 
			{
				fos1=new FileOutputStream(vendidoMov);
				oos=new ObjectOutputStream(fos1);
				
				primeraLectura=true;
			}
			else 
			{
				fos2=new FileOutputStream(vendidoMov,true);
				moos=new MiObjectOutputStream(fos2);
			}
			
			fis = new FileInputStream(vendido);
            ois = new ObjectInputStream(fis);
			
			Object aux= ois.readObject();//lectura del primero
			
			while(aux!=null) 
			{
				if(aux instanceof Producto) 
				{
					productoVendido=(Producto)aux;
					
					if(productoVendido.getNombre().equalsIgnoreCase(productoAVender.getNombre()) && productoAVender.getPeso()==productoVendido.getPeso() 
							&& productoAVender.getPrecio()==productoVendido.getPrecio()) //si los dos objetos son iguales
					{
						productoVendido.setCantidad(productoVendido.getCantidad()+productoAVender.getCantidad());
						
						if(primeraLectura) 
						{
							oos.writeObject(productoVendido);
						}
						else 
						{
							moos.writeUnshared(productoVendido);
						}
					}
					else 
					{
						if(primeraLectura) 
						{
							oos.writeObject(productoVendido);
						}
						else 
						{
							moos.writeUnshared(productoVendido);
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
				
				//ois.close();
				fis.close();
			}
			catch(IOException e) 
			{
				 e.printStackTrace();
			}
		}
		
		vendido.delete();//elimino el antiguo
		
		//sustituyo el nuevo
		
		Path aMover = Paths.get("src\\Ficheros\\productoVendidoMov.dat");
		Path renombrado = Paths.get("src\\Ficheros\\productoVendido.dat");
		
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
	prototipo: public double CalcularVenta(Fecha fechaIni,Fecha fechaFin)  
	comentario: sirve para calcular las ventas de un periodo de tiempo
	precondiciones: el fichero productoComprado debe estar lleno
	entradas: dos fechas
	salidas: double ventas
	entr/sal: no hay
	postcondiciones:AN devolvera las ventas
	*/
	/*
	//resguardo
	public double CalcularVenta(Fecha fechaIni,Fecha fechaFin)   
	{
		System.out.println("En construccion");
		return 1.0;
 	}*/
	
	
	public double CalcularVenta(Fecha fechaIni,Fecha fechaFin) 
	{
		File productoVendido=null;
		
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		
		double venta=0.0,precio=0.0;

		try 
		{
			productoVendido= new File("src\\Ficheros\\productoVendido.dat");
			
			fis = new FileInputStream(productoVendido);
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
				if(aux instanceof Producto) 
				{
					if((((Producto) aux).getFechaVenta().compareTo(fechaIni)==1 && ((Producto) aux).getFechaVenta().compareTo(fechaFin)==(-1)) ||
					   (((Producto) aux).getFechaVenta().compareTo(fechaIni)==(-1) && ((Producto) aux).getFechaVenta().compareTo(fechaFin)==1) ||
					   (((Producto) aux).getFechaVenta().compareTo(fechaIni)==0 || ((Producto) aux).getFechaVenta().compareTo(fechaFin)==0))
						{
							precio=((Producto) aux).getPrecio()*((Producto) aux).getCantidad();
							venta+=precio;
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
		
		return venta;
	}
	
	/*
	//interfaz
	prototipo: public boolean ExisteTrabajador(String dni)
	comentario: sirve para leer un fichero
	precondiciones: no hay
	entradas: un archivo File
	salidas: no hay
	entr/sal: no hay
	postcondiciones:No hay,solo pintara por pantalla los objetos del archivo
	*/
	/*
	//resguardo
	public boolean ExisteTrabajador(String dni)
	{
		System.out.println("En construccion");
		return true;
	}*/

	public boolean ExisteProducto(Producto producto)
    {
		File ficheroTrabajadorContratado=new File("src\\Ficheros\\productoVendido.dat");
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
				if(aux instanceof Producto) 
				{
					if(((Producto) aux).getNombre().equalsIgnoreCase(producto.getNombre()) && ((Producto) aux).getPeso()==producto.getPeso() &&
							((Producto) aux).getPrecio()==producto.getPrecio())
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
	prototipo: public Producto LeerValidarProductoParaDevolucion(Producto [] arrayVendido) 
	comentario: sireve para leer el producto que queremos devolver
	precondiciones: no hay
	entradas:Una ruta tipo File
	salidas: un objeto
	postcondiciones: AN devolvera el resultado
	*/
	/*
	
	resguardo
	
	 public Producto LeerValidarProductoParaDevolucion(Producto [] arrayVendido)  
	 {
		Producto p=null
		System.out.println("En construccion");
		return p;
	 }*/
	public Producto LeerValidarProductoParaDevolucion(File arrayVendido) throws NullPointerException
	{
		Scanner sc=new Scanner(System.in);
		Producto p= new Producto();
		Fecha fechaVenta=new Fecha();
		boolean fechaValida=false,repetir=false;
		
		if(arrayVendido!=null) 
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
				System.out.println("Introduce la cantidad a devolver: ");
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
				System.out.println("Introduce la fecha de devolucion ");
				fechaVenta=fechaVenta.LeerValidarFecha();
				
				fechaValida=fechaVenta.ValidarFecha();
			}while(fechaValida!=true);
			
			//asignar el peso
			
			try 
			{
				System.out.println("Introduce el peso ");
				p.setPeso(sc.nextDouble());
			} catch (ExcepcionProducto e) 
			{
				System.out.println(e);
			}
			//asignar el precio
			
			try
			{
				System.out.println("Introduce el precio ");
				p.setPrecio(sc.nextDouble());
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
	prototipo: public void DevolverProducto(Producto productoADevolver) 
	comentario: sirve para simular la devolucion de un producto
	precondiciones: el fichero productoComprado debe estar lleno
	entradas:Producto productoADevolver
	salidas: no hay
	entr/sal: no hay
	postcondiciones:fichero modificado
	*/
	/*
	//resguardo
	public void DevolverProducto(Producto productoADevolver) 
	 {
		System.out.println("En construccion");
	 }*/
	
	public void DevolverProducto(Producto productoADevolver) 
	{
		File comprado=null;
		File compradoMov=null;
		
		FileOutputStream fos1=null;
		ObjectOutputStream oos=null;
		
		FileOutputStream fos2=null;
		MiObjectOutputStream moos=null;
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		Producto productoComprado=null;
		
		boolean primeraLectura=false;
		
		try 
		{
			comprado = new File("src\\Ficheros\\productoVendido.dat");
			compradoMov = new File("src\\Ficheros\\productoVendidoMov.dat");
			
			if(!compradoMov.exists()) 
			{
				fos1=new FileOutputStream(compradoMov);
				oos=new ObjectOutputStream(fos1);
				
				primeraLectura=true;
			}
			else 
			{
				fos2=new FileOutputStream(compradoMov,true);
				moos=new MiObjectOutputStream(fos2);
			}
			
			fis = new FileInputStream(comprado);
            ois = new ObjectInputStream(fis);
			
			Object aux= ois.readObject();//lectura del primero
			
			while(aux!=null) 
			{
				if(aux instanceof Producto) 
				{
					productoComprado=(Producto)aux;
					
					
					if(productoADevolver.getNombre().equalsIgnoreCase(productoComprado.getNombre()) && productoADevolver.getPeso()==productoComprado.getPeso()
							&& productoADevolver.getPrecio()==productoComprado.getPrecio()) 
					{
						productoComprado.setCantidad(productoComprado.getCantidad()-productoADevolver.getCantidad());
						
						if(primeraLectura) 
						{
							oos.writeObject(productoComprado);
						}
						else 
						{
							moos.writeUnshared(productoComprado);
						}
					}
					else 
					{
						if(primeraLectura) 
						{
							oos.writeObject(productoComprado);
						}
						else 
						{
							moos.writeUnshared(productoComprado);
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
		
		comprado.delete();//elimino el antiguo
		
		//sustituyo el nuevo
		
		Path aMover = Paths.get("src\\Ficheros\\productoVendidoMov.dat");
		Path renombrado = Paths.get("src\\Ficheros\\productoVendido.dat");
		
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
	prototipo: public void DevolverProducto2(Producto productoADevolver) 
	comentario: sirve para simular devolucion
	precondiciones: el fichero productoComprado debe estar lleno
	entradas:Producto productoADevolver
	salidas: no hay
	entr/sal: no hay
	postcondiciones:fichero modificado
	*/
	/*
	//resguardo
	 public void DevolverProducto(Producto productoADevolver)  
	 {
		System.out.println("En construccion");
	 }*/
	
	public void DevolverProducto2(Producto productoADevolver) 
	{
		File vendido=null;
		File vendidoMov=null;
		
		FileOutputStream fos1=null;
		ObjectOutputStream oos=null;
		
		FileOutputStream fos2=null;
		MiObjectOutputStream moos=null;
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		Producto productoVendido=null;
		
		boolean primeraLectura=false;
		
		try 
		{
			vendido = new File("src\\Ficheros\\productoComprado.dat");
			vendidoMov = new File("src\\Ficheros\\productoCompradoMov.dat");
			
			if(!vendidoMov.exists()) 
			{
				fos1=new FileOutputStream(vendidoMov);
				oos=new ObjectOutputStream(fos1);
				
				primeraLectura=true;
			}
			else 
			{
				fos2=new FileOutputStream(vendidoMov,true);
				moos=new MiObjectOutputStream(fos2);
			}
			
			fis = new FileInputStream(vendido);
            ois = new ObjectInputStream(fis);
			
			Object aux= ois.readObject();//lectura del primero
			
			while(aux!=null) 
			{
				if(aux instanceof Producto) 
				{
					productoVendido=(Producto)aux;
					
					if(productoVendido.getNombre().equalsIgnoreCase(productoADevolver.getNombre()) && productoADevolver.getPeso()==productoVendido.getPeso() 
							&& productoADevolver.getPrecio()==productoVendido.getPrecio()) //si los dos objetos son iguales
					{
						productoVendido.setCantidad(productoVendido.getCantidad()+productoADevolver.getCantidad());
						
						if(primeraLectura) 
						{
							oos.writeObject(productoVendido);
						}
						else 
						{
							moos.writeUnshared(productoVendido);
						}
					}
					else 
					{
						if(primeraLectura) 
						{
							oos.writeObject(productoVendido);
						}
						else 
						{
							moos.writeUnshared(productoVendido);
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
				
				//ois.close();
				fis.close();
			}
			catch(IOException e) 
			{
				 e.printStackTrace();
			}
		}
		
		vendido.delete();//elimino el antiguo
		
		//sustituyo el nuevo
		
		Path aMover = Paths.get("src\\Ficheros\\productoCompradoMov.dat");
		Path renombrado = Paths.get("src\\Ficheros\\productoComprado.dat");
		
		try 
		{
			Files.move(aMover, renombrado, StandardCopyOption.REPLACE_EXISTING);
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
}
