package estadnumeros3;
import java.util.Scanner;

public class EstadNumeros3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i=1;
        int num;
        int suma=0;
        int mayor=0;
        float media;
        System.out.print("Ingrese la cantidad de numeros que va a ingresar:");
        n= sc.nextInt();
        while(i<=n){
            System.out.print("Ingrese el numero "+i+": ");
            num= sc.nextInt();
            suma = suma + num;
            if(mayor<num){
                mayor= num;
            }
            i++;
        }
        media= (float) suma / n;
        System.out.println("La media aritmetica de los "+n+" numeros es "+ media);
        System.out.println("El mayor numero de los "+n+" numeros es "+ mayor);
    }
    
}
