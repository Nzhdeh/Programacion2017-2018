package Test;

import java.io.File;

import Clases.Fecha;
import Clases.TipoCargo;
import Clases.Trabajador;
import Gestoras.GestionTrabajador;
import Utilidades.Util;

public class TestGestionTrabajador 
{
	public static void main(String [] args) 
	{
		GestionTrabajador gt=new GestionTrabajador();
		Util u= new Util();
		File ficheroTrabajadorContratado=new File("src\\Ficheros\\trabajadorContratado.dat");
		
		String nie="X0000000T";
		String dni1="26584475A";
		
		Fecha fechaIni=new Fecha(15,2,1998);
		Fecha fechaFin=new Fecha(15,2,2000);
		Fecha fecha1=new Fecha(15,2,1999);
		Fecha fecha2=new Fecha(14,5,1996);
		Fecha fecha3=new Fecha(1,1,1995);
		
		Trabajador t1=new Trabajador("Tomas","Zumarraga","26584475A",fecha1,'V', TipoCargo.VENDEDOR);
		Trabajador t2=new Trabajador("Nzhdeh","Yeghiazaryan","00000000T",fecha1,'V', TipoCargo.ENCARGADO);
		Trabajador t3=new Trabajador("Rafa","Mateos","26584477A",fecha2,'V', TipoCargo.ENCARGADO);
		Trabajador t4=new Trabajador("TOMAS","NUNEZ","00000000T",fecha3,'V', TipoCargo.ENCARGADO);
		
//		//escrituras
//		u.EscribirEnFichero(t1, ficheroTrabajadorContratado);
//		u.EscribirEnFichero(t2, ficheroTrabajadorContratado);
//		u.EscribirEnFichero(t3, ficheroTrabajadorContratado);
//		u.EscribirEnFichero(t4, ficheroTrabajadorContratado);
//		
//		//lecturas
//		gt.LeerFicheroTrabajador();
//		
//		//eliminar
//		gt.EliminarTrabajadorPorMarca("26584475A");
//		
//		//ordenar
//		gt.OrdenarFicheroTrabajadorContratado();
//		gt.LeerFicheroTrabajador();
		
		
		//existe
//		System.out.println(gt.ExisteTrabajador("26584477A"));
//		System.out.println(gt.ExisteEncargado());
//		System.out.println(gt.ExisteVendedor());
//		System.out.println(gt.ExisteDniNie(dni1));
		
//		gt.LeerValidarProductoParaVender(ficheroTrabajadorContratado);
		
//		gt.ValidarDNI(dni1);
//		gt.ValidarNIE(nie);
	}
}
