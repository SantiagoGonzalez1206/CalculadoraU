public class division {

 public double dividir(double a, double b) {
    if (b == 0) {
        System.out.println("Error: No se puede dividir por cero.");
        return 0;
    } else {
        double resultado = a / b;
        System.out.println(" El resultado de la división es: " + resultado);
        return resultado;
        }
    }
}