package person;

public class Student extends Person{
	
	public void set(){
		age = 30;
		name = "홍길동";
		height = 175;
	   // weight = 65; //private으로 설정-> 접근 안됨
		//디폴트는 같은 패키지 안에서는 다 접근 가능
		
		
	}
	
	public Student(){
		System.out.println("call Student()");
	}
	
	public static void main(String[] args) {
		Student s = new Student();
		
	}

}
