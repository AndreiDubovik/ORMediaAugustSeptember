package by.ormedia.lesson5;

public class C implements Comparable<C>{

	private int c;
	
	public C(int c){
		this.c = c;
	}
	
	
	
	@Override
	public String toString() {
		return "C [c=" + c + "]";
	}



	public int getC() {
		return c;
	}



	public void setC(int c) {
		this.c = c;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + c;
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		C other = (C) obj;
		if (c != other.c)
			return false;
		return true;
	}



	@Override
	public int compareTo(C o) {
		// TODO Auto-generated method stub
		return this.c-o.c;
	}

}
