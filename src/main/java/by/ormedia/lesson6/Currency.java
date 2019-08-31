package by.ormedia.lesson6;

public enum Currency {
	
	USD("Доллар США"),EUR("Евро"),RUR("Российский рубль");
	
	private Currency(String name){
		this.name = name;
	}
	
	private int bynValue;
	private String name;
	public int getBynValue() {
		return bynValue;
	}
	public void setBynValue(int bynValue) {
		this.bynValue = bynValue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
