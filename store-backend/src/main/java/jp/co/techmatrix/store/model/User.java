package jp.co.techmatrix.store.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * ログインユーザー用
 * @author kosugi
 *
 */
@Entity(name = "USER")
public class User implements Serializable{

	/**
	 * SerialUID
	 */
	private static final long serialVersionUID = -3730922599619317012L;

	@Id
	private String id;
	
	private String first;
	
	private String last;
	
	private String password;
	
	@OneToMany
	private List<OrderLine> orders;
	
	private class userInnerClass{
		private class userNestClass{
			public void methodNest( String str ) {
				str = "";
			}
		}
		public void methodInner( String str ) {
			userNestClass nest = new userNestClass();
			nest.methodNest( str );
		}
	}
	private interface innerIF_1{
		void methodInterface_1();
	}
	private interface innerIF_2{
		void methodInterface_2();
	}
	/**
	 * 引数なしのコンストラクタ
	 */
	public User(){
		super();
		userInnerClass innerClass  = new userInnerClass();
		innerClass.methodInner( "str" );
		innerIF_1 innerIF = new innerIF_1() {
			@Override
			public void methodInterface_1() {
				userInnerClass innerClass  = new userInnerClass();
				innerClass.methodInner( "str" );
			}
			
		};
		innerIF.methodInterface_1();
		new innerIF_2() {
			class anonInner{
				public void method_anon( String str ) {
					str = "";
				}
			}
			@Override
			public void methodInterface_2() {
				anonInner anon = new anonInner();
				anon.method_anon( "aa" );
			}
			
		}.methodInterface_2();
	}
	
	/**
	 * 引数ありのコンストラクタ
	 * @param id
	 * @param first
	 * @param last
	 * @param password
	 */
	public User(String id, String first, String last, String password){
		this.id = id;
		this.first = first;
		this.last = last;
		this.password = password;
	}

	/**
	 * IDを取得します。
	 * @return
	 */
	public String getId(){
		return this.id;
	}

	/**
	 * IDを設定します。
	 * @param id
	 */
	public void setId(String id){
		this.id = id;
	}

	/**
	 * 名を取得します。
	 * @return
	 */
	public String getFirst(){
		return this.first;
	}

	/**
	 * 名を設定します。
	 * @param first
	 */
	public void setFirst(String first){
		this.first = first;
	}

	/**
	 * 姓を取得します。
	 * @return
	 */
	public String getLast(){
		return this.last;
	}
	
	/**
	 * 姓を設定します。
	 * @param last
	 */
	public void setLast(String last){
		this.last = last;
	}
	
	/**
	 * レジスターを取得します。
	 * @return
	 */
	public List<OrderLine> getRegisters(){
		return orders;
	}

	/**
	 * レジスターを取得します。
	 * @param orders
	 */
	public void setOrderLine(List<OrderLine> orders){
		this.orders = orders;
	}

	/**
	 * パスワードの取得
	 * @return
	 */
	public String getPassword(){
		return this.password;
	}

	/**
	 * パスワードの設定
	 * @param password
	 */
	public void setPassword(String password){
		this.password = password;
	}

	/**
	 * オーダーの取得
	 * @return
	 */
	public List<OrderLine> getOrders(){
		return this.orders;
	}

	/**
	 * オーダーの設定
	 * @param orders
	 */
	public void setOrders(List<OrderLine> orders){
		this.orders = orders;
	}
}
