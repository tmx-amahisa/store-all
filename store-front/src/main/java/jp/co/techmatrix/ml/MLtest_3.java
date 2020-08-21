package jp.co.techmatrix.ml;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

public class MLtest_3 {
	TestBean testBean;
	public void method1(int index) {
		
		for ( int i = 0; i < 10; i++ ) {
			String id = testBean.getId(i - 1);
			
			if ( !String.valueOf( index ).equals( id ) ){
				System.out.println( id.length() );
				return;
			}
		}
	}

}
