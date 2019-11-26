
public class Demo implements AutoMobile,AutoMobileWithAbs{
@Override
public int gear() {
	System.out.println(" Demo gear() ");
	return 0;
}
@Override
	public void gps() {
		System.out.println("Demo gps");
	}@Override
		public void abs() {
			System.out.println("Demo abs");
		}
	@Override
		public void sum() {
			System.out.println("Demo sum");
//			AutoMobile.super.sum();
		}
	public static void main(String[] args){
		Demo d=new Demo();
		d.gear();
		d.sum();
		d.gps();
		d.abs();
	}

}
