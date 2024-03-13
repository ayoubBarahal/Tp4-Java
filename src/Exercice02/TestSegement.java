package Exercice02;

public class TestSegement {
    public static void main(String[] args) {
        int x1=Integer.parseInt(args[0]);
        int x2=Integer.parseInt(args[1]);
        int x3=Integer.parseInt(args[2]);

        Segement segement=new Segement(x1,x2);
        System.out.println("La longeur de segement : ["+segement.getExtr1()+","+segement.getExtr2()+"] : "+segement.longeur());
        System.out.println(x3+"appartient au segement ["+segement.getExtr1()+","+segement.getExtr2()+"]");





    }
}
