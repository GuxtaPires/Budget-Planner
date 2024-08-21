public class Operacoes {
    public static double EntradaDeDinheiro(double saldo, double entrada){

        //Adicionando a entrada ao saldo do usuário
        saldo += entrada;
        
        System.out.println("----------------------------------------");

        //Informando ao usuário o atual saldo dele
        System.out.println("O novo saldo é de: " + saldo + "R$");

        //retornando o valor total do saldo para consulta do usuário
        return saldo;
    }

    public static double SaidaDeDinheiro(double saldo, double saida){

        //Subtraindo o valor da saida ao saldo do usuário
        saldo -= saida;
        System.out.println("----------------------------------------");

        //Informando ao usuário o atual saldo dele
        System.out.println("O novo saldo é de: " + saldo + "R$");

        //retornando o valor total do saldo para consulta do usuário
        return saldo;
    }

    public static double Investimento(double saldo, double inevstimentos, double dinheiroInvestido){

        //Chamando outro método para retirar dinheiro do saldo do usuario
        saldo = Operacoes.SaidaDeDinheiro(saldo, dinheiroInvestido);

        //Adicionando a entrada de investimentos ao saldo investido do usuário
        inevstimentos += dinheiroInvestido;
        System.out.println("----------------------------------------");

        //Informando ao usuário o atual saldo dele
        System.out.println("O novo saldo é de: " + saldo + "R$");

        //Informando ao usuário o atual saldo de investimentos dele
        System.out.println("E o saldo investido é de: " + inevstimentos + "R$");

        //retornando o valor total do saldo de investimentos para consulta do usuário
        return inevstimentos;
    }

    public static double retirarInvestimento(double saldo, double inevstimentos, double retirarInvestimento){

        //chamando o método de entrada de dinheiro para adicionar o saldo retirado do investimentos ao saldo principal
        saldo = Operacoes.EntradaDeDinheiro(saldo, retirarInvestimento);
        
        //Subtraindo a retirada de investimentos ao saldo investido do usuário
        inevstimentos -= retirarInvestimento;
        System.out.println("----------------------------------------");

        //Informando ao usuário o atual saldo dele
        System.out.println("O novo saldo é de: " + saldo + "R$");

        //Informando ao usuário o atual saldo de investimentos dele
        System.out.println("E o saldo investido é de: " + inevstimentos + "R$");

        //retornando o valor total do saldo de investimentos para consulta do usuário
        return inevstimentos;
    }
}
