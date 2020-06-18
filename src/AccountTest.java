import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account myAccount = new Account();

        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        System.out.println("Please enter the name:");
        String theName = scanner.nextLine(); // lê uma linha de texto ÿ
        myAccount.setName(theName); // insere theName em myAccount ÿ
        System.out.println(); // gera saída de uma linha em branco
        // exibe o nome armazenado no objeto myAccount
        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());


    }
}
