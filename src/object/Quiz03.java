package object;

public class Quiz03 {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("둘리", 10000);
		Customer customer2 = new Customer("또치", 20000);
		Cafe cafe = new Cafe("스타벅스");
		
		customer1.orderAmericano(cafe);
		customer2.orderLatte(cafe);
		
		customer1.showInfo();
		customer2.showInfo();
		cafe.showInfo();
	}

}

class Cafe {
	String cafeName;
	int money;

	public Cafe(String cafeName) {
		this.cafeName = cafeName;
	}

	public void order(int money) {
		this.money += money;
	}

	public void showInfo() {
		System.out.println("카페 " + cafeName + "의 수입은 " + money + "입니다.");
	}
}

class Customer {
	String customerName;
	int money;

	public Customer(String customerName, int money) {
		super();
		this.customerName = customerName;
		this.money = money;
	}

	public void orderAmericano(Cafe cafe) {

		if (money < 4000) {
			System.out.println("소지금이 적어 아메리카노를 주문할 수 없습니다..");
			return;
		}
		cafe.order(4000);
		this.money -= 4000;
	}
	
	public void orderLatte(Cafe cafe) {

		if (money < 4500) {
			System.out.println("소지금이 적어 라떼를 주문할 수 없습니다..");
			return;
		}
		cafe.order(4500);
		this.money -= 4500;
	}

	public void showInfo() {
		System.out.println(customerName + "님의 남은 돈은 " + money + "입니다.");
	}
}