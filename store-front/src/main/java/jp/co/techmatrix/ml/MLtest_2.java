package jp.co.techmatrix.ml;

public class MLtest_2 {
	public void method1() {
		DataService dataService = new DataService();
		
		TestBean testBean = dataService.getItemDB( "001" );
		
		String pw = testBean.getPw();
		
		if ( pw.length() > 0 ) {
			String str = testBean.getId( -1 );
			System.out.println( str.length() );
		}
	}
}
