package by.ormedia.lesson5;

public class BuilderExample {
	
	private int x1;
	private int x2;
	private double d1;
	private boolean b1;
	private String name;
	private Object object;
	public int getX1() {
		return x1;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public int getX2() {
		return x2;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public double getD1() {
		return d1;
	}
	public void setD1(double d1) {
		this.d1 = d1;
	}
	public boolean isB1() {
		return b1;
	}
	public void setB1(boolean b1) {
		this.b1 = b1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {
		this.object = object;
	}
	

	
	public static class Builder{
		
		private BuilderExample be = new BuilderExample();
		
		private Builder(){
			
		}
		
		public static Builder getBuilder(){
			return new Builder();
		}
		
		public Builder setX1(int x1){
			be.setX1(x1);
			return this;
		}
		
		public Builder setX2(int x2){
			be.x2 = x2;
			return this;
		}
		
		public BuilderExample build(){
			return be;
		}
	}

}
