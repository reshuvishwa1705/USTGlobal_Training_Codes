
public class TestGen {

	public static void main(String[] args) {
		System.out.println("****First Generation****");
		FirstGen fg=new FirstGen();
		fg.call();
		fg.msg();
		System.out.println("****Second Generation****");
		SecondGen sg=new SecondGen();
		sg.call();
		sg.msg();
		sg.games();
		System.out.println("****Third Generation****");
		ThirdGen tg=new ThirdGen();
		tg.call();
		tg.msg();
		tg.games();
		tg.camera();
	}

}
