package interfaces;

public class Receiver {
	private DataCallback callback;
	public void setCallback(DataCallback cal) {
		this.callback=cal;
	}
	//giả lập việc nhận dl
	public void dataArrive(String s) {
		System.out.println("Receiver ===> có data: "+s);
		callback.onDataDone(s);//quá trình truyền về
		
	}
}
