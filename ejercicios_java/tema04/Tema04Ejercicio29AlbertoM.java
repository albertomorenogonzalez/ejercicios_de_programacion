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
    
    double precioComida = 0;
    String bebida;
    double precioBebida = 0;
    
    switch (comida) {
      case "palmera":
        precioComida = 1.40;
      
        System.out.println("¿Qué ha tomado de beber? (zumo o café):");
        System.out.print("> ");
        bebida = (System.console().readLine().toLowerCase());
        System.out.println(" ");
        
        System.out.printf("%-20s            %.2f %-1s\n","Palmera:" ,precioComida ,"€");
        
        if ("zumo".equals(bebida)) {
            precioBebida = 1.50;
            
            System.out.printf("%-20s            %.2f %-1s\n","Zumo:" ,precioBebida ,"€");
        } else if ("café".equals(bebida)) {
             precioBebida = 1.20;
            
            System.out.printf("%-20s            %.2f %-1s\n","Café:" ,precioBebida,"€");
        } else {
            System.out.println("Introduzca correctamente los datos.");
        }
      
        System.out.printf("%-20s            %.2f %-1s\n","Total:" ,(precioComida + precioBebida) ,"€");
      break;
      case "donut":
        precioComida = 1.00;
      
        System.out.println("¿Qué ha tomado de beber? (zumo o café):");
        System.out.print("> ");
        bebida = (System.console().readLine().toLowerCase());
        System.out.println(" ");
        
        System.out.printf("%-20s            %.2f %-1s\n","Donut:" ,precioComida ,"€");
        
        if ("zumo".equals(bebida)) {
            precioBebida = 1.50;
            
            System.out.printf("%-20s            %.2f %-1s\n","Zumo:" ,precioBebida ,"€");
        } else if ("café".equals(bebida)) {
             precioBebida = 1.20;
            
            System.out.printf("%-20s            %.2f %-1s\n","Café:" ,precioBebida,"€");
        } else {
            System.out.println("Introduzca correctamente los datos.");
        }
      
        System.out.printf("%-20s            %.2f %-1s\n","Total:" ,(precioComida + precioBebida) ,"€");
      break;
      case "pitufo":
        System.out.println("¿De qué era el pitufo? (con aceite o de tortilla): ");
        System.out.print("> ");
        String tipoPitufo = (System.console().readLine().toLowerCase());
        System.out.println(" ");
        
        if ("con aceite".equals(tipoPitufo)) {
          precioComida = 1.20;
      
          System.out.println("¿Qué ha tomado de beber? (zumo o café):");
          System.out.print("> ");
          bebida = (System.console().readLine().toLowerCase());
          System.out.println(" ");
        
          System.out.printf("%-20s            %.2f %-1s\n","Pitufo con aceite:" ,precioComida ,"€");
        
          if ("zumo".equals(bebida)) {
            precioBebida = 1.50;
            
            System.out.printf("%-20s            %.2f %-1s\n","Zumo:" ,precioBebida ,"€");
          } else if ("café".equals(bebida)) {
              precioBebida = 1.20;
            
              System.out.printf("%-20s            %.2f %-1s\n","Café:" ,precioBebida,"€");
          } else {
              System.out.println("Introduzca correctamente los datos.");
          }
          
          System.out.printf("%-20s            %.2f %-1s\n","Total:" ,(precioComida + precioBebida) ,"€");
        } else if ("de tortilla".equals(tipoPitufo)) {
            precioComida = 1.60;
      
            System.out.println("¿Qué ha tomado de beber? (zumo o café):");
            System.out.print("> ");
            bebida = (System.console().readLine().toLowerCase());
            System.out.println(" ");
        
            System.out.printf("%-20s            %.2f %-1s\n","Pitufo de tortilla:" ,precioComida ,"€");
        
            if ("zumo".equals(bebida)) {
              precioBebida = 1.50;
            
              System.out.printf("%-20s            %.2f %-1s\n","Zumo:" ,precioBebida ,"€");
            } else if ("café".equals(bebida)) {
                precioBebida = 1.20;
            
                System.out.printf("%-20s            %.2f %-1s\n","Café:" ,precioBebida,"€");
            } else {
                System.out.println("Introduzca correctamente los datos.");
            }
            
          System.out.printf("%-20s            %.2f %-1s\n","Total:" ,(precioComida + precioBebida) ,"€");
          }
        break;
      default: 
        System.out.println("Introduzca correctamente los datos.");
    }
  }
}
