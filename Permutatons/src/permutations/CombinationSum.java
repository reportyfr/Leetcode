package permutations;
import java.util.*;
/*
 * Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]
 */
public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target){
		if(candidates.length==0 || candidates==null)
			return new ArrayList<List<Integer>>();
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		doDFS(candidates, target, res, new ArrayList<Integer>(), 0);
		//对结果除重
		/*
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		set.addAll(res);
		res.clear();
		res.addAll(set);
		*/
		return res;
	}
	
	private void doDFS(int[] candidates, int target, List<List<Integer>> res, List<Integer> current, int start){
		if(target==0){
			res.add(new ArrayList<Integer>(current));
			return;
		}
		//表明减多了，该情况不符合
		if(target<0){
			return;
		}
		for(int i=start;i<candidates.length;i++){
			current.add(candidates[i]);
			doDFS(candidates, target-candidates[i], res, current, i);
			current.remove(current.size()-1);
		}
	}
}
