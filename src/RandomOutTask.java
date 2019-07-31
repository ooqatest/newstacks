import java.util.Random;

public class RandomOutTask implements Task {

	private int range;

	public RandomOutTask() {
		Random r = new Random();
		this.range = r.nextInt();
	}

	@Override public void execute() {
		System.out.println( "Generated number is " + range );
	}

	@Override public String toString() {
		return "RandomOutTask{" +
				   "range=" + range +
				   '}';
	}
}
