public class Main {
    public static void main(String[] args) {
        CalculadoraSimple calc = new CalculadoraSimple();

        int resultadoSuma = calc.sumar(10, 5);
        int resultadoMultiplicacion = calc.multiplicar(10, 10);

        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
    }
}
