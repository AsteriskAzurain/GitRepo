package sy2;

public class SY2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h=new Human();
		Robots r=new Robots();
		Cats c=new Cats();
		
		h.Action(Lives.EAT);
		h.Action(Lives.WORK);
		h.Action(Lives.SLEEP);
		System.out.println("---------------");
		r.Action(Lives.EAT);
		r.Action(Lives.WORK);
		r.Action(Lives.SLEEP);
		System.out.println("---------------");
		c.Action(Lives.EAT);
		c.Action(Lives.WORK);
		c.Action(Lives.SLEEP);
	}

}
