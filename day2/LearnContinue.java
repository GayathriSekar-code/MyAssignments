package week1.day2;

public class LearnContinue {

	public static void main(String[] args) {
		//continue--->skip the particular iteration
		for (int i=1; i<=5; i++){
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
	}
}
