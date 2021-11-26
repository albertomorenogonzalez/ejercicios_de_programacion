/**
 * El gusano numérico se come los dígitos con forma de rosquilla, o sea, el 0 y el 8
 * (todos los que encuentre). Realiza un programa que muestre un número antes
 * y después de haber sido comido por el gusano. Si el animalito no se ha comido
 * ningún dígito, el programa debe indicarlo.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio51AlbertoM {
  public static void main(String[] args) {
    System.out.println("GUSANO NUMÉRICO");
    System.out.println("----------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número entero positivo, por favor: ");
    System.out.print("> ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.println(" ");
    
    long darLaVuelta = 0;
    
    long comprobador = numero;

    numero = ((numero * 10) + 1);

    while (numero > 0) {
      darLaVuelta = ((darLaVuelta * 10) + (numero % 10));
      
      numero /= 10;
    }

    long nuevoNumero = 0;

    while (darLaVuelta > 10) {
      long resto = (darLaVuelta % 10);

      if ((resto != 0) && (resto != 8)) {
        nuevoNumero = ((nuevoNumero * 10) + resto);
      }

      darLaVuelta /= 10;
    }

    if (nuevoNumero == comprobador) {
      System.out.print("El gusano numérico no se ha comido ningún dígito.");
    } else {
      System.out.print("Después de haber sido comido por el gusano numérico, el número se queda en " + nuevoNumero);
    }
  }
}