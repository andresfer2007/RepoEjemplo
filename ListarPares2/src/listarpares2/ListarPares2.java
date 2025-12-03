package listarpares2;
import java.util.Scanner;
public class ListarPares2 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N,par;
        System.out.print("Ingrese # de pares a mostar: ");
        N = sc.nextInt();
        for(int c=1;c<=N;c++){
            par = c*2;
            System.out.println(par);
        }
    }
    
}
