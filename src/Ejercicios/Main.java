package Ejercicios;

public class Main {
    public static void main(String[] args) {
        ConvertirBase convertBase = new ConvertirBase(200, 3, 0); /*EJERCICIO DE CONVERTIR DE BASE 10 A OTRA*/
        ConvertirTemperatura convertTemp = new ConvertirTemperatura(40); /*EJERCICIO DE CONVERTIR TEMPERATURA*/
        EcuacionCuadratica ecuacionCuad = new EcuacionCuadratica(3, 5, 6); /*EJERCICIO DE ECUACION CUADRÁTICA*/

        //EJERCICIO DE CONVERTIR DE BASE 10 A OTRA
        convertBase.setBase(5);
        convertBase.setN(194);
        convertBase.setInv(0);

        System.out.println("Convertir " + convertBase.getN() + " en base 10 a base " + convertBase.getBase());
        System.out.println("resultado = " + convertBase.resolver());


        //EJERCICIO DE CONVERTIR TEMPERATURA
        convertTemp.setCelsius(36);

        System.out.println("\nConvertir de Celsius a Farenheit, Kelvin y Rankine ");
        System.out.println(convertTemp.convertir());


        //EJERCICIO DE ECUACION CUADRÁTICA
        ecuacionCuad.setA(2);
        ecuacionCuad.setB(4);
        ecuacionCuad.setC(-6);

        System.out.println(ecuacionCuad.solucion());
    }
}
