package sort.primary;

import sort.basic.BasicSort;
import utils.StdRandom;
/**
 *  希尔排序是插入算法的变种
 *
 */
public class Shell extends BasicSort{

	public static void sort(Comparable[] a){
		int len = a.length;
		int h = 1;
		while(h<len/3) h = 3*h +1;
		while(h>1){
			for (int i = 1; i < len; i++) {
				for (int j = i; j >0&&less(a[j],a[j-1]); j-=h)
					exch(a,j-1,j);
			}
			h= h/3;
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
