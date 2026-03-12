package model;

public class Fila {
    

    private Lista lista;

    public Fila(){
        lista = new Lista();    
    }            
    
    // O(1)
    public void enfileirar(Cliente cliente){
        lista.inserirFinal(cliente);
    }

    // O(1)
    public Cliente desenfileirar() throws Exception{
        No removido = lista.removerPrimeiro();
        return removido.retornarCliente();
    }

    public boolean estaVazia(){
        return lista.estaVazio();
    }

    public int tamanho(){
        return lista.retornarQuantidadeItens();
    }

    public void mostrarFila(){
        lista.mostrarLista();
    }

}
                                                     
