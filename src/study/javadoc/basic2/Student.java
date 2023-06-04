package study.javadoc.basic2;

/**
 * {@code Student} 클래스에 대한 설명입니다.
 *
 */
public class Student extends Person {

	/**
	 * 학교 이름 설명
	 */
	private String schoolName;

	/**
	 * Student 생성자에 대한 설명입니다.
	 */
	public Student(int age, String name, String schoolName) {
		super(age, name);
		this.schoolName = schoolName;
	}
}
