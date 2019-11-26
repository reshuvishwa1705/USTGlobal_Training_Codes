package overriding;

public class TestAndroid {

	public static void main(String[] args) {
		AndroidOS aos=new AndroidOS();
		aos.homeGroup();
		Sony s=new Sony();
		s.homeGroup();
		Mi m=new Mi();
		m.homeGroup();
		OnePlus op=new OnePlus();
		op.homeGroup();
	}

}
