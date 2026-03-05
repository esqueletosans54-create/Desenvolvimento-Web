import java.util.Scanner;

public class test {
    public static void main(String [] args) {
        Scanner leitor = new Scanner(System.in);

        int number1;
        int number2;
        String opera;
        
        System.out.print("Digite um numero: ");
        number1 = leitor.nextInt();

        leitor.nextLine();

        System.out.print("Digite uma operação ");
        opera = leitor.nextLine();

        System.out.print("Digite um numero: ");
        number2 = leitor.nextInt();


        switch (opera) {
            case "+" :
                System.out.println(number1 + number2);
                break;
            case "-" :
                System.out.println(number1 - number2);
                break;
            case "*" :
                System.out.println(number1 * number2);
                break;
            case "/" :
                System.out.println(number1 / number2);
                break;    
        }


    }
}
