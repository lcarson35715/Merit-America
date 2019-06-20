import java.util.HashMap;

import java.util.Set;

public class HashMapFun {
    
  public static void main(String[] args) {
        
      HashMap<String, String> tracklist = new HashMap<String, String>();
        
      tracklist.put("Shotclock", "Ella Mae");
        
      tracklist.put("I Need You Now", "Lady Antebellum");
        
      tracklist.put("Hurricane", "Luke Combs");
      	
      tracklist.put("One Wish","Ray J");
        
      Set<String> keys = tracklist.keySet();
        
      
    
    for(String key : keys) {
          
          System.out.print(key+": "); 
            
          System.out.println(tracklist.get(key));    
        
        	System.out.println(tracklist.get("Shotclock"));
              
              
          
          
          
        }
    }
}
