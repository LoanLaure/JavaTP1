//Programme qui lit trois nombres au clavier, les classe dans l'ordre croissant
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
        if ( (premier < deuxieme) && (premier < dernier) ){
            first = premier;
	  if(deuxieme <= dernier) {
	    sec = deuxieme;
	    last = dernier;
	  } else if (dernier <= deuxieme){
	    sec = dernier;
	    last = deuxieme;
	  }
        }else if((deuxieme < premier) && (deuxieme < dernier)){
            first = deuxieme;
	  if(premier <= dernier) {
	    sec = premier;
	    last = dernier;
	  } else if (dernier <= premier){
	    sec = dernier;
	    last = premier;
	  }
        }else if((dernier < premier) && (dernier < deuxieme)){
            first = dernier;
	   if(premier <= deuxieme) {
	    sec = premier;
	    last = deuxieme;
	  } else if (deuxieme <= premier){
	    sec = deuxieme;
	    last = premier;
	  }
        }

        //Affichage
        System.out.println("Les nombres dans l'ordre croissant : " + first + " " + sec + " " + last);
    
    }
}
