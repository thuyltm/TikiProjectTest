package wiki.home.test;

public enum Storage {
	GB("GB"), MB("MB");
	private final String value; 
	Storage(String value) {
        this.value = value;
    }
	public String getValue() {
		return value;
	}
}
