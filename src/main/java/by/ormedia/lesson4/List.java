package by.ormedia.lesson4;

public class List <T extends Book>{
	
	private java.lang.Object[] array = new java.lang.Object[0];
	
	public void add(T t){
		
		java.lang.Object[] newArray = new java.lang.Object[this.array.length+1];
		for(int i = 0;i<this.array.length;i++){
			newArray[i]=this.array[i];
		}
		newArray[this.array.length]=t;
		this.array = newArray;
	}
	
	public T get(int index){
		return (T)this.array[index];
	}
	
	public int size(){
		return this.array.length;
	}

}
