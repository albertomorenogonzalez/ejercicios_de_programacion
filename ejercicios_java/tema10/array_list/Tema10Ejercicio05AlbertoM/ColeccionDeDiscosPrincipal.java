package Tema10Ejercicio05AlbertoM;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Realiza de nuevo el ejercicio de la colección de discos pero utilizando esta vez
 * una lista para almacenar la información sobre los discos en lugar de un array
 * convencional. Comprobarás que el código se simplifica notablemente ¿Cuánto
 * ocupa el programa original hecho con un array? ¿Cuánto ocupa este nuevo
 * programa hecho con una lista?
 * 
 * @author Alberto Moreno González
 */
public class ColeccionDeDiscosPrincipal {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    ArrayList<Disco> album = new ArrayList<Disco>();

    int opcion;
    int codigo = 0;
    int codigoIntroducido;
    String autor;
    String titulo;
    String genero;
    int duracion;
    int i;
    
    do {
      System.out.println("\n\nCOLECCIÓN DE DISCOS");
      System.out.println("----------------");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.println("\nIntroduzca una opción: ");
      System.out.print("> ");
      opcion = Integer.parseInt(s.nextLine());
      
      switch (opcion) {
        case 1:
          System.out.println("\nLISTADO");
          System.out.println("--------");

          for (i = 0; i < album.size(); i++) {
            System.out.println(album.get(i).toString());
          }

          break;
        case 2:
          System.out.println("\nNUEVO DISCO");
          System.out.println("------------");
          
          System.out.println("Por favor, introduzca los datos del disco:");  

          System.out.println("\nAutor: ");
          System.out.print("> ");
          autor = (s.nextLine());
          
          System.out.println("\nTítulo: ");
          System.out.print("> ");
          titulo = (s.nextLine());
          
          System.out.println("\nGénero: ");
          System.out.print("> ");
          genero = (s.nextLine());
          
          System.out.println("\nDuración: ");
          System.out.print("> ");
          duracion = Integer.parseInt(s.nextLine());

          album.add(new Disco (codigo, autor, titulo, genero, duracion));

          codigo++;
          break;
        case 3:
          System.out.println("\nMODIFICAR");
          System.out.println("---------");

          System.out.println("Introduzca el código del disco del que desea modificar los datos:");
          System.out.print("> ");
          codigoIntroducido = Integer.parseInt(s.nextLine());

          System.out.println(album.get(codigoIntroducido).toString());

          System.out.println("\nCódigo: ");
          System.out.print("> ");
          codigo = Integer.parseInt(s.nextLine());
          album.get(codigoIntroducido).setCodigo(codigo);

          System.out.println("\nAutor: ");
          System.out.print("> ");
          autor = (s.nextLine());
          album.get(codigoIntroducido).setAutor(autor);
          
          System.out.println("\nTítulo: ");
          System.out.print("> ");
          titulo = (s.nextLine());
          album.get(codigoIntroducido).setTitulo(titulo);
          
          System.out.println("\nGénero: ");
          System.out.print("> ");
          genero = (s.nextLine());
          album.get(codigoIntroducido).setGenero(genero);
          
          System.out.println("\nDuración: ");
          System.out.print("> ");
          duracion = Integer.parseInt(s.nextLine());
          album.get(codigoIntroducido).setDuracion(duracion);

          break;
        case 4:
          System.out.println("\nBORRAR");
          System.out.println("-------");
          
          System.out.println("Por favor, introduzca el código del disco que desea borrar: ");
          System.out.print("> ");
          codigoIntroducido = Integer.parseInt(s.nextLine());
          boolean encontrado = false;

          for (i = 0; ((i < album.size()) && (!encontrado)); i++) {
            if (album.get(i).getCodigo() == codigoIntroducido) {
              encontrado = true;
              album.remove(i);
            }
          }
          break;
        default:
      
      } // switch
    } while (opcion != 5);
  }
}