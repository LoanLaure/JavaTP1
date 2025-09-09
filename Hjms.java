//Programme qui pour un nombre de secondes données calcule équivalent en
//heures, jours et secondes minutes

import java.util.Scanner;

public class Hjms{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Déclaration des variables        
        int jour = 0;
        int heure = 0;                
        int minute = 0;
        int seconde = 0;

        System.out.print("Donnez une durée en secondes : ");
        int secondes = sc.nextInt();
        int total = secondes;
        while (total != 0){

            if(secondes > 86400){
                for(int i = 0; i < secondes / 86400; i++){
                    jour++;
                    total -= 86400;
                }
            }
            if(secondes > 3600){
                for(int i = 0; i < secondes / 3600; i++){
                    heure++;
                    total -= 3600;
                }            
            }
            if(secondes >= 60){
                for(int i = 0; i < secondes / 60; i++){
                    minute++;
                    total -= 60;                
                }
            }

            seconde = total;
            total = 0;
            
        }
        System.out.println("Cette durée équivaut à : " + jour + " jours " + heure + " heures " + minute + " minutes " + seconde + " secondes.");
    }
}
