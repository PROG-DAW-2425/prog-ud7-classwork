package prog.ud7.classwork.activitat10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

public class MiniDiccionari {

    private final HashMap<String, String> diccionari;

    public MiniDiccionari() {
        this.diccionari = new HashMap<>();
        iniciarDiccionariCastella();
    }

    private void iniciarDiccionariCastella() {
        diccionari.put("sol", "sun");
        diccionari.put("luna", "moon");
        diccionari.put("estrella", "star");
        diccionari.put("cielo", "sky");
        diccionari.put("montaña", "mountain");
        diccionari.put("río", "river");
        diccionari.put("mar", "sea");
        diccionari.put("bosque", "forest");
        diccionari.put("flor", "flower");
        diccionari.put("árbol", "tree");
        diccionari.put("pájaro", "bird");
        diccionari.put("pez", "fish");
        diccionari.put("viento", "wind");
        diccionari.put("lluvia", "rain");
        diccionari.put("nieve", "snow");
        diccionari.put("fuego", "fire");
        diccionari.put("tierra", "earth");
        diccionari.put("ciudad", "city");
        diccionari.put("pueblo", "town");
        diccionari.put("camino", "path");
    }

    public void iniciarDiccionariValencia() {
        diccionari.put("sol", "sol");
        diccionari.put("lluna", "moon");
        diccionari.put("estrella", "star");
        diccionari.put("cel", "sky");
        diccionari.put("muntanya", "mountain");
        diccionari.put("riu", "river");
        diccionari.put("mar", "sea");
        diccionari.put("bosc", "forest");
        diccionari.put("flor", "flower");
        diccionari.put("arbre", "tree");
        diccionari.put("ocell", "bird");
        diccionari.put("peix", "fish");
        diccionari.put("vent", "wind");
        diccionari.put("pluja", "rain");
        diccionari.put("neu", "snow");
        diccionari.put("foc", "fire");
        diccionari.put("terra", "earth");
        diccionari.put("ciutat", "city");
        diccionari.put("poble", "town");
        diccionari.put("camí", "path");
    }

    public String tradueixParaula(String paraula) {
        return diccionari.get(paraula.toLowerCase());        
    }

    public void mostrarDiccionari() {
        for (Map.Entry parella : diccionari.entrySet()) {
            System.out.printf("%s -> %s\n", parella.getKey(), parella.getValue());
        }
    }

    public HashSet<String> genera5ParaulesAleatories() {
        // Creem una llista a partir de totes les paraules (claus, keyset) que tenim al diccionari
        // Aixina podrem accedir per l'índex aleatori que generarem després
        ArrayList<String> paraulesCastella = new ArrayList<>(diccionari.keySet());

        // Per a no repetir paraules quan es genera el mateix index aleatori, crearem un conjunt
        HashSet<String> conjuntParaulesAleatories = new HashSet<>();

        Random random = new Random();
        
        do {
            // generem aleatòriament un índex de la llista de paraules
            int indexAleatori = random.nextInt(paraulesCastella.size());

            // obtenim la paraula corresponent a l'índex
            String paraulaAleatoria = paraulesCastella.get(indexAleatori);

            // Afegim la paraula al conjunt (si ja està, no s'hi afegirà)
            conjuntParaulesAleatories.add(paraulaAleatoria);

        } while (conjuntParaulesAleatories.size() < 5);

        return conjuntParaulesAleatories;
    }
}
