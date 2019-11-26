package casting;

public class Marker extends Pen{
double size;
void color() {
	System.out.println("Marker color() Method");
}
@Override
	void write() {
System.out.println("Marker write() Method");	
}
}
