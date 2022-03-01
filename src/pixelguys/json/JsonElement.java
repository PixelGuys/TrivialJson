package pixelguys.json;

public interface JsonElement {
	/**
	 * Returns the int value, if the JsonObject stores one. Otherwise it uses the defaultValue.
	 * @param defaultValue Replacement if the requested type doesn't exist.
	 */
	default int asInt(int defaultValue) {
		return defaultValue;
	}
	/**
	 * Returns the long value, if the JsonObject stores one. Otherwise it uses the defaultValue.
	 * @param defaultValue Replacement if the requested type doesn't exist.
	 */
	default long asLong(long defaultValue) {
		return defaultValue;
	}
	/**
	 * Returns the float value, if the JsonObject stores one. Otherwise it uses the defaultValue.
	 * @param defaultValue Replacement if the requested type doesn't exist.
	 */
	default float asFloat(float defaultValue) {
		return defaultValue;
	}
	/**
	 * Returns the double value, if the JsonObject stores one. Otherwise it uses the defaultValue.
	 * @param defaultValue Replacement if the requested type doesn't exist.
	 */
	default double asDouble(double defaultValue) {
		return defaultValue;
	}
	/**
	 * Returns the boolean value, if the JsonObject stores one. Otherwise it uses the defaultValue.
	 * @param defaultValue Replacement if the requested type doesn't exist.
	 */
	default boolean asBool(boolean defaultValue) {
		return defaultValue;
	}
	/**
	 * Returns the String value, if the JsonObject stores one. Otherwise it uses the defaultValue.
	 * @param defaultValue Replacement if the requested type doesn't exist.
	 */
	default String asString(String defaultValue) {
		return defaultValue;
	}
	default boolean isNull() {
		return false;
	}

	/**
	 * Gets the int value of a child. Or uses the defaultValue if the child is not present.
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	default int getInt(String key, int defaultValue) {
		return defaultValue;
	}

	/**
	 * Gets the long value of a child. Or uses the defaultValue if the child is not present.
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	default long getLong(String key, long defaultValue) {
		return defaultValue;
	}

	/**
	 * Gets the float value of a child. Or uses the defaultValue if the child is not present.
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	default float getFloat(String key, float defaultValue) {
		return defaultValue;
	}

	/**
	 * Gets the double value of a child. Or uses the defaultValue if the child is not present.
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	default double getDouble(String key, double defaultValue) {
		return defaultValue;
	}

	/**
	 * Gets the boolean value of a child. Or uses the defaultValue if the child is not present.
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	default boolean getBool(String key, boolean defaultValue) {
		return defaultValue;
	}

	/**
	 * Gets the String value of a child. Or uses the defaultValue if the child is not present.
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	default String getString(String key, String defaultValue) {
		return defaultValue;
	}

	/**
	 * Gets a child array.
	 * @param key
	 * @return
	 */
	default JsonArray getArray(String key) {
		return null;
	}

	/**
	 * Gets a child array. Result must not be modified!
	 * Useful when you just want to get stuff and default to another value if the array is not present.
	 * @param key
	 * @return
	 */
	default JsonArray getArrayNoNull(String key) {
		return new JsonArray();
	}

	/**
	 * Gets a child.
	 * @param key
	 * @return
	 */
	default JsonElement get(String key) {
		return null;
	}
}
