/** Nombre de la clase: GestionRectangulo
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class GestionRectangulo
{
	static Rectangulo r=new Rectangulo();
	
	public static double AreaRectangulo(double largo, double ancho) throws ExcepcionRectangulo
	{
		Rectangulo r=new Rectangulo(5,15);
		//Rectangulo r=new Rectangulo(5,-15);
		//Rectangulo r=new Rectangulo(-5,15);
		
		double area;
		
		area=r.getAncho()*r.getLargo();
		
		return area;
	}
	
	public static double PerimetroRectangulo(double largo, double ancho) throws ExcepcionRectangulo
	{
		Rectangulo r=new Rectangulo(5,15);
		//Rectangulo r=new Rectangulo(5,-15);
		//Rectangulo r=new Rectangulo(-5,15);
		
		double perimetro=0.0;
		
		perimetro=(r.getAncho()+r.getLargo())*2;
		
		return perimetro;
	}
	
	public static void main (String [] args) //throws ExcepcionRectangulo
	{
		double ancho=0;
		double largo=0;
		
		try
		{
			System.out.println("Area= "+AreaRectangulo(largo,ancho));
			System.out.println("Perimetro= "+PerimetroRectangulo(largo,ancho));
		}
		catch(ExcepcionRectangulo error)
		{
			System.out.println("No ha sido posible");
			//error.printStackTrace();
		}
		
		System.out.println("No te preocupes. El programa sigue");
	}
}

