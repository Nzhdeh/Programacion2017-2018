package Proyecto;

public class GestoraTienda2 
{
	/*
	//interfaz
	prototipo: public static Trabajador [] ContrataTrabajador(Trabajador [] trabajadorContratado,Trabajador t)
	comentario: este metodo sirve para simular la contratacion de un trabajador
	precondiciones: no hay
	entradas: un objeto trabajador
	salidas: no hay
	entr/sal:un array de trabajadores
	postcondiciones: AN devolvera a los trabajadores contratados
	*/
	
	/*
	//resguardo
	public static Trabajador [] ContrataTrabajador(Trabajador [] trabajadorContratado,Trabajador t)
	{
		System.out.println("En construccion");
		return trabajadorContratado;
	}*/
	
	public static Trabajador [] ContratarTrabajador(Trabajador [] trabajadorContratado,Trabajador t) 
	{
		boolean contratado=false;
		int i=0 ;
		
		for(i=0;i<trabajadorContratado.length && contratado==false;i++) 
		{
			if(trabajadorContratado[i]==null) 
			{
				trabajadorContratado[i]=t;
				contratado=true;
			}
		}
		
		if(trabajadorContratado.length==i && contratado==false) 
		{
			System.out.println("Array lleno,no se puede contratar mas trabajadores");
		}
		return trabajadorContratado;
	}
	
	/*
	//interfaz
	prototipo: public static void ConsultarTrabajadorContratado(Trabajador [] trabajadorContratado)
	comentario: este metodo sirve para ver a todos los trabajadores contratados
	precondiciones: El array debe tener al menos un trabajador
	entradas: un array de trabajadores
	salidas: no hay
	entr/sal:no hay
	postcondiciones:No hay, solo pinta la lista de trabajadores
	*/
	
	/*
	//resguardo
	public static void ConsultarTrabajadorContratado(Trabajador [] trabajadorContratado)
	{
		System.out.println("En construccion");
	}*/
	
	public static void ConsultarTrabajadorContratado(Trabajador [] trabajadorContratado)
	{
		for(int i=0;i<trabajadorContratado.length && trabajadorContratado[i]!=null;i++) 
		{
			System.out.println("------------------------------------------------");
			System.out.println(trabajadorContratado[i]);
		}
	}
	
	/*
	//interfaz
	prototipo: public static boolean DespideTrabajador(Trabajador [] contrataTrabajador,String dni) 
	comentario:este metodo simula la despedida de un trabajador
	precondiciones: El objeto a eliminar tiene que existir
	entradas: array de trabajadores, dni o nie
	salidas: logico
	entr/sal: no hay
	postcondiciones: AN devolvera true si el trabajador se ha eliminado y false si no.
	*/
	
	/*
	//resguardo
	public static boolean DespideTrabajador(Trabajador [] contrataTrabajador,String dni)
	{
		booleant res=false;
		System.out.println("En construccion");
		return res;
	}*/
	
	public static boolean DespedirTrabajador(Trabajador [] contrataTrabajador,String dni) throws NullPointerException
	{
		boolean resultado=false;
		int i=0;
		if(contrataTrabajador[i]!=null) 
		{
			for(i=0;i<contrataTrabajador.length && resultado==false;i++) 
			{
				if(contrataTrabajador[i].getDni().equals(dni)) 
				{
					for (int j=i;j<contrataTrabajador.length-1;j++) 
					{
						contrataTrabajador[j]=contrataTrabajador[j+1];
					}
					contrataTrabajador[contrataTrabajador.length-1]=null;
					resultado=true;
				}
			}
		}else
		{
			throw new NullPointerException("Array vacio");
		}
		return resultado;
	}
	
	/*
	//interfaz
	prototipo: public void ConsultaIncidencias(Incidencia [] denuncia))
	comentario:este metodo sirve para consultar las incidencias
	precondiciones: no hay
	entradas: un array de objeto Incidencia
	salidas: no hay
	entr/sal: no hay
	postcondiciones: no hay,solo pinta por pantalla las incidencias
	*/
	
	/*
	//resguardo
	public void ConsultaIncidencias(Incidencia [] denuncia))
	{
		System.out.println("En construccion");
	}*/
	
	public void ConsultarIncidencias(Incidencia [] denuncia) throws NullPointerException
	{
		int i=0;
		
		if(denuncia[i]!=null)
		{
			for(i=0;i<denuncia.length && denuncia[i]!=null;i++) 
			{
				System.out.println(denuncia[i]);
			}
		}else
		{
			System.out.println("---------------------------------------");
			throw new NullPointerException("No hay Incidencias guardadas");
		}
		
	}
	
	
	/*
	//interfaz
	prototipo: public static Producto [] EncargaProductos(Producto [] productosEnTienda,Producto productoParaTienda)
	comentario:este metodo sirve para rellenar el almacen de productos
	precondiciones: no hay
	entradas:  un objeto Producto
	salidas: no hay
	entr/sal: array de productos
	postcondiciones: AN devolvera un array de productos 
	*/
	
	/*
	//resguardo
	public static Producto [] EncargaProductos(Producto [] productosEnTienda,Producto productoParaTienda)
	{
		System.out.println("En construccion");
		return productoTienda;
	}*/
	
	public static Producto [] EncargarProductos(Producto [] productosEnTienda,Producto productoParaTienda)
	{
		int i=0;
		boolean comprar=false;
		
		for(;i<productosEnTienda.length && comprar==false;i++) 
		{
			if(productosEnTienda[i]==null) 
			{
				productosEnTienda[i]=(productoParaTienda);
				comprar=true;
			}
		}
		
		return productosEnTienda;
	}
	
	/*
	//interfaz
	prototipo: public Incidencia [] AvisaIncidencias(Incidencia incidencia,Incidencia [] clienteDenuncia )
	comentario:este metodo sirve para avisar qualquier incidencia
	precondiciones: No hay
	entradas: un objeto
	salidas: no hay
	entr/sal:un array
	postcondiciones:AN devolvera el array de incidencias
	*/
	
	/*
	//resguardo
	public Incidencia [] AvisaIncidencias(Incidencia incidencia,Incidencia [] clienteDenuncia )
	{
		System.out.println("En construccion");
		return clienteDenuncia[0];
	}*/
	
	public Incidencia [] AvisarIncidencias(Incidencia incidencia,Incidencia [] clienteDenuncia )
	{	
		boolean insertado=false;
		int i=0; 
		
		for(i=0;i<clienteDenuncia.length && insertado==false;i++) 
		{
			if(clienteDenuncia[i]==null) 
			{
				clienteDenuncia[i]=incidencia;
				insertado=true;
			}
		}
		if(insertado==false || clienteDenuncia[i]!=null) 
		{
			System.out.println("Array lleno. No se puede incertar mas incidencias.");
		}
		
		return clienteDenuncia;
	}

	/*
	//interfaz
	prototipo: public boolean EliminarIncidencia(Incidencia [] clienteDenuncia,int idIncidencia) 
	comentario:este metodo sirve para eliminar las incidencias 
	precondiciones: array lleno
	entradas: un entero y un array de incidencia
	salidas: logico
	entr/sal:no hay
	postcondiciones:AN true si se ha eliminado ,false en caso contrario
	*/
	
	/*
	//resguardo
	public boolean EliminarIncidencia(Incidencia [] clienteDenuncia,int idIncidencia) 
	{
		System.out.println("En construccion");
		return true;
	}*/
	
	public boolean EliminarIncidencia(Incidencia [] denuncia,int idIncidencia) 
	{
        boolean resultado = false;
       
        for (int i = 0; i < denuncia.length && resultado==false; i++) 
        {
    		 if (denuncia[i].getId() == idIncidencia) 
             {
                 for (int j = i; j < denuncia.length - 1; j++) 
                 {
                 	denuncia[j] = denuncia[j+1];
                 }
                 denuncia[denuncia.length - 1] = null;
                 resultado = true;
             }
        }
	        
        return resultado;
    }	
	
	/*
	//interfaz
	prototipo: public static Producto [] VendeProducto(Producto [] productos,Producto producto,Producto [] arrayVendido)
	comentario: sirve para vender un producto
	precondiciones: no hay
	entradas: un objeto producto,dos arrays de productos
	salidas: no hay
	entr/sal: un array de producto
	postcondiciones:AN devolvera el array de productos vendidos
	*/
	
	/*
	//resguardo
	public static Producto [] VendeProducto(Producto [] productos,Producto producto,Producto [] arrayVendido)
	{
		System.out.println("En construccion");
		return arrayVendido[0];
	}*/
	
	public static Producto [] VenderProducto(Producto [] productos,Producto producto,Producto [] arrayVendido) throws ExcepcionProducto
	{
		int i=0;
		
		if(productos[i]==null) 
		{
			throw new ExcepcionProducto("No hay productos");
		}else
		{
			arrayVendido[i]=(new Producto(producto));
			productos[i].setCantidad(productos[i].getCantidad()-producto.getCantidad());
		}
		return arrayVendido;
	}
}
