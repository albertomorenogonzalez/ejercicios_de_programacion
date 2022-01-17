/**
 * Primer examen de Programación del curso 2021/22
 * 
 * Escribe un programa que traduzca cada uno de los números de un PIN de 4 dígitos
 * introducido por el usuario a su correspondiente palabra. Si el usuario introduce un número de
 * menos de 4 dígitos, se entiende que el PIN tiene ceros a la izquierda hasta completar esos 4
 * dígitos.
 *
 * @author Alberto Moreno González
 * 
 * 04/11/2021
 */
public class Ex14amg0101 {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE TRADUCE CADA UNO DE LOS NUMEROS DE UN PIN DE 4 DIGITOS A PALABRAS");
    System.out.println("-------------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Introduzca un número, por favor: ");
    System.out.print("> ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    int primeraCifra = (numero / 1000);
    int segundaCifra = ((numero % 1000) / 100);
    int terceraCifra = ((numero % 100) / 10);
    int cuartaCifra = ((numero % 100) % 10);
    
    if (primeraCifra == 1) {
      System.out.print("uno ");
    } else if (primeraCifra == 2) {
        System.out.print("dos ");
    } else if (primeraCifra == 3) {
        System.out.print("tres ");
    } else if (primeraCifra == 4) {
        System.out.print("cuatro ");
    } else if (primeraCifra == 5) {
        System.out.print("cinco ");
    } else if (primeraCifra == 6) {
        System.out.print("seis ");
    } else if (primeraCifra == 7){
        System.out.print("siete ");
    } else if (primeraCifra == 8) {
        System.out.print("ocho ");
    } else if (primeraCifra == 9) {
        System.out.print("nueve ");
    } else {
        System.out.print("cero ");
    }
    
    if (segundaCifra == 1) {
      System.out.print("uno ");
    } else if (segundaCifra == 2) {
        System.out.print("dos ");
    } else if (segundaCifra == 3) {
        System.out.print("tres ");
    } else if (segundaCifra == 4) {
        System.out.print("cuatro ");
    } else if (segundaCifra == 5) {
        System.out.print("cinco ");
    } else if (segundaCifra == 6) {
        System.out.print("seis ");
    } else if (segundaCifra == 7){
        System.out.print("siete ");
    } else if (segundaCifra == 8) {
        System.out.print("ocho ");
    } else if (segundaCifra == 9) {
        System.out.print("nueve ");
    } else {
        System.out.print("cero ");
    }
    
    if (terceraCifra == 1) {
      System.out.print("uno ");
    } else if (terceraCifra == 2) {
        System.out.print("dos ");
    } else if (terceraCifra == 3) {
        System.out.print("tres ");
    } else if (terceraCifra == 4) {
        System.out.print("cuatro ");
    } else if (terceraCifra == 5) {
        System.out.print("cinco ");
    } else if (terceraCifra == 6) {
        System.out.print("seis ");
    } else if (terceraCifra == 7){
        System.out.print("siete ");
    } else if (terceraCifra == 8) {
        System.out.print("ocho ");
    } else if (terceraCifra == 9) {
        System.out.print("nueve ");
    } else {
        System.out.print("cero ");
    }
    
    if (cuartaCifra == 1) {
      System.out.print("uno ");
    } else if (cuartaCifra == 2) {
        System.out.print("dos ");
    } else if (cuartaCifra == 3) {
        System.out.print("tres ");
    } else if (cuartaCifra == 4) {
        System.out.print("cuatro ");
    } else if (cuartaCifra == 5) {
        System.out.print("cinco ");
    } else if (cuartaCifra == 6) {
        System.out.print("seis ");
    } else if (cuartaCifra == 7){
        System.out.print("siete ");
    } else if (cuartaCifra == 8) {
        System.out.print("ocho ");
    } else if (cuartaCifra== 9) {
        System.out.print("nueve ");
    } else {
        System.out.print("cero ");
    }

    // Sería preferible no utilizar tantos if y utilizar switch
  }
}

