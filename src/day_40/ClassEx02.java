package day_40;

class Student
{
	String name;
	int score;
}

public class ClassEx02 {
	public static void main(String[] args) {
		
		//같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다
		Ex01 e = new Ex01();
		e.x = 10;
		e.y = 20;
		
		Student hgd = new Student();
		hgd.name = "홍길동";
		hgd.score = 100;
	}
}
