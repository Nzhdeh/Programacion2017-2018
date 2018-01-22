
package Proyecto;

public class ConductorGestoraTienda{

	public static void main(String[] args) throws ExcepcionTrabajador, ExcepcionFecha{
		
		try
		{
			//Fecha fechaVenta=new Fecha(20,1,2017);
			//Fecha fecha=new Fecha(16,1,2017);
			Fecha fecha1=new Fecha(31,1,2017);
			Fecha fecha2=new Fecha(5,1,2017);
			Fecha fecha3=new Fecha(25,1,2017);
			Fecha fecha4=new Fecha(16,5,2017);
			Fecha fecha5=new Fecha(7,5,2016);
			Fecha fecha6=new Fecha(1,1,2017);
			
			Fecha fechaIni=new Fecha(1,1,2017);
			Fecha fechaFin=new Fecha(31,1,2017);
			
			//String nombre="Tarjeta de red";
			Trabajador trabajador= new Trabajador("Nzhdeh","Yeghiazaryan","00000000A",fecha1,'v');
			//Trabajador [] t= new Trabajador[10];
			/*Producto [] producto={new Producto("Tarjeta de red",15.05,fecha,8,0.3),new Producto("Disco CD",1.20,fecha,9,0.1),new Producto("Cable HDMI",3.50,fecha,10,0.2)
								 ,new Producto("Placa base",100,fecha,10,0.7),new Producto("Disco duro SSD",80,fecha,6,0.1),new Producto("Procesador i5",180,fecha,10,0.2)
								 ,new Producto("Tarjeta de red",30,fecha,5,0.3),new Producto("Disco CD",1.20,fecha,7,0.1),new Producto("Cable DVI",1.50,fecha,10,0.2)
								 ,new Producto("Placa base",120,fecha,10,0.7),new Producto("Disco duro m.2",140,fecha,10,0.1),new Producto("Procesador i5",180,fecha,10,0.2)
								 ,new Producto("Fuente de alimentacion",60.50,fecha,10,1.0),new Producto("Disco duro m.2",140,fecha,5,0.1),new Producto("Procesador i3",180,fecha,10,0.2)
								 };*/
			
			Producto [] productosVendidos={new Producto("Tarjeta de red",15.05,fecha1,8,0.3),new Producto("Disco CD",1.20,fecha2,9,0.1),
								  new Producto("Cable HDMI",3.50,fecha3,10,1.0),new Producto("Placa base",100,fecha4,10,0.7),
								  new Producto("Tarjeta de red",33.48,fecha5,7,0.5),new Producto("Cable USB",1.25,fecha6,7,0.2)
								 };
			
			//GestoraTienda.MenuPrincipal();
			//GestoraTienda.MenuJefe();
			//GestoraTienda.MenuEncargado();
			//GestoraTienda.MenuTrabajador();
			//GestoraTienda.pintaProductos(producto);
			//System.out.println(GestoraTienda.CalculaVenta(productosVendidos, fechaIni, fechaFin));
			//System.out.println(GestoraTienda.ExisteProducto(producto, nombre));
			//nombre="usb 3.0";
			//System.out.println(GestoraTienda.ExisteProducto(producto, nombre));
			System.out.println(GestoraTienda.ContrataTrabajador(trabajador,1));
			//System.out.println(GestoraTienda.DespideTrabajador(tarbajador));
			//GestoraTienda.ConsultaIncidencias();
			//GestoraTienda.EncargaProductos();
			//GestoraTienda.AvisaIncidencias();
			//System.out.println(GestoraTienda.VendeProducto(producto, nombre, fechaVenta));
			//GestoraTienda.DevuelveProducto(producto, nombre, fechaVenta);
			//System.out.println(GestoraTienda.ContrataTrabajador(trabajador));
		}
		catch(ExcepcionProducto error)
		{
			System.out.println("Ooooooh... What a pity");
		}
	}
}
