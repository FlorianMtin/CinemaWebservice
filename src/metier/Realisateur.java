package metier;

import java.io.Serializable;

/**
 * Created by Florian on 18/12/2016.
 */
public class Realisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    private int NoRea;
    private String NomRea;
    private String PrenRea;

    public Realisateur(int noRea, String nomRea, String prenRea) {
        NoRea = noRea;
        NomRea = nomRea;
        PrenRea = prenRea;
    }

    public Realisateur() {
    }

    public int getNoRea() {
        return NoRea;
    }
    public void setNoRea(int noRea) {
        NoRea = noRea;
    }
    public String getNomRea() {
        return NomRea;
    }
    public void setNomRea(String nomRea) {
        NomRea = nomRea;
    }
    public String getPrenRea() {
        return PrenRea;
    }
    public void setPrenRea(String prenRea) {
        PrenRea = prenRea;
    }
}
