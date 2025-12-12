package porcentajepares1;
import java.util.Scanner;
public class PorcentajePares1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short num[];
        short cont;
        float porc;
        short n;
        do{
            System.out.print("¿Cuantos numeros desea ingresar?: ");
            n= sc.nextShort();
        }while(n<=0);
        num = new short[n];
        for(short i=0;i<=n-1;i++){
            System.out.print("Ingrese el numero "+(i+1)+":");
            num[i]=sc.nextShort(); 
        }
        cont=0;
        System.out.print("Lista de pares ingresados: ");
        for(short i=0;i<=n-1;i++){
            if(num[i]%2==0){
                System.out.print(num[i]+" ");
                cont++;
            }  
        }
        porc=(float) cont/n;
        System.out.println("\nPorcentaje pares:"+(porc*100)+"%");
        
        
    }
    
}
