// Array ordering, low computation quality;
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