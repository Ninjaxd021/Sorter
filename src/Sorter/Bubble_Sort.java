void printArray(int[] Arranjo){

    for (int j : Arranjo) {

        IO.print(j + " ");

    }

    IO.println();
}

//int[]Numbers
int[] BubbleSort(){

    int[] randomArranjo = {4,5,56,61,3,4513,234};
    printArray(randomArranjo);

    return new int[]{0};

}

void main() {
    IO.println("initialized");

    int[] ints = BubbleSort();


}