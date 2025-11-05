import java.util.Scanner;
public class Venta1{
	public static void main(String[] Args){
		Scanner sc = new Scanner(System.in);
		float art1, art2, art3, total;
		float iva= (float)0.15;

		System.out.println("COMPRA DE ARTÍCULOS\n===================");
		System.out.print("Ingrese el precio del artículo 1:");
		art1 = sc.nextFloat();
		System.out.print("Ingrese el precio del artículo 2:");
		art2 = sc.nextFloat();
		System.out.print("Ingrese el precio del artículo 3:");
		art3 = sc.nextFloat();
        total = ((art1+art2+art3)*iva)+art1+art2+art3;

		System.out.println("\nGracias por su compra!");
		System.out.print("El total a pagar incluido el IVA es: "+ total+" USD");
	}
}