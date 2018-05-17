package CrearFicheros;

import java.io.*;

import Clases.*;

public class CrearFicherosProductoComprado 
{
	public static void main(String[] args) 
	{
		Fecha fecha1=new Fecha(15,2,1999);
		Fecha fecha2=new Fecha(14,5,1996);
		Fecha fecha3=new Fecha(28,2,1992);
		Fecha fecha4=new Fecha(15,5,1996);
		Fecha fecha5=new Fecha(18,12,1994);
		
		Producto p1=new Producto("DVD",1.2,fecha1,50,0.1);
		Producto p2=new Producto("USB",18.10,fecha2,50,0.125);
		Producto p3=new Producto("CABLE HDMI",3.5,fecha3,50,0.2);
		Producto p4=new Producto("PANTALLA FULL HD",99,fecha4,50,2.5);
		Producto p5=new Producto("DISCO DURO SSD",55.5,fecha5,50,0.350);
		
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
			oos.writeObject(p3);
			oos.writeObject(p4);
			oos.writeObject(p5);
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
