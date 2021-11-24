/**
 * Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 * aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 * final aparecerá el número de suspensos, el número de suficientes, el número
 * de bienes, etc
 *
 * @author Alberto Moreno Gonzalez
 */
public class Tema06Ejercicio11AlbertoM { 
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE MUESTRA 20 NOTAS AL AZAR");
    System.out.println("--------------------------------------");
    System.out.println(" ");
    
    int contadorSuspensos = 0;
    int contadorSuficientes = 0;
    int contadorBienes = 0;
    int contadorNotables = 0;
    int contadorSobresalientes = 0;

    for (int numNotas = 0; numNotas < 20; numNotas++) {
      int calificacion = ((int)(Math.random() * 11));
      String nota = " ";

      switch (calificacion) {
        case 0:
          nota = "Suspenso";
          contadorSuspensos++;
          break;
        case 1: 
          nota = "Suspenso";
          contadorSuspensos++;
          break;
        case 2:
          nota = "Suspenso";
          contadorSuspensos++;
          break;
        case 3:
          nota = "Suspenso";
          contadorSuspensos++;
          break;
        case 4: 
          nota = "Suspenso";
          contadorSuspensos++;
          break;
        case 5:
          nota = "Suficiente";
          contadorSuficientes++;
          break;
        case 6: 
          nota = "Bien";
          contadorBienes++;
          break;
        case 7:
          nota = "Notable";
          contadorNotables++;
          break;
        case 8: 
          nota = "Notable";
          contadorNotables++;
          break;
        case 9: 
          nota = "Sobresaliente";
          contadorSobresalientes++;
          break;
        case 10:
          nota = "Sobresaliente";
          contadorSobresalientes++;
          break;
        default:

      }
      
      System.out.print(nota + " ");
    }

    System.out.println(" ");
    System.out.println(" ");

    System.out.println("Han habido " + contadorSuspensos + " suspensos, " + contadorSuficientes + " suficientes, " + contadorBienes + " bienes, " + contadorNotables + " notables y " + contadorSobresalientes + " sobresalientes.");
  }
}


