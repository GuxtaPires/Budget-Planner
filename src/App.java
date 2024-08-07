import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int escolha = 1;
        double inevstimentos = 0.0;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("-------------Budget_Planner-------------");
        System.out.println("Seja Bem-vindo(a) ao Budget Planner, informe seu valor inicial");

        double saldo = sc.nextDouble();

        while (escolha > 0 && escolha < 5){
        System.out.println("----------------------------------------");
        System.out.println("Qual operação você deseja registrar?");
        System.out.println("1 - Entrada de Dinheiro");
        System.out.println("2 - Saída de Dinheiro");
        System.out.println("3 - Investimento de Dinheiro");
        System.out.println("4 - Retirada de Dinheiro de investimento");
        System.out.println("0 - Encerrar Programa");
        System.out.print("Escolha: ");
        
        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("----------------------------------------");
                System.out.print("Informe o valor a que entrou: ");
                double entrada = sc.nextDouble();
                saldo = Operacoes.EntradaDeDinheiro(saldo, entrada);
                break;
            case 2:
                System.out.println("----------------------------------------");
                System.out.print("Informe o valor a que saiu: ");
                double saida = sc.nextDouble();
                saldo = Operacoes.SaidaDeDinheiro(saldo, saida);
                break;
            case 3:
                System.out.println("----------------------------------------");
                System.out.print("Informe o valor a que será investido: ");
                double investir = sc.nextDouble();
                inevstimentos = Operacoes.Investimento(saldo, inevstimentos, investir);
                break;
            case 4:
                System.out.println("----------------------------------------");
                System.out.print("Informe o valor a que será retirado: ");
                double retirarInvestimento = sc.nextDouble();
                inevstimentos = Operacoes.retirarInvestimento(saldo, inevstimentos, retirarInvestimento);
                break;
            default:
                break;
        }
        }
    }
}
