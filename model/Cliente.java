package model;


public class Cliente {

    private static int clientes = 1;
    private int codigo;
    private String nomeCliente;
    private String problema;


    public Cliente (String problema, String nomeCliente){
        this.codigo = ++clientes; // A cada novo cliente instanciado, 
        // adicionar o código pela quantidade de clientes e somar +1
        this.nomeCliente = nomeCliente;
        this.problema = problema;
    }
    
    public int getCodigo(){
        return codigo;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public String getProblema(){
        return problema;
    }

    @Override
    public String toString() {
        return "Cliente: " + nomeCliente +"\nProblema: " + problema;
    }
}
