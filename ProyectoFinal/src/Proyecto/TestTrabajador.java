package Proyecto;

public class TestTrabajador 
{

	public static void main(String[] args) //throws ExcepcionTrabajador
	{
		try 
		{
			
			Fecha fecha1=new Fecha(15,2,1999);
			Fecha fecha2=new Fecha(10,3,1991);
			
			Trabajador t1=new Trabajador("Tomas","Zumarraga","26584475A",fecha1,'V');
			Trabajador t2=new Trabajador("Nzhdeh","Yeghiazaryan","X2563352F",fecha2,'V');
			Trabajador copia=null;
			
			//prueba getters y setters
			System.out.println("---------------------------------------------------");
			System.out.println("Get y set:");
			System.out.println(t1.getNombre());
			t1.setNombre("Luis");
			System.out.println(t1.getNombre());
			System.out.println("-------------------------");
			//System.out.println(t1.getSexo());
			//t1.setSexo('4');
			//System.out.println(t1.getSexo());
			//fin
			//prueba toString
			System.out.println("---------------------------------------------------");
			System.out.println("To string:");
			System.out.println(t2.toString());
			//fin
			
			//prueba clone
			System.out.println("---------------------------------------------------");
			System.out.println("Clone:");
			copia = t1.clone ();
			System.out.println(t1.clone());
			System.out.println(copia);
			//fin
			
			//Prueba hashCode
			System.out.println("---------------------------------------------------");
			System.out.println("hashCode:");
			System.out.println(t1.hashCode ());
			//Fin
			
			//Prueba equals
			System.out.println("---------------------------------------------------");
			System.out.println("equals:");
			System.out.println(t1.equals (copia));
			System.out.println(t2.equals (copia));
			//Fin
			
			//Prueba compareTo
			System.out.println("---------------------------------------------------");
			System.out.println("compareTo:");
			System.out.println(t1.compareTo (t1));
			System.out.println(t2.compareTo (t2));
			System.out.println(copia.compareTo (t1));
			System.out.println(t1.compareTo (t2));
			//Fin Prueba compareTop
		}catch(ExcepcionTrabajador et) 
		{
			System.out.println("Oooo what a pity");
		}
	}

}
