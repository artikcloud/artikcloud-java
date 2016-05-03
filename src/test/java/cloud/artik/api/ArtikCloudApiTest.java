package cloud.artik.api;

import java.lang.reflect.Method;

import cloud.artik.client.ApiClient;

public class ArtikCloudApiTest {
    protected String accessToken = "2845c2b880d24ac0a287b94ec9cee89f";

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
