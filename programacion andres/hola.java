import java.util.Scanner;
public class hola{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int edad;
		String nombre;

		System.out.println("Ingrese su nombre");
		nombre = sc.nextLine();
		System.out.println("Ingrese su edad");
		edad=sc.nextInt();
		if(edad>=18){
			System.out.println("usted "+ nombre +" es mayor de edad");
		}else{
			System.out.println("usted "+ nombre +" es menor de edad");
		}
	}
}