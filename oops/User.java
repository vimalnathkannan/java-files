
public class User {
	
	private int userId;
	private String userName;
	private String userAddress;
	private String phone; 
	private String email;
	
	//default constructor
	public User() 
	{

		System.out.println("Default constructor invoked..");
	}


	public User(int userId, String userName, String userAddress, String phone, String email) {
		//parameterized constructor
		
		System.out.println("parameterized constructor invoked..");
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.phone = phone;
		this.email = email;
	}
	
	public User(User user) //copy constructor
	{
		System.out.println("copy constructor invoked..");

		this.userId = user.userId;
		this.userName =user.userName;
		this.userAddress = user.userAddress;
		this.phone = user.phone;
		this.email = user.email;
		
	}


	@Override
	public String toString() {
		return "userId="+userId+"\n"+ " userName=" + userName + " \n"+" userAddress=" + userAddress + "\n phone=" + phone
				+ "\n email=" + email+ "\n" ;
	}
	
	
	
}
