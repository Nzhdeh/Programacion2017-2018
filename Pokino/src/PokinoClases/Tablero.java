/** Nombre de la clase: Tablero
 * 
 * propiedades basicas:
 * 
 * 						tabla: tipo Baraja, consultable, modificable
 * 
 * propiedades compartidas : no hay
 * 
 * propiedades derivadas : no hay
 * 
 * INTERFAZ
 * 
 * getters y setters
 * 
 * public Baraja getTabla()
 * public void setTabla(int fila, int columna,Baraja caracter)
 * 
 * restricciones: 
 * 				
 * 				la tabla tiene que ser de 5x5
 * 
 */package PokinoClases;

import Excepciones.ExcepcionTablero;

public class Tablero implements Cloneable, Comparable <Tablero>
{
	private Baraja [][] tabla;
	
	//constructores
	//por defecto
	public Tablero() 
	{
		tabla=new Baraja[5][5];
	}
	
	//con parametros
	public Tablero(Baraja [][] tabla) throws ExcepcionTablero
	{
		if(tabla.length==5 && tabla[0].length==5) 
		{
			this.tabla=tabla;
		}
		else 
		{
			throw new ExcepcionTablero("Error, el tablero debe ser de 5x5");
		}
	}
	
	//de copia
	public Tablero(Tablero tablero) 
	{
		this.tabla=tablero.tabla;
	}

	//getters y setters
	public Baraja [][] getTabla() 
	{
		return tabla;
	}

	public void setTabla(Baraja [][] tabla) throws ExcepcionTablero
	{
		if(tabla.length==5 && tabla[0].length==5) 
		{
			this.tabla=tabla;
		}
		else 
		{
			throw new ExcepcionTablero("Error, el tablero debe ser de 5x5");
		}
	}
	

	@Override
	public String toString ()
	{
		return (getTabla()+"");//pongo las comillas para poder devolver un String
	}
	
	@Override
	public int hashCode ()
	{
		return (1991*tabla.hashCode());
	}
	
	@Override
	public Tablero clone ()
	{
		Tablero clon = null;
		
		try
		{
			clon = (Tablero) super.clone ();
		}
		catch (CloneNotSupportedException error)
		{
			System.out.println("No se ha podido clonar el objeto");
		}
		
		return clon;
	}
	
	//condicion de igualdad: El tamaño del array
	@Override
	public boolean equals (Object o)
	{
		boolean res = false;
		
		if(this==o) 
		{
			res=true;
		}
		else if (o != null && o instanceof Tablero)
		{
			Tablero tabla = (Tablero) o;
			
			if (this.getTabla().length == tabla.getTabla().length
				&& this.getTabla()[0].length == tabla.getTabla()[0].length)
			{
				res = true;
			}
		}
		
		return res;
	}	
	
	//condicion de comparacion: El tamaño del array
	//devuelve un 1 si el primero es mayor que el segundo , un -1 si es menor ,0 si son iguales
	public int compareTo(Tablero t) 
	{
		int comparar=0;
		
		if (this.getTabla().length > t.getTabla().length
				&& this.getTabla()[0].length > t.getTabla()[0].length)
		{
			comparar = 1;
		}
		else if (this.getTabla().length < t.getTabla().length
				&& this.getTabla()[0].length < t.getTabla()[0].length)
		{
			comparar = (-1);
		}
		return comparar;
	}
	
	//interfaz
	/*
	//interfaz
	prototipo:public void CargarArrayTablero()
	comentario:sirve para generar aleatoriamente la baraja española y guardarla en un array
	precondiciones:no hay
	entradas:no hay
	salidas:no hay
	entr/sal:un array
	postcondiciones:AN devuelve el array cargado
	*/
	/*
	//resguardo
	public void CargarArrayTablero() 
	{
		System.out.println("En construccion");
	}*/
	public Baraja [][] CargarArrayTablero() //la baraja es de 40 sin el 8 y 9
	{
		int generarNaipe=0;
		String carta=" ";
		Baraja c=new Baraja();
		
		for(int i=0;i<tabla.length;i++) 
		{
			for(int j=0;j<tabla.length;j++) 
			{
				String [] s= {"1","2","3","4","5","6","7","SO","CA","RE"};
				
				generarNaipe = (int) Math.round(Math.random() * (s.length));
				
				c.setNaipe(generarNaipe+"");
				c.setPalo(TipoPalo.getRandomPalo());
				
				//System.out.println(c);
				
				switch(generarNaipe) 
				{
				case 1:
					carta=1+" "; 
					break;
					
				case 2:
					carta=2+" "; 
					break;
					
				case 3:
					carta=3+" "; 
					break;
					
				case 4:
					carta=4+" "; 
					break;
					
				case 5:
					carta=5+" ";
					break;
					
				case 6:
					carta=6+" ";
					break;
					
				case 7:
					carta=7+" ";
					break;
					
				case 8:
					carta="SO";
					break;
					
				case 9:
					carta="CA";
					break;
					
				case 10:
					carta="RE";
					break;
				}
				c.setNaipe(carta);
				c=new Baraja(c.getNaipe(),c.getPalo());
				tabla[i][j]=c; //new Baraja(c.getPalo(),c.getNaipe());
			}
		}
		return tabla;
	}
	
	//interfaz
	/*
	//interfaz
	prototipo: public void GenerarTablero() 
	comentario:sirve para pintar el tablero
	precondiciones:array lleno
	entradas:un array
	salidas:no hay
	entr/sal:no hay
	postcondiciones:no hay, solo pinta
	*/
	/*
	//resguardo
	public void GenerarTablero() 
	{
		System.out.println("En construccion");
	}*/
	
	public void GenerarTablero() 
	{
		System.out.println("------------------------------------");
		System.out.println("| "+tabla[0][0]+" | "+tabla[0][1]+" | "+tabla[0][2]+" | "+tabla[0][3]+" | "+tabla[0][4]+" | ");
		System.out.println("------------------------------------");
		System.out.println("| "+tabla[1][0]+" | "+tabla[1][1]+" | "+tabla[1][2]+" | "+tabla[1][3]+" | "+tabla[1][4]+" | ");
		System.out.println("------------------------------------");
		System.out.println("| "+tabla[2][0]+" | "+tabla[2][1]+" | "+tabla[2][2]+" | "+tabla[2][3]+" | "+tabla[2][4]+" | ");
		System.out.println("------------------------------------");
		System.out.println("| "+tabla[3][0]+" | "+tabla[3][1]+" | "+tabla[3][2]+" | "+tabla[3][3]+" | "+tabla[3][4]+" | ");
		System.out.println("------------------------------------");
		System.out.println("| "+tabla[4][0]+" | "+tabla[4][1]+" | "+tabla[4][2]+" | "+tabla[4][3]+" | "+tabla[4][4]+" | ");
		System.out.println("------------------------------------");
	}
	
	/*******************************************************/
	public Baraja [][] MarcarCarta(Baraja b)
	{
		for(int i=0;i<tabla.length;i++) 
		{
			for(int j=0;j<tabla.length;j++)
			{
				if(tabla[i][j].equals(b)) //comprobar carta por carta
				{
					tabla[i][j]="* ";
				}
			}
		}
		
		return tabla;
	}
}
