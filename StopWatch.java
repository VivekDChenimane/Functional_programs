package FunctionalProgram;
public class StopWatch {
	public static void main(String args[]) throws InterruptedException {
	long start = System.currentTimeMillis();
	System.out.println("wait to a moment ;)");
	Thread.sleep(1500);
	long stop = System.currentTimeMillis();
	long value = stop-start;
	System.out.println("The time period of gap is "+value/1000+"sec.");
	}
}
