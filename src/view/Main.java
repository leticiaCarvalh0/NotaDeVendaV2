package view;

import model.Product;
import model.Sale;
import model.SaleItem;

public class Main {
	public static void main(String[] args) {
		Product rice = new Product();
		rice.setDescription("Arroz Tatiana");
		rice.setPrice(30);
		
		Product beans = new Product();
		beans.setDescription("Feijão Filó");
		beans.setPrice(20);
		
		Product pasta = new Product();
		pasta.setDescription("Macarrão Chico");
		pasta.setPrice(15);
		
		Sale sale = new Sale();
		sale.addSaleItem(rice, 2);
		sale.addSaleItem(beans, 4);
		sale.addSaleItem(pasta, 3);
		
		for(SaleItem item : sale.getItems()) {
			String itemStr = String.format("%s %d %.2f", item.getProduct().getDescription(), item.getQuantity(), item.getSubtotal());
			System.out.println(itemStr);
		}
		System.out.println(String.format("Total: %.2f", sale.getTotal()));
	}

}
