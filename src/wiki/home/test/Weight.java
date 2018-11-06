package wiki.home.test;

public enum Weight {
	GAM("gam"), KILOGAM("kg");
	private final String value; 
	Weight(String value) {
        this.value = value;
    }
	public String getValue() {
		return value;
	}
}
