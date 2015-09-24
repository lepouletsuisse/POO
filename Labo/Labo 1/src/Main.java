/*
 -----------------------------------------------------------------------------------
 Laboratoire : 01
 Fichier     : Main.java
 Auteur(s)   : Samuel Darcey
 Date        : 22.09.2015

 But         : Apprendre quelque notions de base de JAVA

 Remarque(s) : Travail seul

 Compilateur : jdk1.8.0_60
 -----------------------------------------------------------------------------------
*/

public class Main {
    final static int FR1 = 100; // Constante pour 1 francs

    public static void main(String args[]) {
        Ex1();
        Ex2();
    }

    public static void Ex1() {
        System.out.println("Vive la POO ! ");
    }

    public static void Ex2() {
        int nbPoss = 0; //Nombre de possibilité
        for (int cent50 = 0; cent50 <= 2; cent50++) { //Nombre de pièce de 50 centimes
            for (int cent20 = 0; cent20 <= 5; cent20++) { //Nombre de pièce de 20 centimes
                for (int cent10 = 0; cent10 <= 10; cent10++) { //Nombre de pièce de 10 centimes
                    for (int cent5 = 0; cent5 <= 20; cent5++) { //Nombre de pièce de 5 centimes
                        if (5 * cent5 + 10 * cent10 + 20 * cent20 + 50 * cent50 == FR1) { // Control si le résultat est valide (= 1 Frs)
                            System.out.print("1 Frs = ");
                            if (cent5 != 0) { // Affiche les 5 centimes
                                System.out.print(cent5 + " x 5 cts");
                            }
                            if (cent10 != 0) { // Affiche les 10 centimes
                                System.out.print((cent5 == 0 ? "" : " + ") + cent10 + " x 10 cts");
                            }
                            if (cent20 != 0) { // Affiche les 20 centimes
                                System.out.print((cent5 == 0 && cent10 == 0 ? "" : " + ") + cent20 + " x 20 cts");
                            }
                            if (cent50 != 0) { // Affiche les 50 centimes
                                System.out.print((cent5 == 0 && cent10 == 0 && cent20 == 0 ? "" : " + ") + cent50 + " x 50 cts");
                            }
                            System.out.println();
                            nbPoss++; // Incémente le nombre de possibilité
                        }
                    }
                }
            }
        }
        System.out.println("En tout, il y a " + nbPoss + " facons d'obtenir 1 Frs");
    }
}