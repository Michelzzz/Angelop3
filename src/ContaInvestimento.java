public class ContaInvestimento extends Conta{
    protected double taxa;
    public double getTaxa() {
        return taxa;
    }
    public int getPrazo() {
        return prazo;
    }
    protected int prazo;
    boolean sacar(double valor) {
        if (this.taxa >= valor) {
            this.saldo -= (valor * 1.01);
            return true;
        } else {
            return false;
        }
    }
    boolean depositar(double valor) {
        if (this.taxa >= 0) {
            this.saldo += (valor * 1.01);
            return true;
        } else {
            return false;
        }
    }
    boolean aplicaRendimento(double taxa) {
        if (this.taxa >= 0) {
            this.saldo *= (taxa * 1);
            return true;
        }   else {
            return false;
        }
    }
}
