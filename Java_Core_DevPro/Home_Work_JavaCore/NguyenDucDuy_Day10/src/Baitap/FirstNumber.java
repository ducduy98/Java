package Baitap;

import java.util.concurrent.ThreadLocalRandom;

public class FirstNumber implements Runnable{
	private Number Number_A;
	int i=0;
	public FirstNumber(Number number) {
		this.Number_A = number;
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(i);
			Number_A.Num_A();
			
			try {
				Thread.sleep(ThreadLocalRandom.current().nextInt(500, 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
