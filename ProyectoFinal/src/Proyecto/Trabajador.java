/**Nombre de la clase: Trabajador
 * 
 * propiedades basicas:
 * 						nombre: tipo String,consultable, modificable
 * 						apellidos:tipo String,consultable, modificable
 * 						dni: tipo String,consultable, modificable
 * 						fechaNacimiento: tipo Fecha,consultable
 * 						sexo: tipo char,consultable,modificable
 * 
 * propiedades derivadas:no hay
 * 
 * propiedades compartidas: no hay
 * 
 * restricciones: El nombre, el apellido y el dni no pueden ser nulos
 * 				  El sexo tiene que ser 'V' o 'M' o 'v' o 'm'
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
 * public Fecha getFechaNacimiento()
 * 
 * public char getSexo()
 * public void setSexo(char sexo)
 * 
 * 
 */
package Proyecto;

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
	public Trabajador(String nombre,String apellidos,String dni,Fecha fechaNacimiento,char sexo)
	{
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		this.fechaNacimiento=fechaNacimiento;
		this.sexo=sexo;
	}
	
	//de copia
	public Trabajador(Trabajador trabajador) 
	{
		this.nombre=trabajador.getNombre();
		this.apellidos=trabajador.getApellidos();
		this.dni=trabajador.getDni();
		this.fechaNacimiento=trabajador.fechaNacimiento;
		this.sexo=trabajador.getSexo();
	}
	
	//getters y setters

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) throws ExcepcionTrabajador
	{
		if(nombre ==null)
		{
			throw new ExcepcionTrabajador("El nombre no puede estar vacio");
		}else
		{
			this.nombre = nombre;
		}
		
	}

	public String getApellidos() 
	{
		return apellidos;
	}

	public void setApellidos(String apellidos) throws ExcepcionTrabajador
	{
		if(apellidos ==null)
		{
			throw new ExcepcionTrabajador("El apellido no puede estar vacio");
		}else
		{
			this.apellidos = apellidos;
		}
	}

	public String getDni() 
	{
		return dni;
	}

	public void setDni(String dni) throws ExcepcionTrabajador
	{
		if(apellidos==null)
		{
			throw new ExcepcionTrabajador("El DNI no puede estar vacio");
		}else
		{
			this.dni = dni;
		}
	}
	
	//patron delegacion
	public int getFechaNacimientoDia() 
	{
		return fechaNacimiento.getDia();
	}

	public void setFechaNacimientoDia(int dia) throws ExcepcionFecha 
	{
		fechaNacimiento.setDia(dia);
	}

	public int getFechaNacimientoMes() 
	{
		return fechaNacimiento.getMes();
	}

	public void setFechaNacimientoMes(int mes) throws ExcepcionFecha 
	{
		fechaNacimiento.setMes(mes);
	}

	public int getFechaNacimientoAnio() 
	{
		return fechaNacimiento.getAnio();
	}

	public void setFechaNacimientoAnio(int anio) throws ExcepcionFecha 
	{
		fechaNacimiento.setAnio(anio);
	}
	//fin patron delegacion
	
	public char getSexo() 
	{
		return sexo;
	}

	public void setSexo(char sexo) throws ExcepcionTrabajador
	{
		if((sexo=='V' || sexo=='M') || (sexo=='v' || sexo=='m')) 
		{
			this.sexo = sexo;
		}else
		{
			throw new ExcepcionTrabajador("El sexo se representa con las letras 'V' o 'M'");
		}
	}
	
	//metodos heredados
	@Override
	public String toString() 
	{
		return ("Nombre: "+getNombre()+'\n'+"Apellidos: "+getApellidos()+'\n'+
				"Fecha de nacimiento: "+getFechaNacimientoDia()+"-"+getFechaNacimientoMes()+"-"+getFechaNacimientoAnio()
				+'\n'+"Sexo: "+getSexo()+'\n'+"Dni: "+getDni());
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
			
			clon.fechaNacimiento=this.fechaNacimiento.clone();
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
		else if(o!=null && o instanceof Trabajador) 
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
	
	//condicion de comparacion: fecha de nacimiento
	public int compareTo(Trabajador t) 
	{		
		int comparar=0;
		/*
		if((this.getFechaNacimientoAnio()>t.getFechaNacimientoAnio()) || (this.getFechaNacimientoAnio()==t.getFechaNacimientoAnio() && this.getFechaNacimientoMes()>t.getFechaNacimientoMes()) ||
		  (this.getFechaNacimientoAnio()==t.getFechaNacimientoAnio() && this.getFechaNacimientoMes()==t.getFechaNacimientoMes() && this.getFechaNacimientoDia()>t.getFechaNacimientoDia())) 
		{
			comparar=1;
		}
		else if(this.getFechaNacimientoAnio()==t.getFechaNacimientoAnio() && this.getFechaNacimientoMes()==t.getFechaNacimientoMes() && this.getFechaNacimientoDia()==t.getFechaNacimientoDia())
		{
			comparar=0;
		}
		*/
		if(this.fechaNacimiento.compareTo(t.fechaNacimiento)==1) 
		{
			comparar=1;
		}
		else if(this.fechaNacimiento.compareTo(t.fechaNacimiento)==(-1)) 
		{
			comparar=(-1);
		}
		return comparar;
	}
}
