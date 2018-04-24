/** Nombre de la calse: Baraja
 * 
 * propiedades basicas:
 * 
 * 						palo: tipo char , consultable
 * 						naipe: tipo entero, consultable
 * 
 * 
 * propiedades compartidas: no hay
 * 
 * propiedades derivadas: no hay
 * 
 * getters y setters
 * 
 * public char getPalo()
 * 
 * public int getNaipe()
 * 
 *  metodos añadidos:
 *  
 *  				
 */
package PokinoClases;

public class Baraja implements Cloneable, Comparable <Baraja>
{
	private TipoPalo palo;
	private String naipe;
	//private final String marcado="M";
	
	//constructores
	//por defecto
	public Baraja() 
	{
		palo=null;
		naipe=" ";
	}
	
	//con parametros
	public Baraja(String naipe,TipoPalo palo) 
	{
		this.palo=palo;
		this.naipe=naipe;
	}
	
	//de copia
	public Baraja (Baraja baraja) 
	{
		this.palo=baraja.getPalo();
		this.naipe=baraja.getNaipe();
	}

	
	//getter y setters
	public TipoPalo getPalo() 
	{
		return palo;
	}

	public String getNaipe()
	{
		return naipe;
	}
	
	public void setPalo(TipoPalo palo) {
		this.palo = palo;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}
	
	
	
	@Override
	public String toString() 
	{
		return (getNaipe()+" "+getPalo());
	}
	
	@Override
	public int hashCode() 
	{
		return (2799*naipe.hashCode()/48);
	}
	
	@Override
	public Baraja clone() 
	{
		Baraja clon=null;
		
		try 
		{
			clon=(Baraja) super.clone();
		}catch(CloneNotSupportedException error) 
		{
			System.out.println("No se puede clonar");
		}
		
		return clon;
	}
	
	@Override
	public boolean equals(Object o) 
	{
		boolean res= false;
		
		if(this==o) 
		{
			res=true;
		}
		else if(o!= null && o instanceof Baraja) 
		{
			Baraja baraja=(Baraja) o;
			
			if(this.getPalo()==baraja.getPalo() && this.getNaipe()==baraja.getNaipe()) 
			{
				res=true;
			}
		}
		
		return res;
	}
	
	public int compareTo(Baraja b) 
	{
		int res=0;
		
		if(this.getNaipe().compareTo(b.getNaipe())==1 && this.getPalo()!=b.getPalo()) 
		{
			res=1;
		}else if(this.getNaipe().compareTo(b.getNaipe())==-1 && this.getPalo()!=b.getPalo()) 
		{
			res=(-1);
		}
		return res;
	}
	
	//interfaz
	/*
	//interfaz
	prototipo: public void PintarCarta() 
	comentario:sirve para pintar una carta
	precondiciones:no hay
	entradas:no hay
	salidas:no hay
	entr/sal:no hay
	postcondiciones:no hay, solo pinta
	*/
	/*
	//resguardo
	public void PintarCarta() 
	{
		System.out.println("En construccion");
	}*/
	
	public void PintarCarta() 
	{
		System.out.println("-------");
		System.out.println("| "+getNaipe()+"  |");
		System.out.println("|  "+getPalo()+"  |");
		System.out.println("|   "+getNaipe()+"|");
		System.out.println("-------");
	}
/*
	public Baraja getMarca() {
		// TODO Auto-generated method stub
		return null;
	}*/
}
