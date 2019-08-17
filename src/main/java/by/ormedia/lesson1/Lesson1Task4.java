package by.ormedia.lesson1;


public class Lesson1Task4 {

	
	
	public static void main(String[] args) {
		char[]chars = randomCharArray(10,20);
		System.out.println(chars);
		changeCharRegister(chars);
		System.out.println(chars);
	}
	
	public static void changeCharRegister(char[] chars){
		for(int i=0;i<chars.length;i++){
			if(chars[i]>='A'&&chars[i]<='Z'){
				chars[i]+=32;
			}else if(chars[i]>='a'&&chars[i]<='z')chars[i]-=32;
		}
	}
	
	public static char[] randomCharArray(int min, int max){
		char[]chars = new char[Lesson1Task3.random(min,max)];
		for(int i=0;i<chars.length;i++){
			if(Math.random()>0.5){
				chars[i] = (char)Lesson1Task3.random((int)'A',(int)'Z');
			}else chars[i] = (char)Lesson1Task3.random((int)'a',(int)'z');
		}
		return chars;
	}

}
