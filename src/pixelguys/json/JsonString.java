package pixelguys.json;

public class JsonString implements JsonElement {
	public String value;

	public JsonString(String value) {
		this.value = value;
	}

	@Override
	public String asString(String defaultValue) {
		return value;
	}
	
	@Override
	public String toString() {
		return '\"'+ Json.escape(value) +'\"';
	}
}
