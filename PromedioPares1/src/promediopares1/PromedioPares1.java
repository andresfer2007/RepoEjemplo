package promediopares1;
import java.util.Scanner;
public class PromedioPares1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,c;
        int n;
        float prom =0;
        int suma=0;
        System.out.print("Ingrese la cantidad de elementos: ");
        n = sc.nextInt();
        c=2;
        i=1;
        while(i<=n){
            suma = suma+c;
            c=c+2;
            i++;           
        }
        prom = (float)suma/n;
        System.out.println("La suma de los "+n+" numeros pares es: "+suma);
        System.out.println("El promedio de los "+n+" numeros pares es: "+prom);
        
    }
    
}
