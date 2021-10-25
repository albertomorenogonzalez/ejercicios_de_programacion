/**
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente,
 * suficiente, bien, notable o sobresaliente).
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio08AlbertoM {
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
    
    double sumatorioNota123 = (nota1 + nota2 + nota3);
    
    double media = (sumatorioNota123 / 3);
    
    if ((nota1>=0) && (nota2>=0) && (nota3>=0) && (nota1<=10) && (nota2<=10) && (nota3<=10)) {
      if ((media>=0) && (media<5)) {
      System.out.print("El alumno ha sacado una media de ");
      System.out.printf("%.2f" ,media);
      System.out.println(", un insuficiente, por lo tanto, ha suspendido.");
      } else if ((media>=5) && (media<=10)) {
        System.out.print("El alumno ha sacado una media de ");
        System.out.printf("%.2f" ,media);
        System.out.print(".");
        if ((media>=5) && (media<6)) {
          System.out.println(" Un suficente, ha aprobado.");
        }
        if ((media>=6) && (media<7)) {
          System.out.println(" Un bien.");
        }
        if ((media>=7) && (media<9)) {
          System.out.println(" Un notable, ¡bien!");
        }
        if ((media>=9) && (media<=10)) {
          System.out.println(" Un sobresaliente, ¡enhorabuena!");
        }
      } else {
        System.out.println("Ha habido un error, reinicie el programa.");
      }
    } else {
      System.out.println("Ha habido un error, reinicie el programa.");
    }
  }
}
