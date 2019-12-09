package Baitap;

import java.util.concurrent.ThreadLocalRandom;

public class SecondNumber implements Runnable{
	Number Number_B;
	
	public SecondNumber(Number number_B) {
		Number_B = number_B;
	}

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			Number_B.Num_B();
			//i++;
			try {
				Thread.sleep(ThreadLocalRandom.current().nextInt(500, 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}		
	}

}
