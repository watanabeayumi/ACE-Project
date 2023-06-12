package dao;

	/**
	 * DAOクラスのための共通例外クラスです。DAOクラスにおける例外を集約します。
	 * @author 事務局
	 * @version 1.0
	 */
public class DaoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public DaoException(Exception e) {
		System.out.println("------データベースエラーが発生しました。------");
		e.printStackTrace();
	}
}
