/**NNombre de la clase: TestRectangulo
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class TestRectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1=new Rectangulo(4.0,7.0);
		//Rectangulo r1=new Rectangulo(-10,20);
		//Rectangulo r1=new Rectangulo(10,-20);
		
		System.out.println("Antes del cambio: "+r1.getLargo()+" "+r1.getAncho());
		
		//prueba getters y setters
		System.out.println("---------------------------------------------------");
		System.out.println("Get y set de Largo:");
		//r1.setLargo(3);
		r1.setLargo(-3);
		System.out.println(r1.getLargo());
		
		System.out.println("---------------------------------------------------");
		System.out.println("Get y set de Ancho:");
		r1.setAncho(8);
		//r1.setAncho(-8);
		System.out.println(r1.getLargo());
		//fin
		
		System.out.println("Despues del cambio: "+r1.getLargo()+" "+r1.getAncho());
		
		//prueba de area
		System.out.println("---------------------------------------------------");
		System.out.println("Get y set de Area:");
		System.out.println(r1.getArea());
		//fin prueba area
		
		//prueba de parametro
		System.out.println("---------------------------------------------------");
		System.out.println("Get y set de Parametro:");
		System.out.println(r1.getPerimetro());
		//fin prueba parametro
	}
}
