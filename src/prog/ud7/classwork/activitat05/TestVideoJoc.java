
package prog.ud7.classwork.activitat05;

import java.util.ArrayList;
import java.util.Scanner;


public class TestVideoJoc {

    public static void main(String[] args) {

        // Crear una llista amb els 5 videojocs
        ArrayList<VideoJoc> videoJocs = new ArrayList<>();

        videoJocs.add(new VideoJoc("Fortnite", Genere.ACCIO, 40.0));
        videoJocs.add(new VideoJoc("Fifa", Genere.ESPORTS, 50.0));
        videoJocs.add(new VideoJoc("Gran Theft Auto", Genere.ACCIO, 80.0));
        videoJocs.add(new VideoJoc("MineCraft", Genere.SIMULACIO, 60.0));
        videoJocs.add(new VideoJoc("AnimalCrossing", Genere.SIMULACIO, 30.0));
        
        mostraVideojocs(videoJocs);
        
        // Demanar a l'usuari el nom d'un videojoc
        Scanner teclat = new Scanner(System.in);
        System.out.print("Introdueix el nom del videojoc: ");
        String nomVideoJoc = teclat.nextLine();

        // Comprovem si el videojoc està a la llista
        if (videoJocs.contains(new VideoJoc(nomVideoJoc))) {
            System.out.println("Videojoc disponible");
        } else {
            System.out.println("El videojoc '" + nomVideoJoc + "' no està disponible.");
        }

        teclat.close();

    }

    private static void mostraVideojocs(ArrayList<VideoJoc> videoJocs) {
        System.out.println("VIDEOJOCS DIPONIBLES");
        System.out.println(videoJocs);
    }
}
