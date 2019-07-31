class OutTask implements Task {

	private String message;

	public OutTask( String message ) {
		this.message = message;
	}

	public void execute() {
		System.out.println( this.message );
	}

	@Override public String toString() {
		return "OutTask{" +
				   "message='" + message + '\'' +
				   '}';
	}
}
