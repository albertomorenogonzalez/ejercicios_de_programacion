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
    
    System.out.println("1ª pregunta (Programación): ");
    System.out.println("¿Qué sentencia de java sirve para mostrar una cadena de caracteres por pantalla y aplicar al mismo tiempo un salto de línea?");
    System.out.println("a. System.out.pintf();");
    System.out.println("b. System.out.pintln();");
    System.out.println("c. System.out.pint();");
    System.out.println(" ");
    System.out.println("(Deberás introducir la respuesta en minúscula)");
    System.out.println(" ");
    System.out.print("> ");
    String solucion1 = System.console().readLine();
    System.out.println(" ");
    
    int puntos = 0;
    
    if ("b".equals(solucion1)) {
      System.out.println("¡Acertaste! ¡Obtuviste un punto!");
      puntos++;
    } else {  
      System.out.println("Fallaste, pero no te preocupes, solo es la primera pregunta, ¡ánimo!");
    }
    
    System.out.println(" ");
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    System.out.println(" ");
    
    System.out.println("2ª pregunta (Entornos de Desarrollo): ");
    System.out.println("¿Cómo se llama el traductor que traduce los programas línea a línea a código máquina?");
    System.out.println("a. Compilador");
    System.out.println("b. Intérprete");
    System.out.println("c. Bytecode");
    System.out.println(" ");
    System.out.print("> ");
    String solucion2 = System.console().readLine();
    System.out.println(" ");
    
    if ("b".equals(solucion2)) {
      System.out.println("¡Acertaste! ¡Obtuviste un punto!");
      puntos++;
    } else {  
      System.out.println("Fallaste, no te desanimes, ¡ánimo!");
    }
    
    System.out.println(" ");
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    System.out.println(" ");
    
    System.out.println("3ª pregunta (Lenguajes de Marcas): ");
    System.out.println("¿De qué formas puedes añadir etiquetas CSS a una página HTML?");
    System.out.println("a. Solo a través de en una hoja de estilos aparte");
    System.out.println("b. De tres, en una hoja de estilos aparte, en una etiqueta <style> dentro de <head> o dentro de la etiqueta donde queremos aplicar el estilo.");
    System.out.println("c. De dos, en una hoja de estilos aparte o en una etiqueta <style> dentro de <head>");
    System.out.println(" ");
    System.out.print("> ");
    String solucion3 = System.console().readLine();
    System.out.println(" ");
    
    if ("b".equals(solucion3)) {
      System.out.println("¡Acertaste! ¡Obtuviste un punto!");
      puntos++;
    } else {  
      System.out.println("Fallaste, no te desanimes, ¡ánimo!");
    }
    
    System.out.println(" ");
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    System.out.println(" ");
    
    System.out.println("4ª pregunta (Bases de Datos): ");
    System.out.println("¿Cuáles son los tres pasos para diseñar una base de datos?");
    System.out.println("a. Diseño Conceptual, Diseño Lógico y Diseño Físico.");
    System.out.println("b. Diseño Conceptual, Diseño Lógico y Diseño de Código.");
    System.out.println("c. Diseño Esquemático, Diseño en SGBD y Diseño Físico.");
    System.out.println(" ");
    System.out.print("> ");
    String solucion4 = System.console().readLine();
    System.out.println(" ");
    
    if ("a".equals(solucion4)) {
      System.out.println("¡Acertaste! ¡Obtuviste un punto!");
      puntos++;
    } else {  
      System.out.println("Fallaste, no te desanimes, ¡ánimo!");
    }
    
    System.out.println(" ");
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    System.out.println(" ");
    
    System.out.println("5ª pregunta (Sistemas Informáticos): ");
    System.out.println("¿Qué es una GPU?");
    System.out.println("a. Un procesador de última generación.");
    System.out.println("b. Un componente de la CPU que srive para hacer operaciones con decimales.");
    System.out.println("c. Un coprocesador  dedicado al rpocesamiento de gráficos para aligerar la carga de la CPU al ejecutar videojuegos o aplicaciones 3D");
    System.out.println(" ");
    System.out.print("> ");
    String solucion5 = System.console().readLine();
    System.out.println(" ");
    
    if ("c".equals(solucion5)) {
      System.out.println("¡Acertaste! ¡Obtuviste un punto!");
      puntos++;
    } else {  
      System.out.println("Fallaste, no te desanimes, ¡ánimo!");
    }
    
    System.out.println(" ");
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    System.out.println(" ");
    
    System.out.println("6ª pregunta (FOL): ");
    System.out.println("¿Qué factor de riesgo supone la tarea monótona de sellar décimos de lotería durante cuatro horas seguidas?");
    System.out.println("a. Condiciones psicosociales, organización del trabajo.");
    System.out.println("b. Condiciones ergonómicas, carga mental.");
    System.out.println("c. Condiciones psicosociales, caracteristicas personales.");
    System.out.println(" ");
    System.out.print("> ");
    String solucion6 = System.console().readLine();
    System.out.println(" ");
    
    if ("b".equals(solucion6)) {
      System.out.println("¡Acertaste! ¡Obtuviste un punto!");
      puntos++;
    } else {  
      System.out.println("Fallaste, no te desanimes, ¡ánimo!");
    }
    
    System.out.println(" ");
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    System.out.println(" ");
    
    System.out.println("7ª pregunta (Programación): ");
    System.out.println("¿Qué permite la sentencia if?");
    System.out.println("a. La ejecución de una serie de instrucciones en función del resultado de una expresión lógica.");
    System.out.println("b. Almacenar números con variables.");
    System.out.println("c. Ejecutar un programa dependiendo de sus carcterísticas.");
    System.out.println(" ");
    System.out.print("> ");
    String solucion7 = System.console().readLine();
    System.out.println(" ");
    
    if ("a".equals(solucion7)) {
      System.out.println("¡Acertaste! ¡Obtuviste un punto!");
      puntos++;
    } else {  
      System.out.println("Fallaste, lástima...");
    }
    
    System.out.println(" ");
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    System.out.println(" ");
    
    System.out.println("8ª pregunta (Entornos de Desarrollo): ");
    System.out.println("¿A que qué área de conocieminto del SWEEBOK corresponden las necesidades y restricciones que debe satisfacer un producto para contribuir a la solución de un problema real?");
    System.out.println("a. Pruebas de Software.");
    System.out.println("b. Diseño.");
    System.out.println("c. Requerimientos.");
    System.out.println(" ");
    System.out.print("> ");
    String solucion8 = System.console().readLine();
    System.out.println(" ");
    
    if ("c".equals(solucion8)) {
      System.out.println("¡Acertaste! ¡Obtuviste un punto!");
      puntos++;
    } else {  
      System.out.println("Fallaste, lástima...");
    }
    
    System.out.println(" ");
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    System.out.println(" ");
    
    System.out.println("9ª pregunta (Lenguajes de Marcas): ");
    System.out.println("¿Qué etiqueta de HTML sirve para marcar un párrafo?");
    System.out.println("a. <p>");
    System.out.println("b. <h1>");
    System.out.println("c. <body>");
    System.out.println(" ");
    System.out.print("> ");
    String solucion9 = System.console().readLine();
    System.out.println(" ");
    
    if ("a".equals(solucion9)) {
      System.out.println("¡Acertaste! ¡Obtuviste un punto!");
      puntos++;
    } else {  
      System.out.println("Fallaste, lástima...");
    }
    
    System.out.println(" ");
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    System.out.println(" ");
    
    System.out.println("10ª pregunta (Bases de Datos): ");
    System.out.println("¿En qué organización de ficheros estos están ocupando posiciones consecutivas de memoria y solo se pueden acceder a ellos a partir del primero de uno en uno?");
    System.out.println("a. Organización Secuencial Indexada");
    System.out.println("b. Organización Secuencial");
    System.out.println("c. Organización Directa o Aleatoria");
    System.out.println(" ");
    System.out.print("> ");
    String solucion10 = System.console().readLine();
    System.out.println(" ");
    
    if ("b".equals(solucion10)) {
      System.out.println("¡Acertaste! ¡Obtuviste un punto!");
      puntos++;
    } else {  
      System.out.println("Fallaste, lástima...");
    }
    
    System.out.println(" ");
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    System.out.println(" ");
    
    System.out.println(" ");
    
    System.out.println(" ");
    System.out.print("Tu puntuación final ha sido de ");
    System.out.print(puntos);
    System.out.print(" puntos de 10 posibles.");
    
    if (puntos == 10) {
      System.out.println(" ¡Enhorabuena!");
    }
  }
}


