package factorial2;
import java.util.Scanner;
public class Factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        long fact=1;
        do{
            System.out.print("Ingrese el numero del que desea el factorial:");
            n= sc.nextInt();
            if(n<0){
                System.out.println("El numero ingresadp no puede ser negativo");
            }
        }while(n<0);
        for(int i=1;i<=n;i++){
            fact = (long) fact *i;
        }
        System.out.println("El factorial de "+n+" es: "+fact);
        
        
    }
    
}
