/**Nombre del programa: MuestraParSumaCienEcuacionSegundoGrado
 * 
 * 
 * analisis:este programa segun la opcion que elija el usuario
 * 								-recibe un numero entero y calcula la suma de los siguentes cien numeros
 * 								-recibe un numero entero y positivo y calcula todos los numeros pares anteriores
 * 								-recibe tres numeros y calcula la ecuacion de segundo grado
 * 												
 * 
 * entradas: double a,double b,double c,int numero,int opcion,char desea
 * salidas: double x,double y,int numero,int suma
 * 
 * 
 * PSEUDOCODIGO GENERALIZADO
 * 		inicio
 * 			presentar menu leer y validar la opcion
 * 			mientras (opcion!=0)
 * 				segun(opcion)
 * 					caso 1:
 * 						sumar cien numeros
 * 					caso 2:
 * 						calcular numeros pares
 * 					caso 3:
 * 						calcular una ecuacion de segundo grado
 * 				fin_segun
 * 				volver a presentar menu leer y validar la opcion
 * 			fin_mientras
 * 		finPP
 * 
 * MODULOS
 * 
 * 	//sumar cien numeros
 * 		preguntar si desea seguir y leer y validar respuesta
 * 		mientras(desea=='S')
 * 			leer un numero
 * 			calcular la suma (*)
 * 			mostrar resultado
 * 		volver a preguntar si desea seguir y leer y validar respuesta
 * 		fin_mientras
 * 
 * 	//calcular numeros pares
 * 		preguntar si desea seguir y leer y validar respuesta
 * 		mientras(desea=='S')
 * 			leer y validar un numero
 * 			calcular e imprimir pares (*)
 * 		volver a preguntar si desea seguir y leer y validar respuesta
 * 		fin_mientras
 * 
 * 	//calcular una ecuacion de segundo grado
 * 		preguntar si desea seguir y leer y validar respuesta
 * 		mientras(desea=='S')
 * 			leer a,b,c
 * 			calcular la ecuacion de segundo grado y mostrar resultado (*)
 * 		volver a preguntar si desea seguir y leer y validar respuesta
 * 		fin_mientras
 * 
 * 
 * restricciones: en el segundo caso el numero tiene que ser entero y mayor que 1
 */
import java.util.*;

public class MuestraParSumaCienEcuacionSegundoGrado
{
	public static void main (String args [])
	{
		Scanner sc=new Scanner(System.in);
		
		//variables
		double a=0, b=0, c=0, x=0, y=0;
		int numero=0,suma=0,cont,opcion=0;
		char desea=' ';
		
		
		//presentar menu leer y validar la opcion
		do
		{
			System.out.println("-------------------------------------------------------------------------");
			System.out.println("Elije una de las siguentes opciones");
			System.out.println("Pulsar 0 para salir");
			System.out.println("Pulsar 1 para sumar cien numeros");
			System.out.println("Pulsar 2 para calcular numeros pares");
			System.out.println("Pulsar 3 para calcular una ecuacion de segundo grado");
			opcion=sc.nextInt();
			if(opcion<0 || opcion>3)
			{
				System.out.println("No,Noo,Nooo. Lee bieeen");
				System.out.println("-------------------------------------------------------------------------");
			}
		}while(opcion<0 || opcion>3);
		
		while(opcion!=0)
		{
			switch(opcion)
			{
				case 1:
					//sumar cien numeros
					//preguntar si desea seguir y leer y validar respuesta
					do
					{
						System.out.println("-------------------------------------------------------------------------");
						System.out.print("Deseas sumar cien numeros? s/n: ");
						desea=Character.toUpperCase(sc.next().charAt(0));
					}while(desea!='S' && desea!='N');
					
					while(desea=='S')
					{
						//leer un numero
						System.out.println("-------------------------------------------------------------------------");
						System.out.print("Introduce un numero: ");
						numero=sc.nextInt();
						
						//calcular la suma
						for(cont=0;cont<=100;cont++)
						{
							//numero++;
							suma+=numero++;
						}
						
						//mostrar resultado
						System.out.println("-------------------------------------------------------------------------");
						System.out.println("La sume es: "+suma);
						suma=0;//vuelvo a poner la variable suma en 0 para que no se vaya acumulando por si vuelvo a sumar numeros 
						
						//volver a preguntar si desea seguir y leer y validar respuesta
						do
						{
							System.out.println("-------------------------------------------------------------------------");
							System.out.print("Deseas sumar cien numeros? s/n: ");
							desea=Character.toUpperCase(sc.next().charAt(0));
						}while(desea!='S' && desea!='N');
					}//fin_mientras
					
				break;
				
				case 2:
					//calcular numeros pares
					//preguntar si desea seguir y leer y validar respuesta
					do
					{
						System.out.println("-------------------------------------------------------------------------");
						System.out.print("Deseas calcular pares? s/n: ");
						desea=Character.toUpperCase(sc.next().charAt(0));
					}while(desea!='S' && desea!='N');
					
					while(desea=='S')
					{
						//leer y validar el numero
						do
						{
							System.out.println("-------------------------------------------------------------------------");
							System.out.print("Introduce un numero entero mayor que 1: ");
							numero=sc.nextInt();
						}while(numero<2);
						
						//calcular e imprimir pares
						for(cont=0;cont<numero;cont++)
						{
							for(;cont<numero;numero--)
							{			
								if(numero%2==0)
								{
									System.out.println("-------------------------------------------------------------------------");
									System.out.println("Numero par: "+numero);
								}	
							}
						}
						
						//preguntar si desea seguir y leer y validar respuesta
						do
						{
							System.out.println("-------------------------------------------------------------------------");
							System.out.print("Deseas calcular pares? s/n: ");
							desea=Character.toUpperCase(sc.next().charAt(0));
						}while(desea!='S' && desea!='N');
					}//fin_mientras
					
				break;
				
				case 3:
					//calcular una ecuacion de segundo grado
					//preguntar si desea resolver una ecuacion de segundo grado y ller y validar la respuesta
					do{
						System.out.println("-------------------------------------------------------------------------");
						System.out.print("Deseas resolver una ecuacion de segiundo grado?(s/n): ");
						desea=Character.toUpperCase(sc.next().charAt(0));
					}while(desea!='S' && desea!='N');
					
					while(desea=='S')
					{
						//leer a,b,c
						System.out.println("-------------------------------------------------------------------------");
						System.out.println("Introduce a: ");
						System.out.println("-------------------------------------------------------------------------");
						a=sc.nextDouble();
						System.out.println("-------------------------------------------------------------------------");
						System.out.println("Introduce b: ");
						System.out.println("-------------------------------------------------------------------------");
						b=sc.nextDouble();
						System.out.println("-------------------------------------------------------------------------");
						System.out.println("Introduce c: ");
						System.out.println("-------------------------------------------------------------------------");
						c=sc.nextDouble();
						
						//calcular la ecuacion de segundo grado y mostrar resultado
						if(a==0 && b==0 && c==0)
						{
							System.out.println("-------------------------------------------------------------------------");
							System.out.println("Te crees muy listo eee?");
							System.out.println("No es una ecuacion");
							System.out.println("-------------------------------------------------------------------------");
						}
						else if(a==0)
						{
							System.out.println("-------------------------------------------------------------------------");
							System.out.println("No es una ecuacion de segundo grado, porque a=0");
							
							x=(-c)/b;
							System.out.println("Pero soy buena gente y te dare la solucion: "+"x="+x);
							System.out.println("-------------------------------------------------------------------------");
						}
						else if((4*a*c)>(b*b))
						{
							System.out.println("-------------------------------------------------------------------------");
							System.out.println("No tiene solucion, porque la raiz cuarada de b^2 - 4ac<0");
							System.out.println("-------------------------------------------------------------------------");
						}
						else if((b*b-4*a*c)==0)
						{
							x=(-b)/(2*a);
							System.out.println("-------------------------------------------------------------------------");
							System.out.println("Tiene una solucion, porque la raiz cuarada de b^2 - 4ac=0");
							System.out.println("x="+x);
							System.out.println("-------------------------------------------------------------------------");
						}
						else if(a<0)
						{
							a=a*(-1);
							b=b*(-1);
							c=c*(-1);
							
							x=((-b)+(Math.sqrt((Math.pow(b, 2)-(4*a*c)))))/(2*a);
							
							y=((-b)-(Math.sqrt(((b*b)-(4*a*c)))))/(2*a);
							
							System.out.println("-------------------------------------------------------------------------");
							System.out.println("x="+x);
							System.out.println("x="+y);
							System.out.println("-------------------------------------------------------------------------");
							
						}
						else
						{
							x=((-b)+(Math.sqrt((Math.pow(b, 2)-(4*a*c)))))/(2*a);
							
							y=((-b)-(Math.sqrt(((b*b)-(4*a*c)))))/(2*a);
							
							System.out.println("-------------------------------------------------------------------------");
							System.out.println("x="+x);
							System.out.println("x="+y);
							System.out.println("-------------------------------------------------------------------------");
						}
							
						//volver a preguntar si desea resolver una ecuacion de segundo grado y leer y validar la respuesta
						do{
							System.out.println("-------------------------------------------------------------------------");
							System.out.print("Deseas resolver una ecuacion de segiundo grado?(s/n): ");
							desea=Character.toUpperCase(sc.next().charAt(0));
						}while(desea!='S' && desea!='N');
				
					}//fin mientras
					
				break;
			}
			
			//volver a presentar menu leer y validar la opcion
			do
			{
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("Elije una de las siguentes opciones");
				System.out.println("Pulsar 0 para salir");
				System.out.println("Pulsar 1 para sumar cien numeros");
				System.out.println("Pulsar 2 para calcular numeros pares");
				System.out.println("Pulsar 3 para calcular una ecuacion de segundo grado");
				opcion=sc.nextInt();
				if(opcion<0 || opcion>3)
				{
					System.out.println("No,Noo,Nooo. Lee bieeen");
					System.out.println("-------------------------------------------------------------------------");
				}
			}while(opcion<0 || opcion>3);
		}//fin segun
	}
}
