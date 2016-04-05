package cloud.artik.websocket;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;

public class JSON {
    private Gson gson;

    public JSON() {
        gson = new GsonBuilder().create();
    }

    public Gson getGson() {
        return gson;
    }

    public void setGson(Gson gson) {
        this.gson = gson;
    }

    /**
     * Serialize the given Java object into JSON string.
     */
    public String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     * 
     * @param body
     *            The JSON string
     * @param returnType
     *            The type to deserialize inot
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public <T> T deserialize(String body, Type returnType) {
        try {
            return gson.fromJson(body, returnType);
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return
            // type;
            // parse response body into date or datetime for the Date return
            // type.
            if (returnType.equals(String.class))
                return (T) body;
            // else if (returnType.equals(Date.class))
            // return (T) apiClient.parseDateOrDatetime(body);
            else
                throw (e);
        }
    }
}
