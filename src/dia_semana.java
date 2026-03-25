import java.util.Scanner;

public class dia_semana {
    public static void main(String[] args) {

       /* 4. Desenvolver um programa que leia um número de 1 a 7 e exiba o dia da semana:
        1 - 'Domingo'
        2 - 'Segunda'
        3 - 'Terça'
        4 - 'Quarta'
        5 - 'Quinta'
        6 - 'Sexta'
        7 - 'Sábado'
        Qualquer outro numero exibir: 'Opção inválida!'*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, informe um número de 1 a 7 que está respectivo aos dias da semana: ");
        int valor = sc.nextInt();

        String[] dias = {
                "Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado"
        }; //Criação de um array (Conjunto de elementos)

        String situacao;

        if (valor >=1 && valor <=7){
            situacao = dias[valor - 1]; /*Em um array, cada elemento tem um indice (número que identifica
                                          aquele valor do array) o primeiro valor do array tem indice = 0

                                          [valor - 1] Ajusta o valor inserido

                                          Se valor digitado igual a 1:
                                          então 1 - 1 = 0 (0 é igual a domingo pois esse é o primeiro valor
                                                            do array)  */
        }
        else {
            situacao = "Opção Invalida";
        }

        System.out.println("Você escolheu: "+situacao);

    }
}
