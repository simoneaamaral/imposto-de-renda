import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, informe seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu salario: R$");
        double salario = sc.nextDouble();
        Pessoa pessoa1 = new Pessoa(nome,salario);

        System.out.println("Por favor, informe seu nome: ");
        sc.nextLine();
        nome = sc.nextLine();
        System.out.println("Digite seu salario: R$");
        salario = sc.nextDouble();
        Pessoa pessoa2 = new Pessoa(nome,salario);

        System.out.println("Por favor, informe seu nome: ");
        sc.nextLine();
        nome = sc.nextLine();
        System.out.println("Digite seu salario: R$");
        salario = sc.nextDouble();
        Pessoa pessoa3 = new Pessoa(nome,salario);

        ImpostoDeRenda imposto = new ImpostoDeRenda(pessoa1);
        ImpostoDeRenda imposto2 = new ImpostoDeRenda(pessoa2);
        ImpostoDeRenda imposto3 = new ImpostoDeRenda(pessoa3);

        imposto.imprimir();
        imposto2.imprimir();
        imposto3.imprimir();

        sc.close();
    }
}
