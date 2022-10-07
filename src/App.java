import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que peça um número 
        // e então mostre a mensagem O número informado foi [número].
        double numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número:");
        numero = teclado.nextDouble();
        teclado.close();
        System.out.println("O número digitado foi:" + numero);
        
    }
}
