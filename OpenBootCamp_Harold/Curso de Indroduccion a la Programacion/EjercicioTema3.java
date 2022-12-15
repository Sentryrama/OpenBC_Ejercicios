import javax.sound.sampled.SourceDataLine;

public class EjercicioTema3{
    public static void main(String[] args) {
        suma(10, 12, 14);
    }
    public static void suma(int a, int b, int c){
        int suma = a + b + c;
        System.out.println("La suma es: " + suma);

        Coche miCoche = new Coche();
        System.out.println("El numero de puertas es: " + miCoche.numeroPuertas);
        miCoche.agregarPuerta();
        System.out.println("El numero de puertas es: " + miCoche.numeroPuertas);
    }
}
class Coche{
    int numeroPuertas = 4;

    public void agregarPuerta(){
        numeroPuertas++;
    }
}   