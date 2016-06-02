package cloud.artik.api;

import java.lang.reflect.Method;

import cloud.artik.client.ApiClient;

public class ArtikCloudApiTest {
    protected String accessToken = "b4b13b4974a14330a147d069e3423e80";

    protected Object api(Class<?> className) {
        try {
            Object retVal = className.newInstance();

            ApiClient client = new ApiClient();
            client.setAccessToken(accessToken);
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
