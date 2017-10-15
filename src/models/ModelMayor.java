package models;


public class ModelMayor {
    int n1 = 9;
    int n2 = 6;
    int n3 = 3;
    int r = 9;
    
    public int getN1(){
        return n1;
    }
    public void setN1(int n1){
        this.n1 = n1;
    }
    public int getN2(){
        return n2;
    }
    public void setN2(int n2){
        this.n2 = n2;
    }
    public int getN3(){
        return n3;
    }
    public void setN3(int n3){
        this.n3 = n3;
    }
    public int getR(){
        return r;
    }
    public void setR(int r){
        this.r = r;
    }
    
    public void mayor(){
        r = n1;
        if(n2>r){
            r = n2;
        }
        if(n3>r){
            r = n3;
        }
    }
}
