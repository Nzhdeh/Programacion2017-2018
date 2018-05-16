package CrearFicheros;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Clases.Fecha;
import Clases.Producto;

public class CrearFicheroProductoVendido 
{
	public static void main(String[] args) 
	{
		Fecha fecha1=new Fecha(15,2,1999);
		Fecha fecha2=new Fecha(14,5,1996);
		
		Producto p1=new Producto("DVD",1.2,fecha1,3,0.1);
		Producto p2=new Producto("USB",18.10,fecha2,2,0.125);
		
		//Anexar fichero
		File ficheroProductoVendido = new File("src\\Ficheros\\productoVendido.dat");
		
		FileOutputStream fos =null;
		ObjectOutputStream oos =null;
		try 
		{
			//Crear fichero
			ficheroProductoVendido.createNewFile();	
			
			//Abrir fichero para escribir
			fos = new FileOutputStream(ficheroProductoVendido);	
			oos = new ObjectOutputStream(fos);			
			//Introducir datos
			oos.writeObject(p1);
			oos.writeObject(p2);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} finally
		{
			if (oos!=null) 
			{
				try 
				{
					//Cerrar fichero
					oos.close();
				} 
				catch (IOException e) 
				{
					
					e.printStackTrace();
				}
			}
		}
	}
}
