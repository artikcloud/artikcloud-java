package cloud.artik.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import cloud.artik.client.ApiClient;
import cloud.artik.model.CheckTokenResponse;
import cloud.artik.model.RefreshTokenResponse;
import cloud.artik.model.TokenRequest;

public class TokensApiTest {
    //protected String basePath = "https://accounts.artik.cloud";

    protected TokensApi api(String accessToken) {
        try {
            ApiClient client = new ApiClient();
            client.setAccessToken(accessToken);
            //client.setBasePath(basePath);
            client.setDebugging(true);

            TokensApi retVal = new TokensApi();
            retVal.setApiClient(client);

            return retVal;
        } catch (Exception exc) {
            exc.printStackTrace();
            return null;
        }
    }

    @Test
    public void testCheckToken() throws Exception {
        String userAccessToken = "6907fe156b6848fa82395b2b99a882ed";
        TokensApi apiClient = api(userAccessToken);

        TokenRequest request = new TokenRequest();
        request.setToken(userAccessToken);
        CheckTokenResponse checkTokenResponse = apiClient.checkToken(request);

        assertNotNull(checkTokenResponse);
        assertEquals("Valid token", checkTokenResponse.getData().getMessage());
    }

    @Test
    public void testRefreshToken() throws Exception {
        String userAccessToken = "6907fe156b6848fa82395b2b99a882ed";
        String refreshToken = "bb90333aee114b3e97284814d978080d";
        TokensApi apiClient = api(userAccessToken);

        RefreshTokenResponse refreshTokenResponse = apiClient.refreshToken(
                "refresh_token", refreshToken);

        assertNotNull(refreshTokenResponse);
    }

}
