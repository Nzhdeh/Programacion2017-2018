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
 *              		consultar trabajadores contratados (*)
 *             		caso 5:
 *              		consultar incidencias (*)
 *             	 	caso 6:
 *              		generara nomina 
 * 				fin_segun
 * 			volver a presentar el menuJefe y leer y validar la opcion
 * 		fin_mientras
 * 
 * 	//calcular ventas
 * 		inicio
 * 			si(arrayVendido!=null)
 * 				leer la fecha de inicio y validarla
 * 				repetir
 * 					leer y validar fecha(*)
 * 					comprobar si la fecha de inicio es valida (*)
 * 				mientras(no sea valida)
 * 				leer la fecha final y validarla
 * 				repetir
 * 					leer y validar fecha(*)
 * 					comprobar si la fecha final es valida (*)
 * 				mientras(no sea valida)
 * 
 * 				si(fechaIni>fechaFin)
 * 					pintar mensaje
 * 					fin_si
 * 				sino
 * 					hacer el calculo de ventas
 * 					mostrar el resultado
 * 				fin_sino
 * 			fin_si_vendido
 * 		fin_calcular
 * 
 * 	//contratar un trabajador
 * 		inicio
 * 			leer el nombre
 * 			leer el apellido
 * 			leer y validar el dni y el nie
 * 			presentar menuDni y validar la opcion
 * 				segun(opcionDni)
 * 					caso 1:
 * 						leer y validar el dni
 * 					caso 2: 
 * 						leer y validar el nie
 * 				fin_segun_dni
 * 			leer y validar el cargo
 * 			leer y validar el sexo
 * 			leer y validar la fecha de nacimiento
 * 			repetir
 * 				leer y validar fecha(*)
 * 				comprobar si la fecha es valida (*)
 * 			mientras(fecha no valida)
 * 			contratar al trabajador (*)
 * 			mostrar el resultado
 * 		fin_contratar
 * 
 * 	//despedir a un trabajador
 * 		inicio
 * 			leer el dni del trabajador
 * 			comprobar si el trabajador existe (*)
 * 			si(existe)
 * 				eliminar al trabajador
 * 			fin_si
 * 			sino
 * 				pintar mensaje
 * 			fin_sino
 * 		fin_despedir
 * 
 * 	//generara nomina
 * 	si(hay trabajadores contratados)
 * 		leer y validar el salario base
 * 		leer y validar El Plus Titulo
 * 		leer y validar parte proporcional horas extras
 * 		leer y validar el transporte
 * 		leer nombre de la empresa
 * 		leer el cif de  la empresa
 * 		leer la direccion de la empresa
 * 		leer y validar la fecha de firma
 * 		leer y validar la fecha de periodo inicial
 * 		leer y validar la fecha de periodo final
 * 		mostrar nomina
 * 	fin_si
 * 	fin_generar
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
 * 						eliminar incidencias
 * 				fin_segun	
 * 			volver a presentar el menuEncargado y leer y validar la opcion
 * 		fin_mientras
 * 
 * 
 * 		//encargar productos nuevos
 * 			inicio
 * 				leer el nombre del producto
 * 				leer y validar el precio del producto
 * 				leer y validar la cantidad del producto
 * 				leer y validar la fecha de adquisicion del producto
 * 				repetir
 * 					leer y validar fecha (*)
 * 					comprobar si la fecha es valida (*)
 * 				mientras(fecha no valida)
 * 				leer y validar el peso del producto
 * 				realizar la compra (*)
 * 			fin_encargar
 * 
 * 	//avisar sobre una incidencia
 * 		inicio
 * 			leer el motivo de la incidencia
 * 			hacer el aviso (*)
 * 		fin_avisar
 * 
 * 
 * 	//eliminar incidencias
 * 		inicio
 * 			pintar las incidencias (*)
 * 			leer y validar la id de la incidencia que queremos eliminar
 * 			eliminar la incidencia(*)
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
 * 			pintar los productos disponibles
 * 			leer el nombre del producto
 * 			leer y validar la cantidad
 * 			leer y validar la fecha de venta
 * 			repetir 
 * 				leer y validar fecha
 * 				comprobar si la fecha es valida (*)
 * 			mientras (fecha no valida)
 * 			asignar el peso
 * 			asignar el precio
 * 			comprobar si el producto existe (*)
 * 			si(existe y la cantidad es superior o igual a la que vendemos)
 * 				realizar la venta (*)
 * 				mostrar mensaje de apollo
 * 			fin_si
 * 			sino
 * 				pintar mensaje
 * 			fin_sino
 * 		fin_vender
 *  
 *  //hacer una devolucion
 *  	inicio
 *  		pintar los productos vendidos (*)
 *  		leer el nombre de producto
 *  		leer y validar la cantidad
 *  		leer y validar la fecha de devolucion
 *  		repetir 
 * 				leer y validar fecha
 * 				comprobar si la fecha es valida (*)
 * 			mientras (fecha no valida)
 * 			comprobar si el producto existe (*)
 * 			si(existe)
 * 				realizar la devolucion (*)
 * 				mostrar mensaje de apollo
 * 			fin_si
 * 			sino
 * 				pintar mensaje
 * 			fin_sino
 *  	fin_devolver
 * 
 * Restricciones: no se puede meter caracteres en los datos numericos
 * 				  la opcion del menu principal esta entre 1 y 3 inclusive
 * 				  la opcion del menu jefe esta entre 1 y 6 inclusive
 * 				  la opcion del menu encargado esta entre 1 y 4 inclusive
 * 				  la opcion del menu trabajador esta entre 1 y 2 inclusive
 * 				  el cargo tiene que ser ENCARGADO o VENDEDOR
 */


package Proyecto;

//import java.io.*;
import java.util.*;
public class MainGestionTienda 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		
		int opcion=0,opcionDni=0,idIncidencia=0,i=0;
		double venta=0.0,precio=0.0,peso=0.0;//variables del producto
		int cantidad=0;//cantidad de productos
		String nombre=" ",apellidos=" ",descripcionIncidencia=" ",dni=" ";
		char letra=' ';//letra del dni/nie
		boolean existeTrabajador=false,fechaValida=false,existeProducto=false,incidenciaEliminado=false;
		boolean repetir,existeDocumento=false;//para ver si el dni o el nie existen
		boolean existeEncargado=false,existeVendedor=false,despedido=false;
		TipoCargo CARGO=null;
		
		Fecha fechaIni=new Fecha();
		Fecha fechaFin=new Fecha();
		Fecha fechaVenta=new Fecha();
		Fecha fechaDevolucion=new Fecha();
		Fecha fechaCompra=new Fecha();
		Fecha fechaNacimiento=new Fecha();
		
		Fecha periodoInicial=new Fecha();
		Fecha periodoFinal=new Fecha();
		Fecha firma=new Fecha();
		
		Empresa empresa=new Empresa();
		Nomina nomina=new Nomina();
		
		Incidencia incidencia = null;//creo un objeto Incidencia
		Incidencia [] denuncia=null;//es donde guardo las incidencias
		Trabajador t=new Trabajador();
		Incidencia [] clienteDenuncia = new Incidencia[20];
		Trabajador [] trabajadorContratado = new Trabajador[20];
		Producto productoDevolucion=new Producto();
		Producto productoAVender=new Producto();
		Producto productoParaTienda=new Producto();//los productos que se van a guardar en la tienda
		Trabajador [] contrataTrabajador = new Trabajador[20];
		Producto [] arrayVendido = new Producto[20];//los productos vendidos
		Producto [] productosEnTienda=new Producto[20];
		GestoraTienda gt=new GestoraTienda();//declaramos un objeto de la gestora para los metodos no estaticos
		
		//presentar el MenuPrincipal y leer y validar la opcion
		repetir=true;
		while(repetir) 
		{
			do
			{
				GestoraTienda.MenuPrincipal();
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
							GestoraTienda.MenuJefe();
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
									//leer la fecha de inicio y validarla
									
									do 
									{
										//leer y validar fecha
										System.out.println("Introduce La fecha de Inicio");
										fechaIni=gt.LeerValidarFecha();
										//comprobar si la fecha de inicio es valida
										try 
										{
											fechaValida=fechaIni.ValidarFecha();
										} catch (ExcepcionFecha e) 
										{
											System.out.println(e);
										}
										
										if(fechaValida!=true) 
										{
											System.out.println("Dia incorrecto, compruebalo");
										}
										
									}while(fechaValida!=true);
									
									//leer la fecha final y validarla
									do 
									{
										//leer y validar fecha
										System.out.println("Introduce La fecha Final");
										fechaFin=gt.LeerValidarFecha();
										
										//comprobar si la fecha final es valida
										try 
										{
											fechaValida=fechaFin.ValidarFecha();
										} catch (ExcepcionFecha e) 
										{
											System.out.println(e);
										}
										
										if(fechaValida!=true) 
										{
											System.out.println("Dia incorrecto, compruebalo");
										}
									}while(fechaValida!=true);
									
									
									if(fechaIni.compareTo(fechaFin)==1) 
									{
										//pintar mensaje
										System.out.println("La fecha de Inicio no puede ser posterior que la fecha Final");
									}else 
									{
										//hacer el calculo de ventas
										System.out.println("--------------------------------------------");
										venta=GestoraTienda.CalculaVenta(arrayVendido, fechaIni, fechaFin);
										
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
						
								System.out.println("---------------------------------------------");
								sc.nextLine();//para limpiar el buffer
								System.out.println("Introduce los datos de la persona a contratar");
								//leer el nombre
								System.out.println("Introduce el nombre: ");
								nombre=sc.nextLine();
								
								//leer el apellido
								System.out.println("Introduce el apellido: ");
								apellidos=sc.nextLine();
								
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
											dni=sc.nextLine().toUpperCase();//añadir StringIndexOutOfBoundsException
											letra=GestoraTienda.ValidarDNI(dni.substring(0,8));//para enviar los digitos que queramos
											//comprobar dni repetido
											existeDocumento=gt.ExisteDniNie(trabajadorContratado, dni);
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
												|| existeDocumento== true);
										
										break;
									case 2:
										//leer y validar el nie
										do 
										{
											sc.nextLine();
											System.out.println("------------------------------------------------");
											System.out.print("Introduce el NIE (Ej. X0000000T): ");
											dni=sc.nextLine().toUpperCase();
											letra=GestoraTienda.ValidarNIE(dni.substring(0,8));
											//comprobar nie repetido
											existeDocumento=gt.ExisteDniNie(trabajadorContratado, dni);
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
												|| existeDocumento== true);

										break;
								}//fin segun dni/nie
								
								//leer y validar el cargo
								repetir=true;
								while(repetir) 
								{
									System.out.println("Introduce el Cargo (VENDEDOR O ENCARGADO): ");
									try 
									{
										CARGO=TipoCargo.valueOf(sc.nextLine().toUpperCase());//leer el enum
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
										t.setSexo(sc.next().charAt(0));
										repetir=false;
									} catch (ExcepcionTrabajador et) 
									{
										sc.nextLine();
										System.out.println(et);
									}
								}
								
								//leer y validar la fecha de nacimiento
								do 
								{	
									//leer y validar fecha
									System.out.println("Introduce la fecha de nacimiento ");
									fechaNacimiento=gt.LeerValidarFecha();
									
									//comprobar si la fecha es valida
									try 
									{
										fechaValida=fechaNacimiento.ValidarFecha();
									}
									catch(ExcepcionFecha ef) 
									{
										System.out.println(ef+"Fecha no valida,vuelve a intentarlo");
									}
								}while(fechaValida!=true);
							
								t=new Trabajador(nombre,apellidos,dni,fechaNacimiento,t.getSexo(),CARGO);//asignar los datos al objeto
								
								//contratar al trabajador
								contrataTrabajador=GestoraTienda.ContrataTrabajador(trabajadorContratado,t);
								
								
								//mostrar mensaje de apollo
								System.out.println("Contratado con exito");
								
								break;
										
							case 3:
								//despedir a un trabajador
								
								//leer el dni del trabajador
								sc.nextLine();
								System.out.println("Introduce el dni/nie: ");
								dni=sc.nextLine().toUpperCase();
								
								//comprobamos si el trabajador existe
								try 
								{
									existeTrabajador=GestoraTienda.ExisteTrabajador(trabajadorContratado, dni);
								} catch (ExcepcionTrabajador et) 
								{
									System.out.println(et);
								}
								
								
								if(existeTrabajador==true) 
								{
									//eliminar al trabajador
									try 
									{
										despedido=GestoraTienda.DespideTrabajador(trabajadorContratado, dni);
									} catch (ExcepcionTrabajador e)
									{
										System.out.println(e);
									}
								}
			
								break;
									
							case 4:
								if(trabajadorContratado[i]!=null) 
								{
									//consultar la lista de trabajadores
									GestoraTienda.ConsultarTrabajadorContratado(trabajadorContratado);
								}else 
								{
									System.out.println("-----------------------------------------------");
									System.out.println("No hay ningun trabajador contratado");
								}
								
								break;
								
							case 5:
								//consultar incidencias
								gt.ConsultaIncidencias(denuncia);
								
								break;
							case 6:
								//generar nomina
								if(trabajadorContratado[i]!=null) 
								{
									//leer y validar el salario base
									repetir=true;
									while(repetir)
									{
										System.out.println("Introduce el salario base: ");
										try 
										{
											nomina.setSalarioBase(sc.nextDouble());
											repetir=false;
										} catch (ExcepcionNomina e) 
										{
											System.out.println(e);
										}catch(InputMismatchException ime) 
										{
											System.out.println("Un numero entero porfa");
											sc.nextLine();
										}
									}
									
									//leer y validar El Plus Titulo
									repetir=true;
									while(repetir)
									{
										System.out.println("Introduce plus Titulo: ");
										try 
										{
											nomina.setPlusTitulo(sc.nextDouble());
											repetir=false;
										} catch (ExcepcionNomina e) 
										{
											System.out.println(e);
										}catch(InputMismatchException ime) 
										{
											System.out.println("Un numero entero porfa");
											sc.nextLine();
										}
									}
									
									//leer y validar parte proporcional horas extras
									repetir=true;
									while(repetir)
									{
										System.out.println("Parte Proporcional horas Extras: ");
										try 
										{
											nomina.setParteProporcinalHorasExtras(sc.nextDouble());
											repetir=false;
										} catch (ExcepcionNomina e) 
										{
											System.out.println(e);
										}catch(InputMismatchException ime) 
										{
											System.out.println("Un numero entero porfa");
											sc.nextLine();
										}
									}
									
									//leer y validar el transporte
									repetir=true;
									while(repetir)
									{
										System.out.println("Introduce el Transporte: ");
										try 
										{
											nomina.setTransporte(sc.nextDouble());
											repetir=false;
										} catch (ExcepcionNomina e) 
										{
											System.out.println(e);
										}catch(InputMismatchException ime) 
										{
											System.out.println("Un numero entero porfa");
											sc.nextLine();
										}
									}
									sc.nextLine();
									//leer nombre de la empresa
									System.out.println("Introduce el nombre de la empresa: ");
									empresa.setNombreEmpresa(sc.nextLine());
									
									//leer y validar el cif de  la empresa
									do 
									{
										System.out.println("------------------------------------------------");
										System.out.println("Introduce el CIF de la empresa (T00000000): ");
										empresa.setCIFEmpresa(sc.nextLine().toUpperCase());
										//letra=GestoraTienda.ValidarCIF(empresa.getCIFEmpresa().substring(0,8));//para enviar los digitos que queramos
									}while(empresa.getCIFEmpresa().length()!=9);
									
									//leer la direccion de la empresa
									System.out.println("Introduce la direccion de la empresa: ");
									empresa.setDomicilioEmpresa(sc.nextLine());
									
									//leer y validar la fecha de firma
									do 
									{
										System.out.println("Introduce la fecha de firma");
										firma=gt.LeerValidarFecha();
										//comprobar si la fecha de inicio es valida
										try 
										{
											fechaValida=firma.ValidarFecha();
										} catch (ExcepcionFecha e) 
										{
											System.out.println(e);
										}
										
										if(fechaValida!=true) 
										{
											System.out.println("Dia incorrecto, compruebalo");
										}
										
									}while(fechaValida!=true);
									
									do 
									{
										//leer y validar la fecha de periodo inicial
										do 
										{
											System.out.println("Introduce la fecha de periodo Inicial");
											periodoInicial=gt.LeerValidarFecha();
											//comprobar si la fecha de inicio es valida
											try 
											{
												fechaValida=periodoInicial.ValidarFecha();
											} catch (ExcepcionFecha e) 
											{
												System.out.println(e);
											}
											
											if(fechaValida!=true) 
											{
												System.out.println("Dia incorrecto, compruebalo");
											}
											
										}while(fechaValida!=true);
										
										//leer y validar la fecha de periodo final
										do 
										{
											System.out.println("Introduce la fecha de periodo Final");
											periodoFinal=gt.LeerValidarFecha();
											//comprobar si la fecha de inicio es valida
											try 
											{
												fechaValida=periodoFinal.ValidarFecha();
											} catch (ExcepcionFecha e) 
											{
												System.out.println(e);
											}
											
											if(fechaValida!=true) 
											{
												System.out.println("Dia incorrecto, compruebalo");
											}
											
										}while(fechaValida!=true);
										
										if(periodoInicial.compareTo(periodoFinal)==1) 
										{
											//pintar mensaje
											System.out.println("El periodo inicial no puede ser posterior al periodo Final");
										}
									}while(periodoInicial.compareTo(periodoFinal)==1);
									
									nomina=new Nomina(nomina.getSalarioBase(),nomina.getPlusTitulo(),nomina.getParteProporcinalHorasExtras(),nomina.getTransporte(),
													  firma,periodoInicial,periodoFinal,empresa,trabajadorContratado[i]);
									
									//mostrar nomina
									nomina.generarNomina();
								
									
								}
								else 
								{
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
								GestoraTienda.MenuJefe();
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
						//comprobar si el encargado existe
						existeEncargado=gt.ExisteEncargado(trabajadorContratado);
						
						if(existeEncargado==true) 
						{
							//presentar el MenuEncargado y leer y validar la opcion
							repetir=true;
							while(repetir) 
							{
								do
								{
									GestoraTienda.MenuEncargado();
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
										
										//leer el nombre del producto
										sc.nextLine();//para limpiar el buffer
										System.out.println("--------------------------------------------------");
										System.out.println("Introduce el nombre del producto: ");
										nombre=sc.nextLine();
										
										//leer y validar el precio del producto
										repetir=true;
										while(repetir) 
										{
											System.out.println("Introduce el precio: ");
											try 
											{
												precio=sc.nextDouble();
												repetir = false;
											}catch(NumberFormatException nfe) 
											{
												System.out.println(nfe+": Un numero real porfa");
												sc.nextLine();
											}catch(InputMismatchException ioe) 
											{
												System.out.println(ioe+": Un numero real porfa");
												sc.nextLine();
											}
										}	
										//leer y validar la cantidad del producto
										repetir=true;
										while(repetir) 
										{
											System.out.println("Introduce la cantidad: ");
											try 
											{
												cantidad=sc.nextInt();
												repetir=false;
											}catch(InputMismatchException ioe) 
											{
												sc.nextLine();
												System.out.println(ioe+"Un numero porfa");
											}
										}
										
										//leer y validar la fecha de adquisicion del producto
										do 
										{
											System.out.println("Introduce la fecha de adquisicion ");
											fechaCompra=gt.LeerValidarFecha();
											//fechaCompra=new Fecha(dia,mes,anio);//guardamos el objeto fechaCompra
											
											//comprobar si la fecha es valida
											try 
											{
												fechaValida=fechaCompra.ValidarFecha();
											}
											catch(ExcepcionFecha ef) 
											{
												System.out.println(ef+": Fecha no valida,vuelve a intentarlo");
											}
										}while(fechaValida!=true);								
										
										//leer y validar el peso del producto
										repetir=true;
										while(repetir) 
										{
											System.out.println("Introduce el peso: ");
											try 
											{
												peso=sc.nextDouble();
												repetir=false;
											}catch(InputMismatchException ioe) 
											{
												sc.nextLine();
												System.out.println("Un numero porfa");
											}
										}
										
										productoParaTienda=new Producto(nombre,precio,fechaCompra,cantidad,peso);
										
										//realizar la compra
										productosEnTienda=GestoraTienda.EncargaProductos(productosEnTienda,productoParaTienda);
										break;
												
									case 2:
										//avisar sobre una incidencia
									
										sc.nextLine();//para limpiar el buffer
										
										//leer el motivo de la incidencia
										System.out.println("Redacta el motivo de la denuncia: ");
										descripcionIncidencia=sc.nextLine();
										
										incidencia=new Incidencia(descripcionIncidencia);
										
										//hacer el aviso
										denuncia=gt.AvisaIncidencias(incidencia,clienteDenuncia);
										
										break;
										
									case 3:
										//consultar productos en la tienda
										try 
										{
											GestoraTienda.PintaProductos(productosEnTienda);
										}catch(NullPointerException e) 
										{
											System.out.println(e);
										}
										break;
										
									case 4:
										if(denuncia[i]!=null) 
										{
											//eliminar incidencia
											
											//pintar las incidencias
											gt.ConsultaIncidencias(denuncia);
											
											//leer y validar la id de la incidencia que queremos eliminar
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
											
											//eliminar la incidencia
											incidenciaEliminado=gt.EliminarIncidencia(denuncia,idIncidencia);
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
										GestoraTienda.MenuEncargado();
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
						existeVendedor=gt.ExisteVendedor(contrataTrabajador);
						
						if(existeVendedor==true) 
						{
							//presentar el MenuTrabajador y leer y validar la opcion
							repetir=true;
							while(repetir) 
							{
								do
								{
									GestoraTienda.MenuTrabajador();
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
										//pintar los productos disponibles
										GestoraTienda.PintaProductos(productosEnTienda);
										
										//leer el nombre del producto
										sc.nextLine();//para limpiar el buffer
										System.out.println("--------------------------------------------------");
										System.out.println("Introduce el nombre: ");
										nombre=sc.nextLine();
										
										//leer y validar la cantidad 
										repetir=true;
										while(repetir) 
										{
											System.out.println("Introduce la cantidad: ");
											try 
											{
												cantidad=sc.nextInt();
												repetir=false;
											}catch(InputMismatchException ioe) 
											{
												sc.nextLine();
												System.out.println("Un numero entero porfa");
											}
										}
										
										//leer y validar la fecha de venta
										do {
											System.out.println("Introduce la fecha de venta ");
											fechaVenta=gt.LeerValidarFecha();
											//fechaVenta=new Fecha(dia,mes,anio);
											
											//comprobar si la fecha es valida
											try 
											{
												fechaValida=fechaVenta.ValidarFecha();
											}
											catch(ExcepcionFecha ef) 
											{
												System.out.println(ef+"Fecha no valida,vuelve a intentarlo");
											}
										}while(fechaValida!=true);
										
										i=0;
										if(productosEnTienda[i]!=null) 
										{
											//asignar el peso
											peso=productosEnTienda[i].getPeso();	
											//asignar el precio
											precio=productosEnTienda[i].getPrecio();
										}
										
										productoAVender=new Producto(nombre,precio,fechaVenta,cantidad,peso);
										
										//comprobar si el producto existe
										try 
										{
											existeProducto=GestoraTienda.ExisteProducto(productosEnTienda, nombre);
										} catch (ExcepcionProducto ep)
										{
											System.out.println(ep);
										}
										
										
										if(existeProducto==true && productosEnTienda[i].getCantidad()>productoAVender.getCantidad()) 
										{
											//realizar la venta
											try 
											{
												arrayVendido=GestoraTienda.VendeProducto(productosEnTienda,productoAVender,arrayVendido);
											} catch (ExcepcionProducto ep)
											{
												System.out.println(ep);
											}
											
											//mostrar mensaje de apollo
											System.out.println("La venta se ha realizado con exito");
										}
										else 
										{
											System.out.println("Producto no disponible o cantidad insuficiente");
										}
										
										break;
												
									case 2:
										if(arrayVendido[i]!=null) 
										{
											//hacer una devolucion
											//pintar los productos vendidos
											GestoraTienda.PintaProductos(arrayVendido);
											
											//leer el nombre de producto
											sc.nextLine();//para limpiar el buffer
											System.out.println("--------------------------------------------------");
											System.out.println("Introduce el nombre: ");
											nombre=sc.nextLine();
											
											//leer y validar la cantidad 
											repetir=true;
											while(repetir) 
											{
												do 
												{
													System.out.println("Introduce la cantidad: ");
													try 
													{
														cantidad=sc.nextInt();
														repetir=false;
													}catch(InputMismatchException ioe) 
													{
														sc.nextLine();
														System.out.println("Un numero entero porfa");
													}
												}while(cantidad<1 || cantidad>arrayVendido[i].getCantidad());
											}
											
											//leer y validar la fecha de devolucion
											do {
												System.out.println("Introduce la fecha de devolucion ");
												
												fechaDevolucion=gt.LeerValidarFecha();
												//fechaDevolucion=new Fecha(dia,mes,anio);
												
												//comprobar si la fecha es valida
												try 
												{
													fechaValida=fechaDevolucion.ValidarFecha();
												}
												catch(ExcepcionFecha ef) 
												{
													System.out.println(ef+"Fecha no valida,vuelve a intentarlo");
												}
											}while(fechaValida!=true);
											
											i=0;
											if(arrayVendido[i]!=null) 
											{
												peso=arrayVendido[i].getPeso();//asignar peso
												precio=arrayVendido[i].getPrecio();//asignar precio
											}
											
											productoDevolucion=new Producto(nombre,precio,fechaDevolucion,cantidad,peso);
			
											//comprobar si el producto existe
											try 
											{
												existeProducto=GestoraTienda.ExisteProducto(arrayVendido, nombre);
											} catch (ExcepcionProducto ep)
											{
												System.out.println(ep);
											}								
											
											if(existeProducto==true) 
											{
												//realizar la devolucion
												try 
												{
													GestoraTienda.DevuelveProducto(arrayVendido,productoDevolucion,productosEnTienda);/****************/
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
										}else 
										{
											System.out.println("No hay productos vendidos");
										}
											
											break;
									}
								}//fin segun trabajador
		
								//volver a presentar el MenuTrabajador y leer y validar la opcion
								repetir=true;
								while(repetir) 
								{
									do
									{
										GestoraTienda.MenuTrabajador();
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
							}//fin mientras de submenu Trabajador
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
					GestoraTienda.MenuPrincipal();
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
