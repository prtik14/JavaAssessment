import java.awt.List;
import java.util.ArrayList;

public class Product {
	public static List prodId = new List();
	public static List prodName = new List();
	
	public static void createProduct(String id,String name) {
		prodId.add(id);
		prodName.add(name);
	}
	
}
