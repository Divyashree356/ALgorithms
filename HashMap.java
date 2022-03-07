import java.util.HashMap;
import java.util.Scanner;
//hashmap is a technique of map , there are multiple techniques of maps, hashmap is generally used technique of map 
//hashmap does not guarentee to be ordered
public class main {
     public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        HashMap<String,Integer> map =new HashMap<>();

        //Insering value in hashMap 
        map.put("Divyashree" ,102);
        map.put("Ashutosh",690);
        map.put("pratyush",198);

        System.out.println(map);
        
        //Get value from hashmap
        System.out.println(map.get("Divyashree"));

        //Check if key is present or not in the hashmap
        System.out.println(map.containsKey("Vishal")); //it will return false it is a boolean function

        //Check if value is present in hashmap
        System.out.println(map.containsValue(102));

        //Replace value of key in hashmap
        map.replace("Ashutosh", 690, 92969);
        System.out.println(map); //checking if replaced or not
        
        //put if absent ie if data entered is not present in hashmap than enter it
        map.putIfAbsent("Vishal", 129);
        System.out.println(map);

        //remove data
        map.remove("pratyush");
        System.out.println(map);

        //Taking user input
        int n=sc.nextInt();
        for(int i=0;i<n ;i++)
        {
            String key= sc.next();
            int value=sc.nextInt();

         map.put(key, value);
        }
        System.out.println(map);
    }
}
