package jp.co.techmatrix.sample;

public class Toupper {
	public String value = null;
	
	public Toupper( int index ){
		if ( index == 0 ){
			value = "value is zero";
		}
	}
	public String toUpper() {
		return value.toUpperCase();
	}

	public void setValue(String value) {
		this.value = value;
	}
	public Toupper(){
	}

}
