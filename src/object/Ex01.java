package object;

public class Ex01 {

	public static void main(String[] args) {
		
		Student student = new Student("둘리", 10000);
		Bus bus = new Bus(100);
		
		student.takeBus(bus);
		
		student.showInfo();
		bus.showInfo();
		
	}

}

class Bus {
	int busNumber;
	int passengerCount;
	int money;

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}

}

class Subway {
	String lineNumber;
	int passengerCount;
	int money;

	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "입니다.");
	}
}

class Student {
	String studentName;
	int money;

	public Student(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}

	public void takeTaxi(Taxi taxi) {
		
		if(money<10000) {
			System.out.println("소지금이 적어 택시를 탈 수 없습니다..");
			return;
		}
		
		taxi.take(10000);
		this.money -= 10000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "입니다.");
	}
}