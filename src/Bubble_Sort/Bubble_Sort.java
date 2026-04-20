void printArray(int[] Arranjo){

    for (int j : Arranjo) {

        IO.print(j + " ");

    }

    IO.println();
}

//int[]Numbers
int[] BubbleSort(int[] randomArranjo){

    // Catching the size to make a loop
    int sizeArranjo = randomArranjo.length;

    // Settings values
    int temp,index,jIndex;

    IO.println("Start scan");

    // Scanning the end to start
    for (index = sizeArranjo-1; 0 < index; index--){

        // Scanning the other values
        for (jIndex = 0; jIndex <= index-1;jIndex++)
            if (randomArranjo[jIndex] > randomArranjo[jIndex + 1]) {
                temp = randomArranjo[jIndex];
                randomArranjo[jIndex] = randomArranjo[jIndex + 1];
                randomArranjo[jIndex + 1] = temp;
            }

    }

    IO.println("Finish");

    return randomArranjo;

}

void main() {

    IO.println("initialized");

    // Just a random table with random numbers
    int[] randomArranjo = {4,5,56,61,3,4513,234};

    // print to confirm the previous order
    printArray(randomArranjo);

    // Calling the function to order
    randomArranjo = BubbleSort(randomArranjo);

    // just print to verifying the before order
    printArray(randomArranjo);

}