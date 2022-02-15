package Ex14amg4;

/**
 * Se van a utilizar las clases AnimalDeAcuario y Pez creadas en el ejercicio anterior por lo que
 * deberás hacer una copia de dichas clases en la carpeta correspondiente a este ejercicio. Además de
 * hacer la copia, crea la clase Pecera. De una pecera se debe saber su nombre o identificador y los
 * litros de capacidad. En una pecera se pueden meter peces. Para determinar la cantidad máxima de
 * peces que caben en una pecera, se ha de tener en cuenta que no se deben meter más de 4 peces por
 * litro de capacidad. En cualquier momento se podrá mostrar información sobre la pecera: nombre, litros
 * de capacidad, número de peces que contiene y un listado con todos ellos.
 * 
 * @author Alberto Moreno Gonzalez
 * 
 * Fecha: 15 - 2 - 2022
 */
public class GestorDePeceras { 
  public static void main(String[] args) {
    Pez pepe = new Pez("Pepe", "azul", "globo");
    Pez casilda = new Pez("Casilda", "naranja", "tropical");
    Pecera miPecerilla = new Pecera("Pecerilla", 2);
    miPecerilla.mete(pepe);
    miPecerilla.mete(casilda);
    for (int i = 0; i < 6; i++) {
    miPecerilla.mete(new Pez("Sara", "amarillo", "guppy"));
    }
    System.out.println(miPecerilla);
    miPecerilla.mete(new Pez("Intruso", "rosa", "gurami"));
  }
}