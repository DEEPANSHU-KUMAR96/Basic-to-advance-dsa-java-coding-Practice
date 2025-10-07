 class ArrayPalindrome {
    public static void main(String[] args) {
        System.out.println("welcome to palindrome checker\n");
        int[] numArr = ArrayUtility.inputArray();
        boolean isPalin = isPalindrome(numArr);
        if (isPalin){
            System.out.println("Your number is palindrome");
        }else {
            System.out.println("your number  is not palindrome");
        }
    }
    public static boolean isPalindrome(int[]numArr){
        int i = 0;
        while (i < numArr.length/2){
            if (numArr[i] != numArr[numArr.length-1-i]){
                return false;
            }
            i++;
        }
        return true;

    }
}
