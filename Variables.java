
public class Variables {
	
	//Variable naming standard
	private String _name; // Do not start variables with an underscore ('_')
	private int $age;	//or a dollar sign
	
	//Single character variables	
	//Should only be used for temporary variables name	
	public void myMethod() {
	for(int i = 0 ; i < 5 ; i ++) {
		System.out.println(i);
		// i is only used within the scope of the loop and is not called 
		// by any other function within the class		
	}
	}
	
	
	
	//Constant variable name should always be in UPPERCASE
	private static final String ROOT_URL = "https://123.321.23.2/mysql/users.php";
	
	//Methods
	//A verb is typically used here. 
	public String getName() { 
		return name;
	}
	
	//Each named variable starts with a lower case followed by an uppercase letter on each new word
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	                 
	
	
	
}

