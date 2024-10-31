package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
private List<SaleItem> items = new ArrayList<>();
	
	/*public void addSaleItem(SaleItem item) {
		items.add(item);
	}*/
	
	public void addSaleItem(Product product, int quantity) {
		SaleItem item = new SaleItem();
		item.setProduct(product);
		item.setQuantity(quantity);
		items.add(item);
	}
	
	public double getTotal() {
		double total =0;
		for(SaleItem saleItem : items)
			total += saleItem.getSubtotal();
		
		return total;
	}
	
	public List<SaleItem> getItems(){
		return new ArrayList<>(items);
	}
	
}
