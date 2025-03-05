/*
 Activitat 7. Donades les següents taules que mostren el conjunt de participants
i els resultats obtinguts en diferents proves de classificació per als jocs olímpics, 
crea una classe Participant i 2 llistes (1 per a cada taula) que ens permeten 
representar la següent  informació.

Utilitzant un HashSet, crea un nou llistat que continga tots els participants 
que s'han presentat a qualsevol de les 2 proves. Investiga el mètode addAll.


 */
package prog.ud7.classwork.activitat07;


import java.util.HashSet;

/**
 *
 * @author empar
 */
public class TestParticipant {

    

    public static void main(String[] args) {
                
        HashSet<Participant> prova1 = new HashSet<>();
        
        prova1.add(new Participant("Toni Garcia", "64112243L", 10.12f));
        prova1.add(new Participant("Elena Compte", "72363370B", 12.23f));
        prova1.add(new Participant("Maria Perez", "56099532W", 15.30f));
        prova1.add(new Participant("Juan Magan", "89367935D", 18.5f));
       
        HashSet<Participant> prova2 = new HashSet<>();
        
        prova2.add(new Participant("Toni Garcia", "64112243L", 10.12f));
        prova2.add(new Participant("Ernesto Compte", "39059576X",20.10f));
        prova2.add(new Participant("Mari Carmen Ruíz", "26723726A", 21.10f));        
        prova2.add(new Participant("Elena García", "87787367R",20.05f));
        
        
        System.out.println("Nombre de participants prova1: " + prova1.size());
        System.out.println("Nombre de participants prova2: " + prova1.size());
        
        
        // participants en les dues proves
        HashSet<Participant> participantProves = new HashSet<>();
        
        participantProves.addAll(prova1);
        participantProves.addAll(prova2);
        System.out.println("\nNombre de participants en les dues proves: " + participantProves.size());
        for (Participant participant : participantProves) {
            System.out.println(participant);
        }
        
    }

}
