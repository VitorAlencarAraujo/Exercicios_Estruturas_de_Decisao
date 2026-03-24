import java.util.Scanner;

public class residencia_normal {
    public static void main(String[] args) {


        /*2. Desenvolver um programa que leia o consumo de água para uma residência normal e exiba
        o valor (R$) da conta baseado nos seguintes cálculos:

        Se o consumo for menor ou igual a 10m3, então R$ 22,38
        Se o consumo for menor ou igual a 20m3, então R$ 3,50 por m3
        Se o consumo for menor ou igual a 50m3, então R$ 8,75 por m3
        Se o consumo for acima dos 50m3, então R$ 9,64 por m3*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, informe o valor do consumo: ");
        double consumo = sc.nextDouble();

        double apagar;
        if (consumo <= 10){
            apagar = 22.38;
        } else if (consumo <=20 ) {
            apagar = 3.50 * consumo;

        } else if (consumo <=50 ) {
            apagar = 8.75 * consumo;

        }
        else {
            apagar = 9.64 * consumo;
        }
        System.out.printf("Esse é o valor que deve ser pago: R$ %.2f%n", apagar);
    }
}
