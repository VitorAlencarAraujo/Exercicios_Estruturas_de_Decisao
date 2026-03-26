import java.util.Scanner;

public class imc {
    public static void main(String[] args) {

    /*    5. Desenvolver um programa que leia o peso e a altura de uma pessoa e calcule seu imc
        utilizando a fórmula:
        imc = peso / (altura ^ 2)
        Com o imc exiba para o usuário seu imc e a classificação:
        IMC		Classificação
        < 16		'Magreza grave'
        16 a < 17	'Magreza moderada'
        17 a < 18,5	'Magreza leve'
        18,5 a < 25	'Saudável'
        25 a < 30	'Sobrepeso'
        30 a < 35	'Obesidade Grau I'
        35 a < 40	'Obesidade Grau II (severa)'
        ≥ 40		'Obesidade Grau III (mórbida)'*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a sua altura: ");
        double altura = sc.nextDouble();

        System.out.print("Informe o seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso / (altura*altura);

        String classificacao;
        if (imc < 16) classificacao = "Magreza grave";
        else if (imc < 17) classificacao = "Magreza moderada";
        else if (imc < 18.5) classificacao = "Magreza leve";
        else if (imc < 25) classificacao = "Saudável";
        else if (imc < 30) classificacao = "Sobrepeso";
        else if (imc < 35) classificacao = "Obesididade grau I";
        else if (imc < 40) classificacao = "Obesidade grau II (severa)";
        else classificacao = "Obesidade grau III (mórbida)";


        System.out.printf("imc: %.2f%n", imc);
        System.out.println("classificacao = " + classificacao);

    }
}
