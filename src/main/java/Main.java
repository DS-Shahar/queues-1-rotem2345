class Main {
	//_______________________________________________________________________ex18___________________________
    public static Queue<Ball> fill(String[] a,int n){

        boolean[] size= {true,false};
        Queue<Ball> q=new Queue<Ball>();
        int cnum;int bnum;
        Ball b;
        for (int i = 0; i < n; i++) {
            cnum=(int)(Math.random() * ((5 )));
            bnum=(int)(Math.random() * ((1)));

            b=new Ball(a[cnum],size[bnum]);
            q.insert(b);

        }
        return q;
    }

    public static void printQueue(Queue<Ball> q){
        q.insert(null);
        while(q.head()!=null){
            System.out.print((char)q.head().getColor());
            q.insert(q.remove());
        }
        q.remove();
    }


    public static int checkpos(Queue<Ball> q){
        int count=1;
        q.insert(null);
        while((char)q.head().getColor()!='G' && q.head()!=null){
            count++;
            q.insert(q.remove());

        }
        if (q.head()==null){
            return -1;
        }
        while (q.head()!=null){
            q.insert(q.remove());
        }
        q.remove();
        return count;

    }

    public static void playgame(Queue<Ball> q){
        int pos= checkpos(q);
        if (pos==-1){
            System.out.println("eror, please reset game");
            return;
        }

        System.out.print('\n'+ "enter a gues: ");

        int gues=s.nextInt();
        while(gues!=pos){
            System.out.println("opss, not the right position");
            printQueue(q);
            System.out.println('\n'+"enter a gues: ");
            gues=s.nextInt();

        }
        System.out.println('\n'+"nice! you found the golden ball");

    }


//______________________________________________________________ex20________________________________
    public static void merge(Queue<Integer> q1,Queue<Integer> q2){
        q1.insert(null);
        q2.insert(null);
        while(q1.head()!=null && q2.head()!=null){
            if (q1.head()<=q2.head()){
                q1.insert(q1.remove());
            }
            else{
                q1.insert(q2.remove());
            }
        }
        if(q1.head()==null){
            while(q2.head()!=null) {
                q1.insert(q2.remove());
            }
        }
        else{
            while(q2.head()!=null){
                q1.insert(q1.remove());
            }
        }
        q1.remove();
        return;
    }
  
//___________________________________________________________________ex21________________________	
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
	

}
