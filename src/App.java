import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //Declarando variáveis
        int escolha = 1;
        double inevstimentos = 0.0;

        //Instanciando Scanner
        Scanner sc = new Scanner(System.in);

        //Interface para usuário
        System.out.println("-------------Budget_Planner-------------");
        System.out.println("Seja Bem-vindo(a) ao Budget Planner, informe seu valor inicial");

        //Recebendo dado para calculo do saldo
        double saldo = sc.nextDouble();

        //Interface para usuário
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

        //Switch para colocar o usuário em seu cáculo
        switch (escolha) {
            case 1:
                System.out.println("----------------------------------------");
                System.out.print("Informe o valor a que entrou: ");
                double entrada = sc.nextDouble();

                //Verificar função do método na classe "Opercoes"
                saldo = Operacoes.EntradaDeDinheiro(saldo, entrada);
                break;
            case 2:
                System.out.println("----------------------------------------");
                System.out.print("Informe o valor a que saiu: ");
                double saida = sc.nextDouble();

                //Verificar função do método na classe "Opercoes"
                saldo = Operacoes.SaidaDeDinheiro(saldo, saida);
                break;
            case 3:
                System.out.println("----------------------------------------");
                System.out.print("Informe o valor a que será investido: ");
                double investir = sc.nextDouble();
                
                //Verificar função do método na classe "Opercoes"
                inevstimentos = Operacoes.Investimento(saldo, inevstimentos, investir);
                break;
            case 4:
                System.out.println("----------------------------------------");
                System.out.print("Informe o valor a que será retirado: ");
                double retirarInvestimento = sc.nextDouble();

                //Verificar função do método na classe "Opercoes"
                inevstimentos = Operacoes.retirarInvestimento(saldo, inevstimentos, retirarInvestimento);
                break;
            default:
                break;
        }
        }
    }
}
