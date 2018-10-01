package arrays;
import java.util.*;
//就是给定一个数组，问能否找出3个数相加的和为0
public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums){
		if(nums.length<3)
			return new ArrayList<List<Integer>>();
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		//外层先找第一个数，内层从两侧往内找第二三个数
		for(int i=0; i<nums.length-2;i++){
			int start = i+1;
			int end  = nums.length-1;
			//这是为了除重
			if(i>=1 && nums[i]==nums[i-1])
				continue;
			while(start<end){
				List<Integer> temp = new ArrayList<Integer>();
				if(start>=i+2 && start<end && nums[start]==nums[start-1]){
					start++;
					continue;
				}
				if(end<nums.length-1 && nums[end]==nums[end+1] && end>start){
					end--;
					continue;
				}
				if(nums[i]+nums[start]+nums[end]==0){
					temp.add(nums[i]);
					temp.add(nums[start]);
					temp.add(nums[end]);
					res.add(new ArrayList<Integer>(temp));
					start++;
					end--;
					continue;
				}
				if(nums[i]+nums[start]+nums[end]<0){
					start++;
					continue;
				}
				if(nums[i]+nums[start]+nums[end]>0){
					end--;
					continue;
				}
			}
		}
		
		return res;
	}
}
