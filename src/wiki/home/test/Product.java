package wiki.home.test;

import java.io.File;
import java.util.Date;
import java.util.List;

public class Product {
	private String name;
    private int salePrice;
    private int marketPrice;
    private Currency currency;
    private String color;
    private List<File> imgList;
    private int storage;
    private Storage storageText;
    private String description;
    private String origin;
    private Date factoryDate;
    private float weight;
    private Weight weightText;
    private List<Product> productList;
    
	public static class ProductBuilder {
        private String name;
        private int salePrice;
        private int marketPrice;
        private Currency currency;
        private String color;
        private List<File> imgList;
        private int storage;
        private Storage storageText;
        private String description;
        private String origin;
        private Date factoryDate;
        private float weight;
        private Weight weightText;
        private List<Product> productList;
        public ProductBuilder(String name, int salePrice, int marketPrice, Currency currency) {
            this.name = name;
            this.salePrice = salePrice;
            this.marketPrice = marketPrice;
            this.currency = currency;
        }
        public ProductBuilder(String name, List<Product> productList) {
            this.name = name;
            this.productList = productList;
        }
        public ProductBuilder withColor(String color){
            this.color = color;
            return this;
        }
        public ProductBuilder withImgList(List<File> imgList){
            this.imgList = imgList;
            return this;
        }
        public ProductBuilder withStorage(int storage, Storage storageText){
        	this.storage = storage;
            this.storageText = storageText;
            return this;
        }
        public ProductBuilder withDescription(String description){
            this.description = description;
            return this;
        }
        public ProductBuilder withOrigin(String origin) {
        	this.origin = origin;
        	return this;
        }
        public ProductBuilder withFactoryDate(Date factoryDate) {
        	this.factoryDate = factoryDate;
        	return this;
        }
        public ProductBuilder withWeight(float weight, Weight weightText) {
        	this.weight = weight;
        	this.weightText = weightText;
        	return this;
        }
        public ProductBuilder withProductList(List<Product> productList) {
        	this.productList = productList;
        	return this;
        }
        public Product build(){
            return new Product(this);
        }
    }
    private Product(ProductBuilder productBuilder) {
    	this.name = productBuilder.name;
        this.salePrice = productBuilder.salePrice;
        this.marketPrice = productBuilder.marketPrice;
        this.currency = productBuilder.currency;
        this.color = productBuilder.color;
        this.imgList = productBuilder.imgList;
        this.storage = productBuilder.storage;
        this.storageText = productBuilder.storageText;        
        this.description = productBuilder.description;
        this.origin = productBuilder.origin;
        this.factoryDate = productBuilder.factoryDate;
        this.weight = productBuilder.weight;
        this.weightText = productBuilder.weightText;
        this.productList = productBuilder.productList;
    }
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" Name: ");
		sb.append(name);
		if (salePrice != 0) {
			sb.append("\n Sale Price: ");
			sb.append(salePrice + currency.getValue());
		}
		if (marketPrice != 0) {
			sb.append("\n Market Price: ");
			sb.append(marketPrice + currency.getValue());
		}		
		if (color!=null) {
		  sb.append("\n Color: ");
		  sb.append(color);
		}
		if (imgList!=null) {
		  sb.append("\n Image List:");
		  int i = 0;
		  for (File file : imgList) {
			  sb.append("\n Image "+i+":"+file.getPath());
			  i++;
	      }
		}
		if (storage!=0) {
		  sb.append("\n Storage: ");
		  sb.append(storage + storageText.getValue());
		}
		if (description!=null) {
		  sb.append("\n Description: ");
		  sb.append(description);
		}
		if (origin!=null) {
		  sb.append("\n Origin: ");
		  sb.append(origin);	
		}
        if (factoryDate!=null) {
          sb.append("\n Factory Date: ");
  		  sb.append(Const.DATEFORMAT.format(factoryDate));
        }
		if (weight!= 0.0f) {
		  sb.append("\n Weight: ");
		  sb.append(weight + " " + weightText.getValue());
		}
		if (productList != null) {
			int i = 1;
			for (Product product : productList) {
				sb.append("\n Product "+i+":\n");
				sb.append(product.toString());
				i++;
			}
		}
		return sb.toString();
	}    
    
}