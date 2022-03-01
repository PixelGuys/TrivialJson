package pixelguys.json;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.function.Consumer;

public class Json {
	static Consumer<String> errorHandler = (error) -> {
		System.out.println(error);
	};
	static Charset encoding = Charset.forName("UTF-8");

	static void handleException(Throwable t) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		t.printStackTrace(pw);
		errorHandler.accept(sw.toString());
	}
	
	static String escape(String string) {
		return string   .replace("\\", "\\\\") //escaping  \
		                .replace("\n", "\\\n") //escaping new line
		                .replace("\"", "\\\"") //escaping "
		                .replace("\t", "\\t")  //escaping  tabs
				;
	}

	public static void setErrorHandler(Consumer<String> errorHandler) {
		Json.errorHandler = errorHandler;
	}

	public static void setWEncoding(Charset encoding) {
		Json.encoding = encoding;
	}
}
