package permutations;
import java.util.*;
/*
 * Input: [1,1,2]
		 Output:
			 [
			   [1,1,2],
			   [1,2,1],
			   [2,1,1]
			 ]
 */
//这比NumberPermutation复杂的地方就是这里的原数字串有重复值
//而且要求结果集没有重复值
//有一种方法就是利用一个visited数组记录每一个数是否被添加到结果集里面，具体见leecode 47自己的代码
//这里写一种更好的办法，还是利用交换两个元素的办法，但在每次交换前，判断该元素是否已经被换到前面过
//这里可以利用hashset判断
//当然也可以得到一组重复的结果集之后再利用hashset除重
//当然排序是第一步，必须把原集从小到大排列
public class NumberPermutationsII {
	public List<List<Integer>> numberPermutationsII(int[] nums){
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums.length==0 || nums==null)
			return res;
		Arrays.sort(nums);
		doDFS(nums, res, 0);		
		return res;
	}
	private void doDFS(int[] nums, List<List<Integer>> res, int index){
		if(index == nums.length){
			List<Integer> temp = new ArrayList<>();
			for(int i : nums) temp.add(i);
			res.add(new ArrayList<Integer>(temp));
			return;
		}
		Set<Integer> set = new HashSet<Integer>();
		for(int i=index;i<nums.length;i++){
			if(set.add(nums[i])){
				swap(i, index, nums);
				doDFS(nums, res, index+1);
				swap(i, index, nums);
			}
			//如果hashset里已经存在该元素，则表示这个元素已经被交换到start处过了
			else{
				continue;
			}
		}
		
	}
	private void swap(int x, int y, int[] nums){
		int temp = nums[x];
		nums[x] = nums[y];
		nums[y] = temp;
	}
}
