/*
 * Crear un programa en java en el cual se pida al usuario ingresar su nombre, 
*apellido, edad, hobbie, editor de código preferido, sistema operativo que 
*utiliza, luego deberá mostrarse por consola los datos ingresados.
*El programa deber ser subido a un repositorio de GitHub, pegar el link del 
*ejercicio resuelto en el siguiente recuadro
 */
package practicajava1;
import java.util.Scanner;
/**
 *
 * @author Carlos Azocar Comision #1112
 */
public class PracticaJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   String nombre, apellido, edad, hobbie, editCodPref, osUsado;
   System.out.println("Hola por favor introduce tu nombre");
   nombre = in.nextLine();
   
   System.out.println("Ahora introduce tu apellido");
   apellido = in.nextLine();
   
   System.out.println("Cuál es tu edad?");
   edad = in.nextLine();
   
      System.out.println("Cuál es tu hobbie?");
   hobbie = in.nextLine();
   
   System.out.println("Ya casi terminamos, dime cuál es tu editor de código favorito?");
   editCodPref = in.nextLine();
   
   System.out.println("Ahora si, pregunta final, cuál Sistema Operativo usas?");
   osUsado = in.nextLine();

   System.out.println(" ");
   System.out.println("****************************************************");
   System.out.println("Tu nombre y apellido es " + nombre + " " + apellido);
   System.out.println("Tienes " + edad + " años");
   System.out.println("Te gusta " + hobbie);
   System.out.println("Tu editor de código favorito es " + editCodPref);     
   System.out.println("Y el sistema operativo que usas es " + osUsado);
   System.out.println("****************************************************");   

    }
}
