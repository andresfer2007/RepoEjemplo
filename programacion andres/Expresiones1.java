public class Expresiones1 {
	public static void main (String[] args){
		byte a=4;
		byte b=3;
		byte c=5;

		boolean expresion =( (a>b+2) && !(c+a == b*c));
		System.out.println("Dados a=4, b=3, c=5");
		System.out.println("Y la expresión (a>b+2) and not(c+a = b*c)");
		System.out.println("El resultado es: "+ expresion);
			
	}
}
