
public class ImmutableClass {
	private String FirstName;
	 private String LastName;
	 private int age;
	 private int experience;
	 private String Company;
 public ImmutableClass(ImmutableClassBuilder builder) {
	
		this.FirstName = builder.FirstName;
		this.LastName = builder.LastName;
		this.age = builder.age;
		this.experience = builder.experience;
		this.Company = builder.Company;
	}

public String getFirstName() {
	return FirstName;
}
public String getLastName() {
	return LastName;
}
public int getAge() {
	return age;
}
public int getExperience() {
	return experience;
}
public String getCompany() {
	return Company;
}
@Override
public String toString() {
	return "ImmutableClass [FirstName=" + FirstName + ", LastName=" + LastName + ", age=" + age + ", experience="
			+ experience + ", Company=" + Company + "]";
}
public static class ImmutableClassBuilder{
	private String FirstName;
	 private String LastName;
	 private int age;
	 private int experience;
	 private String Company;
	 public ImmutableClassBuilder(String FirtName){
		 this.FirstName = FirtName;
	 }
	 public ImmutableClassBuilder setLastName(String lastName){
		 this.LastName = lastName;
		 return this;
	 }
	 
	 public ImmutableClassBuilder setage(int age){
		 this.age = age;
		 return this;
	 }
	 public ImmutableClassBuilder setexperience(int exp ){
		 this.experience = exp;
		 return this;
	 }
	 public ImmutableClassBuilder setCompany(String comp ){
		 this.Company = comp;
		 return this;
	 }
	 public ImmutableClass build(){
		 return new ImmutableClass(this);
	 }
}

}