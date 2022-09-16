package Ejercicios;

public class ConvertirTemperatura {
    //DECLARAMOS VARIABLES PÚBLICAS
    public double celsius;
    public double fahrenheit;
    public double kelvin;
    public double rankine;


    //CONSTRUCTOR
    public ConvertirTemperatura( double valorCelsius){
        celsius = valorCelsius;
    }


    //GET Y SET
    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public double getKelvin() {
        return kelvin;
    }

    public double getRankine() {
        return rankine;
    }


    //OTRAS MÉTODOS O FUNCIONES PARA LA SOLUCIÓN DEL ENUNCIADO
    public double convertir(){
        //SE CALCULA LA CONVERCION DE CELSIUS A "F", "K" Y "R"
        fahrenheit=(1.8)*getCelsius()+32;
        kelvin=getCelsius()+273;
        rankine=(1.8)*getCelsius()+492;

        //SE IMPRIME LOS RESULTADOS
        System.out.println(getCelsius()+"° celsius = " + getFahrenheit() + "° farenheit");
        System.out.println(getCelsius()+"° celsius = " + getKelvin() + "° kelvin");
        System.out.println(getCelsius()+"° celsius = " + getRankine() + "° rankine");

        return 0;
    }

}
