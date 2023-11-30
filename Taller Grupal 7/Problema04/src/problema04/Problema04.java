package problema04;
import java.util.Scanner;

public class Problema04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String posicion;
        int contador, edad;
        double altura;
        double sumatoriaEdad, sumatoriaAltura, promedioEdad, promedioAltura;
        String seguir = "si";
        contador = 0;
        sumatoriaEdad = 0;
        sumatoriaAltura = 0;
        while (seguir.equals("si")) {
            System.out.println("Ingrese el nombre, la posicion, la altura y la edad del jugador: ");
            nombre = teclado.next();
            posicion = teclado.next();
            altura = teclado.nextDouble();
            edad = teclado.nextInt();
            sumatoriaEdad = (sumatoriaEdad + edad);
            sumatoriaAltura = (sumatoriaAltura + altura);
            contador = contador + 1;
            System.out.println("Jugador " + contador + ": " + nombre + " -> La posicion es: " + posicion + " -> La edad es: " + edad + " -> La altura es: " + altura);
            System.out.println("¿Si desea continuar ingresando jugadores? escriba: si o no");
            seguir = teclado.next();
        }
        promedioEdad = (sumatoriaEdad / contador);
        System.out.println("El promedio de edad es: " + promedioEdad);
        promedioAltura = (sumatoriaAltura / contador);
        System.out.println("El promedio de altura es: " + promedioAltura);
    }

}
