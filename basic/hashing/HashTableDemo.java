import java.util.*;
public class HashTableDemo{
	public static void main(String[] args) {
		// Implmenting HashTable
		// Creating a Hashtable to store string values		 
		//corresponding to integer keys

		Hashtable<Integer,String> hm = new Hashtable<Integer, String>();

			// Input the values

		hm.put(1,"I");
		hm.put(2,"want");
		hm.put(3,"a");
		hm.put(4,"Job");

		// Print the hashtable

		System.out.println(hm);
	}
}