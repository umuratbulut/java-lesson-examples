package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product = new Product();
		product.setName("Notebook");
		product.setId(1);
		product.setDescription("Asus notebook");;
		product.setPrice(5000);;
		product.setStockAmount(3);;
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
	}

}
