# Aprendiendo markdown

Mis primeros *pasos* en **Markdown**, que es un formato de marcado de ***archivos*** de texto.

A continuación una ___lista___:

* Item 1
* Item 2
    * Item 2.1
    * Item 2.2
* Item 3

A continuación una __tabla__:

| Código | Nombre | Precio |
|:-:|:-|:-:|
| 1 | TV | 553.99 |
| 2 | computador | 1687.23 |
| 3 | Celular | 761.51 |

A continuación un _enlace_ o *link*:

[WebAdmin](http://localhost:22352/dashboard.html)

A continuación una ___imagen___:

![Logo de java](https://www.google.com/url?sa=i&url=https%3A%2F%2Flogosear.ch%2Flogos%2Fjava%2Findex.html&psig=AOvVaw02YUxsFDeV-XelWVaSueme&ust=1761353576280000&source=images&cd=vfe&opi=89978449&ved=0CBUQjRxqFwoTCNCAvP3Ou5ADFQAAAAAdAAAAABAK)

# Titulo nivel 1
## Titulo nivel 2
### Titulo nivel 3

A continuación como mostrar el **codigo de un programa**:

    import java.util.Scanner;
    public class Saludo2 {
	    public static void main(String[] args){
		    Scanner sc= new Scanner(System.in);
		    String nombre;
		    System.out.print("Dime tu nombre: ");
		    nombre= sc.nextLine();
		    System.out.print("Hola "+ nombre);
		    System.out.println(", encantado de conocerte!");
	    }
    }

Fin