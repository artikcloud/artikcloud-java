package cloud.artik.api;

import cloud.artik.client.ApiClient;
import cloud.artik.model.CheckTokenResponse;
import cloud.artik.model.RefreshTokenResponse;
import cloud.artik.model.TokenInfoSuccessResponse;
import cloud.artik.model.TokenRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TokensApi
 */
public class TokensApiTest {

    private TokensApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(TokensApi.class);
    }

    
    /**
     * Check Token
     *
     * (Deprecated) Check Token. See tokenInfo
     */
    @Test
    public void checkTokenTest() {
        TokenRequest tokenInfo = null;
        // CheckTokenResponse response = api.checkToken(tokenInfo);

        // TODO: test validations
    }
    
    /**
     * Refresh Token
     *
     * Refresh Token
     */
    @Test
    public void refreshTokenTest() {
        String grantType = null;
        String refreshToken = null;
        // RefreshTokenResponse response = api.refreshToken(grantType, refreshToken);

        // TODO: test validations
    }
    
    /**
     * Token Info
     *
     * Returns the Token Information
     */
    @Test
    public void tokenInfoTest() {
        // TokenInfoSuccessResponse response = api.tokenInfo();

        // TODO: test validations
    }
    
}
