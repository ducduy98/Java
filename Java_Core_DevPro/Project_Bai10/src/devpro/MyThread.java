package devpro;

public class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}

	//thực hiện việc ghi đè hàm Run của class Thread
	@Override
	public void run() {
		//nơi chứa code hoặc lời gọi mà sẽ được chạy trên luồng tạo ra từ MyThread
		
		for (int i = 0; i < 50; i++) {
			String name=Thread.currentThread().getName();
			System.out.println(name+" : "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
