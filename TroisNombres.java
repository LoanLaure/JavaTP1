//Programme qui lit trois nombres au clavier,classe les dans l'ordre croissant
//et les affiche dans cet ordre

import java.util.Scanner;

public class TroisNombres{

    public static void main(String[] args){
        Scanner sc_1 = new Scanner(System.in);
        Scanner sc_2 = new Scanner(System.in);
        Scanner sc_3 = new Scanner(System.in);

        //Lecture
        System.out.print("1er nombre : ");
        int premier = sc_1.nextInt();
        System.out.print("2e nombre : ");
        int deuxieme = sc_2.nextInt();
        System.out.print("3e nombre : ");
        int dernier = sc_3.nextInt();
        
        //Déclaration des variables
        int first = 0;
        int sec = 0;
        int last = 0;

        //Conditions d'affichage
        if ((premier < deuxieme) && (premier < dernier)){
            first = premier;
        }else if((deuxieme < premier) && (deuxieme < dernier)){
            first = deuxieme;
        }else if((dernier < premier) && (dernier < deuxieme)){
            first = dernier;
        }

        //Affichage
        System.out.println("Le plus petit des Trois Nombres est : " + first);
    
    }
}
