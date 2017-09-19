package sort.quick;

import sort.basic.BasicSort;
import utils.StdRandom;

public class quick extends BasicSort{

	public static void sort(Comparable[] a){
		sort(a,0,a.length -1);
	}
	public static void sort(Comparable[] a,int lo,int hi){
		if(hi <= lo) return;
		int j = partition(a,lo,hi);
		sort(a,lo,j-1);
		sort(a,j+1,hi);
	}
	
	public static int partition(Comparable[] a,int lo,int hi){
		int i = lo,j = hi+1;
		Comparable v = a[lo];
		while(true){
			while(less(a[++i],v)) if(i == hi) break;
			while(less(v,a[--j])) if(j == lo) break;
			if(i>=j) break;
			exch(a,i,j);
		}
		exch(a,lo,j);
		return j;
	}
	public static void main(String[] args) {
		int size = 10;
		Double[] a = new Double[size];
		for (int j = 0; j < size; j++) {
			a[j] =StdRandom.uniform();
		}
		sort(a);
		System.out.println(isSorted(a));
		show(a);
	}
}


