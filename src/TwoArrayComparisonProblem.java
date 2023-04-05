package test;

import java.util.Arrays;
import java.util.HashMap;

public class TwoArrayComparisonProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 15, 56, 500 };
		int b[] = { 54, 43, 366, 25, 10 };
		int pointer=0;
		HashMap out=new HashMap();
		for(int i=0;i<=b.length-1;i++) {
			final int l=i;
			long count = Arrays.stream(a).filter(x->x<b[l]).count();
			out.put(b[i], count);
		}
		System.out.println(out);
	}

}
