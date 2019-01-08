import java.io.InputStream;
import java.util.Scanner;

import org.json.JSONException;
import org.json.JSONObject;
public class JSONUtil {
	public static String getJSONStringFromFile(String path)
	{
		Scanner scanner;
		InputStream in = FileHandle.inputStreamFromFile(path);
		scanner = new Scanner(in);
		String json = scanner.useDelimiter("\\z").next();
		scanner.close();
		return json;
}
	public static JSONObject getJSONObjectFromFile(String path) throws JSONException
	{
		return new JSONObject(getJSONStringFromFile(path));
	}
	public static boolean objectExists(JSONObject jsonObject, String key)
	{
		Object o;
		try {
			o=jsonObject.get(key);
		}
		catch(Exception e)
		{
			return false;
		}
		return o != null;
	}
}