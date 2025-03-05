
package prog.ud7.classwork;

import java.util.ArrayList;

/**
 *
 * @author empar
 */
public class Activitat04 {
    private static final int NUM_VALORS = 50;
    
    public static void main(String[] args) {
        
        // Crear un ArrayList  i afegir-li 50 valors aleatoris entre 0 i 100
        ArrayList<Integer> numerosAleatoris = new ArrayList<>(NUM_VALORS); // 50 elements: tamany inicial

        for (int i = 0; i < NUM_VALORS; i++) {
            // Generem un valor entre 0 i 100
            int numAleatori = (int) (Math.random() * 101);   // (max-min+1 + min)
            // rabdom.nextInt(0, 51);
            // L'afegim a la llista
            numerosAleatoris.add(numAleatori);  
        }

        // Calcular la suma, la mitjana, el màxim i el mínim
        int suma = 0;
        int max, min;
        max = numerosAleatoris.get(0);  // També valdria: = 0
        min = numerosAleatoris.get(0);  // També valdria: = 100 
        

        for (int num : numerosAleatoris) {
            suma += num;
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        double mitjana = (double) suma / numerosAleatoris.size();
        
        // Mostrar els resultats
        System.out.println(numerosAleatoris.toString());
        System.out.println("Suma: " + suma);
        System.out.println("Mitjana: " + mitjana);
        System.out.println("Màxim: " + max);
        System.out.println("Mínim: " + min);
    }
}
