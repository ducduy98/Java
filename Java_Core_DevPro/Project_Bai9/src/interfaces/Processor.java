package interfaces;

public class Processor implements DataCallback {

	@Override
	public void onDataDone(String s) {
		System.out.println("Processor: Đã nhận Dữ liệu: ");
		System.out.println(s);
		System.out.println("Length: "+ s.length());
	}

}
