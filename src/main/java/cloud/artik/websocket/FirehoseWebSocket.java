package cloud.artik.websocket;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

public class FirehoseWebSocket extends WebSocketProxy {
    
    public FirehoseWebSocket(String accessToken,
            String sdid, String sdids, String sdtids, String uid,
            ArtikCloudWebSocketCallback callback) throws URISyntaxException,
            IOException {
        
        this(new OkHttpClient().newBuilder().readTimeout(35, TimeUnit.SECONDS).build(), accessToken, sdid, sdids, sdtids, uid, callback);
    }

    public FirehoseWebSocket(OkHttpClient client, String accessToken,
            String sdid, String sdids, String sdtids, String uid,
            ArtikCloudWebSocketCallback callback) throws URISyntaxException,
            IOException {
        
        super("/live" + getQueryURI(accessToken, sdid, sdids, sdtids, uid),
                client, callback);
    }

    static String getQueryURI(String accessToken, String sdid, String sdids,
            String sdtids, String uid) {
        StringBuffer sb = new StringBuffer("?");
        if (accessToken != null) {
            sb.append("Authorization=bearer+").append(accessToken);
        }
        if (sdid != null) {
            sb.append("&sdid=").append(sdid);
        }
        if (sdids != null) {
            sb.append("&sdids=").append(sdids);
        }
        if (sdtids != null) {
            sb.append("&sdtids=").append(sdtids);
        }
        if (uid != null) {
            sb.append("&uid=").append(uid);
        }

        return sb.toString();
    }

}
