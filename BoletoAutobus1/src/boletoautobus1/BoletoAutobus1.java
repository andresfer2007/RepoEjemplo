package boletoautobus1;
import java.util.Scanner;
public class BoletoAutobus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float distancia;
        String tipDia;
        float precio;
        System.out.print("Ingrese el recorrido en kilometros: ");
        distancia = sc.nextFloat();
        sc.nextLine();
        System.out.print("seleccione el tipo de dia (L o F): ");
        tipDia = sc.nextLine();
        
        
        if(tipDia.equals("L")){
            precio = (float) distancia * 5/100;
            if(precio>=80){
              precio = (float) precio * 85/ 100;
            }
            precio = (float) precio * 95/ 100;
            System.out.print("EL PRECIO FINAL DEL BOLETO EN USD ES: "+precio+ " dolares\n");
        }else if(tipDia.equals("F")){
            precio = (float) distancia * 5/100;
            if(precio>=80){
                precio = (float) precio * 85/ 100;
            }
            System.out.print("EL PRECIO FINAL DEL BOLETO EN USD ES: "+precio+ " dolares\n");
        }else{
            System.out.print("El dia fue mal ingresado\n ");
        }
    }
}
