package com.ma.desgin.model.ObserverMode;

public class ObserverMode {
	public static void test() {
		ProductControl productControl = new ProductControl();
		NameObserver nameobs = new NameObserver();
		PriceObserver priceobs = new PriceObserver();
		Product product = new Product();
		productControl.setProduct(product);
		// productControl.register(nameobs, priceobs);
		product.setName("张三");
		product.setPrice(1.22f);
	}
}