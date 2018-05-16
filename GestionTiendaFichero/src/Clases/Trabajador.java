/**Nombre de la clase: Trabajador
 * 
 * propiedades basicas:
 * 						nombre: tipo String,consultable, modificable
 * 						apellidos:tipo String,consultable, modificable
 * 						dni: tipo String,consultable, modificable
 * 						fechaNacimiento: tipo Fecha,consultable
 * 						sexo: tipo char,consultable,modificable
 * 						CARGO: tipo TipoCargo,consultable,modificable
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
 * public void setApellidos(String apellidos)
 * 
 * public String getDni()
 * public void setDni(String dni)
 * 
 * public Fecha get FechaNacimiento() //se aplicara el patron delegacion
 * 
 * public char getSexo()
 * public void setSexo(char sexo)
 * 
 * public TipoCargo getCARGO()
 * void setCARGO(TipoCargo CARGO)
 * 
 * 
 */
package Clases;

import java.util.InputMismatchException;
import java.util.Scanner;

import Excepciones.*;
import Gestoras.*;
import Interfaces.InterfTrabajador;
import Clases.*;
import java.io.*;

public class Trabajador implements Serializable,InterfTrabajador, Cloneable,Comparable <Trabajador>
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String nombre;
	private String apellidos;
	private String dni;
	private Fecha fechaNacimiento;
	private char sexo;
	private TipoCargo CARGO;
	
	//constructores 
	//por defecto
	public Trabajador() 
	{
		nombre=" ";
		apellidos=" ";
		dni=" ";
		fechaNacimiento=null;
		sexo=' ';
		CARGO=null;
	}
	
	//sobrecargado
	public Trabajador(String nombre,String apellidos,String dni,Fecha fechaNacimiento,char sexo,TipoCargo CARGO)
	{
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.dni=dni;
		this.fechaNacimiento=fechaNacimiento;
		this.sexo=sexo;
		this.CARGO=CARGO;
	}
	
	//de copia
	public Trabajador(Trabajador trabajador) 
	{
		this.nombre=trabajador.getNombre();
		this.apellidos=trabajador.getApellidos();
		this.dni=trabajador.getDni();
		this.fechaNacimiento=trabajador.fechaNacimiento;
		this.sexo=trabajador.getSexo();
		this.CARGO=trabajador.getCARGO();
	}
	
	//getters y setters
	@Override
	public String getNombre() 
	{
		return nombre;
	}
	@Override
	public void setNombre(String nombre) throws ExcepcionTrabajador
	{
		if(nombre == null)
		{
			throw new ExcepcionTrabajador("El nombre no puede estar vacio");
		}else
		{
			this.nombre = nombre;
		}
		
	}
	
	@Override
	public String getApellidos() 
	{
		return apellidos;
	}
	@Override
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
	
	
	@Override
	public String getDni() 
	{
		return dni;
	}
	@Override
	public void setDni(String dni) throws ExcepcionTrabajador
	{
		this.dni = dni;
	}
	
	
	@Override
	public TipoCargo getCARGO() 
	{
		return CARGO;
	}
	@Override
	public void setCARGO(TipoCargo CARGO) 
	{
		this.CARGO=CARGO;
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
	public int getFechaNacimientoAnio() 
	{
		return fechaNacimiento.getAnio();
	}
	//fin patron delegacion
	@Override
	public char getSexo() 
	{
		return sexo;
	}
	@Override
	public void setSexo(char sexo) throws ExcepcionTrabajador
	{
		this.sexo = sexo;
	}
	
	
	@Override
	public String toString() 
	{
		return (getNombre()+','+getApellidos()+','+getDni()+','+getCARGO()+','+getFechaNacimientoDia()+"-"+getFechaNacimientoMes()+"-"+getFechaNacimientoAnio()
				+','+getSexo());
	}
	
	@Override
	public int hashCode() 
	{
		int hash=1;
		
		for(int i=2;i>hash;i++)
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
	
	//condicion de igualdad: dnis iguales
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
			
			if(this.getDni()==trabajador.getDni()) 
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
	
	
	
	/*
	prototipo: public Trabajador leerValidarObjetoTrabajador()    
	comentarios: este metodo sirve para leer y validar el objeto trabajador
	precondiciones: no hay
	entradas: no hay
	salidas: un objeto
	entr/sal: no hay
	postcondiciones: AN devolvera el objeto trabajador
	*/
	
	//resguardo
	/*public Empresa LeerValidarObjetoEmpresa() 
	{
		Trabajador t=null;
		System.out.println("En construccion");
		return t;
	}*/
	
	@Override
	public Trabajador leerValidarObjetoTrabajador()
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		boolean repetir=false,fechaValida=false;
		int opcionDni=0;
		char letra=' ';
		boolean existeDocumento=false;
		GestionTrabajador gt=new GestionTrabajador();
		Trabajador t=new Trabajador();
		Fecha fechaNacimiento=new Fecha();
		

		//sc.nextLine();//para limpiar el buffer
		System.out.println("---------------------------------------------");
		System.out.println("Introduce los datos de la persona a contratar");
		
		//leer el nombre
		try 
		{
			System.out.println("Introduce el nombre: ");
			setNombre(br.readLine().toUpperCase());
		} catch (ExcepcionTrabajador e1) 
		{
			System.out.println(e1);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//leer el apellido
		try 
		{
			System.out.println("Introduce el apellido: ");
			setApellidos(br.readLine().toUpperCase());
		} catch (ExcepcionTrabajador e1)
		{
			System.out.println(e1);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		//leer y validar el dni y el nie
		//presentar menuDni y validar la opcion
		repetir=true;
		while(repetir) 
		{
			do 
			{
				System.out.println("Elige una opcion");
				System.out.println("Pulsa 1 si es DNI");
				System.out.print("Pulsa 2 si es NIE:");
				
				try 
				{
					opcionDni=Integer.parseInt (br.readLine());
					repetir=false;
				}catch(InputMismatchException ioe) 
				{
					try 
					{
						br.readLine();
					} catch (IOException e) 
					{
						
					}
					System.out.println("Un numero entero porfa");
				}
				catch (IOException e) 
				{
					e.printStackTrace();
				}
				
			}while(opcionDni<1 || opcionDni>2);
		}
		
		switch(opcionDni) //segun opcionDni
		{
			case 1:
				//leer y validar el dni
				do 
				{
					System.out.println("------------------------------------------------");
					System.out.print("Introduce el DNI (Ej. 00000000T): ");
					try 
					{
						setDni(br.readLine().toUpperCase());
					} catch (ExcepcionTrabajador e1) 
					{
						System.out.println(e1);
					}
					catch (IOException e) 
					{
						e.printStackTrace();
					}
					
					letra=gt.ValidarDNI(dni.substring(0,8));//para enviar los digitos que queramos
					existeDocumento=gt.ExisteDniNie(dni);
					
				}while(letra!=dni.charAt(8) || dni.length()!=9 
						|| dni.charAt(0)<'0' || dni.charAt(0)>'9'
						|| dni.charAt(1)<'0' || dni.charAt(1)>'9' 
						|| dni.charAt(2)<'0' || dni.charAt(2)>'9'
						|| dni.charAt(3)<'0' || dni.charAt(3)>'9'
						|| dni.charAt(4)<'0' || dni.charAt(4)>'9'
						|| dni.charAt(5)<'0' || dni.charAt(5)>'9'
						|| dni.charAt(6)<'0' || dni.charAt(6)>'9'
						|| dni.charAt(7)<'0' || dni.charAt(7)>'9' 
						|| dni.charAt(8)<'A' || dni.charAt(8)>'Z'
						|| existeDocumento == true);
				
				break;
				
			case 2:
				//leer y validar el nie
				do 
				{
					System.out.println("------------------------------------------------");
					System.out.print("Introduce el NIE (Ej. X0000000T): ");
					try 
					{
						setDni(br.readLine().toUpperCase());
					} catch (ExcepcionTrabajador e1) 
					{
						System.out.println(e1);
					}catch(StringIndexOutOfBoundsException s)
					{
						System.out.println(s+": Nueve digitos porfa");
					}
					catch (IOException e) 
					{
						e.printStackTrace();
					}
					letra=gt.ValidarNIE(dni.substring(0,8));
					existeDocumento=gt.ExisteDniNie(dni);
					
				}while(letra!=dni.charAt(8) || dni.length()!=9  
						|| dni.charAt(0)!='X' && dni.charAt(0)!='Y' && dni.charAt(0)!='Z'
						|| dni.charAt(1)<'0' || dni.charAt(1)>'9' 
						|| dni.charAt(2)<'0' || dni.charAt(2)>'9'
						|| dni.charAt(3)<'0' || dni.charAt(3)>'9'
						|| dni.charAt(4)<'0' || dni.charAt(4)>'9'
						|| dni.charAt(5)<'0' || dni.charAt(5)>'9'
						|| dni.charAt(6)<'0' || dni.charAt(6)>'9'
						|| dni.charAt(7)<'0' || dni.charAt(7)>'9'
						|| dni.charAt(8)<'A' || dni.charAt(8)>'Z'
						|| existeDocumento == true);

				break;
		}//fin segun dni/nie
		
		//leer y validar el cargo
		repetir=true;
		while(repetir) 
		{
			System.out.println("Introduce el Cargo (VENDEDOR , ENCARGADO): ");
			try 
			{
				setCARGO(TipoCargo.valueOf(br.readLine().toUpperCase()));//leer el enum
				repetir=false;
			}catch(IllegalArgumentException iae) 
			{
				try 
				{
					br.readLine();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
				System.out.println(iae+": VENDEDOR o ENCARGADO porfa");
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
		}
		
		//leer y validar el sexo
		repetir=true;
		while(repetir) 
		{
			System.out.println("Introduce el sexo ('V' o 'M'): ");
			try 
			{
				setSexo(Character.toUpperCase(br.readLine().charAt(0)));
				repetir=false;
			} catch (ExcepcionTrabajador et) 
			{
				try 
				{
					br.readLine();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
				System.out.println(et);
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		//FeerValidarFecha
		do 
		{	
			//leer y validar fecha
			System.out.println("Introduce la fecha de nacimiento ");
			fechaNacimiento=fechaNacimiento.LeerValidarFecha();
			
			fechaValida=fechaNacimiento.ValidarFecha();
		}while(fechaValida!=true);
		
		t=new Trabajador(getNombre(),getApellidos(),getDni(),fechaNacimiento,getSexo(),getCARGO());
		
		return t;
	}
	
	/*
	public ObjectOutputStream leerValidarObjetoTrabajador(Trabajador [] trabajadorContratado) 
	{
		File fTrabajadorContartado = new File("src\\Clases\\trabajadorContratado.txt");
		//FileInputStream in = null;
		FileOutputStream out = null;
		
		ObjectOutputStream salida=null;
		 
		 Scanner sc=new Scanner (System.in);
			boolean repetir=false,fechaValida=false;
			int opcionDni=0;
			char letra=' ';
			int existeDocumento=0;
			GestoraTienda3 gt3=new GestoraTienda3();
			Trabajador t=new Trabajador();
			Fecha fechaNacimiento=new Fecha();
			

			sc.nextLine();//para limpiar el buffer
			System.out.println("---------------------------------------------");
			System.out.println("Introduce los datos de la persona a contratar");
			//leer el nombre
			System.out.println("Introduce el nombre: ");
			try 
			{
				setNombre(sc.nextLine().toUpperCase());
			} catch (ExcepcionTrabajador e1) 
			{
				System.out.println(e1);
			}
			
			//leer el apellido
			System.out.println("Introduce el apellido: ");
			try 
			{
				setApellidos(sc.nextLine().toUpperCase());
			} catch (ExcepcionTrabajador e1)
			{
				System.out.println(e1);
			}
			
			//leer y validar el dni y el nie
			//presentar menuDni y validar la opcion
			repetir=true;
			while(repetir) 
			{
				do 
				{
					System.out.println("Elige una opcion");
					System.out.println("Pulsa 1 si es DNI");
					System.out.print("Pulsa 2 si es NIE:");
					
					try 
					{
						opcionDni=sc.nextInt();
						repetir=false;
					}catch(InputMismatchException ioe) 
					{
						sc.nextLine();
						System.out.println("Un numero entero porfa");
					}
					
				}while(opcionDni<0 || opcionDni>2);
			}
			
			switch(opcionDni) //segun opcionDni
			{
				case 1:
					//leer y validar el dni
					do 
					{
						sc.nextLine();
						System.out.println("------------------------------------------------");
						System.out.print("Introduce el DNI (Ej. 00000000T): ");
						try 
						{
							setDni(sc.nextLine().toUpperCase());
						} catch (ExcepcionTrabajador e1) 
						{
							System.out.println(e1);
						}
						
						letra=GestoraTienda3.ValidarDNI(dni.substring(0,8));//para enviar los digitos que queramos
						//comprobar dni repetido
						try 
						{
							existeDocumento=gt3.ExisteDniNie(trabajadorContratado, dni);
						} catch (ExcepcionTrabajador e) 
						{
							System.out.println(e);
						}
					}while(letra!=dni.charAt(8) || dni.length()!=9 
							|| dni.charAt(0)<'0' || dni.charAt(0)>'9'
							|| dni.charAt(1)<'0' || dni.charAt(1)>'9' 
							|| dni.charAt(2)<'0' || dni.charAt(2)>'9'
							|| dni.charAt(3)<'0' || dni.charAt(3)>'9'
							|| dni.charAt(4)<'0' || dni.charAt(4)>'9'
							|| dni.charAt(5)<'0' || dni.charAt(5)>'9'
							|| dni.charAt(6)<'0' || dni.charAt(6)>'9'
							|| dni.charAt(7)<'0' || dni.charAt(7)>'9' 
							|| dni.charAt(8)<'A' || dni.charAt(8)>'Z'
							|| existeDocumento == 1);
					
					break;
					
				case 2:
					//leer y validar el nie
					do 
					{
						sc.nextLine();
						System.out.println("------------------------------------------------");
						System.out.print("Introduce el NIE (Ej. X0000000T): ");
						try 
						{
							setDni(sc.nextLine().toUpperCase());
						} catch (ExcepcionTrabajador e1) 
						{
							System.out.println(e1);
						}catch(StringIndexOutOfBoundsException s)
						{
							System.out.println(s+": Nueve digitos porfa");
						}
						letra=GestoraTienda3.ValidarNIE(dni.substring(0,8));
						//comprobar nie repetido
						try 
						{
							existeDocumento=gt3.ExisteDniNie(trabajadorContratado, dni);
						} catch (ExcepcionTrabajador e) 
						{
							System.out.println(e);
						}
					}while(letra!=dni.charAt(8) || dni.length()!=9  
							|| dni.charAt(0)!='X' && dni.charAt(0)!='Y' && dni.charAt(0)!='Z'
							|| dni.charAt(1)<'0' || dni.charAt(1)>'9' 
							|| dni.charAt(2)<'0' || dni.charAt(2)>'9'
							|| dni.charAt(3)<'0' || dni.charAt(3)>'9'
							|| dni.charAt(4)<'0' || dni.charAt(4)>'9'
							|| dni.charAt(5)<'0' || dni.charAt(5)>'9'
							|| dni.charAt(6)<'0' || dni.charAt(6)>'9'
							|| dni.charAt(7)<'0' || dni.charAt(7)>'9'
							|| dni.charAt(8)<'A' || dni.charAt(8)>'Z'
							|| existeDocumento == 1);

					break;
			}//fin segun dni/nie
			
			//leer y validar el cargo
			repetir=true;
			while(repetir) 
			{
				System.out.println("Introduce el Cargo (VENDEDOR O ENCARGADO): ");
				try 
				{
					setCARGO(TipoCargo.valueOf(sc.nextLine().toUpperCase()));//leer el enum
					repetir=false;
				}catch(IllegalArgumentException iae) 
				{
					sc.nextLine();
					System.out.println(iae+": VENDEDOR o ENCARGADO porfa");
				}
				
			}
			
			//leer y validar el sexo
			repetir=true;
			while(repetir) 
			{
				System.out.println("Introduce el sexo ('V' o 'M'): ");
				try 
				{
					setSexo(Character.toUpperCase(sc.next().charAt(0)));
					repetir=false;
				} catch (ExcepcionTrabajador et) 
				{
					sc.nextLine();
					System.out.println(et);
				}
			}
			
			//FeerValidarFecha
			do 
			{	
				//leer y validar fecha
				System.out.println("Introduce la fecha de nacimiento ");
				fechaNacimiento=fechaNacimiento.LeerValidarFecha();
				
				fechaValida=fechaNacimiento.ValidarFecha();
			}while(fechaValida!=true);
			
			t=new Trabajador(getNombre(),getApellidos(),getDni(),fechaNacimiento,getSexo(),getCARGO());
			
			
			//Crear fichero
			try 
			{
				fTrabajadorContartado.createNewFile();
				//Abrir fichero para escribir
				out = new FileOutputStream(fTrabajadorContartado);	
				salida = new ObjectOutputStream(out);
				
				salida.writeObject(t);
				
			} catch (IOException e) 
			{
				System.out.println(e);
			}		
			finally 
			{
				try 
				{
					salida.close();
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
			
		return salida; 
	}*/
}
