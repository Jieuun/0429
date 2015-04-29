package goods;
public class GoodsApp {

	public static void main(String[] args) {

		Goods camara = new Goods();

		camara.setName("Nikon");
		camara.setPrice(4000000);
		camara.setCountSold(50);
		camara.setCountStock(30);

		System.out.println("상품이름 : " + camara.getName());
		System.out.println("상품가격 : " + camara.getPrice());
		System.out.println("재고수량 : " + camara.getCountStock());
		System.out.println("팔린수량 : " + camara.getCountSold());

		camara.show();
		
		
		Goods camara2 = new Goods("Samsung", 500000, 100, 78);
		camara2.show();
	}

}
