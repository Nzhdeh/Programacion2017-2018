package Gestoras;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;

import Clases.*;
import Excepciones.*;
import Utilidades.*;

public class GestionIncidencia 
{
	/*
	//interfaz
	prototipo: public ArrayList<Incidencia> AvisarIncidencias(Incidencia incidencia,ArrayList<Incidencia> clienteDenuncia )
	comentario:este metodo sirve para avisar qualquier incidencia
	precondiciones: No hay
	entradas: un objeto,un arraylist
	salidas: no hay
	entr/sal:un arraylist
	postcondiciones:AN devolvera el array de incidencias
	*/
	
	/*
	//resguardo
	public ArrayList<Incidencia> AvisarIncidencias(Incidencia incidencia,ArrayList<Incidencia> clienteDenuncia )
	{
		System.out.println("En construccion");
		return clienteDenuncia[0];
	}*/
	
	public ArrayList<Incidencia> AvisarIncidencias(Incidencia incidencia,ArrayList<Incidencia> clienteDenuncia )
	{	
		clienteDenuncia.add(incidencia);
		
		return clienteDenuncia;
	}
	
	/*
	//interfaz
	prototipo: public void ConsultarIncidencias(ArrayList<Incidencia> clienteDenuncia
	comentario:este metodo sirve para consultar las incidencias
	precondiciones: no hay
	entradas: un arraylist de objeto Incidencia
	salidas: no hay
	entr/sal: no hay
	postcondiciones: no hay,solo pinta por pantalla las incidencias
	*/
	
	/*
	//resguardo
	public void ConsultarIncidencias(ArrayList<Incidencia> clienteDenuncia) throws NullPointerException
	{
		System.out.println("En construccion");
	}*/
	
	public void ConsultarIncidencias(ArrayList<Incidencia> clienteDenuncia) throws NullPointerException
	{
		int i=0;
		
		if(clienteDenuncia.get(i)!=null)
		{
			for(i=0;i<clienteDenuncia.size();i++) 
			{
				System.out.println(clienteDenuncia.get(i));
			}
		}else
		{
			System.out.println("---------------------------------------");
			throw new NullPointerException("No hay Incidencias guardadas");
		}
	}
	
	/*
	//interfaz
	prototipo: public void EliminarIncidencias(ArrayList<Incidencia> denuncia,int idIncidencia) 
	comentario:este metodo sirve para eliminar las incidencias 
	precondiciones: array lleno
	entradas: un entero y un array de incidencia
	salidas: logico
	entr/sal:no hay
	postcondiciones:no hay
	*/
	
	/*
	//resguardo
	public void EliminarIncidencias(ArrayList<Incidencia> denuncia,int idIncidencia) 
	{
		System.out.println("En construccion");
	}*/
	
	public void EliminarIncidencias(ArrayList<Incidencia> denuncia,int idIncidencia) 
	{
        boolean resultado = false;
       
        for (int i = 0; i < denuncia.size() && resultado==false; i++) 
        {
    		 if (denuncia.get(i).getId() == idIncidencia) 
             {
    			 denuncia.remove(denuncia.get(i));
             }
        }
	        
       // return resultado;
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
	
//	public boolean EliminarIncidencia(Incidencia [] denuncia,int idIncidencia) 
//	{
//        boolean resultado = false;
//       
//        for (int i = 0; i < denuncia.length && resultado==false; i++) 
//        {
//    		 if (denuncia[i].getId() == idIncidencia) 
//             {
//                 for (int j = i; j < denuncia.length - 1; j++) 
//                 {
//                 	denuncia[j] = denuncia[j+1];
//                 }
//                 denuncia[denuncia.length - 1] = null;
//                 resultado = true;
//             }
//        }
//	        
//        return resultado;
//    }	
	
	
	/*
	//interfaz
	prototipo: public void LeerFicheroIncidencia(File ficheroParaBuscar)
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

//	public void LeerFicheroIncidencia(File ficheroParaBuscar)
//    {
//		ObjectInputStream ois = null;
//		FileInputStream fis = null;
//
//		try 
//		{
//			fis = new FileInputStream(ficheroParaBuscar);
//			ois = new ObjectInputStream(fis);
//
//		} 
//		catch(FileNotFoundException e) 
//		{
//			System.out.println("Fichero no encontrado");
//		}
//		catch (IOException e) 
//		{
//			e.printStackTrace();
//		}
//		
//		try 
//		{
//			Object aux=ois.readObject();
//			
//			while(aux!=null) 
//			{
//				if(aux instanceof Incidencia) 
//				{
//					System.out.println(aux);
//				}
//				aux=ois.readObject();
//			}
//		}
//		catch (EOFException e) 
//		{
//			System.out.println("Fin de fichero");
//		}
//		catch (Exception e) 
//		{
//				e.printStackTrace();
//		}
//		finally 
//		{
//			try 
//			{
//				if (fis != null)
//					fis.close();
//			} 
//			catch (IOException ex) 
//			{
//				ex.printStackTrace();
//			}
//
//		}
//    }
	
	
	
	
	
	/*
	//interfaz
	prototipo: public void EliminarIncidencia(int id,File rutaObjetoABorrar) 
	comentario: sirve para marcar una incidencia para borrar
	precondiciones: no hay
	entradas: un archivo File,int id
	salidas: no hay
	entr/sal: no hay
	postcondiciones:No hay
	*/
	/*
	//resguardo
	public void EliminarIncidencia(int id,File rutaObjetoABorrar) 
	{
		System.out.println("En construccion");
	}*/
	
//	public void EliminarIncidencia(int id,File rutaObjetoABorrar) 
//	{				
//		Incidencia tMarcado=null;
//		
//		File trabajadorMovimiento=null;
//		
//		MiObjectOutputStream moos = null;
//		ObjectOutputStream oos=null;
//		FileOutputStream fos1 = null;
//		FileOutputStream fos2 = null;
//		
//		boolean lecturaInicial=false;
//		
//		FileInputStream fis=null;
//		ObjectInputStream ois=null;
//		
//		try 
//		{
//			trabajadorMovimiento = new File("src\\Ficheros\\trabajadorContratadoBorrado.dat");
//			
//			if(!trabajadorMovimiento.exists()) 
//			{
//				fos1=new FileOutputStream(trabajadorMovimiento);
//				oos=new ObjectOutputStream(fos1);
//				
//				lecturaInicial=true;
//			}
//			else 
//			{
//				fos2=new FileOutputStream(trabajadorMovimiento,true);
//				moos=new MiObjectOutputStream(fos2);
//			}
//			
//			fis = new FileInputStream(rutaObjetoABorrar);
//            ois = new ObjectInputStream(fis);
//			
//			Object aux= ois.readObject();//lectura del primero
//			
//			while(aux!=null) 
//			{
//				if(aux instanceof Incidencia) 
//				{
//					tMarcado=(Incidencia)aux;
//					
//					//DniLeida=
//					
//					if(id==tMarcado.getId()) 
//					{
//						tMarcado.setEstado("*");
//						
//						if(lecturaInicial) 
//						{
//							oos.writeObject(tMarcado);
//						}
//						else 
//						{
//							moos.writeUnshared(tMarcado);
//						}
//					}
//				}
//				
//				aux = ois.readObject();
//			}
//		}
//		catch (EOFException e1)
//        {
//            System.out.println ("");
//        }
//        catch (Exception e2)
//        {
//            e2.printStackTrace();
//        }
//		finally 
//		{
//			try 
//			{
//				if(lecturaInicial) 
//				{
//					oos.close();
//					fos1.close();
//				}
//				else 
//				{
//					moos.close();
//					fos2.close();
//				}
//				
//				ois.close();
//				fis.close();
//			}
//			catch(IOException e) 
//			{
//				 e.printStackTrace();
//			}
//		}
//	}
	
	
	
	
	/************************************************************
	public int verUltimaId(File f) 
	{  
        int id = 0;
        //File f = new File(rutaIDDiscoDuro);
        FileReader archivo = null;
        if (f.exists()) 
        {
            try 
            {
                archivo = new FileReader(f);
                //lectura anticipada
                int aux = archivo.read();
                while (aux != -1) 
                {
                    id = aux;
                    aux = archivo.read();
                }
            } 
            catch (IOException e) 
            {
                System.out.println(e);
            } 
            finally 
            {
                try 
                {
                    archivo.close();
                } 
                catch (IOException e) 
                {
                    System.out.println(e);
                }
            }
        }
        return id;
    }
	
	
	 public void guardarUltimaId(int id,File f) 
	 {  
	        //File f = new File(rutaIDDiscoDuro);
	        FileWriter archivo = null;
	        try 
	        {
	            // Sobrescribimos el fichero para escribir la id.
	            archivo = new FileWriter(f, false);
	            // Sobrescribimos la id
	            archivo.write(id);
	        } 
	        catch (IOException ioe) 
	        {
	            System.out.println(ioe);
	        } 
	        finally 
	        {
	            try 
	            {
	                archivo.close();
	            } catch (IOException e) 
	            {
	                System.out.println(e);
	            }
	        }
	    }*************************************************************************/
}
