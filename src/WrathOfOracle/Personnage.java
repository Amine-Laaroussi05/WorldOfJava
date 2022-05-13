package WrathOfOracle;

public class Personnage {


    /**
     * Attributes
     * @param pointDeVie : int
     * @param degat : int
     * @param nom : String
     *
     */
    private int pointDeVie;
    private int degat;
    private String nom;



    /**
     * Getters & Setters
     * Filtre les points de vies de sortent à ce qu'il soit un nombre positif.
     */

    //Getters & Setters
    public int getPointDeVie() {
        return this.pointDeVie;
    }

    public void setPointDeVie(int pointDeVie) {
        if(this.pointDeVie <0){
            throw new IllegalArgumentException("Le nombre de points de vie doit être un nombre positif.");
        }
        this.pointDeVie = pointDeVie;
    }

    public int getDegat() {
        return this.degat;
    }

    public void setDegat(int degat) {
        this.degat = degat;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    /**
     * Constructors
     * @param pointDeVie
     * @param degat
     * @param nom
     */
    public Personnage(int pointDeVie, int degat, String nom) {
        this.pointDeVie = pointDeVie;
        this.degat = degat;
        this.nom = nom;
    }


    @Override
    public String toString() {
        return "Personnage [nom: " + this.getNom() + ", pointDeVie:  " + this.getPointDeVie() + ", attaque: " + getDegat() + "]";
    }
}
