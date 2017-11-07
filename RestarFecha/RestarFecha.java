import java.util.*;
public class RestarFecha
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		int dia1=0,mes1=0,anio1=0;
		int dia2=0,mes2=0,anio2=0;
		int diaR=0,mesR=0,anioR=0;
		
		System.out.print("Dia1: ");
		dia1=sc.nextInt();
		
		System.out.print("Mes1: ");
		mes1=sc.nextInt();
		
		System.out.print("Anio1: ");
		anio1=sc.nextInt();
		
		System.out.print("Dia2: ");
		dia2=sc.nextInt();
		
		System.out.print("Mes2: ");
		mes2=sc.nextInt();
		
		System.out.print("Anio2: ");
		anio2=sc.nextInt();
		
		
		if((anio1>=anio2 && mes1>=mes2 && dia1>=dia2))
		{
			anioR=anio1-anio2;
			mesR=mes1-mes2;
			diaR=dia1-dia2;
		}else
		{
			anioR=anio2-anio1;
			mesR=mes2-mes1;
			diaR=dia2-dia1;
		}
		System.out.print(anioR+" anios "+mesR+" meses "+diaR+" dias"+'\n');
	}
}
