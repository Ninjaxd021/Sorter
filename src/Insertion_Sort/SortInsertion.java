/*
 Array ordering, low computation quality;

     Insertion Sort is an algorithm that analyzes data and sort it to improve
visualization and optimization in other codes.
    In my opinion, this algorithm, with sorts data by scan and checking previous values,
based on this information, is not suitable in most cases, as it makes scanning difficult, have
there are other, more effective methods.
*
*/


int[] sortInsertion(int []Numbers){

   int index,size,temp,j,valorAncora;

   size = Numbers.length;

   for( index = 1; index < size; index++){

      valorAncora = Numbers[index];
      j = index - 1;

      while (j >= 0 && Numbers[j] > valorAncora) {

         temp = Numbers[j+1];
         Numbers[j+1] = Numbers[j];
         Numbers[j] = temp;

         j = j - 1;

      }


   }

   return Numbers;
}

void main(){
}