/**
 * Realiza un programa que calcule el precio de unas entradas de cine en función
 * del número de personas y del día de la semana. El precio base de una entrada
 * son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
 * jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
 * Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
 * grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
 * que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
 * 1 individual que son 41 euros (33 + 8).
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio26AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA EL PRECIO DE UNAS ENTRADAS DE CINE");
    System.out.println("--------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("CINECAMPA.COM");
    System.out.println("--------------");
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca que día es: ");
    System.out.print("> ");
    String diaSemana = (System.console().readLine().toLowerCase());
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca el número de entradas: ");
    System.out.print("> ");
    int numeroEntradas = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("¿Tiene tarjeta CineCampa? (s/n)");
    System.out.print("> ");
    String tarjeta = (System.console().readLine().toLowerCase());
    System.out.println(" ");
    
    double precioEntrada = ((double)numeroEntradas * 8);
    double precioEntradaMiercoles = ((double)numeroEntradas * 5);
    int numeroEntradasPareja = ((int)numeroEntradas / 2);
    int entradaIndJueves = (numeroEntradas % 2);
    double precioEntradaJueves = ((double)numeroEntradasPareja * 11);
    double descuentoTarjeta = (precioEntrada * 0.10);
    double precioDescontado = (precioEntrada - descuentoTarjeta);
    double precioDescontadoJueves = (precioEntradaJueves - descuentoTarjeta);
    double precioDescontadoJuevesInd = ((precioEntradaJueves + 8) - descuentoTarjeta);
        
    switch (diaSemana) { 
      case "lunes":
        System.out.println("¡Gracias por su compra! Aquí tiene su factura:");
        System.out.println(" ");
        
        System.out.printf("%-20s           %2d\n","Entradas Individuales:" ,numeroEntradas);
        System.out.println("Precio por entrada individual:  8.00 €");
        System.out.printf("%-20s           %.2f %-1s\n","Total:" ,precioEntrada ,"€");
        
        if ("s".equals(tarjeta)) {
          System.out.printf("%-20s            %.2f %-1s\n","Descuento:" ,descuentoTarjeta ,"€");
          System.out.printf("%-20s           %.2f %-1s\n","A pagar" ,precioDescontado ,"€");
        } else if ("n".equals(tarjeta)) {
            System.out.printf("%-20s            %.2f %-1s\n","Descuento:" ,0.00 ,"€");
            System.out.printf("%-20s           %.2f %-1s\n","A pagar" ,precioEntrada ,"€");
        } 
      break;
      case "martes":
        System.out.println("¡Gracias por su compra! Aquí tiene su factura:");
        System.out.println(" ");
        
        System.out.printf("%-20s           %2d\n","Entradas Individuales:" ,numeroEntradas);
        System.out.println("Precio por entrada individual:  8.00 €");
        System.out.printf("%-20s           %.2f %-1s\n","Total:" ,precioEntrada ,"€");
        
        if ("s".equals(tarjeta)) {
          System.out.printf("%-20s            %.2f %-1s\n","Descuento:" ,descuentoTarjeta ,"€");
          System.out.printf("%-20s           %.2f %-1s\n","A pagar" ,precioDescontado ,"€");
        } else if ("n".equals(tarjeta)) {
            System.out.printf("%-20s            %.2f %-1s\n","Descuento:" ,0.00 ,"€");
            System.out.printf("%-20s           %.2f %-1s\n","A pagar" ,precioEntrada ,"€");
        } 
      break;
      case "miércoles":
        System.out.println("¡Gracias por su compra! Aquí tiene su factura:");
        System.out.println(" ");
        System.out.println("El miércoles es el día del espectador, las entradas están a 5€.");
        System.out.println(" ");
        
        System.out.printf("%-20s           %2d\n","Entradas Individuales:" ,numeroEntradas);
        System.out.println("Precio por entrada individual:  8.00 €");
        System.out.printf("%-20s           %.2f %-1s\n","Total:" ,precioEntradaMiercoles ,"€");
        
        if ("s".equals(tarjeta)) {
          System.out.printf("%-20s            %.2f %-1s\n","Descuento:" ,descuentoTarjeta ,"€");
          System.out.printf("%-20s           %.2f %-1s\n","A pagar" ,precioDescontado ,"€");
        } else if ("n".equals(tarjeta)) {
            System.out.printf("%-20s            %.2f %-1s\n","Descuento:" ,0.00 ,"€");
            System.out.printf("%-20s           %.2f %-1s\n","A pagar" ,precioEntradaMiercoles ,"€");
        } 
      break;
      case "jueves":
        System.out.println("¡Gracias por su compra! Aquí tiene su factura:");
        System.out.println(" ");
        System.out.println("El jueves las entradas de pareja están a 11 €.");
        System.out.println(" ");
        
        System.out.printf("%-20s           %2d\n","Entradas de Pareja:" ,numeroEntradasPareja);
        System.out.println("Precio por entrada de pareja:  11.00 €");
        
        if (entradaIndJueves == 1) {
          System.out.printf("%-20s           %2d\n","Entradas Individuales:" ,entradaIndJueves);
          System.out.println("Precio por entrada individual:  8.00 €");
          System.out.printf("%-20s           %.2f %-1s\n","Total:" ,(precioEntradaJueves + 8)   ,"€");
          if ("s".equals(tarjeta)) {
            System.out.printf("%-20s            %.2f %-1s\n","Descuento:" ,descuentoTarjeta ,"€");
            System.out.printf("%-20s           %.2f %-1s\n","A pagar" ,precioDescontadoJuevesInd ,"€");
          } else if ("n".equals(tarjeta)) {
              System.out.printf("%-20s            %.2f %-1s\n","Descuento:" ,0.00 ,"€");
              System.out.printf("%-20s           %.2f %-1s\n","A pagar" ,(precioEntradaJueves + 8) ,"€");
          } 
        } else {
            System.out.printf("%-20s           %.2f %-1s\n","Total:" ,precioEntradaJueves   ,"€");
            if ("s".equals(tarjeta)) {
            System.out.printf("%-20s            %.2f %-1s\n","Descuento:" ,descuentoTarjeta ,"€");
            System.out.printf("%-20s           %.2f %-1s\n","A pagar" ,precioDescontadoJueves ,"€");
            } else if ("n".equals(tarjeta)) {
              System.out.printf("%-20s            %.2f %-1s\n","Descuento:" ,0.00 ,"€");
              System.out.printf("%-20s           %.2f %-1s\n","A pagar" ,precioEntradaJueves ,"€");
            }
        }
      break;
      case "viernes":
        System.out.println("¡Gracias por su compra! Aquí tiene su factura:");
        System.out.println(" ");
        
        System.out.printf("%-20s           %2d\n","Entradas Individuales:" ,numeroEntradas);
        System.out.println("Precio por entrada individual:  8.00 €");
        System.out.printf("%-20s           %.2f %-1s\n","Total:" ,precioEntrada ,"€");
        
        if ("s".equals(tarjeta)) {
          System.out.printf("%-20s            %.2f %-1s\n","Descuento:" ,descuentoTarjeta ,"€");
          System.out.printf("%-20s           %.2f %-1s\n","A pagar" ,precioDescontado ,"€");
        } else if ("n".equals(tarjeta)) {
            System.out.printf("%-20s            %.2f %-1s\n","Descuento:" ,0.00 ,"€");
            System.out.printf("%-20s           %.2f %-1s\n","A pagar" ,precioEntrada ,"€");
        } 
      break;
      case "sábado":
        System.out.println("¡Gracias por su compra! Aquí tiene su factura:");
        System.out.println(" ");
        
        System.out.printf("%-20s           %2d\n","Entradas Individuales:" ,numeroEntradas);
        System.out.println("Precio por entrada individual:  8.00 €");
        System.out.printf("%-20s           %.2f %-1s\n","Total:" ,precioEntrada ,"€");
        
        if ("s".equals(tarjeta)) {
          System.out.printf("%-20s            %.2f %-1s\n","Descuento:" ,descuentoTarjeta ,"€");
          System.out.printf("%-20s           %.2f %-1s\n","A pagar" ,precioDescontado ,"€");
        } else if ("n".equals(tarjeta)) {
            System.out.printf("%-20s            %.2f %-1s\n","Descuento:" ,0.00 ,"€");
            System.out.printf("%-20s           %.2f %-1s\n","A pagar" ,precioEntrada ,"€");
        } 
      break;
      case "domingo":
        System.out.println("¡Gracias por su compra! Aquí tiene su factura:");
        System.out.println(" ");
        
        System.out.printf("%-20s           %2d\n","Entradas Individuales:" ,numeroEntradas);
        System.out.println("Precio por entrada individual:  8.00 €");
        System.out.printf("%-20s           %.2f %-1s\n","Total:" ,precioEntrada ,"€");
        
        if ("s".equals(tarjeta)) {
          System.out.printf("%-20s            %.2f %-1s\n","Descuento:" ,descuentoTarjeta ,"€");
          System.out.printf("%-20s           %.2f %-1s\n","A pagar" ,precioDescontado ,"€");
        } else if ("n".equals(tarjeta)) {
            System.out.printf("%-20s            %.2f %-1s\n","Descuento:" ,0.00 ,"€");
            System.out.printf("%-20s           %.2f %-1s\n","A pagar" ,precioEntrada ,"€");
        } 
      break;
      default:
        System.out.println("Por favor, introduzca que día es.");
    }
    
  }
}
