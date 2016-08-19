package cloud.artik.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import cloud.artik.model.CheckTokenResponse;
import cloud.artik.model.RefreshTokenResponse;
import cloud.artik.model.TokenRequest;

public class TokensApiTest extends ArtikCloudApiTest {
    protected TokensApi apiClient = null;
    
    @Before
    public void setUp() throws Exception {
        this.apiClient = (TokensApi) super.api(TokensApi.class, "user1.token");
    }
    
    @Test
    public void testCheckToken() throws Exception {
        String userAccessToken = "6907fe156b6848fa82395b2b99a882ed";

        TokenRequest request = new TokenRequest();
        request.setToken(userAccessToken);
        CheckTokenResponse checkTokenResponse = apiClient.checkToken(request);

        assertNotNull(checkTokenResponse);
        assertEquals("Valid token", checkTokenResponse.getData().getMessage());
    }

    @Test
    public void testRefreshToken() throws Exception {
        String refreshToken = "bb90333aee114b3e97284814d978080d";

        RefreshTokenResponse refreshTokenResponse = apiClient.refreshToken(
                "refresh_token", refreshToken);

        assertNotNull(refreshTokenResponse);
    }

}
