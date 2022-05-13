package WrathOfOracle;

import java.util.Scanner;

public class Tools {

    /**
     * Method: afficher un message pour inviter l'utilisateur à saisir
     * @param message
     * @return Le String saisi suivant les instructions demandées
     */
    public static String inputString(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.next();
    }
}
