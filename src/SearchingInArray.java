import java.util.Scanner;

 class SearchingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {9,14,26,55,88,99,58,77};
        System.out.println("welcome to searching array number");
        System.out.print("please enter your number you want to search:");
        int num = sc.nextInt();
        boolean isFound = isFound(arr,num);
        if (isFound){
            System.out.println("Your number was found in array");
        }else {
            System.out.println("Your number was not found in array");
        }
    }
    public static boolean isFound(int[]arr, int num){
        int index = 0;
        while (index < arr.length){
            if (arr[index] == num){
                return  true;
            }
            index++;
        }
        return false;
    }
}
