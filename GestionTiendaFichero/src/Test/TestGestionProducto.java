package Test;

import java.io.File;

import Clases.*;
import Gestoras.GestionProducto;
import Utilidades.Util;

public class TestGestionProducto 
{
	public static void main (String [] args) 
	{
		Util u=new Util();
		GestionProducto gp=new GestionProducto();
		
		File ficheroProductoComprado = new File("src\\Ficheros\\productoComprado.dat");
		File ficheroProductoVendido = new File("src\\Ficheros\\productoVendido.dat");
		
		

		Fecha fechaIni=new Fecha(15,2,1998);
		Fecha fechaFin=new Fecha(15,2,2000);
		Fecha fecha1=new Fecha(15,2,1999);
		Fecha fecha2=new Fecha(14,5,1996);
		
		Producto p1=new Producto("DVD",1.2,fecha1,10,0.1);
		Producto p2=new Producto("USB",18.10,fecha1,10,0.125);
		Producto p3=new Producto("USB",18.10,fecha1,2,0.125);
		Producto p4=new Producto("PENDRIVE",5.99,fecha1,10,0.200);
		Producto p5=new Producto("PENDRIVE",5.99,fecha1,3,0.200);
		
//		//escrituras
//		u.EscribirEnFichero(p1, ficheroProductoComprado);
//		u.EscribirEnFichero(p4, ficheroProductoComprado);
//		u.EscribirEnFichero(p2, ficheroProductoVendido);
//		
//		//lecturas
//		gp.LeerFicheroProductoComprado(ficheroProductoComprado);
//		gp.LeerFicheroProductoComprado(ficheroProductoVendido);
//		
//		//vender
//		gp.VenderProducto(p1);
//		gp.VenderProducto2(p1);
//		u.EscribirEnFichero(p1, ficheroProductoVendido);
		
//		System.out.println(gp.CalcularVenta(fecha1, fecha2));
		
//		System.out.println(gp.ExisteProducto(p1));
		
//		gp.LeerFicheroProductoComprado(ficheroProductoVendido);
		
		//devolver
//		gp.DevolverProducto(p2);
//		gp.DevolverProducto2(p2);
	}
}
