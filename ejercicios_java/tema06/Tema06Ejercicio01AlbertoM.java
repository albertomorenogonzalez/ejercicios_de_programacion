/**
 * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 * también la suma total (los puntos que suman entre los tres dados).
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio01AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA EL RESULTADO DE TRES DADOS Y LUEGO LOS SUMA");
    System.out.println("-----------------------------------------------------------------");
    System.out.println(" ");

    int dado1 = ((int)(Math.random()*6) + 1);
    System.out.println("Primer dado: " + dado1);

    int dado2 = ((int)(Math.random()*6) + 1);
    System.out.println("Segundo dado: " + dado2);

    int dado3 = ((int)(Math.random()*6) + 1);
    System.out.println("Tercer dado: " + dado3);

    System.out.println(" ");

    System.out.println("La suma de los números que han salido es: " + (dado1 + dado2 + dado3));
  }
}
