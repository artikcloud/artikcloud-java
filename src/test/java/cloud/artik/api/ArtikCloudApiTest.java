package cloud.artik.api;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

import cloud.artik.client.ApiClient;

public class ArtikCloudApiTest {
    protected Properties properties = new Properties();
    
    /**
     * Loads the artik.properties
     */
    public ArtikCloudApiTest() {
        String filename = "artik.properties"; 
        InputStream is = this.getClass().getClassLoader().getResourceAsStream(filename);
        try {
            properties.load(is);
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }

    protected String getProperty(String key) {
        return this.properties.getProperty(key);
    }
    
    protected Object api(Class<?> className, String tokenKey) {
        try {
            Object retVal = className.newInstance();

            ApiClient client = new ApiClient();
            client.setAccessToken(this.getProperty(tokenKey));
            client.setDebugging(true);

            Method setApiClient = className.getMethod("setApiClient",
                    ApiClient.class);
            setApiClient.invoke(retVal, client);

            return retVal;
        } catch (Exception exc) {
            exc.printStackTrace();
            return null;
        }
    }
}
