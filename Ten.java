public class Ten{
	public static void main(String[] args) {
		System.out.println("Break statement\n --------------------------");
		for(int i=0; i<8; i++){
			if (i==6) break;
			System.out.println(i);
		}
		System.out.println("Continue statement \n ---------------------");
		for (int i=0; i<9; i++){
			if (i==1) continue;
			System.out.println(i);
		}
	}
}