package Proyecto;

public class TestNomina 
{
	public static void main(String[] args) 
	{
		Fecha firma=new Fecha(5,5,1991);
		Fecha periodoInicial=new Fecha(1,2,2018);
		Fecha periodoFinal=new Fecha(28,2,2018);
		Fecha fechanacimiento=new Fecha(31,1,2018);
		Empresa empresa=new Empresa("Gig bang sl", "calle sin fin", "B12345678");
		Trabajador trabajador =new Trabajador("Goncho", "Gonzalez","00000000T", fechanacimiento, 'v',TipoCargo.ENCARGADO);
		Trabajador trabajador1 =new Trabajador("Nzhdeh", "Yeghiazaryan","X0000000T", fechanacimiento, 'v',TipoCargo.VENDEDOR);
		
		Nomina n2=new Nomina(/*1000,50,80,40,firma,periodoInicial,periodoFinal,empresa,trabajador*/);
		Nomina n1=new Nomina(900,50,100,35,firma,periodoInicial,periodoFinal,empresa,trabajador);
		
<<<<<<< HEAD
		Trabajador[] trabajadorContratado=new Trabajador[3];
		trabajadorContratado[0]=new Trabajador(trabajador);
		trabajadorContratado[1]=new Trabajador(trabajador1);
		
		//prueba getters y setters
		System.out.println("---------------------------------------------------");
		System.out.println("Get y set:");
		System.out.println("Salario base: "+n1.getSalarioBase());
=======
		//prueba getters y setters
		System.out.println("---------------------------------------------------");
		System.out.println("Get y set:");
		System.out.println(n1.getSalarioBase());
>>>>>>> 0abe9745a03d8aa1eb2b1b83675fed38b7322663
		
		try 
		{
			n1.setSalarioBase(1200.50);
		} catch (ExcepcionNomina e) 
		{
			System.out.println(e);
		}
		
<<<<<<< HEAD
		System.out.println("Salario base Despues del cambio: "+n1.getSalarioBase());
		//fin
		

//		System.out.println("Total devengado: "+n1.calcularTotalDevengado());
//		System.out.println("Total aportaciones: "+n1.calcularTotalAportaciones());
//		System.out.println("Total a deducir: "+n2.calcularTotalADeducir());
//		System.out.println("Total a percibir: "+n2.calcularLiquidoTotalAPercibir());
//		System.out.println("Total : "+n2.calcularTotal());
//		System.out.println("Base de Cotizacion por contingencias profecionales : "+n2.calcularBaseCotizacionPorContingenciasProfesionales());
//		System.out.println("Contingencia comun: "+n1.getContingenciaComun());
//		System.out.println("Desempleo: "+n1.getDesempleo());
//		System.out.println("Formacion profecional: "+n1.getFormacionProfecional() );
//		System.out.println("Contingencia comun: "+n2.getContingenciaComun());
		n2=n2.LeerValidarObjetoNomina(trabajadorContratado);
=======
		System.out.println("Despues del cambio: "+n1.getSalarioBase());
		//fin
		
		System.out.println("Total devengado: "+n1.calcularTotalDevengado());
		System.out.println("Total aportaciones: "+n1.calcularTotalAportaciones());
		System.out.println("Total a deducir: "+n2.calcularTotalADeducir());
		System.out.println("Total a percibir: "+n2.calcularLiquidoTotalAPercibir());
		System.out.println("Total : "+n2.calcularTotal());
		System.out.println("Base de Cotizacion por contingencias profecionales : "+n2.calcularBaseCotizacionPorContingenciasProfesionales());
		System.out.println("Contingencia comun: "+n1.getContingenciaComun());
		System.out.println("Desempleo: "+n1.getDesempleo());
		System.out.println("Formacion profecional: "+n1.getFormacionProfecional() );
		System.out.println("Contingencia comun: "+n2.getContingenciaComun());
>>>>>>> 0abe9745a03d8aa1eb2b1b83675fed38b7322663
		n2.generarNomina();
			
		
	}
}
