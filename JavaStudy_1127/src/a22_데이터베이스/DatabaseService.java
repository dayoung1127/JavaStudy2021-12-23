package a22_데이터베이스;

import java.util.ArrayList;
import java.util.List;

import a22_데이터베이스.Dto.Product;
import a22_데이터베이스.Dto.User;
import db.DBConnectionMgr;

public class DatabaseService {

	public static void main(String[] args) {
		DBConnectionMgr pool = DBConnectionMgr.getInstance();
		UserDao userDao = new UserDao(pool);
		ProductDao productDao = new ProductDao(pool);
	//	UserDao insertData = new UserDao(DBConnectionMgr.getInstance()); //getInstance는 싱글톤
		
		User user1 = User.builder()
						.username("hello")
						.password("1234")
						.name("다영")
						.email("wou3768@gmail.com")
						.phone("010-7207-3926")
						.addr("연제구")
						.build();
		
		//insertData.InsertUser(user1);
		System.out.println(userDao.getUser("abc"));
/////////////////////////////////////////////////////////////////////////
		
		Product product = Product.builder()
							.product_name("아이스 아메리카노")
							.category_code(3)
							.build();
		
		List<Product> products = new ArrayList<Product>();
		products.add(product);
		products.add(product);
		products.add(product);
		products.add(product);
		products.add(product);
		
	/*	int insertCount = productDao.insertProducts(products);
		System.out.println(insertCount); //5개 insert함
		
		int deleteCount = productDao.deleteProduct(23); 
		System.out.println(deleteCount); //23번 삭제 */
		
		int updateCount = productDao.updateProductName(22, "카페라떼");
		System.out.println(updateCount);
	//	String test = productDao.insertProductSqlValues(products);
	//	System.out.println(productDao.insertProductSqlValues(products));
		
		//productDao.insertProduct(product);
		//System.out.println(productDao.getProduct(10));
	}

}
