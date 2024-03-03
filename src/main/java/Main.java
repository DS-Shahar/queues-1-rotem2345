class Main {
  public static Queue<Wolter> buildQueue(){
		Wolter w=new Wolter();
		Queue<Wolter> q=new Queue<Wolter>();
		for(int i=0;i<=10;i++) {
			w=new Wolter();
			q.insert(w);
		}
		q.remove();
		return q;
	}
	
	public static String bla(Queue<Wolter> q,int cc) {
		q.insert(null);
		while(q.head().getCc()<cc && q.head()!=null) {
			q.insert(q.remove());
		}
		
		if (q.head()==null) {
			return ("there is no wolter with enough cc");
		}
		
		String e=q.head().getId();
		
		while(q.head()!=null) {
			q.insert(q.remove());
		}
		
		return e;
	}
	

	public static void main(String[] args) {
		Queue<Wolter> q=buildQueue();
		System.out.println(bla(q,70));
		
		

	}
}
