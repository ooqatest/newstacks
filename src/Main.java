import java.util.ArrayList;

public class Main {

	public static void main( String[] args ) {
		OutTask outTask = new OutTask("yahuuuu");
		outTask.execute();


		RandomOutTask r = new RandomOutTask( );
		r.execute();


		CounterOutTask counterOutTask = new CounterOutTask();
		CounterOutTask counterOutTask2 = new CounterOutTask();
		CounterOutTask counterOutTask1 = new CounterOutTask();
		CounterOutTask counterOutTask53 = new CounterOutTask();
		CounterOutTask counterOutTask521 = new CounterOutTask();
		CounterOutTask counterOutTask21 = new CounterOutTask();

		counterOutTask.execute();

		ArrayList<Task> list = new ArrayList<Task>();
		Stack stack = new Stack( list );
		stack.push( counterOutTask );
		stack.push( counterOutTask2 );
		stack.push( counterOutTask1 );
		stack.push( counterOutTask53 );
		stack.push( outTask );

		System.out.println(stack.isEmpty());
		System.out.println(list);
		System.out.println(stack.sizes());
	}
}
