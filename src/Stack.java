import java.util.List;

public class Stack implements Container{
	public List<Task> tasks;


	public Stack( List<Task> stackList){
		this.tasks = stackList;
	};


	@Override public Task pop() {
		if(!tasks.isEmpty()){
			return tasks.remove( tasks.size()-1 );
		}
		return null;
	}

	@Override public void push( Task task ) {
		tasks.add( task );
	}

	@Override public int sizes() {
		return tasks.size();
	}

	@Override public boolean isEmpty() {
		return tasks.isEmpty();
	}

	@Override public void transferFrom( Container container ) {
		List<Task> newContainer;
		if(!(tasks.isEmpty())){
			for(int i=0;i<tasks.size();i++){

			}
		}
	}
}
