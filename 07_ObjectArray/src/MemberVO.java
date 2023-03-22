
// 회원정보를 관리는 객체, ValueObject : 데이터를 담는 용도로 활용할 객체
public class MemberVO {
	private String id;
	private String name;
	private int age;

	public MemberVO() {
		super();
	}

	public MemberVO(String id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}