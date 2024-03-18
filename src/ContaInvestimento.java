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
            this.taxa -= valor;
            return true;
        } else {
            return false;
        }
    }
    boolean depositar(double valor) {
        if (this.taxa >= 0) {
            this.taxa += valor;
            return true;
        } else {
            return false;
        }
    }
    boolean aplicaRendimento(double taxa) {
        if (this.taxa >= 0) {
            this.taxa *= taxa;
            return true;
        }   else {
            return false;
        }
    }
}
