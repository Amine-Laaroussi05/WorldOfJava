package WrathOfOracle;

import java.util.Scanner;

public class Program {

    static class Monde{

        /**
         * Method: créer un personnage.
         * Demande à l'utilisateur de saisir son nom.
         * crée une classe personnage en initialisant les points de vie à 0, les dégats à 0 et avec le nom saisi.
         * @return une instance de la classe Personnage correctement instancié.
         */
        public static Personnage personnageFactory(){
            String nom = Tools.inputString("Saisir un nom de personnage: ");
            Personnage personnage = new Personnage(0,0,nom);
            return personnage;
        }


        /**
         * Method: affiche les informations du monde
         * Pour l'instant, la méthode affiche seulement le personnage
         * @param personnage
         */
        public static void afficherInformations(Personnage personnage){
            personnage.toString();
        }

    }









}
