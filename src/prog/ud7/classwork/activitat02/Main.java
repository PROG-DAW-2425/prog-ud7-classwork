
package prog.ud7.classwork.activitat02;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static Scanner teclat = new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList<Alumne> alumnes = new ArrayList<>(5);
        
        alumnes.add(new Alumne(1, "Joan", 8.5));
        alumnes.add(new Alumne(2, "Pere", 5.5));
        alumnes.add(new Alumne(3, "Anna", 7.5));
        alumnes.add(new Alumne(4, "Jordi", 6.0));
        alumnes.add(new Alumne(5, "Pau", 9.5));
        
        System.out.println("Total alumnes: " + alumnes.size());
        
        
        // 3.
        System.out.print("\nIntrodueix l'identificador (id) de l'alumne a buscar: ");
        int idAlumne = teclat.nextInt();
        
        int indexAlumne = alumnes.indexOf(new Alumne(idAlumne, " ", 0.0));
        
        if (indexAlumne == -1) {
            System.out.println("Alumne no trobat");
        } else {
            System.out.println("Alumne trobat a l'índex de la llista " 
                    + indexAlumne  + ": " 
                    + alumnes.get(indexAlumne));     // es crida a toString()        
        }
        
        // 4.
        // ELIMINAR ALUMNE PER id        
        System.out.print("\nIntrodueix l'identificador (id) de l'alumne a eliminar: ");
        int idEliminar = teclat.nextInt();

        eliminarAlumne(alumnes, idEliminar);
        

        // 5. AFEGIR UN NOU ALUMNE
        afegirAlumne(alumnes);

        mostrar(alumnes);

        teclat.close();
    }
    
     static void eliminarAlumne(ArrayList<Alumne> alumnes, int id) {
        Alumne alumneAEliminar = new Alumne(id, "", 0);
        
        if (alumnes.remove(alumneAEliminar)) {
            System.out.println("Alumne amb id = '" + id + "' eliminat");
        } else {
            System.out.println("Alumne amb id = '" + id + "' NO eliminat, "
                    + "no està en la llista");
        }
        mostrar(alumnes);  
    }
    
     static void afegirAlumne(ArrayList<Alumne> alumnes) {
        System.out.println("\nIntrodueix les dades del nou alumne: ");
        System.out.print("\tID: ");
        int id = teclat.nextInt();
        teclat.nextLine(); // buidem el que quede al teclat

        System.out.print("\tNom: ");
        String nom = teclat.nextLine();

        System.out.print("\tNota Mitjana: ");
        double nota = teclat.nextDouble();

        Alumne nouAlumne = new Alumne(id, nom, nota);

        // comprovem que l'alumne no hi estiga a la llista
        if (!alumnes.contains(nouAlumne)) {  // crida a equals (comprova l' id)
            alumnes.add(nouAlumne);
            System.out.println("--> Alumne afegit!");
        } else {
            System.out.println("--> No es pot afegir. Ja existeix un alumne amb este id");
        }

    }
    static void mostrar(ArrayList<Alumne> alumnes) {
        System.out.println("\nLlista d'alumnes:");
        for (Alumne alumne : alumnes) {
            System.out.println(alumne);
        }
    }
}
