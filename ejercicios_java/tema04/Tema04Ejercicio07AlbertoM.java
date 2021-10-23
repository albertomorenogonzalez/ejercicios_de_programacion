/**
 * Realiza un programa que calcule la media de tres notas.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio07AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA LA MEDIA DE TRES NOTAS");
    System.out.println("--------------------------------------------");
    System.out.println(" ");
  
    System.out.println("Por favor, introduzca la primera nota: ");
    System.out.print("> ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca la segunda nota: ");
    System.out.print("> ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca la tercera nota: ");
    System.out.print("> ");
    double nota3 = Double.parseDouble(System.console().readLine());
    System.out.println(" ");
    
    double sumatorionota123 = (nota1 + nota2 + nota3);
    
    double media = (sumatorionota123 / 3);
    
    if ((nota1>=0) && (nota2>=0) && (nota3>=0)) {
      if ((media>=0) && (media<5)) {
      System.out.print("El alumno ha sacado una media de ");
      System.out.printf("%.2f" ,media);
      System.out.println(", por lo tanto, ha suspendido.");
      } else if ((media>=5) && (media<=10)) {
        System.out.print("El alumno ha sacado una media de ");
        System.out.printf("%.2f" ,media);
        System.out.print(".");
        if ((media>=9) && (media<=10)) {
          System.out.println(" ¡Enhorabuena!");
        }
      } else {
        System.out.println("Ha habido un error, reinicie el programa.");
      }
    } else {
      System.out.println("Ha habido un error, reinicie el programa.");
    }
  }
}
