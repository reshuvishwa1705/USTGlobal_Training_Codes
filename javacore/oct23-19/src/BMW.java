
public class BMW implements AutoMobile,AutoMobileWithAbs{
@Override
public int gear() {
	System.out.println("BMW gear() Method");
	return 0;
}
@Override
	public void gps() {
		System.out.println("BMW GPS Method");
	}
@Override
	public void abs() {
	System.out.println("BMW abs Method");	
	}
@Override
	public void sum() {
	System.out.println("BMW sum()");	
	AutoMobile.super.sum();
	}
}
