package wiki.home.test;

public enum Currency {
	DOLLAR("$"), VND("VND");
	private final String value; 
	Currency(String value) {
        this.value = value;
    }
	public String getValue() {
		return value;
	}	
}
