package CrearFicheros;

import java.io.*;

import Clases.*;

public class CrearFicheroTrabajadorContartado 
{
	public static void main(String[] args) 
	{
		Fecha fecha1=new Fecha(15,2,1999);
		Fecha fecha2=new Fecha(14,5,1996);
		
		Trabajador t1=new Trabajador("TOMAS","NUNEZ","00000000T",fecha1,'V', TipoCargo.VENDEDOR);
		Trabajador t2=new Trabajador("NZHDEH","YEGHIAZARYAN","X0000000T",fecha1,'V', TipoCargo.ENCARGADO);
		
		//Anexar fichero
		File ficheroTrabajadorContratado = new File("src\\Ficheros\\trabajadorContratado.dat");
		
		FileOutputStream fos =null;
		ObjectOutputStream oos =null;
		try 
		{
			//Crear fichero
			ficheroTrabajadorContratado.createNewFile();	
			
			//Abrir fichero para escribir
			fos = new FileOutputStream(ficheroTrabajadorContratado);	
			oos = new ObjectOutputStream(fos);		
			
			//Introducir datos
			oos.writeObject(t1);
			oos.writeObject(t2);
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
