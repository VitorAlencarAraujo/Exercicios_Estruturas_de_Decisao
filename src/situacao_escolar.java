import java.util.Scanner;

public class situacao_escolar {
    public static void main(String[] args) {

       /* 12. Desenvolva um programa que leia quatro notas bimestrais obtidas por um aluno numa
       disciplina ao longo de um semestre, e calcule a sua média final. A atribuição de conceitos obedece
        à tabela abaixo:

        Média de Aproveitamento  Conceito
        Entre 9.0 e 10.0        A
        Entre 7.5 e 8.9         B
        Entre 6.0 e 7.4         C
        Entre 4.0 e 5.9         D
        Entre zero e 3.9        E
        O programa deve exibir na tela:
        1. As quatro notas bimestrais,
        2. A média final,
        3. O conceito correspondente e,
        4. A mensagem "APROVADO" ou "Reprovado" de acordo com a regra a seguir:
        4.1. Se o conceito       for A, B ou C    exibir "APROVADO"
        4.2. Senão se o conceito for D ou E       exibir "REPROVADO"
        situacao_escolar.java*/


        Scanner sc = new Scanner(System.in);

        double[] valores = new double[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("informe a nota do bimestre " + (i + 1) + ":");
            valores[i] = sc.nextDouble();
        }

        double nota1 = valores[0];
        double nota2 = valores[1];
        double nota3 = valores[2];
        double nota4 = valores[3];

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        String conceito;
        String situacao;

        if (media >= 9 && media <= 10) {
            conceito = "A";
            situacao = "Aprovado";
        } else if (media >= 7.5 && media <= 8.9) {
            conceito = "B";
            situacao = "Aprovado";

        } else if (media >= 6.0 && media <= 7.4) {
            conceito = "C";
            situacao = "Aprovado";

        }
        else if (media >= 4.0 && media <= 5.9) {
            conceito = "D";
            situacao = "Reprovado";
        }
        else  {
            conceito = "E";
            situacao = "Reprovado";
        }

        System.out.println("As notas foram: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4);
        System.out.println("Média final: " + media);
        System.out.println("Conceito: " + conceito);
        System.out.println("Situação: " + situacao);
    }
}