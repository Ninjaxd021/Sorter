
void printArray(int[] Arranjo) {

    for (int i: Arranjo) {
        IO.print(i+" ");
    }

    IO.println();

}

void quickSort( int[]Number, int index_inicio, int index_fim ) {

    int temp;
    int pivot = Number[index_inicio];
    int c_esquerda = index_inicio;
    int c_direita = index_fim;

    while (c_esquerda <= c_direita) {
        while (Number[c_esquerda] < pivot) c_esquerda++;
        while (Number[c_direita] > pivot) c_direita--;

        if (c_esquerda <= c_direita) {
            temp = Number[c_esquerda];
            Number[c_esquerda] = Number[c_direita];
            Number[c_direita] = temp;

            c_direita--;
            c_esquerda++;
        }

    }
    if (index_inicio < c_direita) {
        quickSort(Number, index_inicio, c_direita);
    }

    if (c_esquerda < index_fim) {
        quickSort(Number, c_esquerda, index_fim);
    }

}

void main() {

    int[] ArranjoForSend = {4,8,2,-12,-6,5,13,22,7,3};
    int tamanho = ArranjoForSend.length;

    printArray(ArranjoForSend);
    quickSort(ArranjoForSend,0,tamanho-1);
    printArray(ArranjoForSend);

}