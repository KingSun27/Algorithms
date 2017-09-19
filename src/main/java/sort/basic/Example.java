package sort.basic;


@Deprecated
public class Example {
	public static void sort(Comparable[] a){}
	public static boolean less(Comparable a,Comparable b){
		return a.compareTo(b)<0;
	}
	public static void exch(Comparable[] a, int i, int j){
		Comparable temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static boolean isSorted(Comparable[] a){
		for (int i = 1; i < a.length; i++) {
			if(less(a[i],a[i-1]))   return false;
		}
		return true;
	}
	public static void show(Comparable[] a){
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Comparable[] a = null;
		sort(a);
		System.out.println(isSorted(a));
		show(a);
	}

}
