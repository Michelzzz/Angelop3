public class ContaEspecial extends  Conta{
    protected double limite;

    public double getLimite() {
        return limite;
    }

    boolean sacar(double valor) {
        if (this.saldo >= valor ) {
            this.saldo -= (valor * 0.09);
            return true;
        } else {
            return false;
        }
    }
}
