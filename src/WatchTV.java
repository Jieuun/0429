
public class WatchTV {

	public static void main(String[] args) {

		TV tv = new TV();
		TV yourTV = new TV(36, 22, true);
		System.out.println(yourTV.getChannel() + " ���� " + yourTV.getVolume() + " �������� ������ �������ϴ�");
		tv.powerOn();
		System.out.println("���� TV ���� ���� : " + tv.getVolume());
		System.out.println("���� TV ä�� : " + 	tv.getChannel());
		System.out.println("ä�� 36������ ����" );
		tv.setChannel(36);
		System.out.println("ä�� ����");
		tv.channelUp();
		System.out.println("���� TVü�� : " + 	tv.getChannel());		
		System.out.println("TV ��û ����");
		tv.powerOff();

	}

}
