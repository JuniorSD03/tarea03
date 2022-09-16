package Matrices;

public class MultMatrices {
    //DECLARAMOS VARIABLES PÚBLICAS
    public int matriz1[][] = {{2,4},{6,8}};
    public int matriz2[][]= {{2,1},{4,3}};
    public int multMatriz[][]= {{0,0},{0,0}};
    public  int fila;
    public  int columna;
    public int i, j; /*Iteradores*/
    //CONSTRUCTOR
    public MultMatrices(int[][] matriz1, int[][] matriz2, int[][] multMatriz, int fila, int columna) {
        this.matriz1 = matriz1;
        this.matriz2 = matriz2;
        this.multMatriz = multMatriz;
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

    public void setMultMatriz(int[][] multMatriz) {
        this.multMatriz = multMatriz;
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

    public void multMatrices(){
        for(i=0;i<getFila();i++){
            for(j=0;j<getColumna();j++){
                multMatriz[i][j] = matriz1[i][j]*matriz2[j][i];
            }
        }
        System.out.print("\nMULTIPLICACIÓN DE MATRICES\n");
        for(i=0;i<getFila();i++){
            for(j=0;j<getColumna();j++){
                System.out.print("\t" + multMatriz[i][j]);
            }
            System.out.println();
        }
    }
}
