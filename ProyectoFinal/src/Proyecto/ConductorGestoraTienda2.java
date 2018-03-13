package Proyecto;

public class ConductorGestoraTienda2 
{
	public static void main (String [] args) 
	{
		int i=0;
		String nombre="",dni="";
		GestoraTienda2 gt2=new GestoraTienda2();
		
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
		
		System.out.println(GestoraTienda2.ContratarTrabajador(contrataTrabajador,t1));
		GestoraTienda2.ConsultarTrabajadorContratado(contrataTrabajador);
		dni="X9923978F";
		try 
		{
			GestoraTienda2.DespedirTrabajador(contrataTrabajador, dni);
		} catch (NullPointerException e1) 
		{
			System.out.println(e1);
		}
		GestoraTienda2.ConsultarTrabajadorContratado(contrataTrabajador);
		gt2.ConsultarIncidencias(inci);
		System.out.println(GestoraTienda2.EncargarProductos(productoComprado,p1));
		System.out.println(gt2.AvisarIncidencias(denuncia1, inci));
		System.out.println(gt2.EliminarIncidencia(inci, 1));
		System.out.println(gt2.EliminarIncidencia(inci, 1));
		try 
		{
			System.out.println(GestoraTienda2.VenderProducto(productoComprado,p1,arrayVendido));
		} catch (ExcepcionProducto e) 
		{
			System.out.println(e+": No hay productos");
		}
	}
}
