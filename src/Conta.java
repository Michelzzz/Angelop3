abstract class Conta {
    protected int numero;
    protected double saldo;

    boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    boolean depositar(double valor) {
        if (this.saldo >= 0 ) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }
    public double getSaldo() {
        return this.saldo;
    }
}
