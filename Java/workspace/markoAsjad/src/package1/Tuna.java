package package1;

public class Tuna {
	private String girlName;
	
	public Tuna(String name){
		girlName = name;
	}
	
	public void simpleMessage(){
		System.out.println("This is another class");
	}
	
	public void anotherMessage(String name){
		System.out.println("Hello " + name);
	}
	
	public void setName(String name){
		girlName = name;
	}
	
	public String getName(){
		return girlName;
	}
	
	public void saying(){
		System.out.printf("%s was your first gf, %s",getName(), "ain't that cool.");
	}
}
