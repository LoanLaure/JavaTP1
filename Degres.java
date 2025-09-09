//Programme qui lit une température exprimée en dgrés Fahrenheit et affiche
//sa valeur en degrés Celsius.

import java.util.Scanner;

public class Degres{

    public static void main(String[] args){
    //Déclaration des variables
        Scanner sc = new Scanner(System.in);
        Double celsius = 0.;

    //Lecture et affichage
        System.out.print("Entrez une température en Fahrenheit : ");
        Double fahrenheit = sc.nextDouble();
        celsius = (fahrenheit - 32) * 5/9;
        System.out.println("En degrés Celsius cela fait " + celsius + " degrés.");
    
    }
}
