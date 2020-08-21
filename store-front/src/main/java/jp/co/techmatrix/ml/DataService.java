package jp.co.techmatrix.ml;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataService {
	/**
	 * データベースコネクション
	 */
	private Connection con;
	/**
	 * 商品 ID で商品情報を取得します。 (DB接続)
	 * 
	 * @param itemId
	 *            商品 ID
	 * @return 1 つの商品情報
	 */
	public TestBean getItemDB(String itemId) {
		TestBean item = null;
		try {
			PreparedStatement stmt = con.prepareStatement( "select * from id where id = ?" );
			stmt.setString( 1, itemId);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				item = new TestBean();
				rs.getString( "aa" ).length();
				item.setId( rs.getString( "ID" ) );
				item.setPw( "PW" );
			}
		} catch (SQLException e) {
			System.out.println("SQLException:" + e.getMessage());
		}

		return item;
	}
}
