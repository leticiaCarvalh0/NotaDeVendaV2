package model;

public class SaleItem {
	private Product product;
	 private int quantity;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {

		this.product = product;
	}

	public int getQuantity() {

		return quantity;
	}

	public void setQuantity(int quantity) {

		this.quantity = quantity;
	}

	public double getSubtotal() {

		return product.getPrice()*quantity;
	}


	@Override

   public String toString() {

       String itemStr = String.format("%s, %d, %2.f",

               this.getProduct().getDescription(),

               this.getQuantity(),

               this.getSubtotal());

       return itemStr;

   }
}
