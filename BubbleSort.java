public class BubbleSort{
  public static void main(String[] args){
    System.out.println("BubbleBobble");
    // int[] primes = {1,2,3,5,7,11,13,17,19,23};
    int mixedPrimes[] = {23,1,2,19,3,17,5,7,13,11};
    System.out.println(mixedPrimes[4]);
    BubbleSort bubblesort = new BubbleSort();
    bubblesort.sort(mixedPrimes);
    System.out.println(mixedPrimes[4]);
  }
  // public void start(){
  //
  // }
  public int[] totals(){
    int[] itemsTotal = new int[3];
    itemsTotal[0] = 4;
    itemsTotal[1] = 16;
    itemsTotal[2] = 92;
    return itemsTotal;
  }
  public void sort(int[] arr) {
        boolean swapped = true;
        int j = 0;
        int tmp;
        while (swapped) {
              swapped = false;
              j++;
              for (int i = 0; i < arr.length - j; i++) {
                    if (arr[i] > arr[i + 1]) {
                          tmp = arr[i];
                          arr[i] = arr[i + 1];
                          arr[i + 1] = tmp;
                          swapped = true;
                    }
              }
        }
  }
}
