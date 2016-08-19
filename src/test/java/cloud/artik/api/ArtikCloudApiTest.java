package cloud.artik.api;

import java.lang.reflect.Method;

import cloud.artik.client.ApiClient;

public class ArtikCloudApiTest {
    protected String accessToken = "56eecae18bcb45c48a0d62571ee852fe";

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
