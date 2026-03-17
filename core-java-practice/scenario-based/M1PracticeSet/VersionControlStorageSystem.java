package RegexPractice;

import java.util.*;
import java.util.Scanner;

public class VersionControlStorageSystem {
  static HashMap<String,LinkedHashMap<String,Integer>> map = new HashMap<>();
  
  public static void upload(String name, String version, int size) {
	  map.putIfAbsent(name,new LinkedHashMap<String,Integer>());
	  HashMap<String,Integer> versions = map.get(name);
	  
	  if(!versions.containsKey(version)) versions.put(version, size);
  }
 public static List<Map.Entry<String,Integer>> fetch(String name){
	 if(!map.containsKey(name)) return null;
	 List<Map.Entry<String,Integer>> res =new ArrayList<>( map.get(name).entrySet());
	 
	 res.sort((a,b) ->
	 {
		 if(!a.getValue().equals(b.getValue())) return a.getValue() - b.getValue();
		 return a.getKey().compareToIgnoreCase(b.getKey());
	 });
	 return res;
	 
 }
 public static String latest(String name) {
	 LinkedHashMap<String,Integer> versions = map.get(name);
	 String latestVersion ="";
	 int latestSize = 0;
	 for(Map.Entry<String,Integer> entry : versions.entrySet()) {
		 latestVersion = entry.getKey();
		 latestSize = entry.getValue();
		 }
	 return latestVersion +" "+latestSize;
 }
 public static int totalStorage(String name) {
	 LinkedHashMap<String,Integer> versions = map.get(name);
	 int size = 0;
	 for(Map.Entry<String,Integer> entry : versions.entrySet()) {
		
		 size += entry.getValue();
		 }
	 return size;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int n =  sc.nextInt();
      sc.nextLine();
      for(int i=1;i<=n;i++) {
    	  String command = sc.next();
    	  switch(command){
    	  case "UPLOAD" : 
    		  String name = sc.next();
    		  String version = sc.next();
    		  int size = sc.nextInt();
    		  upload(name,version,size);
    		  break;
    	  case "FETCH"  :
    		  String nameF = sc.next();
    		  System.out.println(fetch(nameF));
    		  break;
    	  case "LATEST" :
    		  String nameL = sc.next();
    		  System.out.println(latest(nameL));
    		  break;
    		  
    	  case "TOTAL_STORAGE" :
    		  String nameT = sc.next();
    		  System.out.println(totalStorage(nameT));
    		  break;
          default :
        	  System.out.println("INVALID COMMAND");
    	  }
      }
	}

}
