mport com.demo.User;

public class UserMain {

	public static void main(String[] args) {

		User user1=new User();
		User user2=new User(123,"Tarun","Delhi","9087675645","tarun@gmail.com");
		 User user3=new User(user2); 
		//User user3=user2;
		
		System.out.println(user1);
		
		System.out.println(user2);
		
		System.out.println(user3);
		
	}

}

/*int hour=days*24;
int minutes=seconds*60;
int seconds=minutes*60;
System.out.println(seconds);*/





