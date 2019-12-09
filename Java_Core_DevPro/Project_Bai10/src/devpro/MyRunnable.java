package devpro;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		// nơi đạt các mã lệnh mà sẽ chạy trên luồng riêng
		for (int i = 0; i < 30; i++) {
			System.out.println("MyRunnable : "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
