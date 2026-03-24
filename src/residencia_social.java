import java.util.Scanner;

public class residencia_social {
    public static void main(String[] args) {

        /*1. Desenvolver um programa que leia o consumo de água para uma residência
        social e exiba o valor (R$) da conta baseado nos seguintes cálculos: */

        /*Se o consumo for menor ou igual a 10m3, então R$ 7,59
        Se o consumo for menor ou igual a 20m3, então R$ 1,31 por m3
        Se o consumo for menor ou igual a 30m3, então R$ 4,64 por m3
        Se o consumo for menor ou igual a 50m3, então R$ 6,62 por m3
        Se o consumo for acima dos 50m3, então R$ 7,31 por m3*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o consume de água: ");
        double consumo = sc.nextInt();

        double apagar;

        if (consumo <= 10){
            apagar = 7.59;
        }
        else if (consumo <=20 ) {
            apagar = 1.31 * consumo;

        }
        else if (consumo <=30 ) {
            apagar = 4.64 * consumo;
        }

        else if (consumo <=50 ) {
            apagar = 6.62 * consumo;
        }
        else {
            apagar = 7.31 * consumo;

    }

        //printF para menssagem com formatação
        System.out.printf("Esse é o valor que deve ser pago: R$ %.2f%n", apagar);



    }
}
