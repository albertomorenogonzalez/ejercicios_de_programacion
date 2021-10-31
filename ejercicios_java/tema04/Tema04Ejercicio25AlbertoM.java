/**
 * La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
 * máxima calidad y nos ha pedido hacer un configurador que calcule el precio
 * según el alto y el ancho. El precio base de una bandera es de un céntimo de
 * euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
 * se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
 * son 3.25 €. El IVA ya está incluido en todas las tarifas.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio25AlbertoM {
  public static void main(String[] args) {
    System.out.println("BANDERADEESPAÑA.ES");
    System.out.println("-------------------");
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca la altura de la bandera (en cm): ");
    System.out.print("> ");
    double alturaBandera = Double.parseDouble(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca la altura de la bandera (en cm): ");
    System.out.print("> ");
    double anchuraBandera = Double.parseDouble(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("¿Quiere escudo bordado? (s/n): ");
    System.out.print("> ");
    String respuesta = (System.console().readLine().toLowerCase());
    System.out.println(" ");
    System.out.println(" ");
    
    double dimensionesBandera = (alturaBandera * anchuraBandera);
    double precioBandera =(dimensionesBandera * 0.01);
    
    if ("s".equals(respuesta)) {
      System.out.println("¡Muchas gracias por su compra! Aquí tiene su factura:");
      System.out.println(" ");
      System.out.print("Bandera de ");
      System.out.printf("%.1f %-3s       %5.2f %-1s\n" ,dimensionesBandera ,"cm²" ,precioBandera ,"€");
      System.out.printf("%-20s        %5.2f %-1s\n" ,"Con escudo" ,2.50 ,"€");
      System.out.printf("%-20s        %5.2f %-1s\n" ,"Gastos de envío" ,3.25 ,"€");
      System.out.printf("%-20s        %5.2f %-1s\n" ,"Total" ,(precioBandera + 2.50 + 3.25) ,"€");
    } else if ("n".equals(respuesta)) {
        System.out.println("¡Muchas gracias por su compra! Aquí tiene su factura:");
        System.out.println(" ");
        System.out.print("Bandera de ");
        System.out.printf("%.1f %-3s      %5.2f %-1s\n" ,dimensionesBandera ,"cm²" ,precioBandera ,"€");
        System.out.printf("%-20s       %5.2f %-1s\n" ,"Sin escudo" ,0.00 ,"€");
        System.out.printf("%-20s       %5.2f %-1s\n" ,"Gastos de envío" ,3.25 ,"€");
        System.out.printf("%-20s       %5.2f %-1s\n" ,"Total" ,(precioBandera + 3.25) ,"€");
    } else {
        System.out.println("Responda correctamente a la pregunta.");
    }
  }
}
