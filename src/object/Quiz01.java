package object;

public class Quiz01 {

	public static void main(String[] args) {
		
		Student student1 = new Student("둘리", 5000);
		Bus bus = new Bus(100);
		
		student1.takeBus(bus);
		
		student1.showInfo();
		bus.showInfo();
		
		Student student2 = new Student("도우너", 10000);
		Subway subway = new Subway("2호선");	
		
		student2.takeSubway(subway);
		
		student2.showInfo();		
		subway.showInfo();
	}

}
