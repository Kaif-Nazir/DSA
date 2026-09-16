import java.util.*;



public class map {

    public static void main (String ... args){

        Map<Integer , Integer> m1 = new HashMap<>();
        
        /* String a = "kaif";                                                              // Hash Code NIAA
        String b = new String("kaif");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.hashCode() == b.hashCode()); */
        /* Integer a = 123123123;
        System.out.println(a.hashCode()); */
        /* Map<Integer , Integer> m2 = new HashMap<>();                                    // FreQuency Map
        int arr[] = {-1,-1,2,4,5,3,7,4,5,3,4,5,3,7,};
        for(int num : arr){
            m2.put(num , m2.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer , Integer> entry : m2.entrySet()){
            System.out.println(entry.getKey() + " Appears " + entry.getValue());
        } */
        /* HashMap<String, Integer> Map = new HashMap<>();

        Map.put("IND", 500);
        Map.put("CHI", 250);
        Map.put("RUS", 100); */
        /* System.out.println(Map);                                                        // Add Remove Edit    
        Map.put("RUS", 150);                                                               // Edit Data
        System.out.println(Map);
        Map.put("AMR", 250);                                                               // Add Data
        System.out.println(Map);
        Map.remove("CHI");                                                                 // Remove Data By Key
        System.out.println(Map); */
        /* if(Map.containsKey("IND")){
        System.out.println("IND is Present");
        }else
        System.out.println("IND is  Not Present"); */
        /* System.out.println(Map.get("RUS"));                                             // Access By Key
        System.out.println(Map.get("asd")); */
        // Null Access
        /* if(Map.containsValue(150)){                                                     // Access By Value
        System.out.println("Yes");                                          
        } */
        /* for (Map.Entry<String , Integer> val : Map.entrySet()) {                        // Iterate With Entry Set IMP
        System.out.print(val.getKey() + " --> " + val.getValue());
        System.out.println();
        } */
        /* Set<String> keys = Map.keySet();                                                // Iterate By Key Set
        for (String key : keys) {
        System.out.print(key + "--> " + Map.get(key));
        System.out.println();
        } */
        /* int i = 1;                                                                      // Iterate By Key Set and Values Better
        m1.put(i++, i++);
        m1.put(i++, i++);
        m1.put(i++, i++);
        m1.put(i++, i++);
        System.out.println(m1);
        for(int j : m1.keySet())
        System.out.println(j + " " + m1.get(j)); */
        /* int i = 1;                                                                      // Iterate Over Values Better 
        m1.put(i++, i++);
        m1.put(i++, i++);
        m1.put(i++, i++);
        m1.put(i++, i++);
        System.out.println(m1);
        for(int j : m1.values())
        System.out.println(j); */
        


    }

}
