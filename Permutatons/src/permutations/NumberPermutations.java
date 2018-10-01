package permutations;
import java.util.*;

/*
 * Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */
//采用交换元素的办法
public class NumberPermutations {
	public List<List<Integer>> numberPermutations(int nums[]){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums.length==0 || nums==null)
			return res;
		doDFS(0, nums, res);
		return res;
	}
	
	private void doDFS(int start, int[] nums, List<List<Integer>> res){
		if(start==nums.length){
			List<Integer> temp = new ArrayList<Integer>();
			for(int i: nums) temp.add(i);
			res.add(new ArrayList<Integer>(temp));
			return;
		}
		for(int i=start;i<nums.length;i++){
			swap(i, start, nums);
			doDFS(start+1, nums, res);
			swap(i, start, nums);
		}
	}
	private void swap(int x, int y, int[] nums){
		int temp = nums[x];
		nums[x] = nums[y];
		nums[y] = temp;
	}
}
