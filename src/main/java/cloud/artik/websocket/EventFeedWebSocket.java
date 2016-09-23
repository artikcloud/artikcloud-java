package cloud.artik.websocket;

import cloud.artik.model.EventFeedData;
import okhttp3.OkHttpClient;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

/**
 * Created by jniosi on 9/22/16.
 */
public class EventFeedWebSocket extends WebSocketProxy {

    public EventFeedWebSocket(String accessToken, String did, String dids,
                              String uid, String events, ArtikCloudWebSocketCallback callback) throws URISyntaxException, IOException {

        this(new OkHttpClient().newBuilder().readTimeout(35, TimeUnit.SECONDS).build(), accessToken, did, dids, uid, events, callback);
    }

    public EventFeedWebSocket(OkHttpClient client, String accessToken, String did, String dids,
                              String uid, String events, ArtikCloudWebSocketCallback callback) throws URISyntaxException,
            IOException {

        super("/events" + getQueryURI(accessToken, did, dids, uid, events), client, callback);
    }

    public void sendEvent(EventFeedData eventFeedData) throws IOException {
        super.sendObject(eventFeedData);
    }

    static String getQueryURI(String accessToken, String did, String dids,
                              String uid, String events) {

        StringBuffer sb = new StringBuffer("?");
        if (accessToken != null) {
            sb.append("Authorization=bearer+").append(accessToken);
        }
        if (did != null) {
            sb.append("&did=").append(did);
        }
        if (dids != null) {
            sb.append("&dids=").append(dids);
        }
        if (uid != null) {
            sb.append("&uid=").append(uid);
        }
        if (events != null) {
            sb.append("&event=").append(events);
        }

        return sb.toString();
    }

}
