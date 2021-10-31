/**
 * Escribe un programa que calcule el precio final de un producto según su
 * base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
 * reducido o superreducido) y el código promocional. Los tipos de IVA general,
 * reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
 * promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
 * respectivamente que no se aplica promoción, el precio se reduce a la mitad,
 * se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
 * muestran los valores correctos, aunque los números no estén tabulados.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio23AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA EL PRECIO FINAL DE UN PRODUCTO");
    System.out.println("----------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca el valor de la base imponible (en euros) : ");
    System.out.print("> ");
    double baseImp = Double.parseDouble(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca el tipo de IVA (general, reducido o superreducido): ");
    System.out.print("> ");
    String iva = (System.console().readLine().toLowerCase());
    System.out.println(" ");
    
    double ivaGen = (baseImp * 0.21);
    double ivaRed = (baseImp * 0.10);
    double ivaSuperRed = (baseImp * 0.04);
    
    double precioConIVAGen = (baseImp + ivaGen);
    double precioConIVARed = (baseImp + ivaRed);
    double precioConIVASuperRed = (baseImp + ivaSuperRed);
    
    System.out.println("Por favor, introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    System.out.print("> ");
    String descuento = (System.console().readLine().toLowerCase());
    System.out.println(" ");
    System.out.println(" ");
    
    double CincoPorcGen = (precioConIVAGen * 0.05);
    double CincoPorcRed = (precioConIVARed * 0.05);
    double CincoPorcSuperRed = (precioConIVASuperRed * 0.05);
    
    switch (descuento) {
      case "nopro":
        if ("general".equals(iva)) {
          System.out.printf("%-20s      %.2f %-1s\n" ,"Base Imponible:" ,baseImp ,"€");
          System.out.printf("%-20s      %.2f %-1s\n" ,"IVA (21%):" ,ivaGen ,"€");
          System.out.printf("%-20s      %.2f %-1s\n" ,"Precio con IVA:" ,precioConIVAGen ,"€");
          System.out.printf("%-20s     %-1s%.2f %-1s\n" ,"Cód. promo. (nopro):" ,"-" ,0.00 ,"€");
          System.out.printf("%-20s      %.2f %-1s\n" ,"TOTAL:" ,precioConIVAGen ,"€");
        } else if ("reducido".equals(iva)) {
            System.out.printf("%-20s      %.2f %-1s\n" ,"Base Imponible:" ,baseImp ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"IVA (10%):" ,ivaRed ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"Precio con IVA:" ,precioConIVARed ,"€");
            System.out.printf("%-20s     %-1s%.2f %-1s\n" ,"Cód. promo. (nopro):" ,"-" ,0.00 ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"TOTAL:" ,precioConIVARed ,"€");  
        } else if ("superreducido".equals(iva)) {
            System.out.printf("%-20s      %.2f %-1s\n" ,"Base Imponible:" ,baseImp ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"IVA (4%):" ,ivaSuperRed ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"Precio con IVA:" ,precioConIVASuperRed ,"€");
            System.out.printf("%-20s     %-1s%.2f %-1s\n" ,"Cód. promo. (nopro):" ,"-" ,0.00 ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"TOTAL:" ,precioConIVASuperRed ,"€"); 
        } else {
            System.out.println("Por favor, introduzca los datos correctamente.");
        }
        break;
      case "mitad":
        if ("general".equals(iva)) {
          System.out.printf("%-20s      %.2f %-1s\n" ,"Base Imponible:" ,baseImp ,"€");
          System.out.printf("%-20s      %.2f %-1s\n" ,"IVA (21%):" ,ivaGen ,"€");
          System.out.printf("%-20s      %.2f %-1s\n" ,"Precio con IVA:" ,precioConIVAGen ,"€");
          System.out.printf("%-20s     %-1s%.2f %-1s\n" ,"Cód. promo. (mitad):" ,"-" ,(precioConIVAGen / 2) ,"€");
          System.out.printf("%-20s      %.2f %-1s\n" ,"TOTAL:" ,(precioConIVAGen / 2) ,"€");
        } else if ("reducido".equals(iva)) {
            System.out.printf("%-20s      %.2f %-1s\n" ,"Base Imponible:" ,baseImp ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"IVA (10%):" ,ivaRed ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"Precio con IVA:" ,precioConIVARed ,"€");
            System.out.printf("%-20s     %-1s%.2f %-1s\n" ,"Cód. promo. (mitad):" ,"-" ,(precioConIVARed / 2) ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"TOTAL:" ,(precioConIVARed / 2) ,"€");
        } else if ("superreducido".equals(iva)) {
            System.out.printf("%-20s      %.2f %-1s\n" ,"Base Imponible:" ,baseImp ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"IVA (4%):" ,ivaSuperRed ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"Precio con IVA:" ,precioConIVASuperRed ,"€");
            System.out.printf("%-20s     %-1s%.2f %-1s\n" ,"Cód. promo. (mitad):" ,"-" ,(precioConIVASuperRed / 2) ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"TOTAL:" ,(precioConIVASuperRed / 2) ,"€"); 
        } else {
            System.out.println("Por favor, introduzca los datos correctamente.");
        }
        break;
      case "meno5":
        if ("general".equals(iva)) {
          System.out.printf("%-20s      %.2f %-1s\n" ,"Base Imponible:" ,baseImp ,"€");
          System.out.printf("%-20s      %.2f %-1s\n" ,"IVA (21%):" ,ivaGen ,"€");
          System.out.printf("%-20s      %.2f %-1s\n" ,"Precio con IVA:" ,precioConIVAGen ,"€");
          System.out.printf("%-20s     %-1s%.2f %-1s\n" ,"Cód. promo. (nopro):" ,"-" ,5.00 ,"€");
          System.out.printf("%-20s      %.2f %-1s\n" ,"TOTAL:" ,(precioConIVAGen - 5) ,"€");
        } else if ("reducido".equals(iva)) {
            System.out.printf("%-20s      %.2f %-1s\n" ,"Base Imponible:" ,baseImp ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"IVA (10%):" ,ivaRed ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"Precio con IVA:" ,precioConIVARed ,"€");
            System.out.printf("%-20s     %-1s%.2f %-1s\n" ,"Cód. promo. (nopro):" ,"-" ,5.00 ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"TOTAL:" ,(precioConIVARed - 5) ,"€");
        } else if ("superreducido".equals(iva)) {
            System.out.printf("%-20s      %.2f %-1s\n" ,"Base Imponible:" ,baseImp ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"IVA (4%):" ,ivaSuperRed ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"Precio con IVA:" ,precioConIVASuperRed ,"€");
            System.out.printf("%-20s     %-1s%.2f %-1s\n" ,"Cód. promo. (nopro):" ,"-" ,5.00 ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"TOTAL:" ,(precioConIVASuperRed - 5) ,"€");
        } else {
            System.out.println("Por favor, introduzca los datos correctamente.");
        }
        break;
      case "5porc":
        if ("general".equals(iva)) {
          System.out.printf("%-20s      %.2f %-1s\n" ,"Base Imponible:" ,baseImp ,"€");
          System.out.printf("%-20s      %.2f %-1s\n" ,"IVA (21%):" ,ivaGen ,"€");
          System.out.printf("%-20s      %.2f %-1s\n" ,"Precio con IVA:" ,precioConIVAGen ,"€");
          System.out.printf("%-20s     %-1s%.2f %-1s\n" ,"Cód. promo. (5porc):" ,"-" ,CincoPorcGen ,"€");
          System.out.printf("%-20s      %.2f %-1s\n" ,"TOTAL:" ,(precioConIVAGen - CincoPorcGen) ,"€");
        } else if ("reducido".equals(iva)) {
            System.out.printf("%-20s      %.2f %-1s\n" ,"Base Imponible:" ,baseImp ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"IVA (10%):" ,ivaRed ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"Precio con IVA:" ,precioConIVARed ,"€");
            System.out.printf("%-20s     %-1s%.2f %-1s\n" ,"Cód. promo. (5porc):" ,"-" ,CincoPorcRed ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"TOTAL:" ,(precioConIVARed - CincoPorcRed) ,"€");
        } else if ("superreducido".equals(iva)) {
            System.out.printf("%-20s      %.2f %-1s\n" ,"Base Imponible:" ,baseImp ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"IVA (4%):" ,ivaSuperRed ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"Precio con IVA:" ,precioConIVASuperRed ,"€");
            System.out.printf("%-20s     %-1s%.2f %-1s\n" ,"Cód. promo. (5porc):" ,"-" ,CincoPorcSuperRed ,"€");
            System.out.printf("%-20s      %.2f %-1s\n" ,"TOTAL:" ,(precioConIVASuperRed - CincoPorcSuperRed) ,"€");
        } else {
            System.out.println("Por favor, introduzca los datos correctamente.");
        }
        break;
      default:
        System.out.println("Por favor, introduzca los datos correctamente.");  
    }
  }
}
