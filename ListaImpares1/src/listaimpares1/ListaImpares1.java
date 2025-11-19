package listaimpares1;
import java.util.Scanner;
public class ListaImpares1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i,n,c;
       System.out.print("Ingrese el # de elementos:");
       n= sc.nextInt();
       c=1;
       i=1;
       while(i<=n){
           System.out.println(c);
           c=c+2;
           i++;           
       }
    }
}
