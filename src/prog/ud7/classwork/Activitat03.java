
package prog.ud7.classwork;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author empar
 */
public class Activitat03 {
    public static void main(String[] args) {
        // Crea un ArrayList amb els noms de 6 companys de classe
        ArrayList<String> companysClasse = new ArrayList<>(4);  // també usant: new ArrayList<>(Arrays.asList("Joan", , ,);
        
        companysClasse.add("Joan");
        companysClasse.add("Maria");
        companysClasse.add("Pere");
        companysClasse.add("Anna");
        companysClasse.add("Jordi");
        companysClasse.add("Laura");

        // Mostrar els noms utilitzant foreach
        System.out.println("Companys de classe:");
        for (String company : companysClasse) {
            System.out.println(company);
        }

        // Demana a l'usuari un nom i comprova si està a la llista
        Scanner teclat = new Scanner(System.in);
        
        System.out.print("\nIntrodueix el nom del company a buscar: ");
        String nomCompany = teclat.nextLine();

        if (companysClasse.contains(nomCompany)) {
            System.out.println("--> " + nomCompany + " és company de classe!");
        } else {
            System.out.println("--> " + nomCompany + " no és company de classe");
        }
        
        teclat.close();
    }
}
