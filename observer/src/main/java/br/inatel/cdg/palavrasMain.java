package br.inatel.cdg;

import br.inatel.cdg.impl.Observador;
import br.inatel.cdg.impl.Observavel;

public class palavrasMain {

    public static void main(String[] args) {

        Observavel palavras = new Observavel();

        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        palavras.registraObservador(obs1);
        palavras.registraObservador(obs2);
        palavras.registraObservador(obs3);

        palavras.setNovaFrase("Pelo amor de deus chris");
        palavras.setNovaFrase("não vejo a hora de apresentar tcc");

        palavras.removeObservador(obs1);

        System.out.println("\n\nMandando notificação para todos os clientes: ");
        palavras.notificaObservadores();

    }

}

