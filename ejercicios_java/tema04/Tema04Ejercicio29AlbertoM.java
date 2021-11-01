/**
 * Realiza un programa que calcule el precio de un desayuno. El programa
 * preguntará primero qué ha tomado el usuario de comer: palmera, donut o
 * pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
 * programa debe preguntar además si era con aceite o con tortilla; el primero
 * vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
 * café a 1’50 y 1’20 respectivamente.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio29AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA EL PRECIO DE UN DESAYUNO");
    System.out.println("----------------------------------------------");
    System.out.println(" ");
    
    System.out.println("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    System.out.print("> ");
    String comida = (System.console().readLine().toLowerCase());
    System.out.println(" ");
    
    switch (comida) {
      case "palmera":
        System.out.println("¿Qué ha tomado de beber? (zumo o café):");
        System.out.print("> ");
        String bebida1 = (System.console().readLine().toLowerCase());
        System.out.println(" ");
        
        if ("zumo".equals(bebida1)) {
            System.out.printf("%-20s            %.2f %-1s\n","Palmera:" ,1.40 ,"€");
            System.out.printf("%-20s            %.2f %-1s\n","Zumo:" ,1.50 ,"€");
            System.out.printf("%-20s            %.2f %-1s\n","Total:" ,(1.40 + 1.50) ,"€");
        } else if ("café".equals(bebida1)) {
            System.out.printf("%-20s            %.2f %-1s\n","Palmera:" ,1.40 ,"€");
            System.out.printf("%-20s            %.2f %-1s\n","Café:" ,1.20 ,"€");
            System.out.printf("%-20s            %.2f %-1s\n","Total:" ,(1.40 + 1.20) ,"€");
        } else {
            System.out.println("Introduzca correctamente los datos.");
        }
      break;
      case "donut":
        System.out.println("¿Qué ha tomado de beber? (zumo o café):");
        System.out.print("> ");
        String bebida2 = (System.console().readLine().toLowerCase());
        System.out.println(" ");
        
        if ("zumo".equals(bebida2)) {
            System.out.printf("%-20s            %.2f %-1s\n","Donut:" ,1.00 ,"€");
            System.out.printf("%-20s            %.2f %-1s\n","Zumo:" ,1.50 ,"€");
            System.out.printf("%-20s            %.2f %-1s\n","Total:" ,(1.00 + 1.50) ,"€");
        } else if ("café".equals(bebida2)) {
            System.out.printf("%-20s            %.2f %-1s\n","Donut:" ,1.00 ,"€");
            System.out.printf("%-20s            %.2f %-1s\n","Café:" ,1.20 ,"€");
            System.out.printf("%-20s            %.2f %-1s\n","Total:" ,(1.00 + 1.20) ,"€");
        } else {
            System.out.println("Introduzca correctamente los datos.");
        }
      break;
      case "pitufo":
        System.out.println("¿De qué era el pitufo? (con aceite o de tortilla): ");
        System.out.print("> ");
        String tipoPitufo = (System.console().readLine().toLowerCase());
        System.out.println(" ");
        
        if ("con aceite".equals(tipoPitufo)) {
          System.out.println("¿Qué ha tomado de beber? (zumo o café):");
          System.out.print("> ");
          String bebida3 = (System.console().readLine().toLowerCase());
          System.out.println(" ");
        
          if ("zumo".equals(bebida3)) {
            System.out.printf("%-20s            %.2f %-1s\n","Pitufo con aceite:" ,1.20 ,"€");
            System.out.printf("%-20s            %.2f %-1s\n","Zumo:" ,1.50 ,"€");
            System.out.printf("%-20s            %.2f %-1s\n","Total:" ,(1.20 + 1.50) ,"€");
          } else if ("café".equals(bebida3)) {
              System.out.printf("%-20s            %.2f %-1s\n","Pitufo con aceite:" ,1.00 ,"€");
              System.out.printf("%-20s            %.2f %-1s\n","Café:" ,1.20 ,"€");
              System.out.printf("%-20s            %.2f %-1s\n","Total:" ,(1.20 + 1.20) ,"€");
          } else {
              System.out.println("Introduzca correctamente los datos.");
          }
        } else if ("de tortilla".equals(tipoPitufo)) {
            System.out.println("¿Qué ha tomado de beber? (zumo o café):");
            System.out.print("> ");
            String bebida4 = (System.console().readLine().toLowerCase());
            System.out.println(" ");
        
            if ("zumo".equals(bebida4)) {
              System.out.printf("%-20s            %.2f %-1s\n","Pitufo de tortilla:" ,1.60 ,"€");
              System.out.printf("%-20s            %.2f %-1s\n","Zumo:" ,1.50 ,"€");
              System.out.printf("%-20s            %.2f %-1s\n","Total:" ,(1.60 + 1.50) ,"€");
            } else if ("café".equals(bebida4)) {
                System.out.printf("%-20s            %.2f %-1s\n","Pitufo de tortilla:" ,1.60 ,"€");
                System.out.printf("%-20s            %.2f %-1s\n","Café:" ,1.20 ,"€");
                System.out.printf("%-20s            %.2f %-1s\n","Total:" ,(1.60 + 1.20) ,"€");
            } else {
                System.out.println("Introduzca correctamente los datos.");
            }
        } else { 
            System.out.println("Introduzca correctamente los datos.");
        }
        break;
      default: 
        System.out.println("Introduzca correctamente los datos.");
    }
  }
}
