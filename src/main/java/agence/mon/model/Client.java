package agence.mon.model;

/**
 * @author Administrateur
 *
 */
public class Client
{

    /**
     * L'adresse du client. Relation unidirectionnelle binaire de cardinalité
     * 1..1
     */
    private Adresse adresse;
    private String  email;
    private int     id;
    private String  nom;
    private String  numeroFax;
    private String  numeroTel;
    private String  prenom;

    /**
     * 
     */
    public Client()
    {
        // this.adresse = adresse;
    }

    /**
     * @return the adresse
     */
    public Adresse getAdresse()
    {
        return adresse;
    }

    /**
     * @return the email
     */
    public String getEmail()
    {
        return email;
    }

    // Les getters et les setters.
    /**
     * @return the id
     */
    public int getId()
    {
        return id;
    }

    /**
     * @return the nom
     */
    public String getNom()
    {
        return nom;
    }

    /**
     * @return the numeroFax
     */
    public String getNumeroFax()
    {
        return numeroFax;
    }

    /**
     * @return the numeroTel
     */
    public String getNumeroTel()
    {
        return numeroTel;
    }

    public String getPrenom()
    {
        return prenom;
    }

    /**
     * @param adresse
     *            the adresse to set
     */
    public void setAdresse(Adresse adresse)
    {
        this.adresse = adresse;
    }

    /**
     * @param email
     *            the email to set
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /**
     * @param nom
     *            the nom to set
     */
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    /**
     * @param numeroFax
     *            the numeroFax to set
     */
    public void setNumeroFax(String numeroFax)
    {
        this.numeroFax = numeroFax;
    }

    /**
     * @param numeroTel
     *            the numeroTel to set
     */
    public void setNumeroTel(String numeroTel)
    {
        this.numeroTel = numeroTel;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "Client [id=" + id + ", nom=" + nom + ", numeroTel=" + numeroTel + ", email=" + email
                + ", adresse=" + adresse + "]";
    }

}