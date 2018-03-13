package Proyecto;

public class TestProducto {

	public static void main(String[] args) {
		
			Fecha fecha1=new Fecha(12,2,2016);
			Fecha fecha2=new Fecha(16,1,1991);
			
			Producto p1=new Producto("Tarjeta de red",15.2,fecha1,10,1.50);
			Producto p2=new Producto("Cable HDMI",3.90,fecha2,10,2.0);
			Producto copia=null;
			
			
			//prueba getters y setters
			System.out.println("---------------------------------------------------");
			System.out.println("Get y set:");
			System.out.println(p1.getPrecio());
			
			try 
			{	
				p1.setPrecio(10.0);
				System.out.println(p1.getPrecio());
			}catch(ExcepcionProducto ep)
			{
				System.out.println(ep);
			}	
			System.out.println("Despues del cambio: "+p1.getPrecio());
			System.out.println(p1.getFechaVenta());
			//fin
			
			//prueba toString
			System.out.println("---------------------------------------------------");
			System.out.println("To string:");
			System.out.println(p2.toString());
			//fin
			
			//prueba clone
			System.out.println("---------------------------------------------------");
			System.out.println("Clone:");
			copia = p1.clone ();
			System.out.println(p1.clone());
			System.out.println(copia);
			//fin
			
			//Prueba hashCode
			System.out.println("---------------------------------------------------");
			System.out.println("hashCode:");
			System.out.println(p1.hashCode ());
			//Fin
			
			//Prueba equals
			System.out.println("---------------------------------------------------");
			System.out.println("equals:");
			System.out.println(p1.equals (copia));
			System.out.println(p2.equals (copia));
			//Fin
			
			//Prueba compareTo
			System.out.println("---------------------------------------------------");
			System.out.println("compareTo:");
			System.out.println(p1.compareTo (p1));
			System.out.println(p2.compareTo (p2));
			System.out.println(copia.compareTo (p1));
			System.out.println(p1.compareTo (p2));
			//Fin Prueba compareTop
			
			//Prueba compareTo
			System.out.println("---------------------------------------------------");
			System.out.println("LeerValidarObjetoProducto:");
			System.out.println(p1.LeerValidarObjetoProducto());
			//Fin Prueba compareTop

	}

}
