package cloud.artik.api;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import cloud.artik.model.RefreshTokenResponse;
import cloud.artik.model.TokenInfoSuccessResponse;

public class TokensApiTest extends ArtikCloudApiTest {
    protected TokensApi apiClient = null;
    
    @Before
    public void setUp() throws Exception {
        this.apiClient = (TokensApi) super.api(TokensApi.class, "user1.token");
    }
    
    @Test
    public void testTokenInfo() throws Exception {
        TokenInfoSuccessResponse tokenInfoResponse = apiClient.tokenInfo();

        assertNotNull(tokenInfoResponse);
        assertNotNull(tokenInfoResponse.getData().getExpiresIn());
    }

    @Test
    public void testRefreshToken() throws Exception {
        String refreshToken = "bb90333aee114b3e97284814d978080d";

        RefreshTokenResponse refreshTokenResponse = apiClient.refreshToken(
                "refresh_token", refreshToken);

        assertNotNull(refreshTokenResponse);
    }

}
