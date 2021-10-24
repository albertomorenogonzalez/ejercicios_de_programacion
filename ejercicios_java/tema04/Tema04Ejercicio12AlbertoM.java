/**
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
 * tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
 * en las diferentes asignaturas del curso.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio12AlbertoM {
  public static void main(String[] args) {
    System.out.println("MINICUESTIONARIO 1º DAM");
    System.out.println("------------------------");
    System.out.println(" ");
    System.out.println("Este cuestionario probará como de bien vas en el curso. ¿Preparado? ");
    System.out.println(" ");
    
    System.out.println("Primera pregunta (Programación): ");
    System.out.println("¿Qué sentencia de java sirve para mostrar una cadena de caracteres por pantalla y aplicar al mismo tiempo un salto de línea?");
    System.out.println("a. System.out.pintf();");
    System.out.println("b. System.out.pintln();");
    System.out.println("c. System.out.pint();");
    System.out.print("> ");
    String x = System.console().readLine();
    System.out.println(" ");
    
    if ("b".equals(x)) {
      System.out.println("¡Acertaste! ¡Obtuviste un punto!");
    } else {  
      System.out.println("Fallaste, pero no te preocupes, solo es la primera pregunta, ¡ánimo!");
    }
  }
}
