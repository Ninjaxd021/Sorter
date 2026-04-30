/*

*/


void printArray( int[] arranjo ){

    for ( int i:arranjo ){

        IO.print(i+" ");

    }

    IO.println();

}

int[] merge(int[] arranjoA, int[] arranjoB){

    int indexA = 0, indexB = 0;

    int tamanho = arranjoA.length + arranjoB.length;

    int[] p_result = new int[tamanho];

    for (int i = 0; i < tamanho; i++){

        if (indexA > arranjoA.length - 1) {

            p_result[i] = arranjoB[indexB];
            indexB++;

        } else if (indexB > arranjoB.length - 1) {

            p_result[i] = arranjoA[indexA];
            indexA++;

        } else if (arranjoA[indexA] < arranjoB[indexB]) {

            p_result[i] = arranjoA[indexA];
            indexA++;

        } else {

            p_result[i] = arranjoB[indexB];
            indexB++;

        }

    }

    return p_result;
}

int[] merge_sort(int[] arranjo){

    if (arranjo.length > 1) {

        int tamanho_A = arranjo.length / 2;
        int tamanho_B = arranjo.length - tamanho_A;
        int[] p_result;

        int[] p_arranjoA = new int[tamanho_A];
        int[] p_arranjoB = new int[tamanho_B];

        System.arraycopy(arranjo, 0, p_arranjoA, 0, tamanho_A);
        System.arraycopy(arranjo, tamanho_A, p_arranjoB, 0, tamanho_B);

        p_arranjoA = merge_sort(p_arranjoA);
        p_arranjoB = merge_sort(p_arranjoB);

        p_result = merge(p_arranjoA, p_arranjoB);

        return p_result;

    }

    return arranjo;

}

void main() {

    int[] arranjoRandom = {10, 5, 18, 17, 3, 2, 8, 1};

    printArray(arranjoRandom);
    int[] p_sorted = merge_sort(arranjoRandom);
    printArray(p_sorted);

}