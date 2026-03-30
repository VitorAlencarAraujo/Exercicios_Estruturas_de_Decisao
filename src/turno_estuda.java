import java.util.Scanner;

public class turno_estuda {
    public static void main(String[] args) {

        /*10 - Desenvolva um programa que pergunte em que turno você estuda.
Peça para digitar: M-Matutino ou V-Vespertino ou N- Noturno.
Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
Obs.: Somente letras maiúsculas para M, V ou N.
turno_estuda_java*/

        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Em que turno você estuda?
                
                M - Matutino
                V - Vespertino 
                N - Noturno
                """);

        char resposta = sc.next().charAt(0);
        String mensagem;

        if (resposta == 'M') {
            mensagem = "Bom dia!";
        }
        else if (resposta == 'V') {
            mensagem = "Boa Tarde!";

        } else if (resposta == 'N') {
            mensagem = "Boa noite!";

        }
        else {
            mensagem = "Valor Inválido!";
        }

        System.out.println(mensagem);
    }
}
