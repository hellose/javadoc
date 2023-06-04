package study.javadoc.basic2;

/**
 * {@code Person} 클래스에 대한 설명입니다.
 * 
 */
public class Person {

	/**
	 * 나이 필드 설명
	 */
	private int age;

	/**
	 * 이름 필드 설명
	 */
	public String name;

	/**
	 * Person 생성자에 대한 설명
	 * 
	 * @param age  나이 파라메터 설명
	 * @param name 이름 파라메터 설명
	 */
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

}
