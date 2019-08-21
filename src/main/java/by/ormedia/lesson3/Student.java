package by.ormedia.lesson3;

public class Student {
private static int COUNT;
	
	static{
		//System.out.println("point 1");
	}
	
	{
		//System.out.println("point 2");
	}
	
	private String name;
	private int age;
	private final int index = COUNT;
	
	public Student(){
		this.name = "Student#"+(COUNT++);
	}
	
	public Student(String name, int age){
		if(name!=null){
			this.name = name;
			this.age = age;
		}else{
			this.name = "Student#"+(COUNT++);
			this.age = age;
		}
	}
	
	public Student(int age){
		this();
		this.age = age;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null)return false;
		if(!obj.getClass().equals(this.getClass()))
			return false;
		Student st = (Student)obj;
		if(this.age!=st.age)return false;
		if(this.name!=null&&st.name==null)return false;
		return this.name.equals(st.name);
	}
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public void showStaticCount(){
		showCount();
	}
	
	public void growUp(){
		this.age++;
	}
	
	public static void showCount(){
		System.out.println(COUNT);
	}
	
	public static void test(Student st){
		st.growUp();
	}

	public void study() {
		System.out.println("helo! I am Student..... bla bla bla");
		
	}
}
