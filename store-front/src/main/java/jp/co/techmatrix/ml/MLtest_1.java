package jp.co.techmatrix.ml;

public class MLtest_1 {
	TestBean testBean;
	
	public void method1(int index) {
		String id = testBean.getId( index );
		
		if ( id.equals( "" ) ) {
			return;
		}
	}
}
