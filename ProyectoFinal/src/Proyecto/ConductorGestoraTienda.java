
package Proyecto;

import java.util.*;

public class ConductorGestoraTienda
{
	public static void main(String[] args) throws ExcepcionTrabajador, ExcepcionFecha
	{
		int i=0;
		String nombre="",dni="";
		GestoraTienda gt=new GestoraTienda();
		
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
		contrataTrabajador[0]=(t1);
		contrataTrabajador[1]=(t2);
		//dni=contrataTrabajador.get(i).getDni();
		dni="X9923979F";
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
		
//		GestoraTienda.MenuPrincipal();
//		GestoraTienda.MenuJefe();
//		GestoraTienda.MenuEncargado();
//		GestoraTienda.MenuTrabajador();
		
//		try 
//		{
//			GestoraTienda.PintaProductos(producto);
//		}catch(NullPointerException e) 
//		{
//			System.out.println(e);
//		}
		
//		try 
//		{
//			System.out.println(GestoraTienda.ExisteProducto(producto, nombre));
//		} catch (ExcepcionProducto e) 
//		{
//			System.out.println(e+": Producto no encontrado");
//		}
//		nombre="usb";
//		try 
//		{
//			System.out.println(GestoraTienda.ExisteProducto(producto, nombre));
//		} catch (ExcepcionProducto e) 
//		{
//			System.out.println(e+": Producto no encontrado");
//		}
		
//		System.out.println(GestoraTienda.CalculaVenta(productosVendidos, fechaIni, fechaFin));	
//		System.out.println(GestoraTienda.ExisteTrabajador(contrataTrabajador, dni));
//		System.out.println(GestoraTienda.ContrataTrabajador(contrataTrabajador));
//		GestoraTienda.ConsultarTrabajadorContratado(contrataTrabajador);
//		dni="X9923978F";
//		GestoraTienda.DespideTrabajador(contrataTrabajador, dni);
//		GestoraTienda.ConsultarTrabajadorContratado(contrataTrabajador);
//		gt.ConsultaIncidencias(inci);
//		System.out.println(GestoraTienda.EncargaProductos(productoComprado,p1));
//		System.out.println(gt.AvisaIncidencias(denuncia1, inci));
//		System.out.println(gt.EliminarIncidencia(inci, 1));
//		System.out.println(gt.EliminarIncidencia(inci, 1));
//		GestoraTienda.ConsultarProductosTienda(productoComprado);
//		try 
//		{
//			System.out.println(GestoraTienda.VendeProducto(productoComprado,p1,arrayVendido));
//		} catch (ExcepcionProducto e) 
//		{
//			System.out.println(e+": No hay productos");
//		}
//		try 
//		{
//			GestoraTienda.DevuelveProducto(arrayVendido,p1, productoComprado);
//		} catch (ExcepcionProducto e) 
//		{
//			System.out.println(e+": No existe");
//		}catch (IndexOutOfBoundsException e) 
//		{
//			System.out.println("Array vacio");
//		}
//		try 
//		{
//			System.out.println(GestoraTienda.ValidarDNI("15674732"));
//		}catch(NumberFormatException e) 
//		{
//			System.out.println(e+": No valido");
//		}
//		
//		try 
//		{
//			System.out.println(GestoraTienda.ValidarNIE("X9923978F"));
//		}catch(NumberFormatException e) 
//		{
//			System.out.println(e+": No valido");
//		}
		
//		System.out.println(GestoraTienda.ValidarCIF("B90214297"));
		
//		System.out.println(gt.ExisteDniNie(contrataTrabajador, "X9923978F"));
//		System.out.println(gt.ExisteDniNie(contrataTrabajador, "X9923979F"));
//		System.out.println(gt.ExisteEncargado(contrataTrabajador));
//		System.out.println(gt.ExisteEncargado(contrataTrabajador));
		
	}
}
