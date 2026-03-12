import java.util.Random;

import model.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Random random = new Random();
        
        System.out.println("Bem-Vindo ao sistema de Filas");
    
        
        Cliente joao = new Cliente("Sem rede", "João mendes");
        Cliente gustavo = new Cliente("Fatura duplicada", "Gustavo lima");

        Fila fila = new Fila();
        
        fila.enfileirar(joao);
        fila.enfileirar(gustavo);

        fila.mostrarFila();


        fila.desenfileirar();

        fila.mostrarFila();


        for (int i = 0; i < 5; i++){
            Cliente cliente = new Cliente("Problema X", "Cliente " + (i+1));
            fila.enfileirar(cliente);

            int numeroAleatorio = random.nextInt(100);
            if (numeroAleatorio < 50){
                fila.desenfileirar();
                fila.mostrarFila();
            }
        }

    }


}