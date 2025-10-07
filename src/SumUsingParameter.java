 class SumUsingParameter {
    public static void main(String[] args) {
        System.out.println(sumTwoNumbers(4,8));
        System.out.println(sumTwoNumbers(56,85));
        System.out.println(sumTwoNumbers(-98,-89));

    }
    public static int sumTwoNumbers(int first, int second){
        System.out.println("First number received:"+first);
        System.out.println("Second number received:"+second);
        int sum = first+second;
        return sum;
    }
}
