package Proyecto;

public class TestTrabajador 
{

	public static void main(String[] args) //throws ExcepcionTrabajador
	{
		GestoraTienda3 gt3=new GestoraTienda3();
		
		Fecha fecha1=new Fecha(15,2,1999);
		Fecha fecha2=new Fecha(10,3,1991);
		
		Trabajador tra=new Trabajador();
		Trabajador t1=new Trabajador("Tomas","Zumarraga","26584475A",fecha1,'V', null);
		Trabajador t2=new Trabajador("Nzhdeh","Yeghiazaryan","00000000T",fecha2,'V',null);
		Trabajador copia=null;
		Trabajador [] t= {new Trabajador(t1),new Trabajador(t2)};
		//Trabajador [] t= new Trabajador[20];
			
		
		//prueba getters y setters
		System.out.println("---------------------------------------------------");
		System.out.println("Get y set:");
		System.out.println(t1.getNombre());
			
		try
		{
			t1.setNombre("Luis");
			System.out.println(t1.getNombre());
		}catch(ExcepcionTrabajador et) 
		{
			System.out.println(et);//se pone et para que salte el mensaje de la excepcion. 
		}
			
		try 
		{
			System.out.println("-------------------------");
			System.out.println(t1.getSexo());
			t1.setSexo('4');
		}catch(ExcepcionTrabajador et) 
		{
			System.out.println(et);//se pone et para que salte el mensje de la excepcion. 
		}
		System.out.println(t1.getSexo());
			//fin
			
		
			//prueba toString
			System.out.println("---------------------------------------------------");
			System.out.println("To string:");
			System.out.println(t2.toString());
			//fin
			/*
			//prueba toString bonito
			System.out.println("---------------------------------------------------");
			System.out.println("To string bonito:");
			System.out.println(t2.toStringNombreApellidos());
			//fin
			*/
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
			System.out.println(t2.hashCode ());
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
			System.out.println(t2.compareTo (t1));
			//Fin Prueba compareTo
			
			//prueba leerValidarObjetoTrabajador
			try 
			{
				t1.setDni("00000000T");
			} catch (ExcepcionTrabajador e) {
				System.out.println(e);
			}
			
			char letra = GestoraTienda3.ValidarDNI(t1.getDni().substring(0,8));
			System.out.println(letra);
			
			int existeDocumento=0;
			try 
			{
				existeDocumento = gt3.ExisteDniNie(t, t1.getDni());
			} catch (ExcepcionTrabajador e) 
			{
				System.out.println(e);
			}
			System.out.println(existeDocumento);
			
			System.out.println(tra.leerValidarObjetoTrabajador(t));
			//fin leerValidarObjetoTrabajador
	}

}
