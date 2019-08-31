package by.ormedia.lesson6;

public class Starter4 {

	public static void main(String[] args) {
		
		Currency c = Currency.RUR;
		switch(c){
		case EUR:System.out.println("ЕВРО");
		break;
		default:System.out.println("Нам нужны только ЕВРО!!!");
		}

	}
	
	public static void showCurrency(Currency c){
		System.out.println(c.getName());
	}

}
