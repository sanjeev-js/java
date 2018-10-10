public class Eleven{
	public static void main(String[] args) {
		int x=90;
		System.out.println(x);
		for (int y=0; y<x; y++){
			if (y%5==0)
			System.out.println("Nav");
			else if (y%10==0)
			System.out.println("Gurukul");
			else if (y%5==0 || y%10==0)
			System.out.println("NavGurukul");
		}
	}
}