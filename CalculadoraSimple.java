public class CalculadoraSimple {

    public int sumar(int a, int b) {
        int resultado = a + b; //Error logico: falta el contenedor de la suma
        return resultado; // Error sintáctico: falta el punto y coma
    }

    public int multiplicar(int a, int b) {
        int resultado = a * b;// Error sintáctico: falta el punto y coma
        return resultado;
    }

    public static void main(String[] args) {
        CalculadoraSimple calc = new CalculadoraSimple();
        
        int resultadoSuma = calc.sumar(10, 5);
        int resultadoMultiplicacion = calc.multiplicar(10, 10);

        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
    }
}
