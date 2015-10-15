package io.samsungsami.websocket;

import java.io.IOException;
import java.net.URISyntaxException;

public class FirehoseWebSocket extends WSProxy {

    public FirehoseWebSocket(String accessToken, String sdids, String sdtids, String uid, SamiWebSocketCallback callback) throws URISyntaxException, IOException {
        super("/live" + getQueryURI(accessToken, sdids, sdtids, uid), callback);
    }
    
    static String getQueryURI(String accessToken, String sdids, String sdtids, String uid) {
        StringBuffer sb = new StringBuffer("?");
        if (accessToken != null) {
            sb.append("Authorization=bearer+").append(accessToken);
        }
        if (sdids != null) {
        	if (sdids.indexOf(",") != -1) {
                sb.append("&sdids=").append(sdids);
        	} else { // temporary workaround code for the single device <== SAMIDE-280
                sb.append("&sdid=").append(sdids);
        	}
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
