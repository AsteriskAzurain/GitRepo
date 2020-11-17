package testpkg;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[][]= {{1,2,3},{4,5,6}};
		System.out.println(b.length);
		
		int a[]= {1,2,3};
		System.out.println(avg(a));
		/*
		char[] strc= {'C','h','a','r',' ','A','r','r','a','y'};
		System.out.println(String.valueOf(10));
		System.out.println(String.valueOf(strc));
		String s1= strc.toString();
		String s2=String.copyValueOf(strc);
		boolean rst1= s1 instanceof String;
		boolean rst2= s2 instanceof String;
		System.out.println(rst1);
		System.out.println(rst2);
		System.out.println(s1.equals(s2));*/
		
		
	}
	public static float avg(int a[]) {
		
		int sum=0;
		int l=a.length;
		for(int i=0;i<l;i++){
			sum+=a[i];
		}
		float avg=sum/l;
		return avg;
	}

}
