package CrearFicheros;

import java.io.*;

import Clases.*;

public class CrearFicheroTrabajadorContartado 
{
	public static void main(String[] args) 
	{
		//Fecha fecha1=new Fecha(16,1,1999);
		Fecha fecha2=new Fecha(14,5,1996);
		Fecha fecha3=new Fecha(28,2,1992);
		Fecha fecha4=new Fecha(15,5,1996);
		Fecha fecha5=new Fecha(18,12,1994);
		
		Trabajador t1=new Trabajador("TOMAS","NUNIEZ","00000000T",fecha2,'V', TipoCargo.ENCARGADO);
		//Trabajador t2=new Trabajador("NZHDEH","YEGHIAZARYAN","X9923978F",fecha1,'V', TipoCargo.ENCARGADO);
		Trabajador t3=new Trabajador("LUIS","ZUMARRAGA","19355186L",fecha3,'V', TipoCargo.ENCARGADO);
		Trabajador t4=new Trabajador("ANTONIO","GONZALEZ","03882140Q",fecha4,'V', TipoCargo.VENDEDOR);
		Trabajador t5=new Trabajador("SIN NOMBRE","SIN APELLIDO","03562414J",fecha5,'V', TipoCargo.VENDEDOR);
		
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
			//oos.writeObject(t2);
			oos.writeObject(t3);
			oos.writeObject(t4);
			oos.writeObject(t5);
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
