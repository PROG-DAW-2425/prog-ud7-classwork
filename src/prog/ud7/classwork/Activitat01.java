package prog.ud7.classwork;

import java.util.ArrayList;
import java.util.Scanner;

public class Activitat01 {

    public static void main(String[] args) {
        ArrayList<String> colorsArcSanMarti = new ArrayList<>();

        colorsArcSanMarti.add("vermell");
        colorsArcSanMarti.add("taronja");
        colorsArcSanMarti.add("groc");
        colorsArcSanMarti.add("verd");
        colorsArcSanMarti.add("blau");
        colorsArcSanMarti.add("índigo");
        colorsArcSanMarti.add("violeta");

        System.out.println("Nombre de colors: "
                + colorsArcSanMarti.size());

        int posicioColorVermell = colorsArcSanMarti.indexOf("Vermell".toLowerCase());
        System.out.println("La posició del vermell és: " + posicioColorVermell);

        for (int i = 0; i < colorsArcSanMarti.size(); i++) {
               System.out.print(" " + colorsArcSanMarti.get(i));  
        }
        System.out.println();
        
        
        demanarColor(colorsArcSanMarti);
    }
    
    private static void demanarColor(ArrayList<String> llistaColors){
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix el color que vols buscar: ");
        String colorUsuari = teclat.nextLine();
        
        if (llistaColors.contains(colorUsuari)) {
            System.out.println("El color '" + colorUsuari + "' està a la llista");
        } else {
            System.out.println("El color '" + colorUsuari + "' NO  està a la llista");
            llistaColors.add(colorUsuari);
        }
        
        // mostrem llista colors
        for(String color : llistaColors) {
            System.out.println(" " + color);
        }
                
        teclat.close();
    }
    

}
