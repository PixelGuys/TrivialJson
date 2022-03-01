package pixelguys.json;

public class JsonOthers implements JsonElement {
	boolean isNull;
	boolean boolValue;

	public JsonOthers(boolean isNull, boolean boolValue) {
		this.isNull = isNull;
		this.boolValue = boolValue;
	}

	@Override
	public boolean asBool(boolean defaultValue) {
		return isNull ? defaultValue : boolValue;
	}

	@Override
	public boolean isNull() {
		return isNull;
	}

	@Override
	public String toString() {
		return isNull ? "null" : (boolValue ? "true" : "false");
	}
}
