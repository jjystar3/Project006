package scope;

// 접근제어자에 따라 변수의 사용 범위를 작성하세요
class A {
	
	public int field1; //어디서든 사용 가능하다
	int field2; //같은 패키지 안에서 사용 가능하다
	private int filed3; //클래스 내부에서만 사용 가능하다.
	
	
}