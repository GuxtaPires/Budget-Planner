public class Operacoes {
    public static double EntradaDeDinheiro(double saldo, double entrada){
        saldo += entrada;
        System.out.println("----------------------------------------");
        System.out.println("O novo saldo é de: " + saldo + "R$");
        return saldo;
    }

    public static double SaidaDeDinheiro(double saldo, double saida){
        saldo -= saida;
        System.out.println("----------------------------------------");
        System.out.println("O novo saldo é de: " + saldo + "R$");
        return saldo;
    }

    public static double Investimento(double saldo, double inevstimentos, double dinheiroInvestido){
        saldo = Operacoes.SaidaDeDinheiro(saldo, dinheiroInvestido);
        inevstimentos += dinheiroInvestido;
        System.out.println("----------------------------------------");
        System.out.println("O novo saldo é de: " + saldo + "R$");
        System.out.println("E o saldo investido é de: " + inevstimentos + "R$");
        return inevstimentos;
    }

    public static double retirarInvestimento(double saldo, double inevstimentos, double retirarInvestimento){
        saldo = Operacoes.EntradaDeDinheiro(saldo, retirarInvestimento);
        inevstimentos -= retirarInvestimento;
        System.out.println("----------------------------------------");
        System.out.println("O novo saldo é de: " + saldo + "R$");
        System.out.println("E o saldo investido é de: " + inevstimentos + "R$");
        return inevstimentos;
    }
}
