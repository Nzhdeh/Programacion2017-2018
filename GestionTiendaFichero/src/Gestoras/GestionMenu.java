package Gestoras;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import Clases.*;
import Excepciones.*;

public class GestionMenu 
{
	/*
	//interfaz
	prototipo: static void MenuPrincipal()
	comentario:sirve para pintar el menu principal 
	precondiciones: la opcion esta entre 0 y 3
	entradas:no hay
	salidas:no hay
	entr/sal:no hay
	postcondiciones:no hay solo pinta en la pantalla el menu
	*/
	/*
	//resguardo
	public void MenuPrincipal()
	{
		System.out.println("En construccion");
	}*/
	
	public void MenuPrincipal()
	{	
		System.out.println("-----------------------------------------------");
		System.out.println("Pulsar 0 para Salir ");
		System.out.println("Pulsar 1 si eres el/la Jefe/a ");
		System.out.println("Pulsar 2 si eres el/la Encargado/a ");
		System.out.print("Pulsar 3 si eres el/la Trabajador/a: ");
	}
	
	/*
	//interfaz
	prototipo: public  void MenuJefe()
	comentario:sirve para pintar el menu 
	precondiciones: la opcion esta entre 0 y 6
	entradas:no hay
	salidas:no hay
	entr/sal:no hay
	postcondiciones:no hay solo pinta en la pantalla el menu
	*/
	/*
	//resguardo
	public  void MenuJefe()
	{
		System.out.println("En construccion");
	}*/
	
	public void MenuJefe()
	{
			System.out.println("-----------------------------------------------");
			System.out.println("Pulsar 0 para Salir ");
			System.out.println("Pulsar 1 para calcular las ventas ");
			System.out.println("Pulsar 2 para contratar un trabajador ");
			System.out.println("Pulsar 3 para despedir a un trabajador ");
			System.out.println("Pulsar 4 para la lista de trabajadores ");
			System.out.println("Pulsar 5 para consultar incidencias: ");
	}
	
	/*
	//interfaz
	prototipo: public tatic void MenuEncargado()
	comentario:sirve para pintar el menu
	precondiciones: la opcion esta entre 0 y 2
	entradas:no hay
	salidas:no hay
	entr/sal:no hay
	postcondiciones:no hay solo pinta en la pantalla el menu
	*/
	/*
	//resguardo
	public void MenuEncargado()
	{
		System.out.println("En construccion");
	}*/
	
	public void MenuEncargado()
	{
			System.out.println("-----------------------------------------------");
			System.out.println("Pulsar 0 para Salir ");
			System.out.println("Pulsar 1 para encargar productos nuevos ");
			System.out.println("Pulsar 2 para avisar sobre una incidecia ");
			System.out.println("Pulsar 3 para consultar productos en la tienda");
			System.out.print("Pulsar 4 para eliminar la incidencia: ");
	}
	
	/*
	//interfaz
	prototipo: public void MenuTrabajador()
	comentario:sirve para pintar el menu
	precondiciones: la opcion esta entre 0 y 2
	entradas:no hay
	salidas:no hay
	entr/sal:no hay
	postcondiciones:no hay solo pinta en la pantalla el menu
	*/
	/*
	//resguardo
	public void MenuTrabajador()
	{
		System.out.println("En construccion");
	}*/
	
	public void MenuTrabajador()
	{
			System.out.println("-----------------------------------------------");
			System.out.println("Pulsar 0 para Salir ");
			System.out.println("Pulsar 1 para vender productos ");
			System.out.print("Pulsar 2 para hacer una devolucion: ");
	}
	
	

	
	/*
	//interfaz
	prototipo: public static char ValidarCIF(String cif)
	comentario:sirve para validar un cif
	precondiciones: el tamaño de la cadena es de 9,el primer caracter es una letra entre A y Z,
					los demas digitos son numeros de entre 0 y 9
	entradas: una cadena
	salidas: un caracter
	entr/sal:no hay
	postcondiciones:AN devolvera la letra correspondiente a los digitos introducidos .
	*/
	
	/*
	//resguardo
	public static char ValidarCIF(String dni)
	{
		System.out.println("En construccion");
		return a;
	}*/
	/*	
	public static char ValidarCIF(String cif) 
	{
		String caracteres="TRWAGMYFPDXBNJZSQVHLCKE";
		char letra=' ';
		int res=0;
		
		cif=cif.substring(1, 8);
		
		res=Integer.parseInt(cif)%23;
		letra = caracteres.charAt(res);
		
		return letra;
	}*/	
	
	/*
	prototipo: public Fecha RestarFecha(Fecha fechaIni,Fecha fechaFin) 
	comentario: sireve para restar dos fechas
	precondiciones:La fechaFin > fechaIni
	entradas: dos fechas
	salidas: un entero
	postcondiciones: AN devolvera el resultado
	*/
	/*
	
	resguardo
	
	public Fecha RestarFecha(Fecha fechaIni,Fecha fechaFin) 
	{
		int res=0;
		System.out.println("En construccion");
		return res;
	}*/
	
//	public int RestarFecha(Fecha fechaIni,Fecha fechaFin) 
//	{
//		int anio=0;
//		int mes=0;
//		int dia=0;
//		Fecha fechaResultante=new Fecha();
//		
//		if(fechaIni.getAnio()>=fechaFin.getAnio() && fechaIni.getMes()>=fechaFin.getMes() && fechaIni.getDia()>=fechaFin.getDia()) 
//		{
//			anio=fechaIni.getAnio()-fechaFin.getAnio();
//			mes=fechaIni.getMes()-fechaFin.getMes();
//			dia=fechaIni.getDia()-fechaFin.getDia();
//		}
//		else if(fechaIni.getAnio()>=fechaFin.getAnio() && fechaIni.getMes()>=fechaFin.getMes() && fechaIni.getDia()<fechaFin.getDia()) 
//		{
//			anio=fechaIni.getAnio()-fechaFin.getAnio();
//			mes=fechaIni.getMes()-fechaFin.getMes();
//			dia=fechaFin.getDia()-fechaIni.getDia();
//		}
//		else if(fechaIni.getAnio()>=fechaFin.getAnio() && fechaIni.getMes()<fechaFin.getMes() && fechaIni.getDia()<fechaFin.getDia()) 
//		{
//			anio=fechaIni.getAnio()-fechaFin.getAnio();
//			mes=fechaFin.getMes()-fechaIni.getMes();
//			dia=fechaFin.getDia()-fechaIni.getDia();
//		}
//		else if(fechaIni.getAnio()<fechaFin.getAnio() && fechaIni.getMes()<fechaFin.getMes() && fechaIni.getDia()>=fechaFin.getDia()) 
//		{
//			anio=fechaFin.getAnio()-fechaIni.getAnio();
//			mes=fechaFin.getMes()-fechaIni.getMes();
//			dia=fechaIni.getDia()-fechaFin.getDia();
//		}
//		else if(fechaIni.getAnio()<fechaFin.getAnio() && fechaIni.getMes()>=fechaFin.getMes() && fechaIni.getDia()>=fechaFin.getDia()) 
//		{
//			anio=fechaFin.getAnio()-fechaIni.getAnio();
//			mes=fechaIni.getMes()-fechaFin.getMes();
//			dia=fechaIni.getDia()-fechaFin.getDia();
//		}
//		else if(fechaIni.getAnio()<fechaFin.getAnio() && fechaIni.getMes()>=fechaFin.getMes() && fechaIni.getDia()<fechaFin.getDia()) 
//		{
//			anio=fechaFin.getAnio()-fechaIni.getAnio();
//			mes=fechaIni.getMes()-fechaFin.getMes();
//			dia=fechaFin.getDia()-fechaIni.getDia();
//		}
//		else 
//		{
//			anio=fechaFin.getAnio()-fechaIni.getAnio();
//			mes=fechaFin.getMes()-fechaIni.getMes();
//			dia=fechaFin.getDia()-fechaIni.getDia();
//		}
//		
//		fechaResultante=new Fecha(dia,mes,anio);
//		return fechaResultante.getDia();
//	}
}
