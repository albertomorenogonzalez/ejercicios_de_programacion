/**
 * Primer examen de Programación del curso 2021/22
 * 
 * Realiza un programa que calcule y muestre por pantalla el número de vueltas que da el
 * planeta Tierra en 400 años en los dos siguientes supuestos:
 *  a) Sin tener en cuenta los años bisiestos.
 *  b) Desde el año 1601 al 2000, ambos incluidos.
 * Nota: Los años bisiestos tienen 366 días en lugar de 365. Fueron bisiestos los años 1604,
 * 1608, 1612, 1616, …, 1988, 1992, 1996, 2000 (en total 97 años bisiestos).
 *
 * @author Alberto Moreno González
 * 
 * 04/11/2021
 */
public class Ex14amg4 {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE CALCULA Y MUESTRA POR PANTALLA EL NÚMERO DE VUELTAS QUE DA LA TIERRA EN 400 AñOS");
    System.out.println("----------------------------------------------------------------------------------------------");
    System.out.println(" ");
    
    int vueltasSinBisiestos = (400 * 365);
    
    // int vueltasConBisiestos = (400 * (365 + 97)); Error en el cálculo
    int vueltasConBisiestos = (400 * 365 + 97);

    System.out.println("Sin tener en cuenta los años bisiestos, en 400 años, La Tierra da " + vueltasSinBisiestos + " vueltas.");
    
    System.out.println("Desde el año 1601 al 2000, La Tierra dio " + vueltasConBisiestos + " vueltas.");
    
  }
}
