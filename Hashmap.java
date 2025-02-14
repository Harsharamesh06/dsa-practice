// "static void main" must be defined in a public class.
//HASH MAP
public class Main {
    public static void main(String[] args) {
        //hashmap
        HashMap<String,String>map = new HashMap<>();
        //insertion 
       
        map.put("IN","India");
        map.put("CH","China");
        map.put("RU","Russia");
          map.put("L","London");
        
        //search
        System.out.println(map.get("IN"));
        System.out.println(map.get("CH"));
        System.out.println(map.get("RU"));
        System.out.println(map.get("L"));
        System.out.println(map.getOrDefault("N","Not found"));
        
       // for(String key ;)
            
       //remove
        map.remove("CH");
        System.out.println(map); 
       //  for(String key : map.keySet()){
      //Systen.out.println(key + " " +map.get(key));
        
        //size
        map.size();
        //System.out.println(map.size());
        //System.out.println(map.isEmpty)
        
          for (String i : map.keySet()) {
      System.out.println("key" + i + "value" + map.get(i));
        
        
        
            
        }
    }
}
