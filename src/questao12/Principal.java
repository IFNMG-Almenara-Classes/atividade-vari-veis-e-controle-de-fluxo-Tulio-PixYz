package questao12;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, pares = 0, soma = 0, quantidade = 0;
        float media;
        while (true) {
            System.out.println("Digite um numero");
            num = entrada.nextInt();
            if(num == 0){
                break;
            } else {
                soma += num;
                quantidade++;
                if(num % 2 == 0){
                    pares++;
                }
            }
        }
        media = soma/quantidade;
        System.out.printf("Numeros digitados: %d\nNumeros pares: %d\nSoma total: %d\nMedia: %.1f", quantidade, pares, soma, media);
    }
}
