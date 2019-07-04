package jp.co.techmatrix.servlet;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import jp.co.techmatrix.datastore.DataStore;

public class Personal {
	private static final String MEMBER_MODE = "M";
	private static final String NO_MEMBER_MODE = "N";
	//private String customerId = "";
	private List<String> customerList = new ArrayList<String>();
	private String discountMember = "30";
	private String noDiscount = "0";
	HashMap<String, Integer> hashMap = new HashMap();
	
	public void addList( String id ){
		customerList.add( id );
	}
	
	private String getMode( String str ){
		Integer attValue = hashMap.get( str );
		
		switch( attValue.intValue() ){
		case 0:
			return MEMBER_MODE;
		case 1:
			return NO_MEMBER_MODE;
		}
		return null;
	}
	public void generateCustomer(){
		BufferedWriter buffWriter = getWriter( "AA" );
		if ( buffWriter == null || customerList.isEmpty() ) return;
		try {
			DataStore dataStore = new DataStore();
			StringBuilder output = new StringBuilder();
			for ( int i = 0; i < customerList.size(); i++ ){
				String id = customerList.get( i );
				output.append( id );
				String customerMode = getMode( id );
				if ( customerMode.equals( MEMBER_MODE ) ){
					output.append( "," ).append( discountMember );
				} else {
					output.append( "," ).append( noDiscount );
				}
				dataStore.storeData( id );
			}
			
			buffWriter.write( output.toString() );

		} catch ( IOException e ){
			// 不要
		} finally {
			try {
				buffWriter.close();
			} catch (IOException e) {
				//不要
			}
		}
	}
	private BufferedWriter getWriter( String outPath ){
		BufferedWriter buffWriter = null;
		try {
			FileWriter fileWriter = new FileWriter( outPath );
			buffWriter = new BufferedWriter( fileWriter );
		} catch (IOException e) {
			System.out.println( e.getMessage() );
		}
		return buffWriter;
	}
}
