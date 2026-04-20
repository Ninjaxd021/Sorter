
void printArranjo(int[] Arranjo){

   for (int i : Arranjo){

      IO.print( i + " " );

   }

   IO.println();

}

int[] selectionSort(int [] Arranjo){

   int index;
    int jIndex;
    int sizeArranjo;
    int temp;
    int max_Position;

    sizeArranjo = Arranjo.length;

   for (index = sizeArranjo-1; index > 0; index--){

      max_Position = 0;

      for (jIndex = 0; jIndex <= index; jIndex++){

         if ( Arranjo[jIndex] > Arranjo[max_Position]){

            max_Position = jIndex;

         }

      }

      temp = Arranjo[index];
      Arranjo[index] = Arranjo[max_Position];
      Arranjo[max_Position] = temp;

      printArranjo(Arranjo);

   }

   return Arranjo;
}

void main(){

   int[] randomArranjo = {13, 7, 5, 1, 4};

   printArranjo(randomArranjo);
   selectionSort(randomArranjo);
}