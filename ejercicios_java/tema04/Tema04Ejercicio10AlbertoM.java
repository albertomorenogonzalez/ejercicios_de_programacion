/**
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de
 * nacimiento.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio10AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE TE DICE TU SIGNO DEL HORÓSCOPO SEGÚN TU DÍA Y MES DE NACIMIENTO");
    System.out.println("-----------------------------------------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca el día en que nació (1-31): ");
    System.out.print("> ");
    int dia = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca el mes en que nació: ");
    System.out.print("> ");
    String mes = System.console().readLine();
    System.out.println(" ");
    
    switch (mes.toLowerCase()) {
      case "enero":
        if ((dia >= 1 )  && (dia <=20)) {
          System.out.println("Eres capricornio.");
        } else if ((dia > 20) && (dia <=31)) {
          System.out.println("Eres acuario.");
        } else {
          System.out.println("Por favor, introduzca correctamente los datos.");
        }
        break;
      case "febrero":
        if ((dia >= 1 )  && (dia <=19)) {
          System.out.println("Eres acuario.");
        } else if ((dia > 19) && (dia <=29)) {
          System.out.println("Eres piscis.");
        } else {
          System.out.println("Por favor, introduzca correctamente los datos.");
        }
        break;
      case "marzo":
        if ((dia >= 1 )  && (dia <=20)) {
          System.out.println("Eres piscis.");
        } else if ((dia > 20) && (dia <=31)) {
          System.out.println("Eres aries.");
        } else {
          System.out.println("Por favor, introduzca correctamente los datos.");
        }
        break;
      case "abril":
        if ((dia >= 1 )  && (dia <=20)) {
          System.out.println("Eres aries.");
        } else if ((dia > 20) && (dia <=30)) {
          System.out.println("Eres tauro.");
        } else {
          System.out.println("Por favor, introduzca correctamente los datos.");
        }
        break;
      case "mayo":
        if ((dia >= 1 )  && (dia <=21)) {
          System.out.println("Eres tauro.");
        } else if ((dia > 21) && (dia <=31)) {
          System.out.println("Eres géminis.");
        } else {
          System.out.println("Por favor, introduzca correctamente los datos.");
        }
        break;
      case "junio":
        if ((dia >= 1 )  && (dia <=21)) {
          System.out.println("Eres géminis.");
        } else if ((dia > 21) && (dia <=30)) {
          System.out.println("Eres cáncer.");
        } else {
          System.out.println("Por favor, introduzca correctamente los datos.");
        }
        break;
      case "julio":
        if ((dia >= 1 )  && (dia <=22)) {
          System.out.println("Eres cáncer.");
        } else if ((dia > 22) && (dia <=31)) {
          System.out.println("Eres leo.");
        } else {
          System.out.println("Por favor, introduzca correctamente los datos.");
        }
        break;
      case "agosto":
        if ((dia >= 1 )  && (dia <=22)) {
          System.out.println("Eres leo.");
        } else if ((dia > 22) && (dia <=31)) {
          System.out.println("Eres virgo.");
        } else {
          System.out.println("Por favor, introduzca correctamente los datos.");
        }
        break;
      case "septiembre":
        if ((dia >= 1 )  && (dia <=22)) {
          System.out.println("Eres virgo.");
        } else if ((dia > 22) && (dia <=30)) {
          System.out.println("Eres libra.");
        } else {
          System.out.println("Por favor, introduzca correctamente los datos.");
        }
        break;
      case "octubre":
        if ((dia >= 1 )  && (dia <=22)) {
          System.out.println("Eres libra.");
        } else if ((dia > 22) && (dia <=31)) {
          System.out.println("Eres escorpio.");
        } else {
          System.out.println("Por favor, introduzca correctamente los datos.");
        }
        break;
      case "noviembre":
        if ((dia >= 1 )  && (dia <=22)) {
          System.out.println("Eres escorpio.");
        } else if ((dia > 22) && (dia <=30)) {
          System.out.println("Eres sagitario.");
        } else {
          System.out.println("Por favor, introduzca correctamente los datos.");
        }
        break;
      case "diciembre":
        if ((dia >= 1 )  && (dia <=20)) {
          System.out.println("Eres sagitario.");
        } else if ((dia > 20) && (dia <=31)) {
          System.out.println("Eres capricornio.");
        } else {
          System.out.println("Por favor, introduzca correctamente los datos.");
        }
        break;
      default:
        System.out.println("Por favor, introduzca correctamente los datos.");
    }
  }
}
