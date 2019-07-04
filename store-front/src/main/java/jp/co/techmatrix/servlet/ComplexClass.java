package jp.co.techmatrix.servlet;

public class ComplexClass {
	
	public String getAutnMode( String userID ) {
		String authMode = null;
		
		if ( !"".equals( userID ) ) {
			switch( userID.length() ) {
			case 5:
				for ( int i = 0; i < userID.length(); i++ ) {
					if ( userID.charAt( i ) < 64 ) {
						authMode += "A";
					} else if ( userID.charAt( i ) < 100 ){
						authMode += "B";
					} else if ( userID.charAt(  i ) < 150 ) {
						authMode += "C";
					} else if ( userID.charAt(  i ) < 200 ) {
						authMode += "D";
					} else if ( userID.charAt(  i ) < 250 ) {
						authMode += "D";
					}
				}
				break;
			case 10:
				for ( int i = 0; i < userID.length(); i++ ) {
					if ( userID.charAt( i ) < 64 ) {
						authMode += "E";
					} else if ( userID.charAt( i ) < 100 ){
						authMode += "F";
					} else if ( userID.charAt(  i ) < 150 ) {
						authMode += "G";
					} else if ( userID.charAt(  i ) < 200 ) {
						authMode += "H";
					} else if ( userID.charAt(  i ) < 250 ) {
						authMode += "I";
					}
				}
				break;
			case 20:
				for ( int i = 0; i < userID.length(); i++ ) {
					if ( userID.charAt( i ) < 64 ) {
						authMode += "J";
					} else if ( userID.charAt( i ) < 100 ){
						authMode += "K";
					} else if ( userID.charAt(  i ) < 150 ) {
						authMode += "L";
					} else if ( userID.charAt(  i ) < 200 ) {
						authMode += "M";
					} else if ( userID.charAt(  i ) < 250 ) {
						authMode += "N";
					}
				}
				break;
			default:
				authMode = "NG";
			}
			byte[] byteStr = authMode.getBytes();
			int total = 0;
			for ( int i = 0; i < authMode.length(); i++ ) {
				total += byteStr[i];
				if ( total < 10 ) {
					authMode += "10";
				} else if ( total < 20 ) {
					authMode += "20";
				} else if ( total < 30 ) {
					authMode += "30";
				} else if ( total < 40 ) {
					authMode += "40";
				} else if ( total < 50 ) {
					authMode += "50";
				}
				
			}
		}
		
		
		
		
		return authMode;
	}
}
