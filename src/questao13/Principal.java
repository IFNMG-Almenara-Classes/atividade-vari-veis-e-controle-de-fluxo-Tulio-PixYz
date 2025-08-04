package questao13;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        while(true) {
            int num1, num2;
            Scanner entrada = new Scanner(System.in);
            System.out.println("\t---Calculadora---");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.println("opção:");
            int opcao = entrada.nextInt();

            if(opcao==0){
                break;
            } else if(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4){
                continue;
            }
            System.out.println("Insira um numero para efetuar a operação");
            num1 = entrada.nextInt();
            System.out.println("Insira outro para efetuar a operação");
            num2 = entrada.nextInt();
            switch (opcao) {
                case 1:
                    int soma = num1 + num2;
                    System.out.printf("%d + %d = %d\n",  num1, num2, soma);
                    break;
                case 2:
                    int subtracao =  num1 - num2;
                    System.out.printf("%d - %d = %d\n",  num1, num2, subtracao);
                    break;
                case 3:
                    int multiplicacao =  num1 * num2;
                    System.out.printf("%d . %d = %d\n",  num1, num2, multiplicacao);
                    break;
                case 4:
                    int divisao =  num1 / num2;
                    System.out.printf("%d / %d = %d\n",  num1, num2, divisao);
                    break;
            }
        }
    }
}
