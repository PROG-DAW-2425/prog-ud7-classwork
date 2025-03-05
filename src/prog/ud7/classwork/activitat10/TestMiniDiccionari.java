
package prog.ud7.classwork.activitat10;

import java.util.HashSet;
import java.util.Scanner;

public class TestMiniDiccionari {

    private static final Scanner teclat = new Scanner(System.in);

    public static void main(String[] args) {
        MiniDiccionari miniDiccionari = new MiniDiccionari();

        System.out.println("-- DICCIONARI CASTELLÀ - ANGLÉS --");
        miniDiccionari.mostrarDiccionari();
        
        traduirParaula(miniDiccionari);

        practicaTraduccio(miniDiccionari);
        
        teclat.close();
    }

    private static void traduirParaula(MiniDiccionari miniDiccionari) {
        System.out.println(" -- TRADUCTOR CASTELLÀ - ANGLÉS --");
        System.out.print("Introdueix la paraula que vols traduir: ");
        String paraula = teclat.nextLine();

        String traduccio = miniDiccionari.tradueixParaula(paraula);

        if (traduccio != null) {
            System.out.printf("%s --> \"%s\"\n", paraula, traduccio);
        } else {
            System.out.println("Ho senc, \"" + paraula + "\" no està al diccionari\n");
        }

    }

    private static void practicaTraduccio(MiniDiccionari miniDiccionari) {
        HashSet<String> paraulesEspanyol = miniDiccionari.genera5ParaulesAleatories();
        
        System.out.println("\n-- PRACTIQUEM! TRADUEIX A L'ANGLÉS 5 PARAULES --");
        
        int numTraduccionsCorrectes = 0;
        for (String paraulaCastella : paraulesEspanyol) {
            String traduccio = miniDiccionari.tradueixParaula(paraulaCastella);  
            
            System.out.printf("\n \"%s\", en anglés? : ", paraulaCastella);
            String respostaUsuari = teclat.nextLine().trim();

            if (traduccio != null && traduccio.equalsIgnoreCase(respostaUsuari)) {
                System.out.println(" Correcte!");
                numTraduccionsCorrectes++;
            } else {
                System.out.println(" No es correcte! La traducció correcta és: \"" + traduccio + "\"");
            }
        }

        System.out.println("\nResultats obtinguts:");
        System.out.println(" Correctes: " + numTraduccionsCorrectes);
        System.out.println(" Incorrectes: " + (5 - numTraduccionsCorrectes));
    }

}
