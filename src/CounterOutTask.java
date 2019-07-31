public class CounterOutTask implements Task {

	static int counter = 0;

	public CounterOutTask() {
		counter++;
	}

	@Override public void execute() {
		System.out.println( counter + " Objects" );
	}

	@Override public String toString() {
		return "CounterOutTask{}";
	}
}
