package listainvertida2;
import java.util.Scanner;
public class ListaInvertida2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int [] lista;
        System.out.print("¿Cuantos numeros desea ingresar?");
        n=sc.nextInt();
        lista= new int[n];
        for(int i =0;i<=n-1;i++){
            System.out.print("Ingrese elemento "+(i+1)+":");
            lista[i]=sc.nextInt();
        }
        System.out.println("\nLos numeros que ingreso son:");
        for(int i =n-1;i>=0;i--){
            System.out.println(lista[i]);
        }
    }
    
}
