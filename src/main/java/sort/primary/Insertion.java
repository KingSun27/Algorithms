package sort.primary;

import sort.basic.BasicSort;
import utils.StdRandom;

public class Insertion extends BasicSort{

	public static  void sort(Comparable[] a){
		int len = a.length;
		for (int i = 1; i < len; i++) {
			for (int j = i; j >0&&less(a[j],a[j-1]); j--)
				exch(a,j-1,j);
		}
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


