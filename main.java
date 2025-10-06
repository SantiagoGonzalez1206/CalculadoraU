import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        System.out.print("Ingresa el primer número: ");
        int num1 = entrada.nextInt(); // lee el primer número

        System.out.print("Ingresa el segundo número: ");
        int num2 = entrada.nextInt(); // lee el segundo número

        System.out.println("Los números ingresados son: " + num1 + " y " + num2);

    }
}


