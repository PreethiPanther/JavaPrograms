
public class ImmutableBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ImmutableClass im = new ImmutableClass.ImmutableClassBuilder("preethi").setage(1).build();
       System.out.println("objects::"+im);
       ImmutableClass im2 = new ImmutableClass.ImmutableClassBuilder("preethi").setCompany("Wipro").setexperience(8).build();
       System.out.println("objects::"+im2);
	}

}
