package jp.co.techmatrix.ml;

public class TestBean {
	String id = null;
	String pw = null;
	
	
	public String getId( int index ) {
		
		if ( index < 0 ) {
			return null;
		}
		
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
	
}
