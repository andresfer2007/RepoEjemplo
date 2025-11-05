import java.util.Scanner;

public class EntradasDatos1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String nombre, apellidos;
		byte edad;
		int km_viajados;
		float estatura;

		System.out.print("¿Cuáles son sus nombres?");
	    nombre=sc.nextLine();
	    System.out.print("¿Cuáles son sus apellidos?");
	    apellidos=sc.nextLine();
	    System.out.print("¿Cuántos años tiene?");
	    edad=sc.nextByte();
	    System.out.print("¿Cuántos kilometros ha viajado?");
	    km_viajados= sc.nextInt();
	    System.out.print("¿Cuál es su estatura?");
	    estatura= sc.nextFloat();
	    System.out.println("\nAgradecemos sus respuestas\n");
	    System.out.print("Su nombre es "+ nombre+ " "+ apellidos+", ");
	    System.out.print("tiene "+edad+ " años, mide "+ estatura+ "m ");
	    System.out.println("y ha viajado "+ km_viajados+"Km.");
	}
}