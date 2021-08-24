
public class Testarray {

	public static void main(String[] args) {
		int a[]=new int[5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;
		
		int b[] = {11, 22, 33, 44, 55};
		
		
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
				
//		for (int i=0; i<a.length; i++) {
//			System.out.println(b[i]);
//		}
		
		for (int i:b) {
			System.out.println(i);
		}

	}

}
