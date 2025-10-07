import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
 class CollectionsFrequency {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,4,5,8,1,8,9,8,7,2);
        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.frequency(list,8));
        System.out.println(Collections.frequency(list,7));
    }
}
