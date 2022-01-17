/**
 * Primer examen de Programación del curso 2021/22
 * 
 * Implementa un programa que calcule el número de latidos del corazón de una persona
 * durante el transcurso de varios años. Al usuario se le solicitará el tiempo transcurrido,
 * expresado en años, y el ritmo cardíaco medio durante todos esos años, medido en latidos por
 * minuto. No es necesario considerar los años bisiestos, se considera que todos los años tienen
 * 365 días.
 *
 * @author Alberto Moreno González
 * 
 * 04/11/2021
 */
public class Ex14amg0102 {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA EL NÚMERO DE LATIDOS DEL CORAZÓN DE UNA PERSONA DURANTE EL TRANSCURSO DE VARIOS AñOS");
    System.out.println("----------------------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca su ritmo cardíaco medio (en pulsaciones por minuto): ");
    System.out.print("> ");
    int ritmoCardiacoMedio = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca el tiempo (en años): ");
    System.out.print("> ");
    // int años = Integer.parseInt(System.console().readLine()); Hay que evitar las ñ y los caracteres especiales en los nombres de las variables
    int tiempo = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    //int añosAMinutos = (años * 365 * 24 * 60); Hay que evitar las ñ y los caracteres especiales en los nombres de las variables
    int tiempoAMinutos = (tiempo * 365 * 24 * 60);

    int latidos = (ritmoCardiacoMedio * tiempoAMinutos);
    
    System.out.println("En ese tiempo, su corazón habrá latido " + latidos + " veces.");
  }
}
