package sort.merge;

import sort.basic.BasicSort;
import utils.StdRandom;

public class MergeBU extends BasicSort{

	private static Comparable[] aux;
	
	public static void merge(Comparable[] a,int lo,int mid,int hi){
		int i = lo,j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			aux[k] = a[k];
		}
		for (int k = lo; k <= hi; k++) {
			if(i > mid) a[k]=aux[j++];
			else if(j > hi) a[k]=aux[i++];
			else if(less(aux[i],aux[j])) a[k] = aux[i++];
			else a[k] = aux[j++];
		}
	}
	
	public static void sort(Comparable[] a){
		int len = a.length;
		aux = new Comparable[len];
		for (int size = 1; size < len; size *= 2) {
			for (int lo = 0; lo < len; lo += 2*size ) {
				merge(a,lo,lo+size-1,Math.min(lo+2*size-1,len-1));
			}
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
