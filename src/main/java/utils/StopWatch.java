package utils;
/**
 * ����򻯼�ʱ
 *
 */
public class StopWatch {
	private long start ;
	public StopWatch() {
		start = System.currentTimeMillis();
	}
	public long  ElapsedTime(){
		return System.currentTimeMillis() - start;
	}
}
