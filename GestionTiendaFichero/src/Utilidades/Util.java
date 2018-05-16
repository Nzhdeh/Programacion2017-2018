package Utilidades;

import java.io.*;
import java.util.ArrayList;

import Clases.MiObjectOutputStream;
import Clases.*;

public class Util 
{
	/*
	//interfaz
	prototipo: public <T> void EscribirEnFichero(T item,String rutaFichero) 
	comentario: sirve para guardar cualquier tipo de objeto en un fichero
	precondiciones: no hay
	entradas: un objeto 
	salidas: no hay
	entr/sal: no hay
	postcondiciones:No hay
	*/
	/*
	//resguardo
	public <T> void EscribirEnFichero(T item,String rutaFichero)  
	{
		System.out.println("En construccion");
	}*/
	
	public <T> void EscribirEnFichero(T objeto,File rutaFichero) //Es generico
	{
		MiObjectOutputStream moos = null;
		ObjectOutputStream oos=null;
		FileOutputStream fos1 = null;
		FileOutputStream fos2 = null;
		
		boolean lecturaInicial=false;
		
		
		try 
		{
			if(!rutaFichero.exists()) 
			{
				fos1=new FileOutputStream(rutaFichero);
				oos=new ObjectOutputStream(fos1);
				
				lecturaInicial=true;
			}
			else 
			{
				fos2=new FileOutputStream(rutaFichero,true);
				moos=new MiObjectOutputStream(fos2);
			}
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		
		try 
		{
			if(lecturaInicial) 
			{
				oos.writeObject(objeto);
			}
			else 
			{
				moos.writeUnshared(objeto);
			}
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
		catch(NullPointerException e) 
		{
			e.printStackTrace();
		}
		
		finally 
		{
			try 
			{
				if(lecturaInicial)
				{
					oos.close();
					fos1.close();
				}
				else 
				{
					moos.close();
					fos2.close();
				}
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
			
		}
	}
	
	
	/*
	//interfaz
	prototipo: public <T extends Comparable> void BurbujaList(ArrayList<T> array)
	comentario: sirve paraordenar una lista
	precondiciones: no hay
	entradas: no hay
	salidas: no hay
	entr/sal: un ArrayList
	postcondiciones:No hay
	*/
	/*
	//resguardo
	public <T> void EscribirEnFichero(T item,String rutaFichero)  
	{
		System.out.println("En construccion");
	}*/
	
	public <T extends Comparable> void BurbujaList(ArrayList<T> array)
	{
        T aux;

        for(int i=0;i<(array.size()-1);i++)
        {
            for(int j=i+1;j<array.size();j++)
            {
                if(array.get(i).compareTo(array.get(j))==1)
                {
                    aux=array.get(i);
                    array.set(i, array.get(j));
                    array.set(j, aux);
                }
            }
        }
	}
}
