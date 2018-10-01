package comparatorTest;

import java.util.*;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dic = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
		List<List<Integer>> list=new ArrayList<List<Integer>>();        
		for(int i=0;i<dic.length;i++){             
			List<Integer> temp = new ArrayList<>();
			temp.add(dic[i][0]);
			temp.add(dic[i][1]);
			list.add(new ArrayList<Integer>(temp));
		}        
		Collections.sort(list,new Comparator<List<Integer>>(){            
			public int compare(List<Integer> one,List<Integer> two){                
					int a = one.get(0);
					int b = one.get(1);
					int c = two.get(0);
					int d = two.get(1);
					return a-c==0?b-d:c-a;
				}        
			});
		System.out.println(list);

	}

}
