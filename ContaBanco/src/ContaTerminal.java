import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        //Exibir as mensagens para o usuário
        System.out.println("Por favor, inserir seu nome: ");
        String nome  = scanner.nextLine();

        System.out.println("Por favor, inserir número de conta: ");
        String conta = scanner.nextLine();

        System.out.println("Por favor, inserir número de agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, inserir valor de deposito: ");
        double valor = scanner.nextDouble();

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + conta + " e seu valor R$" + valor + " já está disponível para saque");
    }
}
