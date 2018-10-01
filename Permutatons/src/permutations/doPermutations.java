package permutations;

import java.util.*;
public class doPermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		//这个res可以用到所有需要字符串array的结果里
		//List<String> res = new ArrayList<>();
		//测试电话号码对应字符串
		//PhoneNumber pn = new PhoneNumber();
		//res = pn.letterCombination("457");
		//-----------------------------
		
		//2
		//测试产生n括号对
		//GenerateParentheses gp = new GenerateParentheses();
		//res = gp.generateParentheses(3);
		
		//3
		//测试combinationSum
		//CombinationSum cs = new CombinationSum();
		//List<List<Integer>> res  = new ArrayList<List<Integer>>();
		//int[] candidates = {2, 3, 6, 7};
		//res = cs.combinationSum(candidates, 7);
		
		//4
		//NumberPermutations np = new NumberPermutations();
		//int[] nums = {1, 2, 3, 4, 5, 6};
		//res = np.numberPermutations(nums);
		
		//5
		//NumberPermutationsII npII = new NumberPermutationsII();
		//int[] nums = {1, 1, 2};
		//res = npII.numberPermutationsII(nums);
		
		//6
		PelotonProblem pp = new PelotonProblem();
		List<String> res = new ArrayList<String>();
		res = pp.solution(24, 4, "08??840");
		System.out.println(res);
		//System.out.println(res.get(0).length());
	}

}
