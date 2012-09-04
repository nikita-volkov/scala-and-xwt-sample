package swtTestApp;

public class Person  {

    private String name = "AssHole";
    

	public String getName() {
		System.out.println("getting name");
		return name;
	}

	public void setName(String name) {
		System.out.println("setting name: " + name);
		this.name = name;
	}

}