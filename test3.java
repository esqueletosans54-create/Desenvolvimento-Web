import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int x;

        System.out.println("Olá, aqui é a lanchonete do Zé");
        System.out.println("Digite 1 para pedir um cardapio");
        System.out.println("Digite 2 para visualizar as promoções");
        System.out.println("Digite 3 para falar com a atendente");
        System.out.println("------------------------------------------------------");
        System.out.print("Digite o numero da opção desejada: ");
        x = leitor.nextInt();

        if (x == 1) {
            System.out.println("Digite 1 para hamburguer, valor 13,00");
            System.out.println("Digite 2 para cachorro quente, valor 10,00");
            System.out.println("Digite 3 para pizza, valor 20,00");
            System.out.println("Digite 4 para refrigerante, valor 5,00");
            System.out.println("------------------------------------------------------");

            int escolhar;

            System.out.print("Digite o numero da opção desejada:");
            escolhar = leitor.nextInt();
            
            System.out.println("------------------------------------------------------");

            if(escolhar == 1) {
                System.out.println("Você desejou um hamburguer, valor 13,00");
            } else if (escolhar == 2){
                System.out.println("Você desejou um cachorro quente, valor 10,00");
            } else if (escolhar == 3){
                System.out.println("Você desejou uma pizza, valor 20,00");
            } else if (escolhar == 4){
                System.out.println("Você desejou um refrigerante, valor 5,00");
            } 
            System.out.println("------------------------------------------------------");

            int escolhaFinal;

            System.out.print("Digite 1 para Sim ou 2 para Não: ");
            escolhaFinal = leitor.nextInt();

            System.out.println("------------------------------------------------------");

            if (escolhaFinal == 1) {
                System.out.println("Obrigado por comprar conosco, volte sempre!!");
            } else {
                System.out.println("Obrigado por visitar nossa lanchonete, volte sempre!");
            }
        }

        else if(x == 2) {
            System.out.println("Promoção do dia: hamburguer + refrigerante por 15,00");
        } else if(x == 3) {
            System.out.println("Atendente: Olá, em que posso ajudar?");
        }
    }
}
