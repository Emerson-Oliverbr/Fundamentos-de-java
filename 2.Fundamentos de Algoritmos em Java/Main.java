public class Main {
    public static void main(String[] args) {
        int a, b, c;
        float d;
        double e;

        a = 27;
        b = 4;
        c = a + b;

        System.out.println("Valor de C = " + c);
        c = a - b;
        System.out.println("Valor atualizado de C = " + c);
        c = a * b;
        System.out.println("Valor atualizado de C = " + c);
        c = a / b;
        System.out.println("Valor atualizado de C = " + c);
        c = a % b;
        System.out.println("Valor atualizado de C = " + c);

        d = (float) 1.0; // d = 1.0f;
        System.out.println("Valor de D = " + d);

        d = 1.0f/2;

        System.out.println("Valor de D = " + d);
        System.out.printf("Valor de D = %.3f\n", d);

        System.out.printf("Mostrando todos os numeros: a =%d, b = %d, c = %d, d = %.2f\n", a,b,c,d);
    } 
}