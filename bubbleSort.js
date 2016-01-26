// public void bubbleSort(int[] arr) {
//       boolean swapped = true;
//       int j = 0;
//       int tmp;
//       while (swapped) {
//             swapped = false;
//             j++;
//             for (int i = 0; i < arr.length - j; i++) {
//                   if (arr[i] > arr[i + 1]) {
//                         tmp = arr[i];
//                         arr[i] = arr[i + 1];
//                         arr[i + 1] = tmp;
//                         swapped = true;
//                   }
//             }
//       }
// }

var bubbleSort = function(arr){
  var swapped = true;
  var tmp, j=0;
  while (swapped) {
    swapped = false
    j++;
    for (var i = 0; i < arr.length - j; i++){
      if(arr[i] > arr[i+1]){
        tmp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = tmp;
        swapped = true;
      }
    }
  }
}
