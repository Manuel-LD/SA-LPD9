package SA_LPD9;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();

        diccionario.put("hola", "hello");
        diccionario.put("adiós", "goodbye");
        diccionario.put("amor", "love");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("casa", "house");
        diccionario.put("árbol", "tree");
        diccionario.put("libro", "book");
        diccionario.put("computadora", "computer");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("puerta", "door");
        diccionario.put("ventana", "window");
        diccionario.put("noche", "night");
        diccionario.put("día", "day");
        diccionario.put("agua", "water");
        diccionario.put("fuego", "fire");
        diccionario.put("tierra", "earth");
        diccionario.put("cielo", "sky");
        diccionario.put("sol", "sun");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una palabra en español: ");
        String palabraEspañol = sc.nextLine().toLowerCase();

        if (diccionario.containsKey(palabraEspañol)) {
            System.out.println("La palabra en inglés es: " + diccionario.get(palabraEspañol));
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }

        sc.close();
    }
}
