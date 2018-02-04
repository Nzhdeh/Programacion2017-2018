/**Nombre del programa: MainGestionTienda
 * 
 * analisis: Es un programa que gestiona una tienda. Segun las opciones que elija 
 * 			 el usuario podra contratar o despedir trabajadores avisar o consultar 
 * 			 incidencias, vender o devolver productos.
 * 
 * entradas: int opcion
 * salidas: double venta
 * 
 * PSEUDOCODIGO GENERALIZADO
 * 
 * 	inicio
 * 		presentar el menu y leer y validar la opcion
 * 		mientras(opcion!=0)
 * 			segun(opcion)
 * 				caso 1:
 * 					hacer las funciones del jefe
 * 				caso 2:
 *					hacer las funciones del encargado 
 * 				caso 3:
 * 					hacer las funciones del trabajador
 * 			fin_segun
 * 		volver a presentar el menu y leer y validar la opcion
 * 		fin_mientras
 * 	fin_pp
 * 
 * 
 * MODULOS
 * 
 * 	//hacer las funciones del jefe
 * 		
 * 		presentar el menu y leer y validar la opcion
 * 			mientras(opcion!=0)
 * 				segun(opcion)
 * 					caso 1:
 * 						calcular ventas
 * 					caso 2:
 * 						contratar un trabajador
 * 					caso 3:
 *              	    despedir a un trabajador
 *             		caso 4:
 *              		consultar incidencias
 * 				fin_segun
 * 			volver a presentar el menu y leer y validar la opcion
 * 		fin_mientras
 * 
 * 	//hacer las funciones del encargado 
 * 
 * 		presentar el menu y leer y validar la opcion
 * 			mientras(opcion!=0)
 * 				segun(opcion)
 * 					caso 1:
 * 						encargar productos nuevos
 * 					caso 2:
 * 						avisar sobre una incidencia
 * 				fin_segun	
 * 			volver a presentar el menu y leer y validar la opcion
 * 		fin_mientras
 * 
 * 	//hacer las funciones del trabajador
 * 
 * 		presentar el menu y leer y validar la opcion
 * 			mientras(opcion!=0)
 * 				segun(opcion)
 * 					caso 1:
 * 						vender productos
 * 					caso 2:
 * 						hacer una devolucion
 * 				fin_segun
 * 			volver a presentar el menu y leer y validar la opcion
 * 		fin_mientras
 *  
 * 
 * Restricciones: de momento ninguna
 */


package Proyecto;

//import java.io.*;
import java.util.*;

import javax.xml.bind.ValidationEvent;
public class MainGestionTienda {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		//variables
		int opcion=0,opcionDni=0, i=0;
		//char seguir=' ';
		double venta=0.,precio=0.0,peso=0.0;
		//int tam=0;
		ArrayList<Trabajador> contrataTrabajador = null;
		//ArrayList<Trabajador> despideTrabajador;
		int cantidad=0;//cantidad de trabajadores
		String nombre=" ",apellidos=" ",dni=" ";
		char sexo=' ';
		boolean existeTrabajador=false,fechaValida=false,existeProducto=false;
		//int cantidad=0;
		//boolean existe=false;
		//Fecha fecha=new Fecha();
		Fecha fechaIni=new Fecha();
		Fecha fechaFin=new Fecha();
		Fecha fechaVenta=new Fecha();
		Fecha fechaNacimiento=new Fecha();
		
		String incidencia = "";
		String [] denuncia=null;
		//Trabajador trabajador=new Trabajador();
		String [] clienteDenuncia = new String[5];
		ArrayList <Trabajador> trabajadorContratado = new ArrayList<Trabajador>();
		Producto [] productoVendido=new Producto[10];
		Producto [] arrayVendido = new Producto[10];
		Producto [] producto={new Producto("Tarjeta de red",15.05,fechaVenta,10,0.3),new Producto("Disco DVD",1.20,fechaVenta,10,0.1),new Producto("Cable HDMI",3.50,fechaVenta,10,0.2)
							 ,new Producto("Placa base",100,fechaVenta,10,0.9),new Producto("Disco duro SSD",80,fechaVenta,10,0.1),new Producto("Procesador i7",200.0,fechaVenta,10,0.2)
							 ,new Producto("Tarjeta de red",30,fechaVenta,10,0.5),new Producto("Disco CD",1.20,fechaVenta,10,0.1),new Producto("Cable DVI",1.50,fechaVenta,10,0.2)
							 ,new Producto("Placa base",120,fechaVenta,10,0.7),new Producto("Disco duro",50,fechaVenta,10,0.1),new Producto("Procesador i5",180.0,fechaVenta,10,0.2)
							 ,new Producto("Fuente de alimentacion",60.50,fechaVenta,10,1.0),new Producto("Disco duro m.2",140,fechaVenta,10,0.1),new Producto("Procesador i3",100.0,fechaVenta,10,0.2)
							 };
		
		//presentar el menu y leer y validar la opcion
		do
		{
			GestoraTienda.MenuPrincipal();
			opcion=sc.nextInt();
			if(opcion<0 || opcion>3) 
			{
				System.out.println("-----------------------------------------------");
				System.out.println("Opcion incorrecta, vuelve a intentarlo");
			}
		}while(opcion<0 || opcion>3);
		
		while(opcion!=0)
		{
			switch(opcion)
			{
				case 1:
					
					//presentar el menu y leer y validar la opcion
					do
					{
						GestoraTienda.MenuJefe();
						opcion=sc.nextInt();
					}while(opcion<0 || opcion>5);
							
					while(opcion!=0)
					{
						switch(opcion)
						{
							case 1:
								//calcular ventas 
								venta=GestoraTienda.CalculaVenta(productoVendido, fechaIni, fechaFin);
									
								break;
										
							case 2:
							//contratar un trabajador
								
								//preguntar la cantidad de trabajadores y validar la respuesta
								do 
								{
									System.out.println("---------------------------------------------");
									System.out.print("Cuantos trabajadores vas a contratar?: ");
									cantidad=sc.nextInt();
								}while(cantidad<1);
								
								if(cantidad>0) 
								{
									for(;i<cantidad;i++) 
									{
										sc.nextLine();//para limpiar el buffer
										
										System.out.println("Introduce el nombre: ");
										nombre=sc.nextLine();
										
										//sc.nextLine();//para limpiar el buffer
										
										System.out.println("Introduce el apellido: ");
										apellidos=sc.nextLine();
										
										do 
										{
											System.out.println("Elige una opcion");
											System.out.println("Pulsa 1 si es DNI");
											System.out.print("Pulsa 2 si es NIE:");
											opcionDni=sc.nextInt();
										}while(opcionDni<1 || opcionDni > 2);
										
										//elegir si es dni o nie
										switch(opcionDni) 
										{
											case 1:
												do 
												{
													sc.nextLine();
													System.out.println("------------------------------------------------");
													System.out.print("Introduce el DNI (Ej. 00000000B): ");
													dni=sc.nextLine();
													
												}while(dni.length()!=9 || dni.charAt(i)<'0' || dni.charAt(i)>'9' || dni.charAt(8)<'a' || dni.charAt(8)>'z');
												break;
											case 2:
												do 
												{
													sc.nextLine();
													System.out.println("------------------------------------------------");
													System.out.print("Introduce el NIE (Ej. X0000000A): ");
													dni=sc.nextLine();
													
												}while(dni.length()!=9 ||  dni.charAt(0)<'a' || dni.charAt(0)>'z'
														|| dni.charAt(i+1)<'0' || dni.charAt(i+1)>'9' || dni.charAt(8)<'a' || dni.charAt(8)>'z');
	
												break;
										}
										
										System.out.println("Introduce el sexo: ");
										sexo=sc.next().charAt(0);
										
										System.out.println("Introduce la fecha de nacimiento ");
										System.out.println("Introduce el dia: ");
										try 
										{
											fechaNacimiento.setDia(sc.nextInt());
										} catch (ExcepcionFecha e) 
										{
											System.out.println(e);
										}
										
										System.out.println("Introduce el mes: ");
										try 
										{
											fechaNacimiento.setMes(sc.nextInt());
										} catch (ExcepcionFecha e) 
										{
											System.out.println(e);
										}
										
										System.out.println("Introduce el anio: ");
										try 
										{
											fechaNacimiento.setAnio(sc.nextInt());
										} catch (ExcepcionFecha e) 
										{
											System.out.println(e);
										}
										
										//comprobar si la fecha es valida
										try 
										{
											fechaValida=fechaNacimiento.ValidarFecha();
										}
										catch(ExcepcionFecha ef) 
										{
											System.out.println(ef);
										}
										
										if(fechaValida==true) 
										{
											trabajadorContratado.add(new Trabajador(nombre,apellidos,dni,fechaNacimiento,sexo));
										}
										else 
										{
											System.out.println("La fecha no es valida");
										}
									}//for caso 2
									
									//contratar al trabajador
									contrataTrabajador=GestoraTienda.ContrataTrabajador(trabajadorContratado);
									
									//mostrar el resultado
									System.out.println(contrataTrabajador);
								}
								
								
								break;
										
							case 3:
								//despedir a un trabajador
								
								//leer el dni del trabajador
								sc.nextLine();
								System.out.println("Introduce el dni/nie: ");
								dni=sc.nextLine();
								
								//comprobamos si el trabajador existe
								try 
								{
									existeTrabajador=GestoraTienda.ExisteTrabajador(trabajadorContratado, dni);
								} catch (ExcepcionTrabajador et) 
								{
									System.out.
									println(et);
								}
								
								if(existeTrabajador==true) 
								{
									//eliminar al trabajador
									try 
									{
										GestoraTienda.DespideTrabajador(trabajadorContratado, dni);
									} catch (ExcepcionTrabajador e)
									{
										System.out.println(e);
									}
								}else 
								{
									System.out.println("El trabajador no existe");
								}
			
								break;
									
							case 4:
								//consultar la lista de trabajadores
								GestoraTienda.ConsultarTrabajadorContratado(trabajadorContratado);
								break;
								
							case 5:
								//consultar incidencias
								GestoraTienda.ConsultaIncidencias(clienteDenuncia);
								break;
						}//fin segun caso jefe
						
						//volver a presentar el menu y leer y validar la opcion
						do
						{
							GestoraTienda.MenuJefe();
							opcion=sc.nextInt();
						}while(opcion<0 || opcion>5);
					}//fin mientras de submenu Jefe
						
					break;
					
				case 2:
					//presentar el menu y leer y validar la opcion
					do
					{
						GestoraTienda.MenuEncargado();
						opcion=sc.nextInt();
					}while(opcion<0 || opcion>3);
							
					while(opcion!=0)
					{
						switch(opcion)
						{
							case 1:
								//encargar productos nuevos
								GestoraTienda.EncargaProductos(producto);
								break;
										
							case 2:
								//avisar sobre una incidencia
							
								//preguntar la cantidad de incidencias y validar la respuesta
								do 
								{
									System.out.println("---------------------------------------------");
									System.out.print("Cuantos incidencias ha ocurrido?: ");
									cantidad=sc.nextInt();
								}while(cantidad<1);
								
								//tam=tam+cantidad;
								
								//leer los datos del denunciante
								for(;i<cantidad;i++) 
								{
									sc.nextLine();//para limpiar el buffer
									
									System.out.println("Redacta el motivo de la denuncia: ");
									incidencia=sc.nextLine();
									
									clienteDenuncia[i]=new String(incidencia);
								}
								
								//hacer el aviso
								denuncia=GestoraTienda.AvisaIncidencias(clienteDenuncia);
								break;
								
							case 3:
								GestoraTienda.ConsultarProductosTienda(producto);
								break;
						}//fin segun Encargado

						//volver a presentar el menu y leer y validar la opcion
						do
						{
							GestoraTienda.MenuEncargado();
							opcion=sc.nextInt();
						}while(opcion<0 || opcion>3);
					}//fin mientras de submenu Encargado
				
					break;
					
				case 3:
					//presentar el menu y leer y validar la opcion
					do
					{
						GestoraTienda.MenuTrabajador();
						opcion=sc.nextInt();
					}while(opcion<0 || opcion>2);
							
					while(opcion!=0)
					{
						switch(opcion)
						{
							case 1:
								//vender productos
								//pintar los productos
								GestoraTienda.PintaProductos(producto);
								
								//leer el producto
								sc.nextLine();//para limpiar el buffer
								System.out.println("--------------------------------------------------");
								System.out.println("Introduce el nombre: ");
								nombre=sc.nextLine();
								
								System.out.println("Introduce el precio: ");
								precio=sc.nextDouble();
								
								System.out.println("Introduce la cantidad: ");
								cantidad=sc.nextInt();
								
								System.out.println("Introduce la fecha de venta ");
								System.out.println("Introduce el dia: ");
								try 
								{
									fechaVenta.setDia(sc.nextInt());
								} catch (ExcepcionFecha e) 
								{
									System.out.println(e);
								}
								
								System.out.println("Introduce el mes: ");
								try 
								{
									fechaVenta.setMes(sc.nextInt());
								} catch (ExcepcionFecha e) 
								{
									System.out.println(e);
								}
								
								System.out.println("Introduce el anio: ");
								try 
								{
									fechaVenta.setAnio(sc.nextInt());
								} catch (ExcepcionFecha e) 
								{
									System.out.println(e);
								}
								
								System.out.println("Introduce el peso: ");
								peso=sc.nextDouble();								
								
								productoVendido[i]=new Producto(nombre,precio,fechaVenta,cantidad,peso);
								try 
								{
									existeProducto=GestoraTienda.ExisteProducto(producto, nombre);
								} catch (ExcepcionProducto ep)
								{
									System.out.println(ep);
								}
								if(existeProducto==true && producto[i].getCantidad()>cantidad) 
								{
									try 
									{
										arrayVendido=GestoraTienda.VendeProducto(productoVendido,cantidad);
									} catch (ExcepcionProducto ep)
									{
										System.out.println(ep);
									}
								}
								else 
								{
									System.out.println("Producto no disponible");
								}
								
								break;
										
							case 2:
								//hacer una devolucion
							try 
							{
								GestoraTienda.DevuelveProducto(productoVendido, cantidad);
							} catch (ExcepcionProducto ep) 
							{
								System.out.println(ep);
							}
								break;
						}//fin segun trabajador

						//volver a presentar el menu y leer y validar la opcion
						do
						{
							GestoraTienda.MenuTrabajador();
							opcion=sc.nextInt();
						}while(opcion<0 || opcion>2);
					}//fin mientras de submenu Trabajador
					
					break;
			}//fin_segun pricipal
			
			//volver a presentar el menu y leer y validar la opcion
			do
			{
				GestoraTienda.MenuPrincipal();
				opcion=sc.nextInt();
				if(opcion<0 || opcion>3) 
				{
					System.out.println("-----------------------------------------------");
					System.out.println("Opcion incorrecta, vuelve a intentarlo");
				}
			}while(opcion<0 || opcion>3);
			
		}//fin_mientras_menu_principal
		sc.close();
	}//fin main
}//fin clase
