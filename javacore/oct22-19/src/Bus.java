
public class Bus {
int seat;
String clr;
public Bus(int seat,String clr) {
	this.seat=seat;
	this.clr=clr;
}
public Bus() {
this(40);
}
public Bus(int seat) {
	this(seat,"red");
	}
void display() {
	System.out.println("Bus Seat No."+seat);
	System.out.println("Bus Color "+clr);
}
}
