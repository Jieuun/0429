package song;
public class SongApp {

	public static void main(String[] args) {

		Song song1 = new Song("좋은날", "아이유", "REAL", "이민수", 2010, 3);
		Song song2 = new Song("러빙유", "씨스타", "", null, 0, 0);
		Song song3 = new Song("여수 밤바다", "버스커 버스커", "", null, 0, 0);
		song1.show();
		song2.show();
		song3.show();
		
		
	}
}
