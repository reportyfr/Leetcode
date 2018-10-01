package permutations;

import java.util.*;
public class PhoneNumber {
	List<String> dic = new ArrayList<>();
	public List<String> letterCombination(String digits){
		if(digits.length()==0 || digits==null)
			return new ArrayList<String>();
		//如果字符串里有0和1，则直接返回空
		for(char s : digits.toCharArray()){
			if(s<'2' || s>'9')
			{
				return new ArrayList<String>();
			}
		}
		//先把0和1也对应空字符串也加进去，虽然它们没有意义
		dic.add("");
		dic.add("");
		dic.add("abc");
		dic.add("def");
		dic.add("ghi");
		dic.add("jkl");
		dic.add("mno");
		dic.add("pqrs");
		dic.add("tuv");
		dic.add("wxyz");
		List<String> res = new ArrayList<>();
		doDFS(0, res, digits, "");
		return res;
	}
	private void doDFS(int index, List<String> res, String digits, String current){
		//这里表示字符串已经达到该长度
		if(index==digits.length()){
			res.add(current);
			return;
		}
		//遍历当前数字所对应的字符串的长度
		String temp = dic.get(digits.charAt(index)-'0');
		for(int i=0;i<temp.length();i++){
			//current.append(temp.charAt(i));
			doDFS(index+1, res, digits, current+(temp.charAt(i)));
			//current.deleteCharAt(current.length()-1);
		}
	}
}
