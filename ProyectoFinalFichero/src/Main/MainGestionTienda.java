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
 *              		ConsultarTrabajadorContratado (*)
 *             		caso 5:
 *              		ConsultarIncidencias (*)
 *             	 	caso 6:
 *              		generar nomina
 * 				fin_segun
 * 			volver a presentar el menuJefe y leer y validar la opcion
 * 		fin_mientras
 * 
 * 	//calcular ventas
 * 		inicio
 * 			si(arrayVendido!=null)
 * 				LeerValidarFecha (*)	//fecha de inicio
 * 				LeerValidarFecha (*)	//fecha final
 * 
 * 				si(fechaIni>fechaFin)
 * 					pintar mensaje
 * 				fin_si
 * 				sino
 * 					CalcularVentas (*)
 * 					mostrar el resultado
 * 				fin_sino
 * 			fin_si_vendido
 * 		fin calcular
 * 
 * 	//contratar un trabajador
 * 		inicio
 * 			leerValidarObjetoTrabajador (*)
 * 			ContratarTrabajador(*)
 * 		fin_contratar
 * 
 * 	//despedir a un trabajador
 * 		inicio
 * 			leer el dni del trabajador
 * 			ExisteTrabajador (*)
 * 			si(existe)
 * 				DespedirTrabajador(*)
 * 			fin_si
 * 		fin_despedir
 * 
 * 	//generara nomina
 * 	inicio
 * 		si(hay trabajadores contratados)
 * 			LeerValidarObjetoNomina (*)
 * 			generarNomina (*)
 * 		fin_si
 * 	fin_generar
 * 
 * 
 * 
 * 
 * 	//hacer las funciones del encargado 
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
 * 
 * 	//encargar productos nuevos
 * 		inicio
 * 			LeerValidarObjetoProducto (*)
 * 			EncargarProductos (*)
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
 * 
 * 	//hacer las funciones del trabajador
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
 * 	//vender productos
 * 		inicio
 * 			PintarProductos (*)
 * 			LeerValidarProductoParaVender (*)
 * 			ExisteProducto (*)
 * 			si(existe y la cantidad es superior o igual a la que vendemos)
 * 				VenderProducto (*)
 * 			fin_si
 * 		fin_vender
 *  
 *  //hacer una devolucion
 *  	inicio
 *  		PintarProductos (*)
 *  		LeerValidarProductoParaDevolucion (*)
 * 			ExisteProducto (*)
 * 			si(existe)
 * 				DevolverProducto (*)
 * 			fin_si
 *  	fin_devolver
 * 
 * Restricciones: no se puede meter caracteres en los datos numericos
 * 				  la opcion del menu principal esta entre 1 y 3 inclusive
 * 				  la opcion del MenuJefe esta entre 1 y 6 inclusive
 * 				  la opcion del MenuEncargado esta entre 1 y 4 inclusive
 * 				  la opcion del MenuTrabajador esta entre 1 y 2 inclusive
 * 				  el cargo tiene que ser ENCARGADO o VENDEDOR
 * 				  el dni/nie del trabajador es unico
 * 				  la id de la incidencia es autogenerada
 */


package Main;

import java.util.*;

import Clases.*;
import Excepciones.ExcepcionProducto;
import Gestoras.*;

public class MainGestionTienda 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		
		int opcion=0,idIncidencia=0,i=0;
		double venta=0.0;// el resultado de las ventas de un periodo de tiempo
		String dni=" ";
		boolean fechaValida=false,existeProducto=false,incidenciaEliminado=false;
		boolean repetir; //para validar las entradas de los menus
		boolean existeTrabajador=false, existeEncargado=false,existeVendedor=false,despedido=false;
		
		
		Fecha fechaIni=new Fecha();
		Fecha fechaFin=new Fecha();
		
		Nomina nomina=new Nomina();
		
		Incidencia incidencia = new Incidencia();//creo un objeto Incidencia
		Incidencia [] denuncia= new Incidencia[20];//es donde guardo las incidencias
		Trabajador t=new Trabajador();
		Incidencia [] clienteDenuncia = new Incidencia[20];
		Trabajador [] trabajadorContratado = new Trabajador[20];
		Producto productoDevolucion=new Producto();
		Producto productoAVender=new Producto();
		Producto productoParaTienda=new Producto();//los productos que se van a guardar en la tienda
		Trabajador [] contrataTrabajador = new Trabajador[20];
		Producto [] arrayVendido = new Producto[20];//los productos vendidos
		Producto [] productosEnTienda=new Producto[20];
		//GestoraTienda1 gt1=new GestoraTienda1();
		GestoraTienda2 gt2=new GestoraTienda2();//declaramos un objeto de la gestora para los metodos no estaticos
		GestoraTienda3 gt3=new GestoraTienda3();
		
	
		//presentar el MenuPrincipal y leer y validar la opcion
		repetir=true;
		while(repetir) 
		{
			do
			{
				GestoraTienda1.MenuPrincipal();
				try 
				{
					opcion=sc.nextInt();
					repetir=false;
				}catch(InputMismatchException ime) 
				{
					sc.nextLine();
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
							GestoraTienda1.MenuJefe();
							try 
							{
								opcion=sc.nextInt();
								repetir=false;
							}catch(InputMismatchException ime) 
							{
								System.out.println("Un numero entero porfa");
								sc.nextLine();
							}
						}while(opcion<0 || opcion>6);
					}
							
					while(opcion!=0)
					{
						switch(opcion)
						{
							case 1:
								if(arrayVendido[i]!=null) 
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
										venta=GestoraTienda1.CalcularVentas(arrayVendido, fechaIni, fechaFin);
										
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
								contrataTrabajador=GestoraTienda2.ContratarTrabajador(trabajadorContratado,t.leerValidarObjetoTrabajador(trabajadorContratado));
								
								//mostrar mensaje de apoyo
								System.out.println("Contratado con exito");
								
								break;
										
							case 3:
								//despedir a un trabajador
								
								//leer el dni del trabajador
								sc.nextLine();
								System.out.println("Introduce el dni/nie: ");
								dni=sc.nextLine().toUpperCase();
								
								//ExisteTrabajador
								try 
								{
									existeTrabajador=GestoraTienda1.ExisteTrabajador(trabajadorContratado, dni);
								} catch (NullPointerException et) 
								{
									System.out.println(et);
								}
								
								
								if(existeTrabajador==true) 
								{
									//DespedirTrabajador
									try 
									{
										despedido=GestoraTienda2.DespedirTrabajador(trabajadorContratado, dni);
									} catch (NullPointerException e)
									{
										System.out.println(e);
									}
								}
			
								break;
									
							case 4:
								if(trabajadorContratado[i]!=null) 
								{
									//ConsultarTrabajadorContratado
									GestoraTienda2.ConsultarTrabajadorContratado(trabajadorContratado);
								}else 
								{
									System.out.println("-----------------------------------------------");
									System.out.println("No hay ningun trabajador contratado");
								}
								
								break;
								
							case 5:
								//ConsultarIncidencias
								try 
								{
									gt2.ConsultarIncidencias(denuncia);
								}catch(NullPointerException npe) 
								{
									System.out.println(npe);
								}
								
								
								break;
							case 6:
								//generar nomina
								if(trabajadorContratado[i]!=null) 
								{
									//LeerValidarObjetoNomina
									nomina=nomina.LeerValidarObjetoNomina(trabajadorContratado);
									
									//generarNomina
									nomina.generarNomina();
									
								}
								else 
								{
									System.out.println("------------------------------------------------");
									System.out.println("No hay Trabajadores contratados");
								}
								
								break;
						}//fin segun caso jefe
						
						//volver a presentar el MenuJefe y leer y validar la opcion
						repetir=true;
						while(repetir) 
						{
							do
							{
								GestoraTienda1.MenuJefe();
								try 
								{
									opcion=sc.nextInt();
									repetir=false;
								}catch(InputMismatchException ime) 
								{
									System.out.println("Un numero entero porfa");
									sc.nextLine();
								}
							}while(opcion<0 || opcion>6);
						}
						
					}//fin mientras de submenu Jefe
						
					break;
					
				case 2:
					if(trabajadorContratado[i]!=null)
					{
						//ExisteEncargado
						existeEncargado=gt3.ExisteEncargado(trabajadorContratado);
						
						if(existeEncargado==true) 
						{
							//presentar el MenuEncargado y leer y validar la opcion
							repetir=true;
							while(repetir) 
							{
								do
								{
									GestoraTienda1.MenuEncargado();
									try 
									{
										opcion=sc.nextInt();
										repetir=false;
									}catch(InputMismatchException ime) 
									{
										System.out.println("Un numero entero porfa");
										sc.nextLine();
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
										productosEnTienda=GestoraTienda2.EncargarProductos(productosEnTienda,productoParaTienda.LeerValidarObjetoProducto());
										break;
												
									case 2:
										//avisar sobre una incidencia
										
										//LeerObjetoIncidencias
										//incidencia=incidencia.LeerObjetoIncidencias();
										
										//AvisarIncidencias
										denuncia=gt2.AvisarIncidencias(incidencia.LeerObjetoIncidencias(),clienteDenuncia);
										
										break;
										
									case 3:
										//PintarProductos
										try 
										{
											GestoraTienda1.PintarProductos(productosEnTienda);
										}catch(NullPointerException e) 
										{
											System.out.println(e);
										}
										break;
										
									case 4:
										if(denuncia[i]!=null) 
										{
											//eliminar incidencia
											
											//ConsultarIncidencias
											gt2.ConsultarIncidencias(denuncia);
											
											//leer y validar la id de la incidencia
											repetir=true;
											while(repetir) 
											{
												System.out.println("Introduce el numero de incidencia a eliminar: ");
												try 
												{
													idIncidencia=sc.nextInt();
													repetir=false;
												}catch(InputMismatchException ime) 
												{
													sc.nextLine();
													System.out.println(ime+": Un numero entero porfa");
												}
											}
											
											//EliminarIncidencia
											incidenciaEliminado=gt2.EliminarIncidencia(denuncia,idIncidencia);
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
										GestoraTienda1.MenuEncargado();
										try 
										{
											opcion=sc.nextInt();
											repetir=false;
										}catch(InputMismatchException ime) 
										{
											sc.nextLine();
											System.out.println(ime+": Un numero entero porfa");
										}
									}while(opcion<0 || opcion>4);
								}
								
							}//fin mientras Encargado
						}/*else 
						{
							System.out.println("------------------------------------------------------------------");
							System.out.println("No tienes ningun encargado contratado");
						}*/
						break;
					}
					
				case 3:
					if(trabajadorContratado[i]!=null)
					{
						//comprobar si hay un vendedor contratado
						existeVendedor=gt3.ExisteVendedor(contrataTrabajador);
						
						if(existeVendedor==true) 
						{
							//presentar el MenuTrabajador y leer y validar la opcion
							repetir=true;
							while(repetir) 
							{
								do
								{
									GestoraTienda1.MenuTrabajador();
									try 
									{
										opcion=sc.nextInt();
										repetir=false;
									}catch(InputMismatchException ime) 
									{
										sc.nextLine();
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
											GestoraTienda1.PintarProductos(productosEnTienda);
											
//												try 
//												{
												//LeerValidarProductoParaVender
												productoAVender=gt3.LeerValidarProductoParaVender(productosEnTienda);
//												}catch(NullPointerException e) 
//												{
//													System.out.println(e);
//												}
											
											
											//ExisteProducto
											try 
											{
												existeProducto=GestoraTienda1.ExisteProducto(productosEnTienda, productoAVender.getNombre());
											} catch (NullPointerException ep)
											{
												System.out.println(ep);
											}
											
											
											if(existeProducto==true && productosEnTienda[i].getCantidad()>productoAVender.getCantidad()) 
											{
												//VenderProducto
												try 
												{
													arrayVendido=GestoraTienda2.VenderProducto(productosEnTienda,productoAVender,arrayVendido);
												} catch (ExcepcionProducto ep)
												{
													System.out.println(ep);
												}
												
												
												System.out.println("La venta se ha realizado con exito");
											}
											else 
											{
												System.out.println("Producto no disponible o cantidad insuficiente");
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
											GestoraTienda1.PintarProductos(arrayVendido);
											
											//LeerValidarProductoParaDevolucion
											productoDevolucion=gt3.LeerValidarProductoParaDevolucion(arrayVendido);
			
											//ExisteProducto
											try 
											{
												existeProducto=GestoraTienda1.ExisteProducto(arrayVendido, productoDevolucion.getNombre());
											} catch (NullPointerException ep)
											{
												System.out.println(ep);
											}								
											
											if(existeProducto==true && arrayVendido[i].getCantidad()>productoDevolucion.getCantidad()) 
											{
												//DevolverProducto
												try 
												{
													GestoraTienda3.DevolverProducto(arrayVendido,productoDevolucion,productosEnTienda);/****************/
												} catch (ExcepcionProducto ep) 
												{
													System.out.println(ep);
												}
												
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
											GestoraTienda1.MenuTrabajador();
											try 
											{
												opcion=sc.nextInt();
												repetir=false;
											}catch(InputMismatchException ime) 
											{
												sc.nextLine();
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
					GestoraTienda1.MenuPrincipal();
					try 
					{
						opcion=sc.nextInt();
						repetir=false;
					}catch(InputMismatchException ime) 
					{
						sc.nextLine();
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
		sc.close();
	}//fin main
}//fin clase
