package pixelguys.json;

public class JsonInt implements JsonElement {
	public long value;

	public JsonInt(long value) {
		this.value = value;
	}

	@Override
	public int asInt(int defaultValue) {
		return (int)value;
	}

	@Override
	public long asLong(long defaultValue) {
		return value;
	}

	@Override
	public float asFloat(float defaultValue) {
		return value;
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
