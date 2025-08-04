package questao11;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um numero");
        int num = entrada.nextInt();
        for(int i=0;i<=num;i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
