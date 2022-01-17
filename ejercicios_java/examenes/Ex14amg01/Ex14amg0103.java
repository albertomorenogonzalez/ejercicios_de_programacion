/**
 * Primer examen de Programación del curso 2021/22
 * 
 * Una empresa textil que realiza polos personalizados para trabajadores, asociaciones y clubes
 * nos ha pedido hacer un programa que sea capaz de elaborar presupuestos. El precio de cada
 * polo depende de si se piden en blanco o en color, de la cantidad que se pida y del tipo de
 * técnica que se emplee para el logotipo, que puede ser serigrafía o bordado. En un
 * presupuesto no se mezclan distintos colores o técnicas. El pedido mínimo son 20 polos.
 * Suponemos que el usuario introduce correctamente todos los datos. En este ejercicio no hay
 * que comprobar la validez de los mismos. A la cantidad final hay que sumarle el IVA del 21%.
 *
 * @author Alberto Moreno González
 * 
 * 04/11/2021
 */
public class Ex14amg0103 {
  public static void main(String[] args) {
    System.out.println("PROGRAMA CAPAZ DE ELABORAR PRESUPUESTOS");
    System.out.println("----------------------------------------");
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca la cantidad de polos que desea: ");
    System.out.print("> ");
    int cantidadPolos = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("¿Los quiere blancos o de color?: ");
    System.out.println("1 - Blancos");
    System.out.println("2 - De color");
    System.out.print("> ");
    int color = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("¿Quiere el logotipo serigrafiado o bordado?");
    System.out.println("1 - Serigrafiado");
    System.out.println("2 - Bordado");
    System.out.print("> ");
    int logotipo = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    System.out.println(" ");
    
    double precioUdPolo = 0;
    double precioUdLogotipo = 0;
    double polosMasLogotipos = 0;
    double iva = (polosMasLogotipos * 0.21);
    double total = 0;
    
    System.out.println("EL POLO BONITO - PRESUPUESTO");
    
    System.out.printf("%-20s         %4d\n","Polo en color (unid.):" ,cantidadPolos);
    
    if (color == 1) {
      if ((cantidadPolos >= 20) && (cantidadPolos <= 39)) {
        precioUdPolo = 4.90;
      } else if ((cantidadPolos >= 40) && (cantidadPolos <= 99)) {
          precioUdPolo = 3.90;
      } else if (cantidadPolos >= 100) {
          precioUdPolo = 3.20;
      }
    } else if (color == 2) {
      if ((cantidadPolos >= 20) && (cantidadPolos <= 39)) {
        precioUdPolo = (4.90 + (4.90 * 0.2));
      } else if ((cantidadPolos >= 40) && (cantidadPolos <= 99)) {
          precioUdPolo = (3.90 + (3.90 * 0.2));
      } else if (cantidadPolos >= 100) {
          precioUdPolo = (3.20 + (3.20 * 0.2));
      }
    }
    
    System.out.printf("%-20s             %.2f %-1s\n","Precio Unitario:" ,precioUdPolo ,"€");
    
    double totalTextil = ((double)cantidadPolos * precioUdPolo);
    
    System.out.printf("%-20s           %.2f %-1s\n","Total Textil:" ,totalTextil ,"€");
    
    if (logotipo == 1) {
      if ((cantidadPolos >= 20) && (cantidadPolos <= 50)) {
        precioUdLogotipo = 2.00;
      } else if (cantidadPolos >=50) {
          precioUdLogotipo = 1.50;
      }
      
      System.out.printf("%-20s             %.2f %-1s\n","Serigrafía (c. u.):" ,precioUdLogotipo ,"€");
      
      double totalSerigrafia = ((double)cantidadPolos * precioUdLogotipo);
      
      System.out.printf("%-20s            %.2f %-1s\n","Total Serigrafía:" ,totalSerigrafia ,"€");
      
      polosMasLogotipos = (totalTextil + totalSerigrafia);
      
      System.out.printf("%-20s           %.2f %-1s\n","Polos Más Logotipos:" ,polosMasLogotipos ,"€");
      
    } else if (logotipo == 2) {
        if ((cantidadPolos >= 20) && (cantidadPolos <= 50)) {
          precioUdLogotipo = 3.00;
        } else if (cantidadPolos >=50) {
            precioUdLogotipo = 2.50;
        }
        
      System.out.printf("%-20s             %.2f %-1s\n","Bordado (c. u.):" ,precioUdLogotipo ,"€");
      
      double totalBordado = ((double)cantidadPolos * precioUdLogotipo);
      
      System.out.printf("%-20s           %.2f %-1s\n","Total Bordado:" ,totalBordado ,"€");
      
      polosMasLogotipos = (totalTextil + totalBordado);
      
      System.out.printf("%-20s           %.2f %-1s\n","Polos Más Logotipos:" ,polosMasLogotipos ,"€");
    }
    
    iva = (polosMasLogotipos * 0.21);
      
    System.out.printf("%-20s            %.2f %-1s\n","IVA:" ,iva ,"€");
      
    total = (polosMasLogotipos + iva);
      
    System.out.printf("%-20s           %.2f %-1s\n","Total:" ,total ,"€");
    
  }
}
