/** Nombre del programa: RelojDeArena
 * 
 * 
 * 
 * 
 */


import java.util.*;

public class RelojDeArena
{
	public static void main (String [] args)
	{
		Scanner s=new Scanner (System.in);
		
		char car=' ';
		int base=0;
		int mitad=0;
		
		System.out.print('\n'+"Introduce la base: ");
		base=s.nextInt();
		
		System.out.print('\n'+"Introduce el caracter: ");
		car=s.next().charAt(0);
		
		
		if(base>1 && base%2!=0)
		{
			for(int i = 0;i<=base;i++)
			{
				for(int j=0;j<=i-1;j++)
				{
					System.out.print(" ");
				}
				
				for(int j=base-i;j>0;j--)
				{
					System.out.print(car+" ");
				}
			
			System.out.println();
			}
			
			for(int i = 0;i<=base;i++)
			{
				for(int j=base-i;j>0;j--)
				{
					System.out.print(" ");
				}
				
				for(int j=0;j<i;j++)
				{
					System.out.print(car+" ");
				}
			
			System.out.println();
			}
			
		}
		else
		{
			System.out.println("La base tiene que ser un numer impar y mayor que 1");
		}
	} 
}
