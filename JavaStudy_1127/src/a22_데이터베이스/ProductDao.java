package a22_데이터베이스;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import a22_데이터베이스.Dto.Product;
import a22_데이터베이스.Dto.User;
import db.DBConnectionMgr;

public class ProductDao {
	private DBConnectionMgr pool;
	
	public ProductDao(DBConnectionMgr pool) {
		this.pool = pool;
	}
	
	public String insertProductSqlValues(List<Product> products) {
		StringBuilder sqlValues = new StringBuilder();
		
		for(Product product : products) {
			sqlValues.append("(0, '"); //큰 따옴표 부터 product.getProduct_name() 까지 문자열이라서 작은 따옴표 표시해야함
			//setstring은 작은따옴표 자동으로 들어가짐 
			sqlValues.append(product.getProduct_name());
			sqlValues.append("', '");
			sqlValues.append(product.getCategory_code());
			sqlValues.append("', now(), now()), ");
		}
		sqlValues.delete(sqlValues.length()-2, sqlValues.length()); // 마지막 쉼표랑 띄어쓰기 삭제함
	/*	sqlValues.append("test");
		sqlValues.append(", ");
		sqlValues.append("테스트"); */
		return sqlValues.toString();
		
	}
	
	
	public int insertProducts(List<Product> products) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = pool.getConnection();
			sql = "insert into product_mst values" + insertProductSqlValues(products);
			pstmt = con.prepareStatement(sql);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt);
		}
		return 0;
	}
	
	
	public int insertProduct(Product product) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = pool.getConnection();
			sql = "insert into product_mst values(0, ?, ?, now(), now())";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, product.getProduct_name());
			pstmt.setInt(2, product.getCategory_code());
			return pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			pool.freeConnection(con, pstmt);
		}
		return 0;
	}
	
	public Product getProduct(int product_code) {
		Product product = null;
		String sql = null;
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = pool.getConnection();
			sql = "select * from product_mst where product_code = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, product_code);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				product = Product.builder()
						.product_code(rs.getInt(1)) //숫자는 컬럼 순서 (code는 첫번째)
						.product_name(rs.getString(2))
						.category_code(rs.getInt(3))
						.build();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			pool.freeConnection(con, pstmt, rs);
		}
		
		
		return product;
	}
	
	public int deleteProduct(int product_code) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = pool.getConnection();
			sql = "delete from product_mst where product_code = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, product_code);
			
			return pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			pool.freeConnection(con, pstmt);
		}
		return 0;
	}
	
	public int updateProductName(int product_code, String product_name) {
		String sql = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = pool.getConnection();
			sql = "update product_mst set product_name = ? where product_code = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, product_name);
			pstmt.setInt(2, product_code);
			
			return pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			pool.freeConnection(con, pstmt);
		}
		return 0; //오류 나면 return pstmt.executeUpdate(); 리턴 안되기 때문에 확인차필요
	}
	
	
}