package metier;

/**
 * Created by Florian on 18/12/2016.
 */
public class Categorie {

    private String CodeCat;
    private  String LibelleCat;

    public Categorie(String codeCat, String libelleCat) {
        this.CodeCat = codeCat;
        this.LibelleCat = libelleCat;
    }

    public Categorie() {
    }

    public String getCodeCat() {
        return CodeCat;
    }
    public void setCodeCat(String codeCat) {
        CodeCat = codeCat;
    }
    public String getLibelleCat() {
        return LibelleCat;
    }
    public void setLibelleCat(String libelleCat) {
        LibelleCat = libelleCat;
    }
}

