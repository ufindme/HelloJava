class User{
	private long userId;
	private String userName;
	private Product[] visitProducts;
    
    //有参构造方法，用于数据的初始化；
	public User(long userId, String userName){
		this.userId = userId;
		this.userName = userName;
	}

    //创建空参的构造方法
	public User(){}

	//getter，setter的设置
	public long getUserId(){
		return this.userId;
	}

	public void setUserId(long userId){
 		this.userId = userId;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return this.userName;
	}

	public String getInfo(){
		return "【用户信息】用户ID： " + this.userId + ", 用户名： " + this.userName;
	}

	public Product[] getVisitProducts(){
		return this.visitProducts;
	}

	public void setVisitProducts(Product[] visitProducts){
		this.visitProducts = visitProducts;
	}

}
class Product{
	private long productId;
	private String productName;
    private double price;
    private User[] visitUsers;

    //有参构造函数
    public Product(long productId, String productName, double price){
    	this.productId = productId;
    	this.productName = productName;
    	this.price = price;
    }
    public Product(){}

    //setter,getter的设置
    public long getProductId(){
    	return this.productId;
    }

    public void setProductId(long productId){
    	this.productId = productId;
    }

    public String getProductName(){
    	return this.productName;
    }

    public void setProductName(String productName){
    	this.productName = productName;

    }

    public double getPrice(){
    	return this.price;
    }

    public void setPrice(double price){
    	this.price = price;

    }

    public String getInfo(){
		return "【商品信息】商品ID： " + this.productId + ", 商品名称： " + this.productName + "， 销售价格：" + this.price;
	}

	public User[] getVisitUsers(){
		return this.visitUsers;
	}

	public void setVisitUsers(User[] visitUsers){
		this.visitUsers = visitUsers;
	}

}

public class JavaDemo5{
	public static void main(String[] args){
		//第一步：根据结构设置对象数据
		User userA = new User(1001L,"张三");
		User userB = new User(1002L,"李四");
		User userC = new User(1003L,"王五");
		Product proA = new Product(9999L,"花生",25.5);
		Product proB = new Product(9998L,"瓜子",28.2);
		Product proC = new Product(9997L,"可乐",22.9);

		userA.setVisitProducts(new Product[]{proA,proB,proC});
		userB.setVisitProducts(new Product[]{proA,proC});
		userC.setVisitProducts(new Product[]{proC,proB});
		proA.setVisitUsers(new User[]{userA,userB});
		proB.setVisitUsers(new User[]{userA,userC});
		proC.setVisitUsers(new User[]{userA,userB,userC});

		//第二步：根据要求获取数据
		System.out.println("---------根据用户查看浏览商品信息-----------");
		System.out.println(proA.getInfo());
		for(int x = 0; x< proA.getVisitUsers().length; x++){
			System.out.println("\t|-" + proA.getVisitUsers()[x].getInfo());
		}
		System.out.println("---------根据商品到照浏览的用户信息-----------");
		System.out.println(userA.getInfo());
		for(int x = 0; x< userA.getVisitProducts().length; x++){
			System.out.println("\t|-" + userA.getVisitProducts()[x].getInfo());
		}
	}
}