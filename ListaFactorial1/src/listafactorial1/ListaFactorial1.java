package listafactorial1;
import java.util.Scanner;
public class ListaFactorial1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n,c,par;
        int fac;
        
        do{
            System.out.print("Ingrese la cantidad de numeros factoriales que desea:");
            n= sc.nextShort();
            if(n<=0){
                System.out.println("El numero debe ser mayor a cero");
            }
        }while(n<=0);
        c=0;
        par=2;
        System.out.print("Los Factoriales son:");
        while (c < n) {
            fac = CalFactorial(par);
            if (c == n - 1) {
                System.out.print(fac);
            } else {
                System.out.print(fac + ", ");
            }
            par += 2;
            c++;
        }
      
        
    }
    public static int CalFactorial(short num){
        int fac;
        fac=1;
        for(short i=1;i<=num;i++){
            fac=fac*i;
        }
        return fac;
    }
}
