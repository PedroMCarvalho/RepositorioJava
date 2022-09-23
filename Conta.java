package testaconta;

public class Conta {
    private double saldo;
    private double limite;
    private int numero;
    private Agencia agencia;
    
    public void setSaldo(double saldo){
        this.saldo = saldo;        
    }
    public double getSaldo (){
        return saldo;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }
    public double getLimite(){
        return limite;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public double getNumero(){
        return numero;
    }
    public Agencia getAgencia() {
        return agencia;
    }
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    public void deposita(double entrada){
        this.saldo += entrada;
    }
    public double saque (double saida){
        if(this.saldo >= saida){
            this.saldo -= saida;
            return this.saldo;
        }else{
            System.out.println("Ladrão detectado");
            return this.saldo;
        }
    }
    public double transferencia (double transfsaida, Conta contaQueRecebe){
        if(this.saldo >= transfsaida){
            this.saldo -= transfsaida;
            contaQueRecebe.deposita(transfsaida);
            return this.saldo;
        }else{
            System.out.println("Dois ladrões detectados");
            return this.saldo;
        }
    }
    public double consultaSaldo (){
        return this.saldo;
    }
}




