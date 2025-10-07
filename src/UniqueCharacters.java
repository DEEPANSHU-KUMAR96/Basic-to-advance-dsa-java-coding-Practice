import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

 class UniqueCharacters {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your string:");
        String userStr = sc.next();

        for (char ch : userStr.toCharArray()){
            unique.add(ch);
        }
        System.out.printf("your string has %d unique characters", unique.size());
    }
}
