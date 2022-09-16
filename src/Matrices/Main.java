package Matrices;

public class Main {
    public static void main(String[] args) {

        /*CREACIÓN DE OBJETOS Y DECLARACIÓN DE ARGUMENTOS*/
        int matrizBase[][] = {{0,0,0},{0,0,0},{0,0,0}};/*Usado para el argumento de la matriz, max 3x3 */  /*Uso este método ya que de los tantos que probé es el unico que me permite enviar una matriz a las otras clases*/
        CrearMatriz crearMatriz = new CrearMatriz(matrizBase, 2,3); //EJERCICIO DE CREAR MATRIZ
        int matrizA[][] = {{2,4},{6,8}};/*Usado para el argumento de la matriz*/
        int matrizB[][] = {{1,3},{5,7}};/*Usado para el argumento de la matriz*/
        SumaMatrices sumaMatrices = new SumaMatrices(matrizA, matrizB, matrizBase, 2, 2); //EJERCICIO SUMA DE MATRICES
        MultMatrices multMatrices = new MultMatrices(matrizA, matrizB, matrizBase, 2, 2); //EJERCICIO PRODUCTO DE MATRICES

        //EJERCICIO DE CREAR MATRIZ
        crearMatriz.setColumna(3);
        crearMatriz.setFila(2);
        crearMatriz.setMatriz(matrizBase);

        System.out.println("MOSTRANDO MATRIZ");
        crearMatriz.mostrarMatriz();/*Lo pongo sin el >>System.out.println()<< ya que de lo contrario me pide un valor de retorno*/


        //EJERCICIO DE SUMA DE MATRICES
        sumaMatrices.setColumna(2);
        sumaMatrices.setFila(2);
        sumaMatrices.setMatriz1(matrizA);
        sumaMatrices.setMatriz2(matrizB);
        sumaMatrices.setSumaMatriz(matrizBase);

        System.out.println("\nEJERCICIO SUMA DE MATRICES");
        sumaMatrices.mostrarMatrices();
        sumaMatrices.sumarMatrices();


        //EJERCICIO MULTIPLICACIÓN DE MATRICES
        multMatrices.setColumna(2);
        multMatrices.setFila(2);
        multMatrices.setMatriz1(matrizA);
        multMatrices.setMatriz2(matrizB);
        multMatrices.setMultMatriz(matrizBase);

        System.out.println("\nEJERCICIO PRODUCTO DE MATRICES");
        multMatrices.mostrarMatrices();
        multMatrices.multMatrices();

    }
}
