import java.util.HashSet;
import java.util.Set;
public class IntersectionOfArray{

	public static int[] intersection (int[] nums1, int[] nums2){
		Set<Integer> set = new HashSet<>();
		Set<Integer> resultSet = new HashSet<>();

		for(int num : nums1){
			set.add(num);
		}

		for (int num:nums2 ) {
			if(set.contains(num)){
				resultSet.add(num);
			}
			
		}

		// convert resultSet to an array
		int[] result = new int[resultSet.size()];
		int index = 0;

		for (int num:resultSet) {
			result[index++] = num;
			
		}
		return result;


	}


	public static void main(String[] args) {
		System.out.println("Intersection of Arrays");
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] result = intersection(nums1 , nums2);

		for (int i = 0 ;i < result.length ;i++ ) {
			System.out.println(result[i]);
			
		}




	}


}