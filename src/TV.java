
public class TV {

	int channel;
	int volume;
	boolean power;
	
	public TV(){
		this.channel = 7;
		this.volume = 20;
		this.power = false;
	}
	
	public TV(int channel, int volume, boolean power){
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	/**
	 * 채널을 변경한다.
	 * @param channel
	 * 리모컨에서 누른 채널
	 */
	public void setChannel(int channel){
		this.channel = channel;
	}
	
	public void channelUp(){
		channel++;
		//this.channel++;
	}
	public void channelDown(){
		channel--;
	}
	public void volumeUp(){
		volume++;
	}
	public void volumeDown(){
		volume--;
	}
	public void powerOn(){
		power = true;
	}
	public void powerOff(){
		power = false;
	}
	
	public int getChannel(){
		return channel;
	}
	
	public boolean isPower(){
		return power;
	}
	
	public int getVolume(){
		return volume;
	}

	
}
