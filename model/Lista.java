package model;

public class Lista {
    
    private No primeiro;
    private No ultimo;
    private int quantidadeNos;

    public Lista(){
        primeiro = null;
        ultimo = null;
        quantidadeNos = 0;
    }

    public boolean estaVazio(){
        return (primeiro == null);
    }

    public void inserirNo(Cliente cliente){ //Insere pela frente sem ordenar
        No novoNo = new No(cliente);
        No noTemporario = primeiro;
        if (estaVazio())
            ultimo = novoNo;
        primeiro = novoNo; // O primeiro é alterado pra apontar pro novoNo, mas o "ponteiro"
        // (proximo) continua apontando para o antigo
        primeiro.setarProximo(noTemporario); // O "ponteiro" do primeiro no da lista vai apontar pra o antigo primeiro nó
        noTemporario = null; // Pra depois o gargabe collector coletar este objeto
        quantidadeNos++;
    }

    public void inserirFinal(Cliente cliente){ //Insere pelo final. pra filas
        No novoNo = new No(cliente);
        if (estaVazio()){
            primeiro = novoNo;
            ultimo = novoNo;
        }else{
            ultimo.setarProximo(novoNo);// o antigo último vai apontar pro novoNo
            ultimo = novoNo; // o novoNo passa a ser o último
        }
        quantidadeNos++;

    }

    public No removerItem(int chave) throws Exception{ // remove por chave O(n)

            if (estaVazio())
                throw new Exception("A lista está vazia!");

            No atual = primeiro;
            No anterior = null;


            while(atual != null){
                if (atual.retornarChave() == chave){
                    if(atual == primeiro)// o primeiro vai ser o próximo item.
                        primeiro = atual.retornarProximo(); 
                    else// o nó atual vai parar de receber apontamentos.
                        anterior.setarProximo(atual.retornarProximo()); 
                    quantidadeNos--;
                    return atual;
                    
                }

                anterior = atual;
                atual = atual.retornarProximo();

            }
        

            return null;
    }

    public No removerPrimeiro() throws Exception{
        if(estaVazio()){
            throw new Exception("A lista está vazia!");
        }

        No retornar = primeiro;
        primeiro = primeiro.retornarProximo();

        quantidadeNos--;

        System.out.println("=================================\n         Atendendo\n\n" + retornar.mostrarProblemaCliente() +"\n\n=================================\n");
        return retornar;
    }

    public int retornarQuantidadeItens(){
        return quantidadeNos;
    }

    public void mostrarLista(){
        if (estaVazio())
             System.err.println("A lista está vazia");
        else{   
            No atual = primeiro;
            System.out.println("=================================\n          Lista Atual\n=================================\n");
            while(atual != null){
                System.out.println(atual.mostrarProblemaCliente());
                System.out.println("");
                atual = atual.retornarProximo();
            }

        }
    }









}
