/**Nombre de la clase: Trabajador
 * 
 * propiedades basicas:
 * 						nombre: tipo String,consultable, modificable
 * 						apellidos:tipo String,consultable, modificable
 * 						dni: tipo String,consultable, modificable
 * 						edad: tipo int,consultable
 * 						sexo: tipo char,consultable,modificable
 * 
 * propiedades derivadas:no hay
 * 
 * INTERFAZ DE LA CLASE
 * 
 * GETTERS Y SETTERS
 * 
 * public String getNombre()
 * public void setNombre(String nombre)
 * 
 * public String getApellidos()
 * public void setNombre(String apellidos)
 * 
 * public String getDni()
 * public void setNombre(String dni)
 * 
 * public int getedad()
 * 
 * public char getSexo()
 * public void setSexo(char sexo)
 * 
 * 
 */package Proyecto;

public class Trabajador implements Cloneable,Comparable <Trabajador>
{
	private String nombre;
	private String apellidos;
	private String dni;
	private Fecha fechaNacimiento;
	private char sexo;
	
	//constructores 
	//por defecto
	public Trabajador() 
	{
		String nombre=" ";
		String apellidos=" ";
		String dni=" ";
		Fecha fechaNacimiento=null;
		char sexo=' ';
	}
	
	//sobrecargado
	public Trabajador(String nombre,String apellidos,String dni,Fecha fechaNacimiento,char sexo) throws ExcepcionTrabajador
	{
		if((sexo!='V' && sexo!='M') && (sexo!='v' && sexo!='m')) 
		{
			throw new ExcepcionTrabajador("El sexo se representa con las letras 'V' o 'M'");
		}
		else 
		{
			this.nombre=nombre;
			this.apellidos=apellidos;
			this.dni=dni;
			this.fechaNacimiento=fechaNacimiento;
			this.sexo=sexo;
		}
	}
	
	//de copia
	public Trabajador(Trabajador trabajador) 
	{
		this.nombre=trabajador.getNombre();
		this.apellidos=trabajador.getApellidos();
		this.dni=trabajador.getDni();
		this.fechaNacimiento=trabajador.getFechaNacimiento();
		this.sexo=trabajador.getSexo();
	}
	
	//getters y setters

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) throws ExcepcionTrabajador
	{
		this.nombre = nombre;
	}

	public String getApellidos() 
	{
		return apellidos;
	}

	public void setApellidos(String apellidos) throws ExcepcionTrabajador
	{
		this.apellidos = apellidos;
	}

	public String getDni() 
	{
		return dni;
	}

	public void setDni(String dni) throws ExcepcionTrabajador
	{
		this.dni = dni;
	}

	public Fecha getFechaNacimiento()
	{
		return fechaNacimiento;
	}

	public char getSexo() 
	{
		return sexo;
	}

	public void setSexo(char sexo) 
	{
		this.sexo = sexo;
	}
	
	//metodos heredados
	@Override
	public String toString() 
	{
		return ("Nombre: "+getNombre()+'\n'+"Apellidos: "+getApellidos()+'\n'+
				"Fecha de nacimiento: "+getFechaNacimiento()+'\n'+"Sexo: "+getSexo()+'\n'+"Dni: "+getDni());
	}
	
	@Override
	public int hashCode() 
	{
		int hash=1;
		
		hash=hash*27+nombre.hashCode();
		
		return hash;
	}
	
	
	@Override
	public Trabajador clone() 
	{
		Trabajador clon=null;
		
		try 
		{
			clon=(Trabajador) super.clone();
		}
		catch(CloneNotSupportedException error) 
		{
			System.out.println("Error.No se puede clonar");
		}
		
		return clon;
	}
	
	//condicion de igualdad: nombres , apellidos y dnis iguales
	@Override
	public boolean equals(Object o) 
	{
		boolean res=false;
		
		if(this==o) 
		{
			res=true;
		}
		else if(o!=null && o instanceof Producto) 
		{
			Trabajador trabajador=(Trabajador) o;
			
			if(this.getNombre()==trabajador.getNombre() && 
			   this.getApellidos()==trabajador.getApellidos() && 
			   this.getDni()==trabajador.getDni()) 
			{
				res=true;
			}
		}
		return res;
	}
	
	//condicion de comparacion: la edad
	@Override
	public int compareTo(Trabajador t) 
	{
		int comparar=0;
		
		if(this.getFechaNacimiento().compareTo(t.getFechaNacimiento())==1) 
		{
			comparar=1;
		}
		else if(this.getFechaNacimiento().compareTo(t.getFechaNacimiento())==(-1)) 
		{
			comparar=(-1);
		}
		
		return comparar;
	}
	
}
