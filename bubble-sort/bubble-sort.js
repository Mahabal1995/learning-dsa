function bubbleSort(arr) {
  let swapped; // boolean variable to check if the elements in array is swapped
  do {
    swapped = false; // make it false in every single pass
    for (let i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        let temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
        swapped = true; // make it true if elements are swapped
      }
    }
  } while (swapped); // if swapped repeat the iteration until there are no more swaps
}

const arr = [64, 34, 25, 12, 22, 11, 90];
bubbleSort(arr);
console.log(arr);
