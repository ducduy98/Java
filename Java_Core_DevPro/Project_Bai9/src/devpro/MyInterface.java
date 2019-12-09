package devpro;

public interface MyInterface {
	//hằng static
	public static final String HOST_NAME="devpro.edu.vn";
	//viết tắt
	String IP_ADDRESS="104.103.115.30";
	//trong interface, các biến khai báo được mặc định coi là hằng số
	//public và static tự động được rình biên dịch thêm vào
	
	//phương thức trừu tượng
	
	public abstract boolean isConnected();
	//viết tắt
	boolean isOK();
	//các phương thức chỉ có thể là public và mặc định là abstract
}
