package sort.primary;

import sort.basic.BasicSort;
import utils.StdRandom;

public class Selection extends BasicSort{

	public static void sort(Comparable[] a){
		int len = a.length;
		for (int i = 0; i < len; i++) {
			int min = i;
			for (int j = i; j < len; j++) 
				if(less(a[j],a[min]))  min = j;
			exch(a, i, min);
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
