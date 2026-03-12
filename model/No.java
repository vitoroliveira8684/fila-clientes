package model;

public class No {

    private static int idNos = 0;
    
    private int chave;
    private No proximo;
    private Cliente cliente;

    public No(Cliente cliente){
        chave = ++idNos;
        proximo = null;
        this.cliente = cliente;
    }

    public void setarProximo(No novoNo){
        this.proximo = novoNo;
    }

    public No retornarProximo(){
        return this.proximo;
    }

    public int retornarChave(){
        return this.chave;
    }

    public Cliente retornarCliente(){
        return cliente;
    }

    public String mostrarProblemaCliente(){
        return cliente.toString();
    }
}
