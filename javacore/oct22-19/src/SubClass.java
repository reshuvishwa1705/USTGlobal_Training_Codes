
public class SubClass extends SuperClas{
	String s="subclass variable";
public SubClass() {
	super();
	System.out.println("SubClass Constructor");
}
void getSData() {
	System.out.println(s);
	System.out.println(this.s);
	System.out.println(super.s);
	super.superClassMethod();

}
}
