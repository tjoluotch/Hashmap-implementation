public class Main {

    public static void main(String[] args) {

        MyHashMap hm = new MyHashMap();

        hm.put("1", "Football");
        hm.put("2", "Rugby");
        hm.put("3", "Baseball");

        System.out.println(hm.get("2"));

        hm.put("3", "NFL");

        System.out.println(hm.get("1"));
        System.out.println(hm.get("3"));
        System.out.println(hm.get("7"));
    }
}
