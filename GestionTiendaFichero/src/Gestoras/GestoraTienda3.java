package Gestoras;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import Clases.*;
import Excepciones.*;

public class GestoraTienda3 
{
	/*
	//interfaz
	prototipo: public void CrearFicheroIncidencia() 
	comentario:sirve para crear el arcghivo txt para incidencias
	precondiciones:no hay
	entradas:no hay
	salidas:no hay
	entr/sal:no hay
	postcondiciones:no hay
	*/
	/*
	//resguardo
	public void CrearFicheroIncidencia() 
	{
		System.out.println("En construccion");
	}
	*/
	public void CrearFicheroIncidencia() 
	{
		File txt = new File("src\\Ficheros\\incidencia.txt");
		FileOutputStream fos =null;
		ObjectOutputStream oos =null;
		
		try {
			//Crear fichero
			txt.createNewFile();			
			//Abrir fichero para escribir
			fos = new FileOutputStream(txt);	
			oos = new ObjectOutputStream(fos);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			if (oos!=null) {
				try {
					//Cerrar fichero
					oos.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}			
		}
	}
}
