package Test;

import Clases.*;
import Excepciones.*;
import Gestoras.GestoraTienda3;

public class ConductorGestoraTienda3 
{
	public static void main (String [] args) 
	{
		int i=0;
		String nombre="",dni="";
		GestoraTienda3 gt3=new GestoraTienda3();
		
		Fecha fechaVenta1=new Fecha(31,1,2017);
		Fecha fechaVenta2=new Fecha(5,1,2017);
		Fecha fechaNacimiento=new Fecha(16,1,1991);
		
		Fecha fechaIni=new Fecha(1,1,2017);
		Fecha fechaFin=new Fecha(31,1,2017);
		
		Producto p1=new Producto ("cd",2.4,fechaVenta1,10,0.1);
		Producto p2= new Producto("usb",2.4,fechaVenta2,10,0.2);
		
		Producto [] productosVendidos=new Producto[20];
		Producto [] producto=new Producto[20];
		producto[0]=(p1);
		producto[1]=(p2);
		
		productosVendidos[0]=(p1);
		productosVendidos[1]=(p2);
		
		Trabajador t1=new Trabajador("Nzhdeh","Yeghiazaryan","X9923978F",fechaNacimiento,'V',TipoCargo.ENCARGADO);
		Trabajador t2=new Trabajador("Luis","Zumarraga","00000000T",fechaNacimiento,'V',TipoCargo.VENDEDOR);
		Trabajador [] contrataTrabajador=new Trabajador[20];
		contrataTrabajador[0]=new Trabajador(t1);
		contrataTrabajador[1]=new Trabajador(t2);
		
		//dni="X9923979F";
		Incidencia [] inci=new Incidencia[5];
		Incidencia denuncia1=new Incidencia("El pan esta duro");
		Incidencia denuncia2=new Incidencia("Denuncia");
		inci[0]=denuncia1;
		inci[1]=denuncia2;
		
		Producto [] productoComprado=new Producto[20];
		productoComprado[0]=(p1);
		productoComprado[1]=(p2);	
		
		Producto [] arrayVendido=new Producto[20];
		arrayVendido[0]=(p1);
		
		Producto [] productosEnTienda=new Producto[20];
		
		
		try 
		{
			GestoraTienda3.DevolverProducto(arrayVendido,p1, productoComprado);
		} catch (ExcepcionProducto e) 
		{
			System.out.println(e+": No existe");
		}catch (IndexOutOfBoundsException e) 
		{
			System.out.println("Array vacio");
		}
		try 
		{
			System.out.println(GestoraTienda3.ValidarDNI("15674732"));
		}catch(NumberFormatException e) 
		{
			System.out.println(e+": No valido");
		}
		
		try 
		{
			System.out.println(GestoraTienda3.ValidarNIE("X9923978F"));
		}catch(NumberFormatException e) 
		{
			System.out.println(e+": No valido");
		}		
//		System.out.println(GestoraTienda3.ValidarCIF("B90214297"));		
		try 
		{
			System.out.println(gt3.ExisteDniNie(contrataTrabajador, "X9923978F"));
		} catch (ExcepcionTrabajador e) 
		{
			System.out.println(e);
		}
		try
		{
			System.out.println(gt3.ExisteDniNie(contrataTrabajador, "00000000T"));
		} catch (ExcepcionTrabajador e) 
		{
			System.out.println(e);
		}
		System.out.println(gt3.ExisteEncargado(contrataTrabajador));
		System.out.println(gt3.ExisteVendedor(contrataTrabajador));
		
//		System.out.println(gt3.LeerValidarProductoParaDevolucion(arrayVendido));
//		System.out.println(gt3.LeerValidarProductoParaVender(productosEnTienda));
	}
}
