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
    
    double dietaViajes = (30 * viaje);
       
    System.out.println("Por favor, introduzca su estado civil (1-2): ");
    System.out.println("1 - Soltero");
    System.out.println("2 - Casado");
    System.out.print("> ");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    System.out.println(" ");
    
    if ((cargo >= 1) && (cargo <= 3)) {
      
      System.out.println("-------------------------------------");
      
      switch (cargo) {
        case 1:
          System.out.print("|");
          System.out.printf("%-20s       %.2f %-1s" ,"Sueldo Base:" ,950.00 ,"€");
          System.out.println("|");
        
          if (viaje == 1) {
            System.out.print("|");
            System.out.print("Dietas (");
            System.out.print(viaje);
            System.out.print(" viaje):");
            System.out.printf("           %5.2f %-1s" ,dietaViajes ,"€");
            System.out.println("|");
          } else if ((viaje > 1) && (viaje <= 3)) {
              System.out.print("|");
              System.out.print("Dietas (");
              System.out.print(viaje);
              System.out.print(" viajes):");
              System.out.printf("          %5.2f %-1s" ,dietaViajes ,"€");
              System.out.println("|");
          } else if ((viaje > 3) && (viaje <= 33)) {
              System.out.print("|");
              System.out.print("Dietas (");
              System.out.print(viaje);
              System.out.print(" viajes):");
              System.out.printf("         %5.2f %-1s" ,dietaViajes ,"€");
              System.out.println("|");
          } else if (viaje > 33) {
              System.out.print("|");
              System.out.print("Dietas (");
              System.out.print(viaje);
              System.out.print(" viajes):");
              System.out.printf("       %5.2f %-1s" ,dietaViajes ,"€");
              System.out.println("|");
          } 
      
          System.out.println("|-----------------------------------|");
      
          double sueldoBrutoJr = (950 + dietaViajes);
          
          System.out.print("|");
          System.out.printf("%-20s      %.2f %-1s" ,"Sueldo Bruto:" ,(sueldoBrutoJr) ,"€");
          System.out.println("|");
          
          
          double irpfSolteroJr = (sueldoBrutoJr * 0.25);
          
          double irpfCasadoJr = (sueldoBrutoJr * 0.20); 
          
          if (estadoCivil == 1) {
            System.out.print("|");
            System.out.printf("%-20s      %.2f %-1s" ,"Retención IRPF (25%):" ,(irpfSolteroJr) ,"€");
            System.out.println("|");
            
            System.out.println("|-----------------------------------|");
            
            double SueldoNetoSJr = (sueldoBrutoJr - irpfSolteroJr);
            
            System.out.print("|");
            System.out.printf("%-20s       %.2f %-1s" ,"Sueldo Neto:" ,(SueldoNetoSJr) ,"€");
            System.out.println("|");
            
            System.out.println("-------------------------------------");
          
          } else if (estadoCivil == 2) {
              System.out.print("|");
              System.out.printf("%-20s      %.2f %-1s" ,"Retención IRPF (20%):" ,(irpfCasadoJr) ,"€");
              System.out.println("|");
            
              System.out.println("|-----------------------------------|");
            
              double SueldoNetoCJr = (sueldoBrutoJr - irpfCasadoJr);
            
              System.out.print("|");
              System.out.printf("%-20s       %.2f %-1s" ,"Sueldo Neto:" ,(SueldoNetoCJr) ,"€");
              System.out.println("|");
              
              System.out.println("-------------------------------------");
          }
          break;
        case 2:
          System.out.print("|");
          System.out.printf("%-20s      %.2f %-1s" ,"Sueldo Base:" ,1200.00 ,"€");
          System.out.println("|");
        
          if (viaje == 1) {
            System.out.print("|");
            System.out.print("Dietas (");
            System.out.print(viaje);
            System.out.print(" viaje):");
            System.out.printf("           %5.2f %-1s" ,dietaViajes ,"€");
            System.out.println("|");
          } else if ((viaje > 1) && (viaje <= 3)) {
              System.out.print("|");
              System.out.print("Dietas (");
              System.out.print(viaje);
              System.out.print(" viajes):");
              System.out.printf("          %5.2f %-1s" ,dietaViajes ,"€");
              System.out.println("|");
          } else if ((viaje > 3) && (viaje <= 33)) {
              System.out.print("|");
              System.out.print("Dietas (");
              System.out.print(viaje);
              System.out.print(" viajes):");
              System.out.printf("         %5.2f %-1s" ,dietaViajes ,"€");
              System.out.println("|");
          } else if (viaje > 33) {
              System.out.print("|");
              System.out.print("Dietas (");
              System.out.print(viaje);
              System.out.print(" viajes):");
              System.out.printf("       %5.2f %-1s" ,dietaViajes ,"€");
              System.out.println("|");
          } 
      
          System.out.println("|-----------------------------------|");
      
          double sueldoBrutoSr = (1200 + dietaViajes);
          
          System.out.print("|");
          System.out.printf("%-20s      %.2f %-1s" ,"Sueldo Bruto:" ,(sueldoBrutoSr) ,"€");
          System.out.println("|");
          
          
          double irpfSolteroSr = (sueldoBrutoSr * 0.25);
          
          double irpfCasadoSr = (sueldoBrutoSr * 0.20); 
          
          if (estadoCivil == 1) {
            System.out.print("|");
            System.out.printf("%-20s      %.2f %-1s" ,"Retención IRPF (25%):" ,(irpfSolteroSr) ,"€");
            System.out.println("|");
            
            System.out.println("|-----------------------------------|");
            
            double SueldoNetoSSr = (sueldoBrutoSr - irpfSolteroSr);
            
            System.out.print("|");
            System.out.printf("%-20s      %.2f %-1s" ,"Sueldo Neto:" ,(SueldoNetoSSr) ,"€");
            System.out.println("|");
            
            System.out.println("-------------------------------------");
          
          } else if (estadoCivil == 2) {
              System.out.print("|");
              System.out.printf("%-20s      %.2f %-1s" ,"Retención IRPF (20%):" ,(irpfCasadoSr) ,"€");
              System.out.println("|");
            
              System.out.println("|-----------------------------------|");
            
              double SueldoNetoCSr = (sueldoBrutoSr - irpfCasadoSr);
            
              System.out.print("|");
              System.out.printf("%-20s      %.2f %-1s" ,"Sueldo Neto:" ,(SueldoNetoCSr) ,"€");
              System.out.println("|");
              
              System.out.println("-------------------------------------"); 
          }
          break;
        case 3:
          System.out.print("|");
          System.out.printf("%-20s      %.2f %-1s" ,"Sueldo Base:" ,1600.00 ,"€");
          System.out.println("|");
        
          if (viaje == 1) {
            System.out.print("|");
            System.out.print("Dietas (");
            System.out.print(viaje);
            System.out.print(" viaje):");
            System.out.printf("           %5.2f %-1s" ,dietaViajes ,"€");
            System.out.println("|");
          } else if ((viaje > 1) && (viaje <= 3)) {
              System.out.print("|");
              System.out.print("Dietas (");
              System.out.print(viaje);
              System.out.print(" viajes):");
              System.out.printf("          %5.2f %-1s" ,dietaViajes ,"€");
              System.out.println("|");
          } else if ((viaje > 3) && (viaje <= 33)) {
              System.out.print("|");
              System.out.print("Dietas (");
              System.out.print(viaje);
              System.out.print(" viajes):");
              System.out.printf("         %5.2f %-1s" ,dietaViajes ,"€");
              System.out.println("|");
          } else if (viaje > 33) {
              System.out.print("|");
              System.out.print("Dietas (");
              System.out.print(viaje);
              System.out.print(" viajes):");
              System.out.printf("       %5.2f %-1s" ,dietaViajes ,"€");
              System.out.println("|");
          } 
      
          System.out.println("|-----------------------------------|");
      
          double sueldoBrutoJf = (1600 + dietaViajes);
          
          System.out.print("|");
          System.out.printf("%-20s      %.2f %-1s" ,"Sueldo Bruto:" ,(sueldoBrutoJf) ,"€");
          System.out.println("|");
          
          
          double irpfSolteroJf = (sueldoBrutoJf * 0.25);
          
          double irpfCasadoJf = (sueldoBrutoJf * 0.20); 
          
          if (estadoCivil == 1) {
            System.out.print("|");
            System.out.printf("%-20s      %.2f %-1s" ,"Retención IRPF (25%):" ,(irpfSolteroJf) ,"€");
            System.out.println("|");
            
            System.out.println("|-----------------------------------|");
            
            double SueldoNetoSJf = (sueldoBrutoJf - irpfSolteroJf);
            
            System.out.print("|");
            System.out.printf("%-20s      %.2f %-1s" ,"Sueldo Neto:" ,(SueldoNetoSJf) ,"€");
            System.out.println("|");
            
            System.out.println("-------------------------------------");
          
          } else if (estadoCivil == 2) {
              System.out.print("|");
              System.out.printf("%-20s      %.2f %-1s" ,"Retención IRPF (20%):" ,(irpfCasadoJf) ,"€");
              System.out.println("|");
            
              System.out.println("|-----------------------------------|");
            
              double SueldoNetoCJf = (sueldoBrutoJf - irpfCasadoJf);
            
              System.out.print("|");
              System.out.printf("%-20s      %.2f %-1s" ,"Sueldo Neto:" ,(SueldoNetoCJf) ,"€");
              System.out.println("|");
              
              System.out.println("-------------------------------------"); 
          }
          break;
      }
    } else { 
        System.out.println("Por favor, introduzca el cargo del empleado (1-3).");
    }
  }
}
