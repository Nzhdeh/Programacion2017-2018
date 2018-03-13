package Proyecto;

public class TestEmpresa 
{
	public static void main(String[] args) 
	{
		Empresa e1=new Empresa("El paraiso","calle sin nombre","D12345678");
		Empresa e2=new Empresa("El infierno","calle fin del mundo","H87456123");
		
		
		//getters y setters
		System.out.println("getters y setters");
		System.out.println("Get y set:");
		System.out.println("CIF e1: "+e1.getCIFEmpresa());
		e1.setCIFEmpresa("A00000000");
		System.out.println("CIF e1 cambiado: "+e1.getCIFEmpresa());
		//getters y setters
		
		//toString
		System.out.println("---------------------------------------------------");
		System.out.println("To string:");
		System.out.println(e2.toString());
		/*
		//toStringBonito
		System.out.println("---------------------------------------------------");
		System.out.println("To string bonito:");
		System.out.println(e2.toStringBonito());
		*/
		
		//LeerValidarObjetoEmpresa
		System.out.println("---------------------------------------------------");
		System.out.println("LeerValidarObjetoEmpresa:");
		System.out.println(e2.LeerValidarObjetoEmpresa());
				
	}

}
