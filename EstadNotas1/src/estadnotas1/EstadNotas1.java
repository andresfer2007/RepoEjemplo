package estadnotas1;
import java.util.Scanner;
public class EstadNotas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float notas[];
        float promedio;
        short contArriba=0,contAbajo=0;
        short n;
        do{
            System.out.print("¿Cuantos estudiantes desea ingresar?");
            n= sc.nextShort();
        }while(n<=0);
        
        notas= new float[n];
        promedio=0;
        for(short i =0;i<=n-1;i++){
            do{
                System.out.print("Ingrese la nota del estudiante "+(i+1)+":");
                notas[i]=sc.nextFloat();
            }while(notas[i]<0 || notas[i]>10);    
            promedio= promedio+notas[i];
        }
        promedio= promedio/n;
        for(short i =0;i<=n-1;i++){
            if(notas[i]>=promedio){
                contArriba++;
            }else {
                contAbajo++;
            }
        }
        System.out.println("Promedio"+promedio);
        System.out.println("Estudiantes por encima de la media:"+contArriba);
        System.out.println("Estudiantes por debajo de la media:"+contAbajo);
        System.out.printf("Estudiantes por debajo de la media: %d\n", contAbajo);
        
    }
    
}