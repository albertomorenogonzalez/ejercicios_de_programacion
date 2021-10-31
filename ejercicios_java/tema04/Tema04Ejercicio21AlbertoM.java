/**
 * 
 * Calcula la nota de un trimestre de la asignatura Programación. El programa
 * pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
 * Si la media de los dos controles da un número mayor o igual a 5, el alumno
 * está aprobado y se mostrará la media. En caso de que la media sea un número
 * menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
 * se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
 * ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
 * de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
 * la nota media anterior.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio21AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA LA NOTA DE UN TRIMESTRE DE LA ASIGNATURA DE PROGRMACIÓN");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca la nota del primer control, por favor: ");
    System.out.print("> ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Introduzca la nota del segundo control, por favor: ");
    System.out.print("> ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.println(" ");
    
    double notaMedia = ((nota1 + nota2) / 2);
    
    if ((nota1 >= 0) && (nota1 <= 10)) {
      if (notaMedia >= 5) {
        System.out.print("Tu nota media del trimestre en Programación es de un ");
        System.out.printf("%.2f" ,notaMedia);
        System.out.println(".");
      } else if (notaMedia < 5) {
          System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):");
          System.out.print("> ");
          String resultadoRecuperacion = (System.console().readLine().toLowerCase());
          System.out.println(" ");
          
          if ("apto".equals(resultadoRecuperacion)) {
            System.out.println("Tu nota media del trimestre en Programación es de un 5.");  
          } else if ("no apto".equals(resultadoRecuperacion)) {
              System.out.print("Tu nota media del trimestre en Programación es de un ");
              System.out.printf("%.2f" ,notaMedia);
              System.out.println(".");
          } else {
              System.out.println("Introduzca correctamente el resultado de la recuperación."); 
          }
      } 
    } else {
        System.out.println("Introduzca correctamente las notas de los controles.");
    }
  }
}
