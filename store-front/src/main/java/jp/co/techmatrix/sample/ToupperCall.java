package jp.co.techmatrix.sample;

public class ToupperCall {
	public static void main(String[] args) {
		Toupper name = new Toupper( 10 );
		System.out.println( name.toUpper() );
	}
	
	public void testMethod( int index ){
		String str = null;
		
		if ( index == 0 ){
			str = "index is zero";
		}
		System.out.println( str.toUpperCase() );
	}
}
