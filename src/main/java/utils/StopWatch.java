package utils;
/**
 * 秒表，简化计时
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
