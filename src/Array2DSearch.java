import java.util.Scanner;

 class Array2DSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D search");
        int[][] numArr = ArrayUtility2.input2DArray();
        System.out.print("Now enter the number you want to search:");
        int num = input.nextInt();
        boolean isFound = search(numArr,num);
        if (isFound){
            System.out.println("your number was found");
        }else {
            System.out.println("your number was not found");
        }

    }
    public static boolean search(int[][] numArr, int num) {
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr[i].length) {
                if (numArr[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }

}
