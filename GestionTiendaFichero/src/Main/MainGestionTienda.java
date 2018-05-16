/**Nombre del programa: MainGestionTienda
 * 
 * analisis: Es un programa que gestiona una tienda. Segun las opciones que elija 
 * 			 el usuario podra contratar o despedir trabajadores avisar o consultar 
 * 			 incidencias, vender o devolver productos,generar nomina, etc.
 * 
 * entradas: la opcion de los menus,objeto Fecha,objeto Trabajador,objeto empresa,objeto incidencia,cadena dni,entero id
 * salidas: se pintara por pantalla los resultados y algunos mensajes de apollo
 * 
 * PSEUDOCODIGO GENERALIZADO
 * 
 * 	inicio
 * 		presentar el menuPrincipal y leer y validar la opcion
 * 		mientras(opcion!=0)
 * 			segun(opcion)
 * 				caso 1:
 * 					hacer las funciones del jefe
 * 				caso 2:
 * 					si hay trabajadores contratados
 * 						comprobar si el encargado existe(*)
 * 						si existe
 *							hacer las funciones del encargado 
 *						fin_si
 *						sino
 *							pintar mensaje
 *						fin_sino
 *					fin_si_contratado
 * 				caso 3:
 * 					si hay trabajadores contratados
 * 						comprobar si el trabajador existe(*)
 * 						si existe
 *							hacer las funciones del trabajador 
 *						fin_si
 *						sino
 *							pintar mensaje
 *						fin_sino
 *					fin_si_contratado
 * 			fin_segun
 * 		volver a presentar el menu y leer y validar la opcion
 * 		fin_mientras
 * 	fin_pp
 * 
 * MODULOS
 * 
 * 	//hacer las funciones del jefe
 * 		
 * 		presentar el menuJefe y leer y validar la opcion
 * 			mientras(opcion!=0)
 * 				segun(opcion)
 * 					caso 1:
 * 						calcular ventas
 * 					caso 2:
 * 						contratar un trabajador
 * 					caso 3:
 *              	    despedir a un trabajador
 *              	caso 4:
 *              		ConsultarTrabajadorContratado
 *             		caso 5:
 *              		ConsultarIncidencias (*)
 * 				fin_segun
 * 			volver a presentar el menuJefe y leer y validar la opcion
 * 		fin_mientras
 * 
 * //calcular ventas
 * 		inicio
 * 			si(productoVendido!=null)
 * 				LeerValidarFecha (*)	//fecha de inicio
 * 				LeerValidarFecha (*)	//fecha final
 * 
 * 				si(fechaIni>fechaFin)
 * 					pintar mensaje
 * 				fin_si
 * 				sino
 * 					CalcularVenta (*)
 * 					mostrar el resultado
 * 				fin_sino
 * 			fin_si_vendido
 * 		fin calcular
 * 
 * //contratar un trabajador
 * 		inicio
 * 			leerValidarObjetoTrabajador (*)
 * 			ContratarTrabajador(*)
 * 		fin_contratar
 * 
 * //despedir a un trabajador
 * 		inicio
 * 			leer el dni del trabajador
 * 			ExisteTrabajador (*)
 * 			si(existe)
 * 				DespedirTrabajador(*)
 * 			fin_si
 * 		fin_despedir
 * 
 * //ConsultarTrabajadorContratado
 * 		inicio
 * 			OrdenarFicheroTrabajadorContratado (*)
 * 			LeerFicheroTrabajadorContratado (*)
 * 		fin
 * 
 * //hacer las funciones del encargado 
 * 
 * 		presentar el menuEncargado y leer y validar la opcion
 * 			mientras(opcion!=0)
 * 				segun(opcion)
 * 					caso 1:
 * 						encargar productos nuevos
 * 					caso 2:
 * 						avisar sobre una incidencia
 *					caso 3:
 * 						consultar productos en la tienda (*)
 * 					caso 4:
 * 						if(denuncia[i]!=null)
 * 							eliminar incidencias
 * 						fin_si
 * 				fin_segun	
 * 			volver a presentar el menuEncargado y leer y validar la opcion
 * 		fin_mientras
 * 
 * /encargar productos nuevos
 * 		inicio
 * 			LeerValidarObjetoProducto (*)
 * 			EscribirEnFichero (*) //encargar el producto
 * 		fin_encargar
 * 
 * 	//avisar sobre una incidencia
 * 		inicio
 * 			LeerObjetoIncidencia (*)
 * 			AvisarIncidencias
 * 		fin_avisar
 * 
 * 
 * 	//eliminar incidencias
 * 		inicio
 * 			ConsultarIncidencias (*)
 * 			leer y validar la id de la incidencia
 * 			EliminarIncidencia(*)
 * 		fin_eliminar	
 * 
 * //hacer las funciones del trabajador
 * 
 * 		presentar el menuTrabajador y leer y validar la opcion
 * 			mientras(opcion!=0)
 * 				segun(opcion)
 * 					caso 1:
 * 						vender productos
 * 					caso 2:
 * 						hacer una devolucion
 * 				fin_segun
 * 			volver a presentar el menuTrabajador y leer y validar la opcion
 * 		fin_mientras
 * 
 * //vender productos
 * 		inicio
 * 			LeerFicheroProductoComprado (*)//pintar Productos
 * 			LeerValidarProductoParaVender (*)
 * 			ExisteProducto (*)
 * 			si(existe )
 * 				VenderProducto (*) restar la cantidad
 * 				VenderProducto2 (*) sumar la cantidad o crear nuevo
 * 			fin_si
 * 		fin_vender
 *  
 *  //hacer una devolucion
 *  	inicio
 *  		LeerFicheroProductoComprado (*)
 *  		LeerValidarProductoParaDevolucion (*)
 * 			ExisteProducto (*)
 * 			si(existe)
 * 				DevolverProducto (*)
 * 				DevolverProducto2 (*)
 * 			fin_si
 *  	fin_devolver
 * 
 * 
 *  Restricciones: no se puede meter caracteres en los datos numericos
 * 				  la opcion del menu principal esta entre 1 y 3 inclusive
 * 				  la opcion del MenuJefe esta entre 1 y 5 inclusive
 * 				  la opcion del MenuEncargado esta entre 1 y 4 inclusive
 * 				  la opcion del MenuTrabajador esta entre 1 y 2 inclusive
 * 				  el cargo tiene que ser ENCARGADO o VENDEDOR
 * 				  el dni/nie del trabajador es unico
 * 				  la id de la incidencia es autogenerada
 */
package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import Clases.*;
import Gestoras.*;
import Utilidades.Util;

public class MainGestionTienda 
{
	public static void main(String[] args) 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		
		int opcion=0,idIncidencia=0,i=0;
		double venta=0.0;// el resultado de las ventas de un periodo de tiempo
		String dni=" ";
		boolean fechaValida=false,existeProducto=false,incidenciaEliminado=false;
		boolean repetir; //para validar las entradas de los menus
		boolean existeTrabajador=false, existeEncargado=false,existeVendedor=false;
		
		Util u=new Util();
		
		Fecha fechaIni=new Fecha();
		Fecha fechaFin=new Fecha();
		
		
		File ficheroTrabajadorContratado=new File("src\\Ficheros\\trabajadorContratado.dat");
		File ficheroProductoEnTienda = new File("src\\Ficheros\\productoComprado.dat");
		File ficheroProductoVendido = new File("src\\Ficheros\\productoVendido.dat");
		
		Incidencia incidencia = new Incidencia();//creo un objeto Incidencia
		ArrayList<Incidencia> denuncia= new ArrayList<>();//es donde guardo las incidencias
		ArrayList<Incidencia> clienteDenuncia=new ArrayList<>();
		Trabajador t=new Trabajador();
		Producto productoDevolucion=new Producto();
		Producto productoAVender=new Producto();
		Producto productoParaTienda=new Producto();//los productos que se van a guardar en la tienda
		GestionTrabajador gt=new GestionTrabajador();
		GestionProducto gp=new GestionProducto();
		GestionMenu gm=new GestionMenu();
		GestionIncidencia gi=new GestionIncidencia();
		
	
		//presentar el MenuPrincipal y leer y validar la opcion
		repetir=true;
		while(repetir) 
		{
			do
			{
				gm.MenuPrincipal();
				try 
				{
					try {
						opcion=Integer.parseInt (br.readLine());
					} catch (NumberFormatException e) {
						e.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					}
					repetir=false;
				}catch(InputMismatchException ime) 
				{
					try {
						br.readLine();
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.println("Un numero entero porfa");
				}
				
				if(opcion<0 || opcion>3) 
				{
					System.out.println("-----------------------------------------------");
					System.out.println("Opcion incorrecta, vuelve a intentarlo");
				}
			}while(opcion<0 || opcion>3);
		}
		
		while(opcion!=0)
		{
			switch(opcion)
			{
				case 1:
					
					//presentar el MenuJefe y leer y validar la opcion
					repetir=true;
					while(repetir) 
					{
						do
						{
							gm.MenuJefe();
							try 
							{
								try {
									opcion=Integer.parseInt (br.readLine());
								} catch (NumberFormatException e) {
									e.printStackTrace();
								} catch (IOException e) {
									e.printStackTrace();
								}
								repetir=false;
							}catch(InputMismatchException ime) 
							{
								System.out.println("Un numero entero porfa");
								try {
									br.readLine();
								} catch (IOException e) {
									e.printStackTrace();
								}
							}
						}while(opcion<0 || opcion>5);
					}
							
					while(opcion!=0)
					{
						switch(opcion)
						{
							case 1:
								if(ficheroProductoVendido!=null) 
								{
									//calcular ventas 
									
									//LeerValidarFecha
									do 
									{
										System.out.println("Introduce La fecha de Inicio");
										fechaIni=fechaIni.LeerValidarFecha();
										fechaValida=fechaIni.ValidarFecha();
										
										if(fechaValida!=true) 
										{
											System.out.println("Fecha incorrecto, compruebalo");
										}
										
									}while(fechaValida!=true);
									
									//LeerValidarFecha
									do 
									{
										System.out.println("Introduce La fecha Final");
										fechaFin=fechaFin.LeerValidarFecha();
										
										fechaValida=fechaFin.ValidarFecha();
										
										if(fechaValida!=true) 
										{
											System.out.println("Fecha incorrecto, compruebalo");
										}
									}while(fechaValida!=true);
									
									
									if(fechaIni.compareTo(fechaFin)==1) 
									{
										//pintar mensaje
										System.out.println("La fecha de Inicio no puede ser posterior que la fecha Final");
									}else 
									{
										//CalcularVentas
										System.out.println("--------------------------------------------");
										venta=gp.CalcularVenta(fechaIni, fechaFin);
										
										//Mostrar el resultado
										System.out.println("Venta ="+venta);
									}
								}else 
								{
									System.out.println("--------------------------------------------");
									System.out.println("No has vendido nada aun");
								}
								
								break;
										
							case 2:
								//contratar un trabajador
								//leerValidarObjetoTrabajador
								
								//t=t.leerValidarObjetoTrabajador(trabajadorContratado);
								//ContratarTrabajador
								u.EscribirEnFichero(t.leerValidarObjetoTrabajador(),ficheroTrabajadorContratado);
								
								//mostrar mensaje de apoyo
								System.out.println("Contratado con exito");
								
								break;
										
							case 3:
								//despedir a un trabajador
								
								//leer el dni del trabajador
								System.out.println("Introduce el dni/nie: ");
								try {
									dni=br.readLine().toUpperCase();
								} catch (IOException e1) {
									e1.printStackTrace();
								}
								
								//ExisteTrabajador
								try 
								{
									existeTrabajador=gt.ExisteTrabajador(dni);
								} catch (NullPointerException et) 
								{
									System.out.println(et);
								}
								
								
								if(existeTrabajador==true) 
								{
									//DespedirTrabajador
									try 
									{
										gt.EliminarTrabajadorPorMarca(dni);
									} catch (NullPointerException e)
									{
										System.out.println(e);
									}
								}
			
								break;
									
							case 4:
								//ConsultarTrabajadorContratado
								gt.OrdenarFicheroTrabajadorContratado();
								gt.LeerFicheroTrabajador();
								
								break;
								
							case 5:
								//ConsultarIncidencias
								try 
								{
									gi.ConsultarIncidencias(clienteDenuncia);
								}catch(NullPointerException npe) 
								{
									System.out.println(npe);
								}
								
								
								break;
//							case 6:
//								//generar nomina
//								if(ficheroTrabajadorContratado!=null) 
//								{
//									//LeerValidarObjetoNomina
//									nomina=nomina.LeerValidarObjetoNomina(ficheroTrabajadorContratado);
//									
//									//generarNomina
//									nomina.generarNomina();
//									
//								}
//								else 
//								{
//									System.out.println("------------------------------------------------");
//									System.out.println("No hay Trabajadores contratados");
//								}
//								
//								break;
						}//fin segun caso jefe
						
						//volver a presentar el MenuJefe y leer y validar la opcion
						repetir=true;
						while(repetir) 
						{
							do
							{
								gm.MenuJefe();
								try 
								{
									try {
										opcion=Integer.parseInt (br.readLine());
									} catch (NumberFormatException e) {
									} catch (IOException e) {
									}
									repetir=false;
								}catch(InputMismatchException ime) 
								{
									System.out.println("Un numero entero porfa");
									try {
										br.readLine();
									} catch (IOException e) {
									}
								}
							}while(opcion<0 || opcion>5);
						}
						
					}//fin mientras de submenu Jefe
						
					break;
					
				case 2:
					if(ficheroTrabajadorContratado!=null)
					{
						//ExisteEncargado
						existeEncargado=gt.ExisteEncargado();
						
						if(existeEncargado==true) 
						{
							//presentar el MenuEncargado y leer y validar la opcion
							repetir=true;
							while(repetir) 
							{
								do
								{
									gm.MenuEncargado();
									try 
									{
										try 
										{
											opcion=Integer.parseInt (br.readLine());
										} catch (NumberFormatException e) 
										{
										} catch (IOException e) 
										{
										}
										repetir=false;
									}catch(InputMismatchException ime) 
									{
										System.out.println("Un numero entero porfa");
										try {
											br.readLine();
										} catch (IOException e) 
										{
										}
									}
								}while(opcion<0 || opcion>4);
							}
									
							while(opcion!=0)
							{
								switch(opcion)
								{
									case 1:
										//encargar productos nuevos
										
										//LeerValidarObjetoProducto
										
										//productoParaTienda=productoParaTienda.LeerValidarObjetoProducto();
										
										//EncargarProductos
										u.EscribirEnFichero(productoParaTienda.LeerValidarObjetoProducto(),ficheroProductoEnTienda);
										break;
												
									case 2:
										//avisar sobre una incidencia
										
										//LeerObjetoIncidencias
										//incidencia=incidencia.LeerObjetoIncidencias();
										
										//AvisarIncidencias
										//u.EscribirEnFichero(incidencia.LeerObjetoIncidencias(),ficheroIncidencia);
										denuncia=gi.AvisarIncidencias(incidencia.LeerObjetoIncidencias(),clienteDenuncia);
										
										break;
										
									case 3:
										//PintarProductos
										try 
										{
											gp.LeerFicheroProductoComprado(ficheroProductoEnTienda);
										}catch(NullPointerException e) 
										{
											System.out.println(e);
										}
										break;
										
									case 4:
										if(clienteDenuncia.get(i)!=null)
										{
											//eliminar incidencia
											
											//ConsultarIncidencias
											gi.ConsultarIncidencias(clienteDenuncia);
											
											//leer y validar la id de la incidencia
											repetir=true;
											while(repetir) 
											{
												System.out.println("Introduce el numero de incidencia a eliminar: ");
												try 
												{
													try {
														idIncidencia=Integer.parseInt (br.readLine());
													} catch (NumberFormatException e) 
													{
													} catch (IOException e) 
													{
													}
													repetir=false;
												}catch(InputMismatchException ime) 
												{
													try 
													{
														br.readLine();
													} catch (IOException e)
													{
													}
													System.out.println(ime+": Un numero entero porfa");
												}
											}
											
											//EliminarIncidencia
											gi.EliminarIncidencias(clienteDenuncia,idIncidencia);
										}else 
										{
											System.out.println("No hay incidencias guardadas");
										}
										
									break;
								}//fin segun Encargado
		
								//volver a presentar el MenuEncargado y leer y validar la opcion
								repetir=true;
								while(repetir) 
								{
									do
									{
										gm.MenuEncargado();
										try 
										{
											try {
												opcion=Integer.parseInt (br.readLine());
											} catch (NumberFormatException e) 
											{
											} catch (IOException e) 
											{
											}
											repetir=false;
										}catch(InputMismatchException ime) 
										{
											try 
											{
												br.readLine();
											} catch (IOException e) 
											{
											}
											System.out.println(ime+": Un numero entero porfa");
										}
									}while(opcion<0 || opcion>4);
								}
								
							}//fin mientras Encargado
						}else 
						{
							System.out.println("------------------------------------------------------------------");
							System.out.println("No tienes ningun encargado contratado");
						}
					}
					break;
					
				case 3:
					if(ficheroTrabajadorContratado!=null)
					{
						//comprobar si hay un vendedor contratado
						existeVendedor=gt.ExisteVendedor();
						
						if(existeVendedor==true) 
						{
							//presentar el MenuTrabajador y leer y validar la opcion
							repetir=true;
							while(repetir) 
							{
								do
								{
									gm.MenuTrabajador();
									try 
									{
										try {
											opcion=Integer.parseInt (br.readLine());
										} catch (NumberFormatException e)
										{
										} catch (IOException e) 
										{
										}
										repetir=false;
									}catch(InputMismatchException ime) 
									{
										try 
										{
											br.readLine();
										} catch (IOException e)
										{
										}
										System.out.println(ime+": Un numero entero porfa");
									}
								}while(opcion<0 || opcion>2);
							}
									
							while(opcion!=0)
							{
								switch(opcion)
								{
									case 1:
										//vender productos
										try 
										{
											//PintarProductos
											gp.LeerFicheroProductoComprado(ficheroProductoEnTienda);
											
//												try 
//												{
												//LeerValidarProductoParaVender
												productoAVender=gt.LeerValidarProductoParaVender(ficheroProductoEnTienda);
//												}catch(NullPointerException e) 
//												{
//													System.out.println(e);
//												}
											
											
											//ExisteProducto
											try 
											{
												if(ficheroProductoVendido!=null) 
												{
													existeProducto=gp.ExisteProducto(productoAVender);
												}
												else 
												{
													existeProducto=false;
												}
											} catch (NullPointerException ep)
											{
												System.out.println(ep);
											}
											
											//VenderProducto
											if(existeProducto) 
											{
												gp.VenderProducto(productoAVender);
												gp.VenderProducto2(productoAVender);
												System.out.println("La venta se ha realizado con exito");
											}
											else 
											{
												gp.VenderProducto(productoAVender);
												u.EscribirEnFichero(productoAVender, ficheroProductoVendido);
												System.out.println("La venta se ha realizado con exito");
											}
											
										}catch(NullPointerException npe) 
										{
											System.out.println(npe);
										}
										
										break;
												
									case 2:
										//hacer una devolucion
										
										try 
										{
											//PintarProductos
											gp.LeerFicheroProductoComprado(ficheroProductoVendido);
											
											//LeerValidarProductoParaDevolucion
											productoDevolucion=gp.LeerValidarProductoParaDevolucion(ficheroProductoVendido);
			
											//ExisteProducto
											try 
											{
												existeProducto=gp.ExisteProducto(productoDevolucion);
											} catch (NullPointerException ep)
											{
												System.out.println(ep);
											}								
											
											if(existeProducto) 
											{
												gp.DevolverProducto(productoDevolucion);
												gp.DevolverProducto2(productoDevolucion);
												
												//mostrar mensaje de apollo
												System.out.println("La devolucion se ha realizado con exito");
											}
											else 
											{
												System.out.println("Este producto no es de esta tienda");
											}
										}catch(NullPointerException npe) 
										{
											System.out.println(npe);
										}
										break;
									}//fin segun trabajador
								
									//volver a presentar el MenuTrabajador y leer y validar la opcion
									repetir=true;
									while(repetir) 
									{
										do
										{
											gm.MenuTrabajador();
											try 
											{
												try {
													opcion=Integer.parseInt (br.readLine());
												} catch (NumberFormatException e) 
												{
												} catch (IOException e) 
												{
												}
												repetir=false;
											}catch(InputMismatchException ime) 
											{
												try 
												{
													br.readLine();
												} catch (IOException e) 
												{
												}
												System.out.println(ime+": Un numero entero porfa");
											}
										}while(opcion<0 || opcion>2);
									}
								}//fin while trabajador
							}//fin Trabajador existe
					}else 
					{
						System.out.println("-------------------------------------------------");
						System.out.println("No hay trabajadores contratados");
					}
					
					break;
			}//fin_segun pricipal
			
			//volver a presentar el MenuPrincipal y leer y validar la opcion
			repetir=true;
			while(repetir) 
			{
				do
				{
					gm.MenuPrincipal();
					try 
					{
						try {
							opcion=Integer.parseInt (br.readLine());
						} catch (NumberFormatException e) 
						{
						} catch (IOException e) 
						{
						}
						repetir=false;
					}catch(InputMismatchException ime) 
					{
						try 
						{
							br.readLine();
						} catch (IOException e) 
						{
						}
						System.out.println("Un numero entero porfa");
					}
					
					if(opcion<0 || opcion>3) 
					{
						System.out.println("-----------------------------------------------");
						System.out.println("Opcion incorrecta, vuelve a intentarlo");
					}
				}while(opcion<0 || opcion>3);
			}
			
		}//fin_mientras_menu_principal
	}//fin main
}//fin clase
