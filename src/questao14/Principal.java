package questao14;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\tPlano de desconto");
        System.out.println("1 - Comum");
        System.out.println("2 - VIP");
        System.out.println("3 - Funcionario");
        System.out.println("opcao:");
        int opcao = entrada.nextInt();
        System.out.println("Insira o valor da pizza");
        float valor = entrada.nextFloat();
        float preco = 0, desconto;

        switch (opcao){
            case 1:
                preco = valor;
                break;
            case 2:
                 desconto = valor * 5/100;
                 preco = valor - desconto;
                break;
            case 3:
                desconto = valor * 10/100;
                preco = valor - desconto;
                break;
            default:
        }
        System.out.printf("Preço final: R$%.2f\n", preco);
    }
}
