/**
 * Escribe un programa que genere la nómina (bien desglosada) de un empleado
 * según las siguientes condiciones:
 * • Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
 *   de proyecto), los días que ha estado de viaje visitando clientes durante el
 *   mes y su estado civil (1 - Soltero, 2 - Casado).
 * • El sueldo base según el cargo es de 950, 1200 y 1600 euros según
 *   si se trata de un prog. junior, un prog. senior o un jefe de proyecto
 *   respectivamente.
 * • Por cada día de viaje visitando clientes se pagan 30 euros extra en 
 *   concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de 
 *   un 25% en caso de estar soltero y un 20% en caso de estar casado.
 *
 * @author Alberto Moreno González
 */
public class Tema04Ejercicio24AlbertoM {
  public static void main(String[] args) {
    System.out.println("PROGRAMA QUE GENERA LA NÓMINA DE UN EMPLEADO");
    System.out.println("---------------------------------------------");
    System.out.println(" ");
    
    System.out.println("Por favor, introduzca el cargo del empleado (1-3): ");
    System.out.println("1 - Programador Junior");
    System.out.println("2 - Programador Senior");
    System.out.println("3 - Jefe de Proyecto");
    System.out.print("> ");
    int cargo = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
  
    System.out.println("Por favor, introduzca el número de viajes que ha hecho el empleado:");
    System.out.print("> ");
    int viaje = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
       
    System.out.println("Por favor, introduzca su estado civil (1-2): ");
    System.out.println("1 - Soltero");
    System.out.println("2 - Casado");
    System.out.print("> ");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    double sueldoBase = 0;
    
    switch (cargo) {
      case 1:
        sueldoBase = 900;
        break;
      case 2:
        sueldoBase = 1200;
        break;
      case 3:
        sueldoBase = 1600;
        break;
      default:
        System.out.println("Por favor, introduzca correctamente los datos.");
    }
    
    if ((cargo >= 1) && (cargo <= 3)) {
      double dietaViajes = (viaje * 30);
      
      double sueldoBruto = (sueldoBase + dietaViajes);
      
      double retencionIRPF = 0;
      
      String porcentajeIRPF = " ";
      if (estadoCivil == 1) {
        retencionIRPF = (sueldoBruto * 0.25);
        porcentajeIRPF = "25%";
      } else if (estadoCivil == 2) {
          retencionIRPF = (sueldoBruto * 0.20);
          porcentajeIRPF = "20%";
      } else {
          System.out.println("Por favor, introduzca correctamente los datos.");
      }
    
      if ((estadoCivil >= 1) && (estadoCivil <= 2)) {
        double sueldoNeto = (sueldoBruto - retencionIRPF);
      
        System.out.println("-------------------------------------");
        System.out.print("|");
        System.out.printf("%-12s              %4.2f %-1s" ,"Sueldo Base:" ,sueldoBase ,"€");
        System.out.println("|");
        System.out.print("|");
        System.out.printf("%-8s%d%-8s         %4.2f %-1s" ,"Dietas (" ,viaje ," viajes):"  ,dietaViajes ,"€");
        System.out.println("|");
        System.out.println("|-----------------------------------|");
        System.out.print("|");
        System.out.printf("%-13s              %4.2f %-1s" ,"Sueldo Bruto:" ,sueldoBruto ,"€");
        System.out.println("|");
        System.out.print("|");
        System.out.printf("%-16s%-3s%-2s      %4.2f %-1s" ,"Retención IRPF (" ,porcentajeIRPF ,"):" ,retencionIRPF ,"€");
        System.out.println("|");
        System.out.println("|-----------------------------------|");
        System.out.print("|");
        System.out.printf("%-1s              %4.2f %-1s" ,"Sueldo Neto:" ,sueldoNeto ,"€");
        System.out.println("|");
        System.out.println("-------------------------------------");
      }
    }
  }
}
