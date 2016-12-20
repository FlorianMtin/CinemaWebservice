package metier;

import java.io.Serializable;

/**
 * Created by Florian on 18/12/2016.
 */
public class Film implements Serializable {
    private static final long serialVersionUID = 1L;

    private int NoFilm;
    private String Titre;
    private int Duree;
    private String DateSortie;
    private int Budget;
    private int MontantRecette;
    private int NoRea;
    private String CodeCat;

    public Film(int noFilm, String titre, int duree, String dateSortie, int budget, int montantRecette, int noRea, String codeCat) {
        NoFilm = noFilm;
        Titre = titre;
        Duree = duree;
        DateSortie = dateSortie;
        Budget = budget;
        MontantRecette = montantRecette;
        NoRea = noRea;
        CodeCat = codeCat;
    }

    public Film() {

    }

    public int getNoFilm() {
        return NoFilm;
    }
    public void setNoFilm(int noFilm) {
        NoFilm = noFilm;
    }
    public String getTitre() {
        return Titre;
    }
    public void setTitre(String titre) {
        Titre = titre;
    }
    public int getDuree() {
        return Duree;
    }
    public void setDuree(int duree) {
        Duree = duree;
    }
    public String getDateSortie() {
        return DateSortie;
    }
    public void setDateSortie(String dateSortie) {
        DateSortie = dateSortie;
    }
    public int getBudget() {
        return Budget;
    }
    public void setBudget(int budget) {
        Budget = budget;
    }
    public int getMontantRecette() {
        return MontantRecette;
    }
    public void setMontantRecette(int montantRecette) {
        MontantRecette = montantRecette;
    }
    public int getNoRea() {
        return NoRea;
    }
    public void setNoRea(int noRea) {
        NoRea = noRea;
    }
    public String getCodeCat() {
        return CodeCat;
    }
    public void setCodeCat(String codeCat) {
        CodeCat = codeCat;
    }
}


