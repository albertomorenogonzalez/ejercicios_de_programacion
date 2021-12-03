/**
 * Escribe un programa que pinte por pantalla un rectángulo hueco de 6 caracteres 
 * de ancho por 3 de alto y, a continuación, un menú que permita agrandarlo,
 * achicarlo o cambiar su orientación. Cada vez que el rectángulo se agranda,
 * se incrementa en 1 tanto su anchura como su altura. Cuando se achica,
 * se decrementa en 1 su anchura y altura. Por último, cuando se cambia la
 * orientación, los valores de anchura y altura se intercambian. El valor mínimo
 * de la altura o la anchura es 2.
 *
 * @author Alberto Moreno González
 */
public class Tema05Ejercicio64AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE PINTA POR PANTALLA UN RECTÁNGULO QUE PUEDES MODIFICAR");
    System.out.println("-------------------------------------------------------------------");
    System.out.println(" ");

    int anchura = 6;
    int altura = 3;

    int linea = 1;
    int opcion = 1;
    
    while (((opcion > 0) && (opcion < 4)) && ((altura >= 2) || (anchura >= 2))) {
      while (linea <= altura) {
        for (int longLinea = 1; longLinea <= anchura; longLinea++) {
          if ((linea == 1) || (linea == altura)) {
            System.out.print("*");
          } else {
              if ((longLinea == 1) || (longLinea == anchura)) {
                System.out.print("*");
              } else {
                System.out.print(" ");
              }
          }
        }
        
        System.out.println(" ");
        
        linea++;
      }

      int anchuraParaVoltear = anchura;
      int alturaParaVoltear = altura;

      linea = 1;

      System.out.println(" ");
      System.out.println("1. Agrandarlo");
      System.out.println("2. Achicarlo");
      System.out.println("3. Cambiar la orientación");
      System.out.println("4. Salir");
      System.out.println(" ");
      System.out.println("Indique qué quiere hacer con el rectángulo:");
      System.out.print("> ");
      opcion = Integer.parseInt(System.console().readLine());
      System.out.println(" ");

      switch (opcion) {
        case 1:
          altura++;
          anchura++;
          break;
        case 2:
          altura--;
          anchura--;
          break;
        case 3:
          altura = anchuraParaVoltear;
          anchura = alturaParaVoltear;
          break;
        default:
        
      }
    }
  }
}