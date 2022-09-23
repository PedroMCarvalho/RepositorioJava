package testaconta;

public class Testaconta {

    public static void main(String[] args) {
        Cliente pedro = new Cliente();
        pedro.setNome("Pedro");
        pedro.setCodigo(554);
        
        Agencia agenciaPedro = new Agencia();
        agenciaPedro.setNumeroag(789);
        agenciaPedro.setUf("MG");
        
        Conta contaPedro = new Conta();
        contaPedro.setAgencia(agenciaPedro);
        contaPedro.deposita(1000);
        
        CartaoDeCredito cdc = new CartaoDeCredito();
        cdc.setCliente(pedro);
        cdc.setNumero(4564);
        cdc.setData("11/08");
        
        pedro.setConta(contaPedro);
        
        
        /*
        
        */
      
        /*
        Agencia novaAgencia = new Agencia();
        novaAgencia.setNumeroag(789);
        novaAgencia.setUf("MG");
        
        Conta contaNova = new Conta();
        contaNova.setAgencia(novaAgencia);
        contaNova.deposita(1000); 
        */
             
        
        Cliente joao = new Cliente();
        joao.setNome("João");
        
        joao.setCodigo(554);
        
        Agencia agenciaJoao = new Agencia();
        agenciaJoao.setNumeroag(258);
        agenciaJoao.setUf("SP");
        
        Conta contaJoao = new Conta();
        contaJoao.setAgencia(agenciaJoao);
        contaJoao.deposita(1000);
        joao.setConta(contaJoao);
        
        CartaoDeCredito cdcJoao = new CartaoDeCredito();
        cdcJoao.setCliente(joao);
        cdcJoao.setNumero(1234);
        cdcJoao.setData("12/08");
        
        /*
        Conta referencia = new Conta();
        referencia.setSaldo(1000.0);
        referencia.setLimite(500.0);
        referencia.setNumero(1);
        
        
        System.out.println("Saldo "+referencia.getSaldo());
        System.out.println("Limite "+referencia.getLimite());
        System.out.println("Numero "+referencia.getNumero()+"\n");
        */
        
        /*
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Laercio");
        cliente1.setCodigo(789885);
        
        Cliente cliente2 = new Cliente();
        cliente2.setNome("Cassia");
        cliente2.setCodigo(456889);
        
        System.out.println("O cliente 1: "+cliente1.getNome());
        System.out.println("O codigo 1: "+cliente1.getCodigo());
        
        System.out.println("O cliente 2: "+cliente2.getNome());
        System.out.println("O codigo 2: "+cliente2.getCodigo()+"\n");

        CartaoDeCredito cartao1 = new CartaoDeCredito();
        cartao1.setNumero(321987);
        cartao1.setData("09/82");
        
        CartaoDeCredito cartao2 = new CartaoDeCredito();
        cartao2.setNumero(44545);
        cartao2.setData("12/27");
        
        
        System.out.println("Numero do cartao 1 : "+cartao1.getNumero()+" e a data de validade é: "+cartao1.getData());
        System.out.println("Numero do cartao 2 : "+cartao2.getNumero()+" e a data de validade é: "+cartao2.getData());
        
        
        Agencia agencia1 = new Agencia();
        agencia1.setNumeroag(456789);
        agencia1.setUf("DF");
        
        Agencia agencia2 = new Agencia();
        agencia2.setNumeroag(123456);
        agencia2.setUf("SP");
        
        System.out.println("Numero da agencia 1 : "+agencia1.getNumeroag()+" e sua uf é: "+agencia1.getUf());
        System.out.println("Numero da agencia 2 : "+agencia2.getNumeroag()+" e sua uf é: "+agencia2.getUf());
        
        System.out.println("Codigo do cliente: "+cdc.getCliente().getCodigo()+"\nNome do titular: "+cdc.getCliente().getNome() +"\nNumero do cartão 3: " + cdc.getNumero() + "\nData de Validade: " + cdc.getData());
        System.out.println("Agencia : "+contaNova.getAgencia().getNumeroag()+"\nUf: "+contaNova.getAgencia().getUf());
        */
        
        pedro.getConta().deposita(5000);
        pedro.getConta().consultaSaldo();
        System.out.println("Saldo da conta do Pedro após deposito: "+pedro.getConta().consultaSaldo());
        
        pedro.getConta().saque(2000);
        System.out.println("Saldo da conta do Pedro após saque: "+pedro.getConta().consultaSaldo());
        
        System.out.println("Saldo da conta do Pedro antes da transferencia : "+pedro.getConta().consultaSaldo());
        System.out.println("Saldo da conta do Joao antes da transferencia : "+joao.getConta().consultaSaldo());
        pedro.getConta().transferencia(500, joao.getConta());
        System.out.println("Saldo da conta do Pedro apos da transferencia : "+pedro.getConta().consultaSaldo());
        System.out.println("Saldo da conta do Joao apos da transferencia : "+joao.getConta().consultaSaldo());
        
        
        
        
        
        
        

    }
    
}