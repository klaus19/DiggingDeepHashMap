import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Worker {


    public static void main(String[] args) {
        HashMap<String,Integer>emp_hashmap = new HashMap<>();
        emp_hashmap.put("Niks",1234);
        emp_hashmap.put("Dom",4567);
        emp_hashmap.put("tejas",5632);
        emp_hashmap.put("tom",5678);
        System.out.println("HashMap:"+emp_hashmap);

        HashMap<String,String>map = new LinkedHashMap<>();
        map.put("Alice","34");
        map.put("Bob","45");
        map.put("dabby","67");
        map.put("er","23");

        //usage of entrySet
        System.out.println("Following is the Set View:"+emp_hashmap.entrySet());

        //using keySet

        String str = (String)map.get("Bob");
        System.out.println("rank of Bob:"+str);
        Iterator itr = map.keySet().iterator();
        while (itr.hasNext()){
            String resKey = (String) itr.next();
            System.out.println("Rank of" +resKey+ " is " +map.get(resKey));
        }
        

    }
}
