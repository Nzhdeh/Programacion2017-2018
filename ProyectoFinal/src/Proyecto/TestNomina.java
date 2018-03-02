package Proyecto;

public class TestNomina 
{
	public static void main(String[] args) 
	{
		Fecha f=new Fecha(5,5,1991);
		Empresa empresa=new Empresa("Gig bang sl", "calle sin fin", "B12345678");
		Trabajador [] trabajador = { new Trabajador("Goncho", "Gonzalez","00000000T", f, 'v',TipoCargo.ENCARGADO)};
		
		Nomina n2=new Nomina(1000,50,80,40,empresa,trabajador);
		//Nomina n1=new Nomina(900,50,100,35, "Mostachon sl", "calle amor de caracol", "A87456123", "Poncho", "Necio","X9923978F", f, 'v',TipoCargo.VENDEDOR,10,5,2009);
			
		
		//prueba getters y setters
//		System.out.println("---------------------------------------------------");
//		System.out.println("Get y set:");
//		System.out.println(n1.getSalarioBase());
//		
//		try 
//		{
//			n1.setSalarioBase(1200.50);
//		} catch (ExcepcionNomina e) 
//		{
//			System.out.println(e);
//		}
//		
//		System.out.println("Despues del cambio: "+n1.getSalarioBase());
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
//		System.out.println("Contingencia comun: "+n1.getContingenciaComun());
//		System.out.println("Contingencia comun: "+n1.getContingenciaComun());
//		System.out.println("Contingencia comun: "+n1.getContingenciaComun());
		n2.generarNomina();
		
	}

}
