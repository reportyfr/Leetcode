package arrays;

import java.util.*;
public class DoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test threesum
		ThreeSum ts = new ThreeSum();
		int[] nums = {-1,4,5,3,2,8,-6,-4,-9,-7,4, 2, 3, -11, 11};
		List<List<Integer>> res  = ts.threeSum(nums);
		System.out.println(res);
	}

}
