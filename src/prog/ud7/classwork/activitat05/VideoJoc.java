package prog.ud7.classwork.activitat05;

import java.util.Objects;

public class VideoJoc {
    private String titol;
    private Genere genere;
    private double preu;

    public VideoJoc(String titol, Genere genere, double preu) {
        this.titol = titol;
        this.genere = genere;
        this.preu = preu;
    }
    public VideoJoc(String titol) {
        this(titol, Genere.ACCIO, 0.0);
    }

    public String getTitol() {
        return titol;
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
        final VideoJoc other = (VideoJoc) obj;
        return Objects.equals(this.titol, other.titol);
    }

    @Override
    public String toString() {
        return "Titol = '" + titol + "', Gènere = '" + genere + "', Preu = " + preu;
    }
}
