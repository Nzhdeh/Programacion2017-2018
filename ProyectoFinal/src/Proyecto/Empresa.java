/** N
 * ombre de la clase : Empresa
 * 
 * propiedades basicas: 
 * 			
 * 				nombreEmpresa: tipo String , consultable , modificable
 * 				domicilioEmpresa: tipo String , consultable , modificable
 * 				CIFEmpresa: tipo String , consultable , modificable
 * 
 * 
 * propiedades derivadas : no hay
 * 
 * propiedades compartidas: no hay
 * 
 * 
 * restricciones: CIFEmpresa tiene que tener 9 digitos y el primero tiene que ser una letra
 * 
 * 
 * INTERFAZ
 * 
 * getters y setters
 * 
 * public String getNombreEmpresa()
 * public void setNombreEmpresa(String nombreEmpresa)
 * 
 * public String getDomicilioEmpresa()
 * public void setDomicilioEmpresa(String domicilioEmpresa)
 * 
 * public String getCIFEmpresa()
 * public void setCIFEmpresa(String CIFEmpresa)
 * 
 * 
 * metodos añadidos: LeerValidarObjetoEmpresa()
 * 
 */package Proyecto;

import java.util.Scanner;

public class Empresa 
{
	private String nombreEmpresa;
	private String domicilioEmpresa;
	private String CIFEmpresa;
	
	
	//constructores
	
	//por defecto;
	public Empresa() 
	{
		String nombreEmpresa=" ";
		String domicilioEmpresa=" ";
		String CIFEmpresa=" ";
	}
	
	//con parametros
	public Empresa(String nombreEmpresa,String domicilioEmpresa,String CIFEmpresa) 
	{
		this.nombreEmpresa=nombreEmpresa;
		this.domicilioEmpresa=domicilioEmpresa;
		this.CIFEmpresa=CIFEmpresa;
	}
	
	//de copia
	public Empresa(Empresa empresa) 
	{
		this.nombreEmpresa=empresa.getNombreEmpresa();
		this.domicilioEmpresa=empresa.getDomicilioEmpresa();
		this.CIFEmpresa=empresa.getCIFEmpresa();
	}
	
	//getters y setters
	
	public String getNombreEmpresa() 
	{
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) 
	{
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getDomicilioEmpresa() 
	{
		return domicilioEmpresa;
	}

	public void setDomicilioEmpresa(String domicilioEmpresa) 
	{
		this.domicilioEmpresa = domicilioEmpresa;
	}

	public String getCIFEmpresa() 
	{
		return CIFEmpresa;
	}

	public void setCIFEmpresa(String CIFEmpresa) 
	{
		this.CIFEmpresa = CIFEmpresa;
	}
	
	@Override
	public String toString() 
	{
		return (nombreEmpresa+", "+CIFEmpresa+", "+domicilioEmpresa);
	}
	
	/**
	prototipo: public Empresa LeerValidarObjetoEmpresa()   
	comentarios: este metodo sirve para leer y validar el objeto empresa
	precondiciones: no hay
	entradas: no hay
	salidas: un objeto
	entr/sal: no hay
	postcondiciones: AN devolvera el objeto empresa
	*/
	
	//resguardo
	/*public Empresa LeerValidarObjetoEmpresa() 
	{
		Empresa empresa=null;
		System.out.println("En construccion");
		return empresa;
	}*/
	
	public Empresa LeerValidarObjetoEmpresa() 
	{
		Scanner sc=new Scanner (System.in);
		Empresa empresa=new Empresa();
		
		sc.nextLine();
		System.out.println("-----------------------------------------------");
		System.out.println("Introducir el nombre de la empresa: ");
		setNombreEmpresa(sc.nextLine().toUpperCase());
		
		do 
		{
			System.out.println("Introduce el CIF de la empresa: ");
			setCIFEmpresa(sc.nextLine().toUpperCase());
		}while(getCIFEmpresa().length()!=9);
		
		System.out.println("Introduce el domicilio de la empresa");
		setDomicilioEmpresa(sc.nextLine().toUpperCase());
		
		empresa=new Empresa(getNombreEmpresa(),getDomicilioEmpresa(),getCIFEmpresa());
		
		return empresa;
	}
}
