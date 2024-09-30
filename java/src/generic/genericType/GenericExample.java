package generic.genericType;

public class GenericExample {

	public static void main(String[] args) {
		
		// k는 tv로 대체, m은 String으로 대체
		Product<Tv, String> product1 = new Product<>();
		
		// setter 매개값은 반드시 tv와 string을 제공
		product1.setKind(new Tv());
		product1.setModel("스마트tv");
		
		// getter 리턴값은 tv와 string이 됨
		Tv tv = product1.getKind();
		String tvModel = product1.getModel();
		
		// K는 car로 대체, m은 String으로 대체
		Product<Car, String> product2 = new Product<>();
		
		// setter 매개값은 반드시 car와 String을 제공
		product2.setKind(new Car());
		product2.setModel("suv자동차");
		
		// getter 리턴값은 car와 string이 됨
		Car car = product2.getKind();
		String carModel = product2.getModel();
		
		

	}

}
