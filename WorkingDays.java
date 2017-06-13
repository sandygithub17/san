package guvi;

public class WorkingDays {

	public static void main(String[] args) {
		String[] weekDays = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","sunday"};

		for(int i = 0; i < weekDays.length-2; i++) {
		System.out.println("Working("+weekDays[i]+")->true");
		}
		for(int j = weekDays.length-1; j > 4; j-- ) {
			System.out.println("Working("+weekDays[j]+")->false");
		}
		
	}

}
