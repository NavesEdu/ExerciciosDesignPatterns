package br.inatel.cdg.ordenacao;

public abstract class ordenaArray {

    protected Ordenacao ordenacao;

    public int[] Ordenar(int vet[])
    {
        return ordenacao.Ordenar(vet);
    }

    public Ordenacao getOrdenacao() {
        return ordenacao;
    }

    public void setOrdenacao(Ordenacao ordenacao) {
        this.ordenacao = ordenacao;
    }
}
