package miniprojet.model.metier;


import miniprojet.IHM.listview.Sortable;

public abstract class Personnel implements Personne, Sortable{

    private String num;
    private String nom;
    private String prenom;
    private String adresse;
    private String libStatus;

    /**
     * Constructeur de la classe Personnel, implémentée de l'interface Personne et Sortable
     * @param num numéro de l'employé
     * @param nom nom de l'employé
     * @param prenom prénom de l'employé
     * @param adresse adresse de l'employé
     * @param libStatus libelle du status de l'employé
     */
    public Personnel(String num, String nom, String prenom, String adresse, String libStatus) {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.libStatus = libStatus;
    }


    /**Renvoie la cotisation de l'employé
     *
     * @return double
     */
    @Override
    public double calculerCot() {
        return 100;
    }

    /**
     * Renvoie le numéro de l'employé
     * @return String
     */
    public String getNum() {
        return num;
    }

    /**
     * Retourne le nom de l'employé
     * @return String
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne le prénom de l'employé
     * @return String
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Retourne l'adresse de l'employé
     * @return String
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * Retourne le libelle du status de l'employé
     * @return
     */
    public String getLibStatus() {
        return libStatus;
    }

    /**
     * Retourne une chaine de caractère contenant le prenom, nom et libelle de status de l'employé
     * @return String
     */
    public String toString(){
        return this.prenom+" "+this.nom+ " "+this.getLibStatus();
    }

    /**
     * Retourne une chaine de caractère contenant le prenom, nom de l'employé
     * @return String
     */
    @Override
    public String getId()
    {
        return this.prenom + " " + this.prenom;
    }

    /**
     * Retourne une chaine de caractère contenant le prenom, nom et libelle de status de l'employé
     * @return String
     */
    @Override
    public String getText()
    {
        return this.prenom + " " + this.nom + " "+ this.libStatus;
    }

    /**
     * Retourne une chaine de caractère contenant le prenom, nom et libelle de status de l'employé
     * @return String
     */
    @Override
    public String getDetail()
    {
        return this.toString();
    }
}


