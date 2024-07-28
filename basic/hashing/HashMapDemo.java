public class HashMapDemo{

	public static void createHashMap(int[] arr){
			// Create an Empty HashMap
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();

		// Travese Through the given array

		for (int i = 0;i< arr.length ;i++ ) {

			Integer c = hmap.get(arr[i]);
			
		}
		// https://www.geeksforgeeks.org/hashing-in-java/


	}
	public static void main(String[] args) {
		
		int arr[] = { 10, 34, 5, 10, 3, 5, 10 };
        createHashMap(arr);


	}
}