package Baitap;

import java.util.concurrent.ThreadLocalRandom;

public class Sum implements Runnable{
	Number Number_Sum;
	
	public Sum(Number number_Sum) {
		Number_Sum = number_Sum;
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++){			
			Number_Sum.Num_Sum();
			try {
				Thread.sleep(ThreadLocalRandom.current().nextInt(500, 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
