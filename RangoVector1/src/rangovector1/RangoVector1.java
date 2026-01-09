package rangovector1;
import java.util.Scanner;
public class RangoVector1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short n;
        float vector[],alto,bajo;
        do{
            System.out.print("Ingrese el tamaño del vector:");
            n= sc.nextShort();
            if(n<=0){
                System.out.println("El numero debe ser mayor a cero");
            }
        }while(n<=0);
        vector= new float[n];
        for(short i=0;i<=n-1;i++){
            System.out.print("Ingrese elemento "+(i+1)+": ");
            vector[i] = sc.nextFloat();
        }
        bajo=masBajo(vector);
        alto=masAlto(vector);
        System.out.printf("El rango del vector es de: %.2f\n",(alto-bajo));
    }
    public static float masBajo(float[] vec){
        float bajo;
        bajo=vec[0];
        for(short i=0;i<=vec.length-1;i++){
            if(vec[i]<bajo){
                bajo=vec[i];
            }
        }
        return bajo;
    }
    public static float masAlto(float[] vec){
        float alto;
        alto=0;
        for(short i=0;i<=vec.length-1;i++){
            if(vec[i]>alto){
                alto=vec[i];
            }
        }
        return alto;
    }
    
}
