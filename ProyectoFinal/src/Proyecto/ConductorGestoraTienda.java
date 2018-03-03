package Proyecto;

public class ConductorGestoraTienda {

	public static void main(String[] args){
		
		try
		{
			String nombre="Tarjeta de red";
			Fecha fechaVenta=new Fecha(20,1,2017);
			Fecha fecha=new Fecha(16,1,2017);
			Fecha fechaIni=new Fecha(01,1,2017);
			Fecha fechaFin=new Fecha(31,1,2017);
			Producto [] producto={new Producto("Tarjeta de red",15.05,fecha,"Muy util",0.3),new Producto("Disco CD",1.20,fecha,"No funciona",0.1),new Producto("Cable HDMI",3.50,fecha,"Es bonito",0.2)
								 ,new Producto("Placa base",100,fecha,"Es impresionante",0.7),new Producto("Disco duro m.2",140,fecha,"Va muy rapido",0.1),new Producto("Procesador i5",180,fecha,"Es magnifico",0.2)
								 ,new Producto("Tarjeta de red",15.05,fecha,"Muy util",0.3),new Producto("Disco CD",1.20,fecha,"No funciona",0.1),new Producto("Cable HDMI",3.50,fecha,"Es bonito",0.2)
								 ,new Producto("Placa base",120,fecha,"Es impresionante",0.7),new Producto("Disco duro m.2",140,fecha,"Va muy rapido",0.1),new Producto("Procesador i5",180,fecha,"Es magnifico",0.2)
								 ,new Producto("Fuente de alimentacion",60.5,fecha,"No te lo recomiendo",1.0),new Producto("Disco duro m.2",140,fecha,"Va muy rapido",0.1),new Producto("Procesador i5",180,fecha,"Es magnifico",0.2)
								 };
			
			GestoraTienda.pintaProductos(producto);
			//GestoraTienda.PreguntarSeguir(1);
			//GestoraTienda.MenuPrincipal();
			//GestoraTienda.MenuJefe(1);
			//GestoraTienda.MenuEncargado(2);
			//GestoraTienda.MenuTrabajador(0);
			//System.out.println(GestoraTienda.CalcularVenta(producto, fechaIni, fechaFin,1));
			//System.out.println(GestoraTienda.ExisteProducto(producto, nombre));
			//nombre="usb 3.0";
			//System.out.println(GestoraTienda.ExisteProducto(producto, nombre));
			//System.out.println(GestoraTienda.VenderProducto(producto, nombre, fechaVenta));
		}catch(ExcepcionProducto error)
		{
			System.out.println("Ooooooh... Wata pity");
		}
	}
}
