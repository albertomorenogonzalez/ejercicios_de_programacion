/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 * segundo examen un 60%.
 *
 * @author Alberto Moreno González
 */
public class Tema03Ejercicio12AlbertoM {
  public static void main(String[] args) {
    String number;
    
    System.out.println("Por favor, introduzca la nota obtenida en el primer examen: ");
    System.out.print("> ");
    number = System.console().readLine();
    double nota1;
    nota1 = Double.parseDouble( number );
    
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca la nota media deseada en el primer trimestre ");
    System.out.print("> ");
    number = System.console().readLine();
    double notaW;
    notaW = Double.parseDouble( number );
    
    System.out.println(" ");
    
    double valorNota1;
    valorNota1 = nota1 * 0.4;
    
    double notaN;
    notaN = ((notaW - valorNota1) / 0.6);
    
    System.out.print("Para sacar la nota que desea, necesitaría sacar en el segundo examen un ");
    System.out.printf("%.2f", notaN);
    System.out.println(".");
    
    // Nesitaría usar condicionales (aún no los hemos aprendido) para que en el 
    // caso de que aparezcan notas superiores a 10, el programa de un mensaje de 
    // que no puedes llegar a esa nota.
  }
}
