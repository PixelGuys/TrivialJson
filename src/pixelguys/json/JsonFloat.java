package pixelguys.json;

public class JsonFloat implements JsonElement {
	public double value;

	public JsonFloat(double value) {
		this.value = value;
	}

	@Override
	public int asInt(int defaultValue) {
		return (int)value;
	}

	@Override
	public long asLong(long defaultValue) {
		return (long)value;
	}

	@Override
	public float asFloat(float defaultValue) {
		return (float)value;
	}

	@Override
	public double asDouble(double defaultValue) {
		return value;
	}

	@Override
	public String toString() {
		return ""+value;
	}
}
