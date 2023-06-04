package Animales;
import java.util.*;
public class prueba {
    public static void main(String[] args){
        Animal[] animales = new Animal[4];
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new lobo();
        animales[3] = new Leon();
        Scanner input = new Scanner(System.in);
        System.out.println("Elija el numero del animal sobre el que desee saber ");
        System.out.println("Gato: 1, Perro: 2, Lobo: 3, Leon: 4 ");
        int opcion = input.nextInt();

        if (opcion >= 1 && opcion <=4){
            Animal animalElegido = animales[opcion-1];
            System.out.println("Nombre Cientifico" + animalElegido.getNomcientifico());
            System.out.println("Sonido: "+ animalElegido.getSonido());
            System.out.println("Alimentos: " + animalElegido.getAlimentos());
            System.out.println("Habitat: " + animalElegido.getHabitat());
        }



        }

}
