public class Main {
    public static void main(String[] args) {
    ContaEspecial contaEspecial = new ContaEspecial();
    ContaInvestimento contaInvestimento = new ContaInvestimento();
    contaEspecial.limite  = 100;
    contaEspecial.depositar(4000);
    contaEspecial.sacar(3000);

        System.out.println("saldo conta especial: "+contaEspecial.getSaldo()+
                "\n limite conta especial: "+contaEspecial.getLimite());

    contaInvestimento.taxa = 150;
    contaInvestimento.saldo = 200;
    contaInvestimento.depositar(200);
        System.out.println("\nsaldo conta investimento: "+contaInvestimento.getSaldo()+
                "\n taxa conta investimento: "+contaInvestimento.getTaxa());
    }
}