package transferencia;

public class Conta {
    String agencia;
    String numeroConta;
    Double saldo;
    Cliente proprietario;

    public Conta(String agencia, String numeroConta, Double saldo, Cliente proprietario) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.proprietario = proprietario;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Cliente getProprietario() {
        return proprietario;
    }

    public void realizaDeposito(Double valor){
        saldo += valor;

    }

    public boolean realizarSaque(Double valor){
        if (valor > saldo){
            return false;
        }
        saldo -= valor;
        return true;

    }
    public boolean realizarTransferencia(Double valor, Conta destino ){
       if (realizarSaque(valor)){
           destino.realizaDeposito(valor);
           return true;
       }
       return false;

    }

}
