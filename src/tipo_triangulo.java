import java.util.Scanner;

public class tipo_triangulo {
    public static void main(String[] args) {

        /*6. Desenvolva um programa que peça os 3 lados de um triângulo. O programa deverá
        informar se os valores podem formam um triângulo e se formarem exibir na tela se é
        equilátero, isósceles ou escaleno.

        Sabemos que:
        Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
        Triângulo Equilátero: três lados iguais;
        Triângulo Isósceles: quaisquer dois lados iguais;
        Triângulo Escaleno: três lados diferentes;
        tipo_triangulo.java */


        Scanner sc = new Scanner(System.in);
        double[] lados = new double[3]; /*Criação de um array (conjunto de valores) do tipo double
                                         capaz de guardar no máximo 3 valores*/

        /*Estrutura de repetição que pede valores e os guarda em uma variavel*/
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o lado " + (i + 1) + ": "); /* i começa na posição 0 somar +1 ajusta a */
            lados[i] = sc.nextDouble();                          /* posição exibida na tela                 */
        }   /* ↑ - Guarda os valores na variavel "lados" */

        /*Realoca os valores da variavel "lados" em outras variaveis do mesmo tipo*/
        double a = lados[0];
        double b = lados[1];
        double c = lados[2];

        String classificacao;

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                classificacao = "Equilátero";
            } else if (a == b || b == c || a == c) {
                classificacao = "Isósceles";

            } else {
                classificacao = "Escaleno";
            }

            System.out.println("Esse triangulo é: " + classificacao);

        }
        else {
            System.out.println("Esse triangulo não pode existir");
        }
    }
}
