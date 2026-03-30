import java.util.Scanner;

public class calculadora_basica {
    public static void main(String[] args) {

        /*8. Desenvolva um calculadora que receba dois números e efetue uma das seguintes
        operações aritméticas:

        1 - Adição
        2 - Subtração
        3 - Multiplicação
        4 - Divisão
        5 - Potência
        6 - Raiz quadrada

        calculadora_basica.java*/

        Scanner sc = new Scanner(System.in);

        double[] valores = new double[2];
        for (int i = 0; i < 2; i++){
            System.out.print("Informe o valor " + (i + 1) + ":");
            valores[i] = sc.nextDouble();
        }

        double num1 = valores[0];
        double num2 = valores[1];


        System.out.println("""
Escolha uma operação:

1 - Adição
2 - Subtração
3 - Multiplicação
4 - Divisão
5 - Potência
6 - Raiz quadrada
 """);

        int opcao = sc.nextInt();
        double numero_calculado = 0;

        if (opcao == 1){
            numero_calculado = num1 + num2;
        }
        else if (opcao == 2) {
            numero_calculado = num1 - num2;

        }
        else if (opcao == 3) {
            numero_calculado = num1 * num2;
        }
        else if (opcao == 4) {
            numero_calculado = num1 / num2;
        }
        else if (opcao == 5) {
            numero_calculado = Math.pow(num1,num2);
        }
        else if (opcao == 6) {
            numero_calculado = Math.pow(num1, 1.0 / num2); // num1^1/num2
        }
        else {

            System.out.println("Número Inválido!");
        }

        System.out.println("Resultado: " + numero_calculado);

    }
}
