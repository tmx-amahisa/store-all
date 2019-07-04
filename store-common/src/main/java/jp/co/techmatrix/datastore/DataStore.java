package jp.co.techmatrix.datastore;

import java.sql.Connection;

public class DataStore {
	private Connection con;
	
	public boolean startTransaction(){
		return true;
	}
	/**
	 * 
	 * @param str
	 * @return
	 */
	public boolean storeData( String str ){
		return true;
	}
	public boolean rollBackTransaction(){
		return true;
	}
	public boolean endTransaction(){
		return true;
	}
	
}
