package sy2;

public abstract class Lives {
	public static final int EAT=1;
	public static final int WORK=3;
	public static final int SLEEP=5;
	
	public abstract void eat();
	public abstract void sleep();
	public abstract void work();

	public void Action(int flag) {
		switch(flag) {
		case EAT:{this.eat();break;}
		case WORK:{this.work();break;}
		case SLEEP:{this.sleep();break;}
		default:{System.out.println("未指定动作");break;}
		}
	}
}
