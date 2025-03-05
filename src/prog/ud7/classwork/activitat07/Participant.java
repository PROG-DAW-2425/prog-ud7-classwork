
package prog.ud7.classwork.activitat07;

import java.util.Objects;


public class Participant {
    private String nom;
    private String dni;
    private float temps;

    public Participant(String nom, String dni, float temps) {
        this.nom = nom;
        this.dni = dni;
        this.temps = temps;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nom);
        hash = 97 * hash + Objects.hashCode(this.dni);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Participant other = (Participant) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return Objects.equals(this.dni, other.dni);
    }

    
    
    @Override
    public String toString() {
        return "Participant{" + "nom=" + nom + ", dni=" + dni + ", temps=" + temps + '}';
    }
    
}
