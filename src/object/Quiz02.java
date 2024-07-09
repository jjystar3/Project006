package object;

public class Quiz02 {

	public static void main(String[] args) {
		
		Student student = new Student("둘리", 50000);
		Taxi taxi = new Taxi("70합 1234");
		
		student.takeTaxi(taxi);
		
		student.showInfo();
		taxi.showInfo();
		
	}

}

class Taxi {
	String taxiNumber;
	int money;

	public Taxi(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}

	public void take(int money) {
		this.money += money;
	}

	public void showInfo() {
		System.out.println("택시번호 " + taxiNumber + "의 수입은 " + money + "입니다.");
	}

}
