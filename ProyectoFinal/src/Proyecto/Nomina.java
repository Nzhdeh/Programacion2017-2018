/**Nombre de la clase : Nomina
 * 
 * 
 * propiedades basicas:
 * 		
 * 				salarioBase: tipo double , consultable , modificable
 * 				plusTitulo: tipo double , consultable , modificable
 * 				parteProporcinalHorasExtras: tipo double , consultable , modificable
 * 				transporte: tipo double, consultable , modificable
 * 				trabajador: tipo Trabajador, consultable
 * 				empresa: tipo Empresa, consultable
 * 				fecha: tipo Fecha, consultable
 *
 * 
 * 				porcentajeContingenciaComun: tipo double, consultable
 * 				porcentajeDesempleo: tipo double, consultable
 * 				porcentajeFormacionProfecional: tipo double, consultable
 * 				porcentajeHorasExtras: tipo double, consultable
 * 				porcentajeIRPF: tipo double, consultable 
 * 
 * propiedades derivadas:
 * 
 * 				contingenciaComun; tipo double , consultable
 * 				desempleo: tipo double , consultable
 * 				formacionProfecional: tipo double , consultable
 * 				horasExtras: tipo double , consultable
 * 				IRPF: tipo double, consultable
 * 				remuneracionMensual: tipo double, consultable
 * 				prorotaPagasExtraordinarias: tipo double, consultable

 * 
 * 
 * restricciones: salario base >0,plusTitulo>=0, parteProporcinalHorasExtras>=0,transporte>=0
 * 				  porcentajeContingenciaComun=4.7, porcentajeDesempleo=1.6,porcentajeFormacionProfecional=0.10
 * 				  porcentajeHorasExtras=4.7, porcentajeIRPF=15
 * 
 * INTERFAZ
 * 
 * getters y setters
 * 
 *  public double getSalarioBase() 
	public void setSalarioBase(double salarioBase) 
	
	public double getPlusTitulo() 
	public void setPlusTitulo(double plusTitulo) 
	
	public double getParteProporcinalHorasExtras() 
	public void setBaseProporcinalHorasExtras(double baseProporcinalHorasExtras) 
	
	public double getTransporte() 
	public void setTransporte(double transporte)
	
	public double getContingenciaComun() 
	
	public double getDesempleo() 
	
	public double getFormacionProfecional() 
	
	public double getHorasExtras() 
	
	public double getRemuneracionMensual() 

	public double getProrotaPagasExtraordinarias() 

	public double getIRPF() 
	
	
	public double getPorcentajecontingenciacomun() 
	
	public double getPorcentajedesempleo() 
	
	public double getPorcentajeformacionprofecional() 
	
	public double getPorcentajehorasextras() 
	
	public double getPorcentajeIRPF() 
	
	//patron delegacion
	public String getNombreTrabajador() 

	public String getApellidosTrabajador() 

	public String getDniTrabajador() 

	public TipoCargo getCARGOTrabajador() 

	public int getFechaNacimientoDiaTrabajador() 

	public int getFechaNacimientoMesTrabajador() 

	public int getFechaNacimientoAnioTrabajador()

	public char getSexoTrabajador() 

	public String getNombreEmpresaEmpresa() 

 	public String getDomicilioEmpresaEmpresa() 
 	
 	public String getCIFEmpresaEmpresa() 
	
	public int getFechaFirmaDia() 
	public int getFechaFirmaMes() 
	public int getFechaFirmaAnio() 
	
	public int getPeriodoFinalDia() 
	public int getPeriodoFinalMes() 
	public int getPeriodoFinalAnio() 
	
	public int getPeriodoInicialDia() 
	public int getPeriodoInicialMes() 
	public int getPeriodoInicialAnio() 
 * 
 * 
 * metodos añadidos: 
 * 
 * 			calcularTitalDevengado()
 * 			calcularTotalAportaciones()
 * 			calcularTotalADeducir()
 * 			calcularLiquidoTotalAPercibir()
 * 			calcularTotal()
 * 			generarNomina()
 */
package Proyecto;

public class Nomina 
{
	//propiedades basicas:
	private double salarioBase;
	private double plusTitulo;
	private double parteProporcinalHorasExtras;
	private double transporte;
	private double horasExtras;
	private Trabajador trabajador;
	private Empresa empresa;
	private Fecha fechaFirma;
	private Fecha fechaPeriodoInicial;
	private Fecha fechaPeriodoFinal;
		 
	//propiedades compartidas:
	private final double porcentajeContingenciaComun=4.7;
	private final double porcentajeDesempleo=1.6;
	private final double porcentajeFormacionProfecional=0.1;
	private final double porcentajeHorasExtras=4.7;
	private final double porcentajeIRPF=15.0;
	private GestoraTienda gt;
	
	//propiedades derivadas:
	private double contingenciaComun;
	private double desempleo;
	private double formacionProfecional;
	private double IRPF;
	private double remuneracionMensual;
	private double prorotaPagasExtraordinarias;
	
	//constructeores
	//por defecto
	public Nomina() 
	{
		double salarioBase=0.0;
		double plusTitulo=0.0;
		double parteProporcinalHorasExtras=0.0;
		double transporte=0.0;
		//Fecha fechaNacimientoTrabajador=new Fecha();
		Trabajador trabajador=new Trabajador();
		Empresa empresa=new Empresa();
		Fecha fechaFirma=new Fecha();
		Fecha fechaPeriodoInicial=new Fecha();
		Fecha fechaPeriodoFinal=new Fecha();
		
		double porcentajeContingenciaComun=4.7;;
		double porcentajeDesempleo=1.6;
		double porcentajeFormacionProfecional=0.1;
		double porcentajeHorasExtras=4.7;
		double porcentajeIRPF=15.0;
		
		GestoraTienda gt=new GestoraTienda();
		
		double antiguedad=0.0; 
		double contingenciaComun=0.0;
		double desempleo=0.0;
		double formacionProfecional=0.0;
		double horasExtras=0.0;
		double IRPF=0.0;
	}
	

	//con parametros
	public Nomina(double salarioBase,double plusTitulo,double parteProporcinalHorasExtras,double transporte,
				  Fecha fechaFirma,Fecha fechaPeriodoInicial,Fecha fechaPeriodoFinal,Empresa empresa, Trabajador trabajador) 
	{
		this.salarioBase=salarioBase;
		this.plusTitulo=plusTitulo;
		this.parteProporcinalHorasExtras=parteProporcinalHorasExtras;
		this.transporte=transporte;
		this.fechaFirma=fechaFirma;
		this.fechaPeriodoInicial=fechaPeriodoInicial;
		this.fechaPeriodoFinal=fechaPeriodoFinal;
		this.trabajador=trabajador;
		this.empresa=empresa;
	}
	
	//de copia
	public Nomina(Nomina nomina) 
	{
		this.salarioBase=nomina.getSalarioBase();
		this.plusTitulo=nomina.getPlusTitulo();	
		this.parteProporcinalHorasExtras=nomina.getParteProporcinalHorasExtras();
		this.transporte=nomina.getTransporte();
		this.contingenciaComun=nomina.getContingenciaComun();
		this.desempleo=nomina.getDesempleo();
		this.formacionProfecional=nomina.getFormacionProfecional();
		this.horasExtras=nomina.getHorasExtras();
		this.IRPF=nomina.getIRPF();
		
		this.trabajador=new Trabajador(nomina.trabajador);
		this.empresa=new Empresa(nomina.empresa);
	}

	//getters y setters
	public double getSalarioBase() 
	{
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) throws ExcepcionNomina
	{
		if(salarioBase<1) 
		{
			throw new ExcepcionNomina("El salario base tiene que ser mayor que cero");
		}
		else 
		{
			this.salarioBase = salarioBase;
		}
	}
	
	
	public double getPlusTitulo() 
	{
		return plusTitulo;
	}
	public void setPlusTitulo(double plusTitulo) throws ExcepcionNomina
	{
		if(plusTitulo<0) 
		{
			throw new ExcepcionNomina("El plus titulo tiene que ser mayor o igual que cero");
		}
		else 
		{
			this.plusTitulo = plusTitulo;
		}
	}
	
	
	public double getParteProporcinalHorasExtras() 
	{
		return parteProporcinalHorasExtras;
	}
	public void setParteProporcinalHorasExtras(double parteProporcinalHorasExtras)  throws ExcepcionNomina
	{
		if(parteProporcinalHorasExtras<0) 
		{
			throw new ExcepcionNomina("El plus titulo tiene que ser mayor o igual que cero");
		}
		else 
		{
			this.parteProporcinalHorasExtras = parteProporcinalHorasExtras;
		}
	}
	
	
	public double getTransporte() 
	{
		return transporte;
	}
	public void setTransporte(double transporte) throws ExcepcionNomina
	{
		if(transporte<0) 
		{
			throw new ExcepcionNomina("El plus titulo tiene que ser mayor o igual que cero");
		}
		else 
		{
			this.transporte = transporte;
		}
	}
	
	
	public double getContingenciaComun() 
	{
		return (Math.round(calcularTotal()*getPorcentajecontingenciacomun())/100);
	}
	
	
	public double getDesempleo() 
	{
		return (Math.round(calcularBaseCotizacionPorContingenciasProfesionales()*getPorcentajedesempleo())/100);
	}
	
	
	public double getFormacionProfecional() 
	{
		return (Math.round(calcularBaseCotizacionPorContingenciasProfesionales()*getPorcentajeformacionprofecional())/100);
	}
	
	
	public double getHorasExtras() 
	{
		return (Math.round(getParteProporcinalHorasExtras()*getPorcentajehorasextras())/100);
	}
	
	
	public double getRemuneracionMensual() 
	{
		return remuneracionMensual=getSalarioBase()+getPlusTitulo();
	}

	public double getProrotaPagasExtraordinarias() 
	{
		return prorotaPagasExtraordinarias=Math.round((getSalarioBase()*2)/12);
	}

	public double getIRPF() 
	{
		IRPF=Math.round((getPorcentajeIRPF()*calcularTotalDevengado())/100);
		return IRPF;
	}
	
	
	public double getPorcentajecontingenciacomun() 
	{
		return porcentajeContingenciaComun;
	}
	
	
	public double getPorcentajedesempleo() 
	{
		return porcentajeDesempleo;
	}
	
	
	public double getPorcentajeformacionprofecional() 
	{
		return porcentajeFormacionProfecional;
	}
	
	
	public double getPorcentajehorasextras() 
	{
		return porcentajeHorasExtras;
	}
	
	
	public double getPorcentajeIRPF() 
	{
		return porcentajeIRPF;
	}
	
	//patron delegacion
	public String getNombreTrabajador() 
	{
		return trabajador.getNombre();
	}

	public String getApellidosTrabajador() 
	{
		return trabajador.getApellidos();
	}

	public String getDniTrabajador() 
	{
		return trabajador.getDni();
	}

	public TipoCargo getCARGOTrabajador() 
	{
		return trabajador.getCARGO();
	}

	public int getFechaNacimientoDiaTrabajador() 
	{
		return trabajador.getFechaNacimientoDia();
	}

	public int getFechaNacimientoMesTrabajador() 
	{
		return trabajador.getFechaNacimientoMes();
	}

	public int getFechaNacimientoAnioTrabajador() 
	{
		return trabajador.getFechaNacimientoAnio();
	}

	public char getSexoTrabajador() 
	{
		return trabajador.getSexo();
	}

	public String getNombreEmpresaEmpresa() 
	{
		return empresa.getNombreEmpresa();
	}

	public String getDomicilioEmpresaEmpresa() 
	{
		return empresa.getDomicilioEmpresa();
	}

	public String getCIFEmpresaEmpresa() 
	{
		return empresa.getCIFEmpresa();
	}
	
	public int getFechaFirmaDia() 
	{
		return fechaFirma.getDia();
	}

	public int getFechaFirmaMes() 
	{
		return fechaFirma.getMes();
	}

	public int getFechaFirmaAnio() 
	{
		return fechaFirma.getAnio();
	}
	
	public int getPeriodoFinalDia() 
	{
		return fechaPeriodoFinal.getDia();
	}


	public int getPeriodoFinalMes() 
	{
		return fechaPeriodoFinal.getMes();
	}


	public int getPeriodoFinalAnio() 
	{
		return fechaPeriodoFinal.getAnio();
	}
	
	public int getPeriodoInicialDia() 
	{
		return fechaPeriodoInicial.getDia();
	}


	public int getPeriodoInicialMes() 
	{
		return fechaPeriodoInicial.getMes();
	}


	public int getPeriodoInicialAnio() 
	{
		return fechaPeriodoInicial.getAnio();
	}
	
	//interfaz
	/*
	prototipo: public double calcularTotalDevengado() 
	comentarios: este metodo calcula el total devengado,
				 el total devengado es la suma de la percepciones salariales y de las percepciones extrasalariales
	precondiciones: no hay
	entradas: no hay
	salidas: double totalDevengado
	entr/sal: no hay
	postcondiciones: AN devolvera el resultado
	*/
	
	//resguardo
	/*public double calcularTotalDevengado() 
	{
		System.out.println("En construccion");
		return 1.0;
	}*/	
	
	public double calcularTotalDevengado() 
	{
		double totalDevengado=0.;
		totalDevengado=getSalarioBase()+getPlusTitulo()+getParteProporcinalHorasExtras()+getTransporte();
		return totalDevengado;
	}
	
	

	//interfaz
	/*
	prototipo: public double calcularTotalAportaciones() 
	comentarios: este metodo calcula las aportaciones totales,
				 se calcula sumando todas las cotizaciones a la seguridad social
	precondiciones: no hay
	entradas: no hay
	salidas: double totalAportaciones
	entr/sal: no hay
	postcondiciones: AN devolvera el resultado
	*/
	
	//resguardo
	/*public double calcularTotalAportaciones()  
	{
		System.out.println("En construccion");
		return 1.0;
	}*/	
	
	public double calcularTotalAportaciones() 
	{
		double totalAportaciones=0.0;
		totalAportaciones=Math.round(getContingenciaComun()+getDesempleo()+getFormacionProfecional()+getHorasExtras());
		return totalAportaciones;
	}
	
	//interfaz
	/*
	prototipo: public double calcularTotalADeducir() 
	comentarios: este metodo calcula las aportaciones totales,
				 se calcula sumando las aportaciones totales y el IRPF
	precondiciones: no hay
	entradas: no hay
	salidas: double totalADeducir
	entr/sal: no hay
	postcondiciones: AN devolvera el resultado
	*/
	
	//resguardo
	/*public double calcularTotalADeducir()  
	{
		System.out.println("En construccion");
		return 1.0;
	}*/	
	
	public double calcularTotalADeducir() 
	{
		double totalADeducir=0.;
		totalADeducir=getIRPF()+calcularTotalAportaciones();
		return totalADeducir;
	}
	
	//interfaz
	/**
	prototipo: public double calcularLiquidoTotalAPercibir() 
	comentarios: este metodo calcula el liquido total a percibir,
				 se calcula restando total a deducir a total devengado
	precondiciones: no hay
	entradas: no hay
	salidas: double liquidoTotalAPercibir
	entr/sal: no hay
	postcondiciones: AN devolvera el resultado
	*/
	
	//resguardo
	/*public double calcularLiquidoTotalAPercibir()  
	{
		System.out.println("En construccion");
		return 1.0;
	}*/	
	
	public double calcularLiquidoTotalAPercibir() 
	{
		double liquidoTotalAPercibir=0.;
		liquidoTotalAPercibir=calcularTotalDevengado()-calcularTotalADeducir();
		return liquidoTotalAPercibir;
	}
	
	
	/**
	prototipo: public double calcularTotal() 
	comentarios: este metodo calcula la Base de cotización por contingencias comunes
				 se calcula sumando remuneracionMensual y prorotaPagasExtraordinarias
	precondiciones: no hay
	entradas: no hay
	salidas: double total
	entr/sal: no hay
	postcondiciones: AN devolvera el resultado
	*/
	
	//resguardo
	/*public double calcularTotal() 
	{
		System.out.println("En construccion");
		return 1.0;
	}*/
	public double calcularTotal() 
	{
		double total=0;
		total=getRemuneracionMensual()+getProrotaPagasExtraordinarias();
		return total;
	}
	
	/**
	prototipo: public double calcularBaseCotizacionPorContingenciasProfesionales() 
	comentarios: este metodo calcula la Base de cotización por contingencias profecionales
				 se calcula sumando remuneracionMensual y prorotaPagasExtraordinarias y ParteProporcinalHorasExtras
	precondiciones: no hay
	entradas: no hay
	salidas: double base
	entr/sal: no hay
	postcondiciones: AN devolvera el resultado
	*/
	
	//resguardo
	/*public double calcularBaseCotizacionPorContingenciasProfesionales() 
	{
		System.out.println("En construccion");
		return 1.0;
	}*/
	public double calcularBaseCotizacionPorContingenciasProfesionales() 
	{
		double base=0;
		base=getRemuneracionMensual()+getProrotaPagasExtraordinarias()+getParteProporcinalHorasExtras();
		return base;
	}

	/**
	prototipo: public void generarNomina()  
	comentarios: este metodo sirve para generar una nomina
	precondiciones: El array tiene que estar lleno
	entradas: 4 numeros reales, dos objetos
	salidas: no hay
	entr/sal: no hay
	postcondiciones: se pintara en pantalla la nomina
	*/
	
	//resguardo
	/*public void generarNomina()  
	{
		System.out.println("En construccion");
	}*/
	public void generarNomina() 
	{
		GestoraTienda gt=new GestoraTienda();
		
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println("|----------------------------------------"+"	----------------------------------------||");
		System.out.println("|Empresa: "+empresa.getNombreEmpresa()+"			|"+"	|Trabajador: "+getNombreTrabajador()+' '+getApellidosTrabajador()+"		||");
		System.out.println("|Domicilio: "+empresa.getDomicilioEmpresa()+"		|"+"	|DNI/NIE: "+getDniTrabajador()+"			||");
		System.out.println("|Cif: "+empresa.getCIFEmpresa()+"				|"+"	|Categoria: "+getCARGOTrabajador()+"			||");
		System.out.println("|----------------------------------------"+"	----------------------------------------||");
		System.out.println("|---------------------------------------------------------------------------------------||");
		System.out.println("|---------------------------------------------------------------------------------------||");
		System.out.println("|Periodo de liquidacion: desde "+fechaPeriodoInicial.toString()+" hasta "+fechaPeriodoFinal.toString()+"		Total dias: "+(gt.RestarFecha(fechaPeriodoInicial,fechaPeriodoFinal)+1)+"		||");
		System.out.println("|---------------------------------------------------------------------------------------||");
		System.out.println("|I. DEVENGOS										||");
		System.out.println("|		1. Percepciones salariales						||");
		System.out.println("|		Salario base----------------------------------------------"+getSalarioBase()+" €	||");
		System.out.println("|		Complementos salariales:						||");
		System.out.println("|		Plus Titulo-----------------------------------------------"+getPlusTitulo()+" €	||");
		System.out.println("|		Parte proporcional horas extras---------------------------"+getParteProporcinalHorasExtras()+" €	||");
		System.out.println("|		2. Percepciones extrasalariales						||");
		System.out.println("|		Indemnizaciones o suplidos:						||");
		System.out.println("|		Transporte------------------------------------------------"+getTransporte()+" €	||");
		System.out.println("|				     A.TOTAL DEVENGADO-------------------------"+calcularTotalDevengado()+" € ||");
		System.out.println("|---------------------------------------------------------------------------------------||");
		System.out.println("|II. DEDUCCIONES									||");
		System.out.println("|		1. Cotizaciones a la seguridad social					||");
		System.out.println("|		Contingencias comunes--------------- "+getPorcentajecontingenciacomun()+"% --------------"+getContingenciaComun()+" €		||");
		System.out.println("|		Desempleo--------------------------- "+getPorcentajedesempleo()+"% --------------"+getDesempleo()+" €		||");
		System.out.println("|		Formacion profecional--------------- "+getPorcentajeformacionprofecional()+"% --------------"+getFormacionProfecional()+"€		||");
		System.out.println("|		Horas extras------------------------ "+getPorcentajehorasextras()+"% --------------"+getHorasExtras()+"€		||");
		System.out.println("|				TOTAL APORTACIONES----------------------"+calcularTotalAportaciones()+" € 		||");
		System.out.println("|		2. IRPF----------------------------- "+getPorcentajeIRPF()+"% -------------"+getIRPF()+" €		||");
		System.out.println("|		3. Anticipos----------------------------------------------------	||");
		System.out.println("|		4. Valor de los productos recibidos en especie------------------ 	||");
		System.out.println("|		5. Otras deducciones--------------------------------------------	||");
		System.out.println("|					  B.TOTAL A DEDUCIR---------------------"+calcularTotalADeducir()+" € ||");
		System.out.println("|			LIQUIDO TOTAL A PERCIBIR (A-B)--------------------------"+calcularLiquidoTotalAPercibir()+" € ||");
		System.out.println("|				Firma y sello de la empresa	"+fechaFirma.toString()+"		||");
		System.out.println("|								Recibi			||");
		System.out.println("|											||");
		System.out.println("|---------------------------------------------------------------------------------------||");
		System.out.println("|BASES DE COTIZACION A LA SEGURIDAD SOCIAL E IRPF					||");
		System.out.println("|		1. Base de cotización por contingencias comunes				||");
		System.out.println("|			Remuneración mensual--------------------------------"+getRemuneracionMensual()+" €	||");
		System.out.println("|			Prorrata de pagas extraordinarias-------------------"+getProrotaPagasExtraordinarias()+" €	||");
		System.out.println("|								Total-------"+calcularTotal()+" €	||");
		System.out.println("|		2. Base de cotización por contingencias					||");
		System.out.println("|		   profecionales----------------------------------------"+calcularBaseCotizacionPorContingenciasProfesionales()+" €	||");
		System.out.println("|		3. Base de cotización por horas extras------------------"+getParteProporcinalHorasExtras()+" €		||");
		System.out.println("|		4. Base sujeta a retención del IRPF---------------------"+calcularTotalDevengado()+" €	||");
		System.out.println("|---------------------------------------------------------------------------------------||");
	}	
}