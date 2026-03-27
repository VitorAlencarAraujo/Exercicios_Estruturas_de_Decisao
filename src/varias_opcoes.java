import java.util.Scanner;

public class varias_opcoes {
    public static void main(String[] args) {

       /* 7. Desenvolva um programa que exiba na tela um menu de opções:

        1 - Opção 1
        2 - Opção 2
        3 - Opção 3
        4 - Sair
        Digite uma opção:
        Se o usuário digitar 1, exibir na tela: 'Você selecionou a opção 1'
        Se o usuário digitar 2, exibir na tela: 'Você selecionou a opção 2'
        Se o usuário digitar 3, exibir na tela: 'Você selecionou a opção 3'
        Se o usuário digitar 4, exibir na tela: 'Você selecionou sair'
        Se o usuário digitar uma opção diferente das apresentadas no menu, exibir 'Opção inválida!!!'
        Exibir no final do processamento 'Fim do programa!'*/


        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++){
            System.out.println(i + " - Opção " + i);

        }
        System.out.println("4 - Sair");
        System.out.print("Digite uma opção:");
        int opcao = sc.nextInt();

        String condicao;

        if (opcao == 1) {
            condicao = "a opção 1";
        }
        else if (opcao == 2 ) {
            condicao = "a opção 2";
        }
        else if (opcao == 3 ){
            condicao = "a opção 3";
        }
        else if (opcao == 4 ) {
            condicao = "sair";
        }
        else {
            condicao = "Uma Opção invalida";
        }

        System.out.println("Você selecionou "+condicao);

    }
}
