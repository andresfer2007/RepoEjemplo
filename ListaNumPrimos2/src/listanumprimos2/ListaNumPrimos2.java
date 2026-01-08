package listanumprimos2;
import java.util.Scanner;

public class ListaNumPrimos2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.print("Ingrese un numero entero: ");
            num = sc.nextInt();
            if(num<=0){
                System.out.println("El numero debe ser mayor a cero");
            }
        }while(num<=0);
        
        System.out.print("Los numeros primos entre 0 y " +num+ " son: ");
        for (int i=0; i<=num; i++){
            if(primo(i)){
                System.out.print( i + " ");
            
            }
        }
        System.out.println();

        
    }
    public static boolean primo(int numero){
        boolean esPrimo=false;
        int cont;
        
        if (numero >= 2){
            cont = numero -1;
            while(numero%cont!=0){
                cont = cont-1;
            }
            if (cont==1){
                esPrimo = true;
            }
        }
        return esPrimo;
    }
    
}