package dao;

import dto.Reserve;

public class ReserveDAO extends CommonDAO{

	private static final String SELECT_BY_RESEARVE = "SELECT * FROM t_reserve WHERE reserve_date = ? AND time_cd = ?";
	
	public Reserve selectReserve() throws DaoException {
		
		Reserve reserve = null;
		
		
		return reserve;
	}
}
