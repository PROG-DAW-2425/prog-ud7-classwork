package prog.ud7.classwork;

import java.util.HashSet;
import java.util.Scanner;

public class Activitat06 {

    public static void main(String[] args) {
        HashSet<String> conjuntNoms = new HashSet<>();

        Scanner teclat = new Scanner(System.in);
        System.out.println("Introdueix noms separats per espais (FI acabar)");
        while (true) {
            String nom = teclat.next();
            if (nom.equalsIgnoreCase("FI")) {
                break;
            }
            // afegim nom al conjunt
            conjuntNoms.add(nom);            
        }
        teclat.close();
        
        // Mostrem noms del conjunt
        for(String nom : conjuntNoms) {
            System.out.println(nom);
        }
    }
}
