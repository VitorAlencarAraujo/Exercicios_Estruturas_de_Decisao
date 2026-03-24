import java.util.Scanner;

public class comercio_industria {
    public static void main(String[] args) {

        /*3. Desenvolver um programa que leia o consumo de água para
        prédios comerciais e industriais e exiba o valor (R$) da conta baseado nos seguintes cálculos:

        Se o consumo for menor ou igual a 10m3, então R$ 44,95
        Se o consumo for menor ou igual a 20m3, então R$ 8,75 por m3
        Se o consumo for menor ou igual a 50m3, então R$ 16,76 por m3
        Se o consumo for acima dos 50m3, então R$ 17,46 por m3*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, informe o valor do consumo: ");
        double consumo = sc.nextDouble();

        double apagar;
        if (consumo <= 10){
            apagar = 44.95;
        } else if (consumo <=20 ) {
            apagar = 8.75 * consumo;

        } else if (consumo <=50 ) {
            apagar = 16.76 * consumo;

        }
        else {
            apagar = 17.46 * consumo;
        }
        System.out.printf("Esse é o valor que deve ser pago: R$ %.2f%n", apagar);
    }
}
