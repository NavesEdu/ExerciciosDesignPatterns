package br.inatel.cdg.teste.ordenacao;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import br.inatel.cdg.ordenacao.bubbleSort;
import br.inatel.cdg.ordenacao.heapSort;
import br.inatel.cdg.ordenacao.mergeSort;
import br.inatel.cdg.ordenacao.ordena.impl.BubbleSort;
import br.inatel.cdg.ordenacao.ordena.impl.HeapSort;
import br.inatel.cdg.ordenacao.ordena.impl.MergeSort;
import org.junit.Before;
import org.junit.Test;

public class testOrdenaArray {

    int[] vetorMockado = new int[10];

    @Before
    public void mock(){
        vetorMockado[0] = 0;
        vetorMockado[1] = 1;
        vetorMockado[2] = 2;
        vetorMockado[3] = 3;
        vetorMockado[4] = 4;
        vetorMockado[5] = 5;
        vetorMockado[6] = 6;
        vetorMockado[7] = 7;
        vetorMockado[8] = 8;
        vetorMockado[9] = 9;
    }

    @Test
    public void testBubbleSort() {
        bubbleSort ordenacaoBS = new bubbleSort();
        assertTrue(ordenacaoBS.getOrdenacao() instanceof BubbleSort);
    }

    @Test
    public void testMergeSort() {
        mergeSort ordenacaoMS = new mergeSort();
        assertTrue(ordenacaoMS.getOrdenacao() instanceof MergeSort);
    }


    @Test
    public void testHeapSort() {
        heapSort ordenacaoHS = new heapSort();
        assertTrue(ordenacaoHS.getOrdenacao() instanceof HeapSort);
    }

}
