import java.util.Scanner;


public class Main {
	public static void main(String args[]) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter 1 to register 2 to login 3 to craete product 4 to create order 5 to exit");
		int choice = c.nextInt();
		RegisterLogin user = new RegisterLogin();
		Product prod = new Product();
		Order ord = new Order();
		
		boolean f = true;
		while(f = true) {
			switch(choice) {
			case 1:
				System.out.println("enter username and password");
				String userName = c.nextLine();
				String password = c.nextLine();
				user.register(userName, password);
				break;
			case 2:
				System.out.println("enter username and password");
				String LuserName = c.nextLine();
				String Lpassword = c.nextLine();
				RegisterLogin usernew = new RegisterLogin();
				usernew.login(LuserName,Lpassword);
				break;
			case 3:
				System.out.println("enter product name and product ID");
				String pName = c.nextLine();
				String id = c.nextLine();
				prod.createProduct(id, pName);
				break;
			case 4:
				System.out.println("enter username and product ID");
				String oname = c.nextLine();
				String pid = c.nextLine();
				ord.addOrder(oname, pid);
				
			case 5:
				f = false;
				break;
				
				
			}
		}
	}
}
