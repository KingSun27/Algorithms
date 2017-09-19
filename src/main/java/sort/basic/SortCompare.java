package sort.basic;

import sort.primary.Insertion;
import sort.primary.Selection;
import utils.StdRandom;
import utils.StopWatch;

public class SortCompare {
	
	enum Sort{
		insertion,selection,shell,merge
	}
	
	public static double time(Sort sort,Double[] a){
		StopWatch timer = new StopWatch();
		switch (sort) {
		case insertion:
			Insertion.sort(a);
			break;
		case selection:
			Selection.sort(a);
			break;
		case shell:
			Selection.sort(a);
			break;
		case merge:
			Selection.sort(a);
			break;
		default:
			break;
		}
		return timer.ElapsedTime();
	}
	
	public static double timeRamdomInput(Sort sort,int N,int size){
		double total = 0d;
		Double[] a = new Double[size];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < size; j++) {
				a[j] =StdRandom.uniform();
			}
			total += time(sort,a);
		}
		return total;
	}
	public static void main(String[] args) {
		
		
		int N = 10;
		int size = 20000;
		Sort sort1 = Sort.selection;
		Sort sort2 = Sort.insertion;
		Sort sort3 = Sort.shell;
		Sort sort4 = Sort.merge;

		double t1 = timeRamdomInput(sort1,N,size);
		double t2 = timeRamdomInput(sort2,N,size);
		double t3 = timeRamdomInput(sort3,N,size);
		double t4 = timeRamdomInput(sort4,N,size);

		System.out.println(sort1 + " cost " + t1);
		System.out.println(sort2 + " cost " + t2);
		System.out.println(sort3 + " cost " + t3);
		System.out.println(sort4 + " cost " + t4);

	/*	System.out.println("¶ÔÓÚ"+N+"×é"+size+" doubles "+sort1+" is");
		System.out.println(t2/t1 + " times faster than "+sort2);*/

	}
	
	
}
