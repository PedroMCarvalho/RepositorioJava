package testaconta;

public class CartaoDeCredito {

    private int numero;
    private String DataDeValidade;
    private Cliente cliente;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setData(String DataDeValidade) {
        this.DataDeValidade = DataDeValidade;
    }

    public String getData() {
        return DataDeValidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
