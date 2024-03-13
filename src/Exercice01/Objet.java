package Exercice01;

public class Objet {
    private static int nbrinstance=0;
    public Objet(){
        nbrinstance++;
        System.out.println("Le Nombres des instances déja creés  est : "+nbrinstance);

    }
}
