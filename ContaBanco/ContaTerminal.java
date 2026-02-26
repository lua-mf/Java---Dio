package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
        Scanner ENTRADA = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = ENTRADA.nextInt();

        // Limpeza de buffer: Consome o "\n" que sobrou do nextInt()
        ENTRADA.nextLine(); 

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = ENTRADA.nextLine();

        System.out.print("Por favor, digite o seu Nome: ");
        String nomeCliente = ENTRADA.nextLine();

        System.out.print("Por favor, digite o Saldo inicial: ");
        double saldo = ENTRADA.nextDouble();

        // Exibição da mensagem formatada
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                           "sua agência é " + agencia + ", conta " + numero + 
                           " e seu saldo " + saldo + " já está disponível para saque.");
        
        ENTRADA.close();
    }
}