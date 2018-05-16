package CrearFicheros;

import java.io.*;

import Clases.*;

public class CrearFicherosProductoComprado 
{
	public static void main(String[] args) 
	{
		Fecha fecha1=new Fecha(15,2,1999);
		Fecha fecha2=new Fecha(14,5,1996);
		
		Producto p1=new Producto("DVD",1.2,fecha1,10,0.1);
		Producto p2=new Producto("USB",18.10,fecha2,10,0.125);
		
		//Anexar fichero
		File ficheroProductoComprado = new File("src\\Ficheros\\productoComprado.dat");
		
		FileOutputStream fos =null;
		ObjectOutputStream oos =null;
		try 
		{
			//Crear fichero
			ficheroProductoComprado.createNewFile();	
			
			//Abrir fichero para escribir
			fos = new FileOutputStream(ficheroProductoComprado);	
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
