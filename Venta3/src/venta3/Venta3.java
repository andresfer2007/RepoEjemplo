package venta3;
import java.util.Scanner;
public class Venta3 {
    public static void main(String[] args) {
        String item1,item2, item3;
        byte cant1,cant2,cant3;
        float precio1,precio2,precio3,subtotal,iva,total;
        
        item1="Televisor LG";
        item2="Computador Asus";
        item3="Jugo de Sala";
        cant1=4;
        cant2=10;
        cant3=7;
        precio1=(float)765.87;
        precio2=(float)2324.56;
        precio3=(float)655.99;
        subtotal=(cant1*precio1)+(cant2*precio2)+(cant3*precio3);
        iva=(float)(subtotal*0.12);
        total= subtotal+iva;
        
        System.out.println("+-------+-------------------------------+-------------+--------------+");
        System.out.println("| Cant  | Itam                          | Precio Unit | Precio total |");
        System.out.println("+-------+-------------------------------+-------------+--------------+");
        System.out.printf("| %5d | %-29s | %,11.2f | %,12.2f |\n",cant1,item1,precio1,cant1*precio1);
        System.out.printf("| %5d | %-29s | %,11.2f | %,12.2f |\n",cant2,item2,precio2,cant2*precio2);
        System.out.printf("| %5d | %-29s | %,11.2f | %,12.2f |\n",cant3,item3,precio3,cant3*precio3);
        System.out.println("+-------+-------------------------------+-------------+--------------+");
        System.out.printf("|%39s| %11s | %,12.2f |\n"," ","Subtotal",subtotal);
        System.out.printf("|%39s| %11s | %,12.2f |\n"," ","IVA (12%)",iva);
        System.out.printf("|%39s| %11s | %,12.2f |\n"," ","Tot. Pagar",total);
        System.out.println("+---------------------------------------+-------------+--------------+");
    }
    
}
