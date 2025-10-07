import java.util.Arrays;
import java.util.List;

 class CollectionsElementSwap {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,3,5,4,6,7,6,2,1);
        System.out.println(list);
        swap(list, 2,7);
        System.out.println(list);
    }
    public static void swap(List<Integer>list, int x, int y){
        int swap = list.get(x);
        list.set(x, list.get(y));
        list.set(y,swap);

    }
}
