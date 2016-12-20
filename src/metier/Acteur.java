package metier;

import java.io.Serializable;

/**
 * Created by Florian on 18/12/2016.
 */
public class Acteur  implements Serializable{

    private static final long serialVersionUID = 1L;
    private int NoAct;
    private String NomAct;
    private String PrenAct;
    private String DateNaiss;
    private String DateDeces;

    public Acteur(int noAct, String nomAct, String prenAct, String dateNaiss, String dateDeces) {
        this.NoAct = noAct;
        this.NomAct = nomAct;
        this.PrenAct = prenAct;
        this.DateNaiss = dateNaiss;
        this.DateDeces = dateDeces;
    }

    public Acteur(){

    }

    public int getNoAct() {
        return NoAct;
    }
    public void setNoAct(int noAct) {
        NoAct = noAct;
    }
    public String getNomAct() {
        return NomAct;
    }
    public void setNomAct(String nomAct) {
        NomAct = nomAct;
    }
    public String getPrenAct() {
        return PrenAct;
    }
    public void setPrenAct(String prenAct) {
        PrenAct = prenAct;
    }
    public String getDateNaiss() {
        return DateNaiss;
    }
    public void setDateNaiss(String dateNaiss) {
        DateNaiss = dateNaiss;
    }
    public String getDateDeces() {
        return DateDeces;
    }
    public void setDateDeces(String dateDeces) {
        DateDeces = dateDeces;
    }
}
