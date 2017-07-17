package agence.mon.model;

/**
 * Classe métier ou Objet métier ou PlainOldJavaObject
 * 
 * @author Administrateur
 *
 */
public class Adresse
{

    // Attributs
    private String adresse;
    private String codePostal;
    private int    id;
    private String pays;
    private String ville;

    // Constructeur
    public Adresse()
    {

    }

    // Getters(accesseurs) et Setters(mutateurs)
    public String getAdresse()
    {
        return adresse;
    }

    public String getCodePostal()
    {
        return codePostal;
    }

    public int getId()
    {
        return id;
    }

    public String getPays()
    {
        return pays;
    }

    public String getVille()
    {
        return ville;
    }

    public void setAdresse(String adresse)
    {
        this.adresse = adresse;
    }

    public void setCodePostal(String codePostal)
    {
        this.codePostal = codePostal;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setPays(String pays)
    {
        this.pays = pays;
    }

    public void setVille(String ville)
    {
        this.ville = ville;
    }

    @Override
    public String toString()
    {
        return "Adresse ID " + id + " : " + adresse + " " + codePostal + " - " + ville + " [" + pays
                + "]";
    }

}
