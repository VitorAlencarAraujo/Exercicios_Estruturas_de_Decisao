import java.util.Scanner;

public class reajuste {
    public static void main(String[] args) {

       /* 11 - Desenvolva um programa que recebe o salário de um funcionário e determine o reajuste
       segundo o seguinte critério, baseado no salário atual:
        salários até R$ 1000,00 (incluindo)     : aumento de 20%
                salários até R$ 1.700,00                : aumento de 15%
                salários até R$ 2.300,00                : aumento de 10%
                salários acima de R$ 2.300,00 em diante : aumento de 5%

                Após o processamento exibir na tela:
        o salário antes do reajuste;
        o percentual de aumento aplicado;
        o valor do aumento;
        o novo salário, após o aumento.

        Exemplo:
        Salário digitado: R$ 1.900,00
        Aumento         : 10%
                Valor do aumento: R$ 190,00
        Novo salário    : R$ 2.090,00

        reajuste.java*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, informe o sálario:");
        double salario = sc.nextDouble();


        double percentual;

        if (salario <= 1000){
            percentual = 20.0;
        }
        else if (salario <= 1700) {
            percentual = 15.0;

        } else if (salario <= 2300) {
            percentual = 10.0;

        }
        else {
            percentual = 5.0;
        }

        double resajuste = salario * (percentual/100.0);
        double salario_com_reajuste = salario + resajuste;

        System.out.println("Salario antes do reajuste: "+ salario);
        System.out.println("Percentual aplicado: " + percentual);
        System.out.println("Reajuste: "+ resajuste);
        System.out.println("Sálario com reajuste: "+ salario_com_reajuste);
    }
}
