/**
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de
 * tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
 * manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
 * 16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
 * además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
 * segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
 * nombre; la nata suma 2.50 y la escritura del nombre 2.75.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio27AlbertoM {
  public static void main(String[] args) {
    System.out.println("PASTELERÍALAESQUINA.COM");
    System.out.println("------------------------");
    System.out.println(" ");
    
    System.out.println("Por favor, indique de que sabor quiere la tarta (manzana, fresa, chocolate): ");
    System.out.print("> ");
    String sabor = (System.console().readLine().toLowerCase());
    System.out.println(" ");
    
    double precioTarta = 0;
    
    switch (sabor) {
      case "manzana":
        precioTarta = 18.00;
      break;
      case "fresa":
        precioTarta = 16.00;
      break;
      case "chocolate":
        System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco):");
        System.out.print("> ");
        String tipoChocolate = (System.console().readLine().toLowerCase());
        System.out.println(" ");
        
        if ("negro".equals(tipoChocolate)) {
          precioTarta = 14.00;
        } else if ("blanco".equals(tipoChocolate)) {
            precioTarta = 15.00;
        }
      break;
      default:
        System.out.println("Introduzca correctamente los datos.");
    }
     
    System.out.println("¿Quiere nata? (si o no):");
    System.out.print("> ");
    String nata = (System.console().readLine().toLowerCase());
    System.out.println(" ");
    
    double precioNata = 0;
    
    System.out.println("¿Quiere ponerle nombre a la tarta? (si o no):");
    System.out.print("> ");
    String nombre = (System.console().readLine().toLowerCase());
    System.out.println(" ");
    System.out.println(" ");
    
    double precioNombre = 0;
    
    String tipoChocolate = " ";
    
    if ("negro".equals(tipoChocolate)) {
      System.out.printf("%-9s%-9s%-5s%-1s            %.2f %-1s\n","Tarta de " ,sabor ,tipoChocolate,":" ,precioTarta ,"€");
    } else if ("blanco".equals(tipoChocolate)) {
        System.out.printf("%-9s%-9s%-1s            %.2f %-1s\n","Tarta de " ,sabor ,tipoChocolate,":" ,precioTarta ,"€");
    } else {
        System.out.printf("%-9s%-9s%-1s            %.2f %-1s\n","Tarta de " ,sabor ,":" ,precioTarta ,"€");
    }
    
    if ("si".equals(nata)) {
      precioNata = 2.50;
      System.out.printf("%-20s            %.2f %-1s\n","Con Nata:" ,precioNata ,"€");
    } 
    
    if ("si".equals(nombre)) {
      precioNombre = 2.75;
      System.out.printf("%-20s            %.2f %-1s\n","Con Nombre:" ,precioNombre ,"€");
    } 
    
    System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(precioTarta + precioNata + precioNombre) ,"€");
  } 
}

/*/**
 * Una pastelería nos ha pedido realizar un programa que haga presupuestos de
 * tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
 * manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
 * 16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
 * además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
 * segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
 * nombre; la nata suma 2.50 y la escritura del nombre 2.75.
 *
 * @author Alberto Moreno González
 */
/*
public class Tema04Ejercicio27AlbertoM {
  public static void main(String[] args) {
    System.out.println("PASTELERÍALAESQUINA.COM");
    System.out.println("------------------------");
    System.out.println(" ");

    System.out.println("Por favor, indique de que sabor quiere la tarta (manzana, fresa, chocolate): ");
    System.out.print("> ");
    String sabor = (System.console().readLine().toLowerCase());
    System.out.println(" ");

    switch (sabor) {
      case "manzana":
        System.out.println("¿Quiere nata? (si o no):");
        System.out.print("> ");
        String nataManzana = (System.console().readLine().toLowerCase());
        System.out.println(" ");

        if ("si".equals(nataManzana)) {
          System.out.println("¿Quiere ponerle nombre a la tarta? (si o no):");
          System.out.print("> ");
          String nombreManzana = (System.console().readLine().toLowerCase());
          System.out.println(" ");

          if ("si".equals(nombreManzana)) {
            System.out.printf("%-20s           %.2f %-1s\n","Tarta de manzana:" ,18.00 ,"€");
            System.out.printf("%-20s            %.2f %-1s\n","Con Nata:" ,2.50 ,"€");
            System.out.printf("%-20s            %.2f %-1s\n","Con Nombre:" ,2.75 ,"€");
            System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(18 + 2.50 + 2.75) ,"€");
          } else if ("no".equals(nombreManzana)) {
              System.out.printf("%-20s           %.2f %-1s\n","Tarta de manzana:" ,18.00 ,"€");
              System.out.printf("%-20s            %.2f %-1s\n","Con Nata:" ,2.50 ,"€");
              System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(18 + 2.50) ,"€");
          } else {
              System.out.println("Introduzca correctamente los datos.");
          }
        } else if ("no".equals(nataManzana)) {
            System.out.println("¿Quiere ponerle nombre a la tarta? (si o no):");
            System.out.print("> ");
            String nombreManzana = (System.console().readLine().toLowerCase());
            System.out.println(" ");

            if ("si".equals(nombreManzana)) {
              System.out.printf("%-20s           %.2f %-1s\n","Tarta de manzana:" ,18.00 ,"€");
              System.out.printf("%-20s            %.2f %-1s\n","Con Nombre:" ,2.75 ,"€");
              System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(18 + 2.75) ,"€");
            } else if ("no".equals(nombreManzana)) {
                System.out.printf("%-20s           %.2f %-1s\n","Tarta de manzana:" ,18.00 ,"€");
                System.out.printf("%-20s           %.2f %-1s\n","Total:" ,18.00 ,"€");
            } else {
                System.out.println("Introduzca correctamente los datos.");
            } 
        } else { 
            System.out.println("Introduzca correctamente los datos.");
        } 
      break;
      case "fresa":
        System.out.println("¿Quiere nata? (si o no):");
        System.out.print("> ");
        String nataFresa = (System.console().readLine().toLowerCase());
        System.out.println(" ");

        if ("si".equals(nataFresa)) {
          System.out.println("¿Quiere ponerle nombre a la tarta? (si o no):");
          System.out.print("> ");
          String nombreFresa = (System.console().readLine().toLowerCase());
          System.out.println(" ");

          if ("si".equals(nombreFresa)) {
            System.out.printf("%-20s           %.2f %-1s\n","Tarta de fresa:" ,16.00 ,"€");
            System.out.printf("%-20s            %.2f %-1s\n","Con Nata:" ,2.50 ,"€");
            System.out.printf("%-20s            %.2f %-1s\n","Con Nombre:" ,2.75 ,"€");
            System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(16 + 2.50 + 2.75) ,"€");
          } else if ("no".equals(nombreFresa)) {
              System.out.printf("%-20s           %.2f %-1s\n","Tarta de fresa:" ,16.00 ,"€");
              System.out.printf("%-20s            %.2f %-1s\n","Con Nata:" ,2.50 ,"€");
              System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(16 + 2.50) ,"€");
          } else {
              System.out.println("Introduzca correctamente los datos.");
          }
        } else if ("no".equals(nataFresa)) {
            System.out.println("¿Quiere ponerle nombre a la tarta? (si o no):");
            System.out.print("> ");
            String nombreFresa = (System.console().readLine().toLowerCase());
            System.out.println(" ");

            if ("si".equals(nombreFresa)) {
              System.out.printf("%-20s           %.2f %-1s\n","Tarta de fresa:" ,16.00 ,"€");
              System.out.printf("%-20s            %.2f %-1s\n","Con Nombre:" ,2.75 ,"€");
              System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(16 + 2.75) ,"€");
            } else if ("no".equals(nombreFresa)) {
                System.out.printf("%-20s           %.2f %-1s\n","Tarta de fresa:" ,16.00 ,"€");
                System.out.printf("%-20s           %.2f %-1s\n","Total:" ,16.00 ,"€");
            } else {
                System.out.println("Introduzca correctamente los datos.");
            } 
        } else { 
            System.out.println("Introduzca correctamente los datos.");
        } 
      break;
      case "chocolate":
        System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco):");
        System.out.print("> ");
        String tipoChocolate = (System.console().readLine().toLowerCase());
        System.out.println(" ");

        if ("negro".equals(tipoChocolate)) {
          System.out.println("¿Quiere nata? (si o no):");
          System.out.print("> ");
          String nataChocolateNegro = (System.console().readLine().toLowerCase());
          System.out.println(" ");

          if ("si".equals(nataChocolateNegro)) {
            System.out.println("¿Quiere ponerle nombre a la tarta? (si o no):");
            System.out.print("> ");
            String nombreChocolateNegro = (System.console().readLine().toLowerCase());
            System.out.println(" ");

            if ("si".equals(nombreChocolateNegro)) {
              System.out.printf("%-20s      %.2f %-1s\n","Tarta de chocolate negro:" ,14.00 ,"€");
              System.out.printf("%-20s            %.2f %-1s\n","Con Nata:" ,2.50 ,"€");
              System.out.printf("%-20s            %.2f %-1s\n","Con Nombre:" ,2.75 ,"€");
              System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(14 + 2.50 + 2.75) ,"€");
            } else if ("no".equals(nombreChocolateNegro)) {
                System.out.printf("%-20s      %.2f %-1s\n","Tarta de chocolate negro:" ,14.00 ,"€");
                System.out.printf("%-20s            %.2f %-1s\n","Con Nata:" ,2.50 ,"€");
                System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(14 + 2.50) ,"€");
            } else {
                System.out.println("Introduzca correctamente los datos.");
            }
          } else if ("no".equals(nataChocolateNegro)) {
              System.out.println("¿Quiere ponerle nombre a la tarta? (si o no):");
              System.out.print("> ");
              String nombreChocolateNegro = (System.console().readLine().toLowerCase());
              System.out.println(" ");

              if ("si".equals(nombreChocolateNegro)) {
                System.out.printf("%-20s      %.2f %-1s\n","Tarta de chocolate negro:" ,14.00 ,"€");
                System.out.printf("%-20s            %.2f %-1s\n","Con Nombre:" ,2.75 ,"€");
                System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(14 + 2.75) ,"€");
              } else if ("no".equals(nombreChocolateNegro)) {
                  System.out.printf("%-20s      %.2f %-1s\n","Tarta de chocolate negro:" ,14.00 ,"€");
                  System.out.printf("%-20s           %.2f %-1s\n","Total:" ,14.00 ,"€");
              } else {
                  System.out.println("Introduzca correctamente los datos.");
              } 
          } else { 
              System.out.println("Introduzca correctamente los datos.");
          }
        } else if ("blanco".equals(tipoChocolate)) {
            System.out.println("¿Quiere nata? (si o no):");
            System.out.print("> ");
            String nataChocolateBlanco = (System.console().readLine().toLowerCase());
            System.out.println(" ");

            if ("si".equals(nataChocolateBlanco)) {
              System.out.println("¿Quiere ponerle nombre a la tarta? (si o no):");
              System.out.print("> ");
              String nombreChocolateBlanco = (System.console().readLine().toLowerCase());
              System.out.println(" ");

              if ("si".equals(nombreChocolateBlanco)) {
                System.out.printf("%-20s      %.2f %-1s\n","Tarta de chocolate blanco:" ,15.00 ,"€");
                System.out.printf("%-20s            %.2f %-1s\n","Con Nata:" ,2.50 ,"€");
                System.out.printf("%-20s            %.2f %-1s\n","Con Nombre:" ,2.75 ,"€");
                System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(15 + 2.50 + 2.75) ,"€");
              } else if ("no".equals(nombreChocolateBlanco)) {
                  System.out.printf("%-20s      %.2f %-1s\n","Tarta de chccolate blanco:" ,15.00 ,"€");
                  System.out.printf("%-20s            %.2f %-1s\n","Con Nata:" ,2.50 ,"€");
                  System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(15 + 2.50) ,"€");
              } else {
                  System.out.println("Introduzca correctamente los datos.");
              }
            } else if ("no".equals(nataChocolateBlanco)) {
                System.out.println("¿Quiere ponerle nombre a la tarta? (si o no):");
                System.out.print("> ");
                String nombreChocolateBlanco = (System.console().readLine().toLowerCase());
                System.out.println(" ");

                if ("si".equals(nombreChocolateBlanco)) {
                  System.out.printf("%-20s     %.2f %-1s\n","Tarta de chocolate blanco:" ,15.00 ,"€");
                  System.out.printf("%-20s            %.2f %-1s\n","Con Nombre:" ,2.75 ,"€");
                  System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(15 + 2.75) ,"€");
                } else if ("no".equals(nombreChocolateBlanco)) {
                    System.out.printf("%-20s      %.2f %-1s\n","Tarta de chocolate blanco:" ,15.00 ,"€");
                    System.out.printf("%-20s           %.2f %-1s\n","Total:" ,15.00 ,"€");
                } else {
                    System.out.println("Introduzca correctamente los datos.");
                } 
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
}*/
