package wiki.home.test;

import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) throws ParseException {
		ClassLoader cl = Test.class.getClassLoader();
		File file = new File(cl.getResource("./images/iphoneX.jpg").getFile());
		List<File> imgList = new ArrayList<File>(Arrays.asList(file, file, file));
		
		Product iphoneX64G = new Product.ProductBuilder("Iphone X 64GB Black", 999, 1099, Currency.DOLLAR)
							.withColor("black")
							.withImgList(imgList)
							.withStorage(64, Storage.GB)
							.withDescription("description Iphone X 64GB Black")
							.withOrigin("Apple")
							.withFactoryDate(Const.DATEFORMAT.parse("20/10/2010"))
							.withWeight(500, Weight.GAM)
				            .build();
		System.out.println("Iphone X 64GB Black");
		System.out.println(iphoneX64G.toString());
		System.out.println("=======================");
		Product iphoneX128G = new Product.ProductBuilder("Iphone X 64GB Black", 950, 1050, Currency.DOLLAR)
				.withColor("Yellow")
				.withImgList(imgList)
				.withStorage(128, Storage.GB)
				.withDescription("description Iphone X 128GB Black")
				.withOrigin("Apple")
				.withFactoryDate(Const.DATEFORMAT.parse("20/10/2010"))
				.withWeight(500, Weight.GAM)
	            .build();
		System.out.println("Iphone X 128GB Black");
		System.out.println(iphoneX128G.toString());
		System.out.println("=======================");
		List<Product> productList = new ArrayList<Product>(
			    Arrays.asList(iphoneX64G, iphoneX128G));
		
		Product configurableProduct = new Product.ProductBuilder("Iphone X", productList).build();
		System.out.println("Iphone X 128GB Black");
		System.out.println(configurableProduct.toString());
	}
}
