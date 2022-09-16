package Matrices;

public class CrearMatriz {
    //DECLARAMOS VARIABLES PÚBLICAS
    public int matriz[][]; /*= {{1,2,3},{4,5,6}}*/  /*Vi en algunas referencias que usan >>int[][] variable;<< y en otras >>int variable[][];<<, ambas funcionan, pero no sé que forma es más recomendada de usar*/
    public int fila;
    public int columna;
    public int i, j; /*Iteradores*/


    //CONSTRUCTOR
    public CrearMatriz(int[][] numMatriz, int numFila, int numColumna) {
        matriz = numMatriz;
        fila = numFila;
        columna = numColumna;
    }


    //GET Y SET
    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
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
    public void mostrarMatriz(){
        /*Reemplaza los datos de las matrices por un número al azar entre 1 y 10*/
        for(i=0;i<getFila();i++){
            for(j=0;j<getColumna();j++){
                matriz[i][j] = (int) (Math.random()*(10-1)+1);
            }
        }
        for(i=0;i<getFila();i++){
            for(j=0;j<getColumna();j++){
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println();
        }
    }


}
