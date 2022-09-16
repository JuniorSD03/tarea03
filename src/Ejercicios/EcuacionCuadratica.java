package Ejercicios;

public class EcuacionCuadratica {
    //DECLARAMOS VARIABLES PÚBLICAS
    public double a;
    public double b;
    public double c;


    //CONSTRUCTOR
    public EcuacionCuadratica(double numA, double numB, double numC){
        a = numA;
        b = numB;
        c = numC;
    }


    // GET Y SET
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    //OTROS MÉTODOS O FUNCIONES PARA LA SOLUCIÓN DEL ENUNCIADO
    public double discriminante(){
        //DECLARAMOS VARIABLE USADA
        double expresion;

        //RESOLVEMOS LA DISCRIMINANTE DE LA ECUACION CUADRATICA
        expresion = Math.pow(getC(),2)-(4*getA()*getC());

        //RETORNAMOS LA EXPRESION
        return expresion;
    }

    public double solucion(){
        //DECLARAMOS VARIABLE USADA EN CADA POSIBLE RESPUESTA
        double respuesta1;

        //CONDICIONAMOS CON RESPECTO A LA DISCRIMINANTE
        System.out.println("\nECUACION CUADRÁTICA");
        if (discriminante() > 0){
            //HACEMOS MENCION DE LA CANTIDAD DE SOLUCIONES DISPONIBLES
            System.out.println("2 soluciones:");

            //DECLARAMOS VARIABLE QUE SOLO SE USA EN ESTA CONDICIÓN
            double respuesta2;

            //HALLAMOS LOS VALORES PARA X
            respuesta1=(-getB()+Math.sqrt(discriminante()))/(2*getA());
            respuesta2=(-getB()-Math.sqrt(discriminante()))/(2*getA());

            //IMPRIMIMOS LOS VALORES DE X
            System.out.println("X = " + respuesta1 + "\t" + "X = " + respuesta2);

        } else if (discriminante() == 0) {
            //HACEMOS MENCION DE LA CANTIDAD DE SOLUCIONES DISPONIBLES
            System.out.println("1 soluciones");

            //HALLAMOS EL VALORES PARA X
            respuesta1 =(-getB())/(2*getA());

            //IMPRIMIMOS EL VALOR DE X
            System.out.println("X = " + respuesta1);
        } else if (discriminante() < 0){
            //HACEMOS MENCION DE QUE NO SE ENCONTRARON SOLUCIONES
            System.out.println("No se encontraron soluciones");
        }
        return 0;
    }
}
