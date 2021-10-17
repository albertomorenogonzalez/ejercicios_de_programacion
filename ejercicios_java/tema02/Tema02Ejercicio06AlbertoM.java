/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
 *
 * @author Alberto Moreno González
 */
public class Tema02Ejercicio06AlbertoM {
  public static void main(String[] args) {
    int bimponible;
    
    bimponible = 1000;
    
    double iva;
    
    iva = 0.21;
    
    System.out.print("El precio total (IVA no incluido) es de ");
    System.out.print(bimponible);
    System.out.println(" euros.");
    System.out.println(" ");
    System.out.print("El precio de la factura (IVA incluido) es de ");
    System.out.printf("%.2f", bimponible + (bimponible * iva));
    System.out.println(" euros.");
  }
}
