package problema02;

public class Problema02 {

    public static void main(String[] args) {
        
        int numerador = 5;
        int denominador = 10;

        for (int i = 0; i < 6; i++) {
            System.out.println(numerador + "/" + denominador);
            
            numerador += 5;
            denominador += 2;
        }
    }

}
