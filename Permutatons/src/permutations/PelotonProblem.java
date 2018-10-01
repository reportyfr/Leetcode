package permutations;
import java.util.*;
public class PelotonProblem {
	public List<String> solution(int workHours, int dayHours, String pattern)
	{
		if(pattern.length()<=0)
			return new ArrayList<String>();
		List<String> res = new ArrayList<String>();
		doDFS(0, res, new StringBuilder(""), workHours, dayHours, pattern);
		return res;
	}
	
	private void doDFS(int count, List<String> res, StringBuilder current, int workhours, int dayhours, String pattern){
		//满足条件
		if(count==7 && workhours==0){
			res.add(current+"");
			//System.out.println(current);
			return;
		}
		if(count==7 && workhours!=0)
			return;
		if(workhours<0)
			return;
		if(pattern.charAt(count)!='?'){
			int temp = pattern.charAt(count)-'0';
			//这里注意current.append一定要单独写，不能直接写在调用DFS的参数里，因为一旦加了就回不去了
			current.append(String.valueOf(temp));
			doDFS(count+1, res, current, workhours-temp, dayhours, pattern);
			current.deleteCharAt(current.length()-1);
		}
		//每个位置的工作时间从0开始到dayhours
		if(pattern.charAt(count)=='?'){
			//在每个可以放数字的位置按顺序加
			for(int i=0;i<=Math.min(dayhours, 8);i++){
				current.append(String.valueOf(i));
				doDFS(count+1, res, current, workhours-i, dayhours, pattern);
				current.deleteCharAt(current.length()-1);
			}
		}
	}	
}
