
package prog.ud7.classwork.activitat02;

public class Alumne {
    private int id;
    private String nom;
    private double notaMitjana;

    public Alumne(int id, String nom, double notaMitjana){
        this.id = id;
        this.nom = nom;
        this.notaMitjana = notaMitjana;
    }
    

    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public double getNotaMitjana() {
        return notaMitjana;
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
        final Alumne other = (Alumne) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Alumne{" + "id=" + id + ", nom="
                + nom + ", notaMitjana=" + notaMitjana + '}';
    }
    
    
}
