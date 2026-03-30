import java.util.Scanner;

public class imposto {
    public static void main(String[] args) {

        /*9 - Desenvolva um programa que leia o valor (R$) de um salário qualquer e calcule e
        exiba o desconto com IRRF e INSS;
        fonte: https://impostoderenda2023.com.br/tabela-do-imposto-de-renda-2023/
        imposto.java*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, informe o salario: ");
        double salario = sc.nextDouble();
        
        double valor_inss;
        double valor_irrf;

        /*Tabala INSS

        Até R$ 1.621,00                         7,5%
        De R$ 1.621,01 a R$ 2.902,84            9%
        De R$ 2.902,85 até R$ 4.354,27          12%
        De R$ 4.354,28 até R$ 8.475,55          14%*/

        
        if (salario < 1621){
            valor_inss = salario * (7.5/100);
        } 
        
        else if (salario < 2902.84) {
            valor_inss = salario * (9.0/100);
            
        } else if (salario < 4354.27) {
            valor_inss = salario * (12.0/100);
            
        }
        else {
            valor_inss = salario * (14.0/100);
        }

        double base_irrf = salario - valor_inss;

        if (base_irrf < 2428){
            valor_irrf = 0;
        } else if (base_irrf < 2826.65) {

            valor_irrf = base_irrf * (7.5/100) - 182.16;
            
        } else if (base_irrf < 3751.05) {
            valor_irrf = base_irrf * (15.0/100) - 394.16;
            
        } else if (base_irrf < 4664.68) {
            valor_irrf = base_irrf * (22.5/100) - 675.49;
            
        }

        else {
            valor_irrf = base_irrf * (27.5/100) - 908.73;
        }

        System.out.println("INNS: " + valor_inss);
        System.out.println("IRRF: " + valor_irrf);

    }
}
