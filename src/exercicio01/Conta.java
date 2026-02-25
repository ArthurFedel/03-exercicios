package exercicio01;

public class Conta {
    // atributos ou propriedades ou variáveis de instância
    String correntista;
    int numero;
    double saldo;

    // método para depositar um valor na conta
    public void depositar(double valor) {
        saldo += valor;
    }

    // método para sacar um valor da conto
    public void sacar(double valor) {
        saldo -= valor;
    }
}

