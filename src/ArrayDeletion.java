import java.util.Scanner;



 class ArrayDeletion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to array deletion\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.println("Now Enter the number you want to delete:");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr,numToDelete);
        System.out.println("Here is your new Array");
        ArrayUtility.displayArray(newArr);

    }
      class OccurrencesArray {
         public static int noOfOccurences(int[] arr, int num) {
             int count = 0;
             for (int val : arr) {
                 if (val == num) count++;
             }
             return count;
         }
     }

     public static int[] deleteNumber(int[]numArr,int numToDelete){
        int occ = OccurrencesArray.noOfOccurences(numArr,numToDelete);

        if (occ == 0){
            return numArr;
        }
        int newSize = numArr.length-occ;
        int[] newArr = new int[newSize];
        int i = 0, j = 0;
        while (i < numArr.length){
            if (numArr[i] != numToDelete){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;

    }
}
