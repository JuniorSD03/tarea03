package Matrices;

public class SumaMatrices {
    //DECLARAMOS VARIABLES PÚBLICAS
    public int matriz1[][]; /*= {{1,2,3},{4,5,6}};*/
    public int matriz2[][]; /*= {{7,8,9},{10,11,12}}*/
    public int sumaMatriz[][]; /*= {{0,0,0},{0,0,0}};*/
    public  int fila;
    public  int columna;
    public int i, j; /*Iteradores*/


    //CONSTRUCTOR
    public SumaMatrices(int[][] matriz1, int[][] matriz2, int[][] sumaMatriz, int fila, int columna) {
        this.matriz1 = matriz1;
        this.matriz2 = matriz2;
        this.sumaMatriz = sumaMatriz;
        this.fila = fila;
        this.columna = columna;
    }


    //GET Y SET
    public void setMatriz1(int[][] matriz1) {
        this.matriz1 = matriz1;
    }

    public void setMatriz2(int[][] matriz2) {
        this.matriz2 = matriz2;
    }

    public void setSumaMatriz(int[][] sumaMatriz) {
        this.sumaMatriz = sumaMatriz;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }


    //OTROS MÉTODOS O FUNCIONES PARA LA SOLUCIÓN DEL ENUNCIADO
    public void mostrarMatrices(){
        System.out.print("MATRIZ 1\n");
        for(i=0;i<getFila();i++){
            for(j=0;j<getColumna();j++){
                System.out.print("\t" + matriz1[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nMATRIZ 2\n");
        for(i=0;i<getFila();i++){
            for(j=0;j<getColumna();j++){
                System.out.print("\t" + matriz2[i][j]);
            }
            System.out.println();
        }
    }

    public void sumarMatrices(){
        for(i=0;i<getFila();i++){
            for(j=0;j<getColumna();j++){
                sumaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        System.out.print("\nSUMA DE MATRICES\n");
        for(i=0;i<getFila();i++){
            for(j=0;j<getColumna();j++){
                System.out.print("\t" + sumaMatriz[i][j]);
            }
            System.out.println();
        }
    }
}
