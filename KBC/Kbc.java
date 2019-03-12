import java.util.Scanner;
public class Kbc{
	public static void main(String[] args) {
	String[] questions={"Bahubali festival is related to","September 27 is celebrated every year as","Who is the author of the epic 'Meghdoot?","Which of the following is observed as Sports Day every year?",
		"World Health Day is observed on","Pongal is a popular festival of which state?","Ghototkach in Mahabharat was the son of","Van Mahotsav was started by","The first month of the Indian national calendar is",
	"Which of the following is not a dance from Kerala?","Onam is the main festival of","Which one of the following is essentially a solo dance?","Which of the followiing is a folk dance of India?","Nandyal is situated in",
	"Which city of India was first of all affected by plague?","Which of the-following is wrongly matched?"};
		String[] option1={"Islam","Teacher's Day","Vishakadatta","22nd April","Apr 7","Karnataka","Duryodhana","Maharshi Karve","Mahga","Kathakali","Tamil Nadu","Kuchipudi","Kathakali","Karnataka","Jaipur","Qutab Minar- Delhi"};
		String[] option2={"Hinduism","National Integration Day","National Integration Day","Valmiki","26th july","Mar 6","Kerala","Arjuna","Bal Gangadhar Tiiak","Chaitra","Mohiniattam","Karnataka","Kathak","Mohiniattam","AndhraPradesh","Bombay","Taj Mahal -Agra"};
		String[] option3={"Buddhism","World Tourism Day","Banabhatta","29th August","March I5","Tamil Nadu","Yudhishthir","K.M, Munshi","Ashada","ottam thulal","Andhra Pradesh","Manipuri","Garba","Maharashtra","surat","Ajanta Caves-Maharashtra"};
		String[] option4={"Jainism","International Literacy Day","Kalidas","2nd October","Apr 28","Andhra Pradesh","Bhima","Sanjay Gandhi","Vaishakha","Yaksha Gana","Kerala","Manipuri","Mohiniattam","Madhya Pradesh","Kanpur","Charminar -Lucknow"};
		int[] answer={4,3,4,3,1,3,4,3,2,4,4,4,3,1,3,4};
		int price=1000;
		for (int x=0; x< questions.length; x++){
			System.out.println(questions[x]);
			System.out.println(option1[x]);
			System.out.println(option2[x]);
			System.out.println(option3[x]);
			System.out.println(option4[x]);
			System.out.println("");	
			Scanner sc = new Scanner(System.in);
			int a=sc.nextInt();
			if (a==answer[x]){
				System.out.println("You won"+ price);
				price=price*2;
			}
			else{
				break;
			}
		}
	}
}
