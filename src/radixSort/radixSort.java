void printArray( int[]Arranjo ){

    for ( int i:Arranjo ){

        IO.print(i+" ");

    }

    IO.println();

}

int pow10(int n) {
    int result = 1;
    for (int i = 0; i < n; i++) {
        result *= 10;
    }
    return result;
}

int retorna_digito(int valor, int posicao) {
    int divisor = pow10(posicao - 1);

    if (valor < divisor) {
        return 0;
    }

    return (valor / divisor) % 10;
}

int[] radixSort( int[]Arranjo ){



    return Arranjo;

}

void main() {



}