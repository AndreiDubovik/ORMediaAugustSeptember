package by.ormedia.lesson7;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append('h');
		sb.append("__________");
		sb.append(false);
		sb.append(1);
		String line = sb.toString();
		System.out.println(line);

	}

}
