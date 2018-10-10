import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MyHashMap {

    // Class that records Key, Value pair
    class Container{
        Object key;
        Object value;
        public void insert(Object k, Object v){
            this.key = k;
            this. value = v;
        }
    }

    private Container c;
    private List<Container> recordList;

    // Create an underlying Extensible Array which will hold the Key,Value
    public MyHashMap() {
        this.recordList = new ArrayList<Container>();
    }


    // Put Key and Value into underlying ArrayList
    public void put(Object k, Object v) {

        this.c = new Container();

        //Data structure previously created is used to store record key and value
        c.insert(k, v);

        for (int i = 0; i < recordList.size(); i++){
            Container c1 = recordList.get(i);

            // If a DatatStructure in the underlying ArrayList holds the same Key as the key currently being used to insert a value
            // remove existing data structure from underlying ArrayList

            /*
            This means that there is always O(1) lookup as no collisions happen
             */
            if (c1.key.equals(k)) {
                recordList.remove(i);
                break;
            }
        }

        // add the DataStructure of Key, Value recorded to underlying arraylist
        recordList.add(c);
    }

    // get value from selected Key
    public Object get (Object k){

        for (int i = 0; i < this.recordList.size(); i++){
            // Loop through underlying arraylist
            Container con = recordList.get(i);
            // if Key passed through as a parameter is the same as the Key in the underlying ArrayList return the Value
            if (k.toString() == con.key.toString()) {

                return con.value;
            }
        }

        return null;
    }


}
