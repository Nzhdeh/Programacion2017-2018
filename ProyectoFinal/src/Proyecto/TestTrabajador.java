package Proyecto;

public class TestTrabajador 
{

	public static void main(String[] args) throws ExcepcionTrabajador 
	{
		Fecha fecha1=new Fecha();
		Fecha fecha2=new Fecha();
		
		Trabajador t1=new Trabajador("Antonio","Sanchez","26584475A",fecha1,'V');
		Trabajador t2=new Trabajador("Nzhdeh","Yeghiazaryan","X2563352F",fecha2,'V');
		Trabajador copia=null;
		
		
		//prueba getters y setters
		System.out.println("---------------------------------------------------");
		System.out.println("Get y set:");
		System.out.println(t1.getNombre());
		t1.setNombre("Ivan");
		System.out.println(t1.getNombre());
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


	}

}
