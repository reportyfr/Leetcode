package permutations;
import java.util.*;
//给定一个数字n，产生所有符合条件的n对开闭括号
//思路：
//用两个count来记录左括号和右括号，所有满足条件的括号对一定是左括号比右括号多
//左括号数量不等于0
public class GenerateParentheses {
	public List<String> generateParentheses(int n){
		if(n<=0)
			return new ArrayList<String>();
		List<String> res = new ArrayList<>();
		doDFS(n, n, res, new StringBuilder());
		return res;
	}
	
	private void doDFS(int left, int right, List<String> res, StringBuilder current){
		if(left==0 && right==0){
			res.add(current+"");
			return;
		}
		if(left>0){
			current.append("(");
			doDFS(left-1, right, res, current);
			current.deleteCharAt(current.length()-1);
		}
		if(right>left && right>0){
			current.append(")");
			doDFS(left, right-1, res, current);
			current.deleteCharAt(current.length()-1);
		}
	}
}
