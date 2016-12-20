package metier;

import java.io.Serializable;

/**
 * Created by Florian on 18/12/2016.
 */
public class Personnage implements Serializable {

    private static final long serialVersionUID = 1L;
    private int NoFilm;
    private int NoAct;
    private String NomPers;

    public Personnage(int noFilm, int noAct, String nomPers) {
        NoFilm = noFilm;
        NoAct = noAct;
        NomPers = nomPers;
    }

    public Personnage() {
    }

    public int getNoFilm() {
        return NoFilm;
    }
    public void setNoFilm(int noFilm) {
        NoFilm = noFilm;
    }
    public int getNoAct() {
        return NoAct;
    }
    public void setNoAct(int noAct) {
        NoAct = noAct;
    }
    public String getNomPers() {
        return NomPers;
    }
    public void setNomPers(String nomPers) {
        NomPers = nomPers;
    }

}
