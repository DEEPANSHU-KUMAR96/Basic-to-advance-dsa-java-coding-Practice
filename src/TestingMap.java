import java.util.HashMap;
import java.util.Map;

class TestingMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Deepanshu",100);
        map.put("preeti", 50);
        map.put("Deepak", 60);
        System.out.println(map.size());
        System.out.println(map.get("Deepanshu"));
        System.out.println(map.containsKey("preeti"));
        System.out.println(map.remove("Deepak"));
        System.out.println(map.size());

        for (String key: map.keySet()){
            System.out.printf("%s: %s\n", key,map.get(key));
        }
    }
}
