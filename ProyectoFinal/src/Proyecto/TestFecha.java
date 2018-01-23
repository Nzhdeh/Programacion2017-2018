package Proyecto;

public class TestFecha 
{
	public static void main(String[] args) 
	{
		try 
		{
			Fecha f1=new Fecha(31,5,1990);
			Fecha f2=new Fecha(15,2,2016);
			Fecha copia=null;
			
			
			//prueba getters y setters
			System.out.println("---------------------------------------------------");
			System.out.println("Get y set:");
			System.out.println("Antes del cambio: "+f1);
			f1.setDia(5);
			System.out.println("Cambiamos el dia: "+f1.getDia());
			System.out.println("-----------------------");
			f1.setMes(12);
			System.out.println("Cambiamos el dia: "+f1.getMes());
			//fin
			
			//prueba toString
			System.out.println("---------------------------------------------------");
			System.out.println("To string:");
			System.out.println(f1.toString());
			//fin
			
			//prueba clone
			System.out.println("---------------------------------------------------");
			System.out.println("Clone:");
			copia = f1.clone ();
			System.out.println(f1.clone());
			System.out.println(copia);
			//fin
			
			//Prueba hashCode
			System.out.println("---------------------------------------------------");
			System.out.println("hashCode:");
			System.out.println(f1.hashCode ());
			//Fin
			
			//Prueba equals
			System.out.println("---------------------------------------------------");
			System.out.println("equals:");
			System.out.println(f1.equals (copia));
			System.out.println(f2.equals (copia));
			//Fin
			
			//Prueba compareTo
			System.out.println("---------------------------------------------------");
			System.out.println("compareTo:");
			System.out.println(f1.compareTo (f1));
			System.out.println(f2.compareTo (f2));
			System.out.println(copia.compareTo (f2));
			//Fin Prueba compareTo
			
			//Prueba ValidarFecha
			System.out.println("---------------------------------------------------");
			System.out.println("Validar Fecha:");
			System.out.println(f1.ValidarFecha());
			//fin
		}
		catch(ExcepcionFecha error) 
		{
			System.out.println("Fecha incorrecta");
		}

	}

}
