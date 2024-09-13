package Day07.Ex02_Interface;

public class Drone implements RemoteControl{
	
	int speed;

	@Override
	public void turnOn() {
		System.out.println("드론 전원 On");
	}
	
	@Override
	public void turnOff() {
		System.out.println("드론 전원 Off");
	}

	@Override
	public void setSpeed(int speed) {
		if( speed > MAX_SPEED ) {
			this.speed = MAX_SPEED;
			System.err.println("최대 속력!");
		}
		else if( speed < MIN_SPEED) {
			
			this.speed = MIN_SPEED;
		System.err.println("최저 속력!");
		}
		else {
			this.speed = speed;
	}
	
}


}
