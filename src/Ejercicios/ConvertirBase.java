package Ejercicios;

public class ConvertirBase {
    //DECLARAMOS VARIABLES PÚBLICAS
    public int n;
    public int base;
    public int inv;


    //CONSTRUCTOR
    public ConvertirBase(int numN, int numBase, int numInv){
        n = numN;
        base = numBase;
        inv = numInv;
    }


    //GET Y SET
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getInv(){
        return inv;
    }

    public void setInv(int inv){
        this.inv = inv;
    }


    //OTRAS MÉTODOS O FUNCIONES PARA LA SOLUCIÓN DEL ENUNCIADO
    public int resolver(){
        while (n>0){
            inv=((10*getInv())+(getN()%getBase()));
            n=getN()/getBase();
        }
        while (getInv()>0) {
            n = (10 * getN()) + (getInv()%10);
            inv = getInv() / 10;
        }
        return getN();
    }
}
