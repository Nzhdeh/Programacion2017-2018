/**
 * 
 * 
 */

import java.util.*;

public class PintaCuadrado
{
	public static void main (String [] args)
	{
		Scanner s=new Scanner (System.in);
		
		char car=' ';
		int base=0;
		int i;
		
		do
		{
		System.out.print('\n'+"Introduce la base: ");
		base=s.nextInt();
		}while(base<1 || base%2==0);
		
		do
		{
		System.out.print('\n'+"Introduce el caracter: ");
		car=s.next().charAt(0);
		}while(car=='*');
		
		
			for(i = 0;i<base;i++)
			{
				System.out.print(car+" ");
			}
			
			System.out.println("");
			
			
			for(i = 0;i<base-2;i++)
			{
				System.out.print(car);
				
				for(int j=0;j<base-2;j++)
				{
					System.out.print("  ");
				}
				System.out.println(" "+car);
			}
			
			for(i = 0;i<base;i++)
			{
				System.out.print(car+" ");
			}
			
			System.out.println("");
		
	}
}
