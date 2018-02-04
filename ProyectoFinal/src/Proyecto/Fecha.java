/** Nombre de la calse: Fecha
 * 
 * 	propiedades basicas
 * 		
 * 		dia: tipo int, consultable, modificable
 * 		mes: tipo int, consultable, modificable
 * 		anio: tipo int, consultable, modificable
 * 
 * 	Propiedades derivadas: no hay
 * 
 * INTERFAZ
 * 
 * getters y setters
 * 
 *  public int getDia()
 *  public void setDia(int dia)
 *  
 *  public int getMes()
 *  public void setDia(int mes)
 *  
 *  public int getAnio()
 *  public void setAnio(int anio)
 * 
 * 
 * metodos añadidos: ValidarFecha
 * 
 * restricciones: dia (minimo 1 y maximo 28,29,30,31 dependiendo del mes)
 * 				  mes (entre 1 y 12 ambos inclusive)
 * 				  anio>0
 * 				  
 * 				  para el metodo Bisiesto el anio tiene que ser mayor o igual que 1582
 */

package Proyecto;

public class Fecha implements Cloneable, Comparable <Fecha>
{
	private int dia;
	private int mes;
	private int anio;
	
	//constructores
	
	//por defecto
	public Fecha()
	{
		int dia=0;
		int mes=0;
		int anio=0;
	}
	
	//sobrecargado
	public Fecha(int dia, int mes, int anio)
	{
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
	
	//de copia
	public Fecha(Fecha fecha)
	{
		this.dia=fecha.getDia();
		this.mes=fecha.getMes();
		this.anio=fecha.getAnio();
	}
	
	//getters y setters
	public int getDia()
	{
		return dia;
	}
	
	public void setDia(int dia) throws ExcepcionFecha
	{
		if(dia<1) 
		{
			throw new ExcepcionFecha("El dia tiene que ser mayor que 0");
		}
		else
		{
			this.dia=dia;
		}
	}
	
	public int getMes()
	{
		return mes;
	}
	
	public void setMes(int mes) throws ExcepcionFecha
	{
		if(mes<1 || mes >12)		
		{
			throw new ExcepcionFecha("El mes tiene que estar entre 1 y 12");
		}else 
		{
			this.mes=mes;
		}
	}
	
	public int getAnio() 
	{
		return anio;
	}
	
	public void setAnio(int anio) throws ExcepcionFecha
	{
		if(anio<1) 
		{
			throw new ExcepcionFecha("El anio no puede ser menor que 1");
		}else 
		{
			this.anio=anio;
		}
	}
	
	//metodos heredados
	
	@Override
	public String toString()
	{
		return (dia+","+mes+" ,"+anio);
	}
	
	
	@Override
	public int hashCode()
	{
		return(int)(getDia()*getMes()*getAnio()/3);
	}
	
	
	@Override
	public Fecha clone()
	{
		Fecha clon=null;
		
		try
		{
			clon=(Fecha) super.clone();
		}
		catch(CloneNotSupportedException error)
		{
			System.out.println("Error.No se puede clonar");
		}
		
		return clon;
	}
	
	//las fechas son iguales si el dia ,el mes y el año son iguales
	@Override
	public boolean equals(Object o)
	{
		boolean res=false;
		if(o!=null && o instanceof Fecha)
		{
			Fecha fecha=(Fecha) o;
			
			if(this.getDia()==fecha.getDia() && this.getMes()==fecha.getMes() && this.getAnio()==fecha.getAnio())
			{
				res=true;
			}
		}
		return res;
	}
	
	//condicion de comparacion: dia,mes y año
	@Override
	public int compareTo(Fecha f)
	{
		int comparar;
		
		if((this.getAnio()>f.getAnio()) || (this.getAnio()==f.getAnio() && this.getMes()>f.getMes()) || 
		   (this.getAnio()==f.getAnio() && this.getMes()==f.getMes() && this.getDia()>f.getDia())) 
		{
			comparar=1; //el primero es mayor que el segundo
		}
		else if(this.getAnio()==f.getAnio() && this.getMes()==f.getMes() && this.getDia()==f.getDia())
		{
			comparar=0;//son iguales
		}
		else /*if((this.getAnio()<f.getAnio()) || (this.getAnio()==f.getAnio() && this.getMes()<f.getMes()) || 
		   (this.getAnio()==f.getAnio() && this.getMes()==f.getMes() && this.getDia()<f.getDia()))*/
		{
			comparar=(-1);
		}
		
		return comparar;
	}
	
	/*
	prototipo: public boolean ValidarFecha()
	comentario: sirve para validar una fecha
	precondiciones:no hay
	entradas: no hya
	salidas: logico
	postcondiciones: AN devolvera true si la fecha es valida y false si no.
	*/
	/*
	
	resguardo
	
	public boolean ValidarFecha()
	{
		boolean res=false;
		System.out.println("En construccion");
		return res;
	}*/
	
	public boolean ValidarFecha() throws ExcepcionFecha
	{
		boolean res=false;
		
		if (this.getAnio () > 0)
		{
			if (this.getMes () > 0 && this.getMes () < 13)
			{
					switch (this.getMes())
					{
						case 1:
						case 3:
						case 5:
						case 7:
						case 8:
						case 10:
						case 12:
						
						if (this.getDia () > 0 && this.getDia () < 32)
						{
							res = true;
						}
						break;
						
						case 4:
						case 6:
						case 9:
						case 11:
						
						if (this.getDia () > 0 && this.getDia () < 31)
						{
							res = true;
						}
						break;
						
						case 2:
							
						if ((this.getAnio()>1581) && (this.getAnio() % 400 == 0) || 
							((this.getAnio() % 4 == 0) && (this.getAnio() % 100 != 0)))
						{
							if (this.getDia () > 0 && this.getDia () < 30)
							{
								res = true;
							}
						}
						else if (this.getDia () > 0 && this.getDia () < 29)
						{
							res = true;
						}
					}
			}
		}
		return res;
	}
}
