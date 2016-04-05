package cloud.artik.api;

import java.lang.reflect.Method;

import cloud.artik.client.ApiClient;

public class ArtikCloudApiTest {
    protected String accessToken = "51e73cc3ad88418dbf921de4dceacf7e";

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
