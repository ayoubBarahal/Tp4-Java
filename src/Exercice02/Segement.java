package Exercice02;

public class Segement {
    private int extr1 , extr2 ;

    public Segement(int extr1,int extr2){
        this.extr1=extr1;
        this.extr2=extr2;
        this.ordonne();
    }
    private void ordonne(){
        int tmp;
        if(extr1>extr2){
            tmp=extr1;
            extr1=extr2;
            extr2=tmp;
        }
    }
    public int longeur(){
        return extr2-extr1;
    }

    public boolean appartient(int x){
        this.ordonne();
        if(x>=extr1 && x<=extr2)
            return true ;
        else
            return false;

    }
    public int getExtr1(){
        return extr1;
    }

    public int getExtr2(){
        return extr2;
    }

    public int setExtr1(int extr1){
        return this.extr1=extr1;
    }
    public int setExtr2(int extr1){
        return this.extr2=extr2;
    }

    public String toString(){
        return "segement["+extr1+","+extr2+"]" ;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj instanceof Segement) {
            if (this.extr1 == ((Segement) obj).extr1 && this.extr2 == ((Segement) obj).extr1)
                return true;

        }
        return false;

    }
}
