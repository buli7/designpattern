package u014.example;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Map;

public class AuthToken {
    private static final long DEFAULT_EXPIRED_TIME_INTERVAL = 1 * 60 * 1000;
    private String token;
    private long createTime;
    private long expiredTimeInterval = DEFAULT_EXPIRED_TIME_INTERVAL;

    public AuthToken(String token, long createTime) {
        this.token = token;
        this.createTime = createTime;
    }

    public AuthToken(String token, long createTime, long expiredTimeInterval) {
        this.token = token;
        this.createTime = createTime;
        this.expiredTimeInterval = expiredTimeInterval;
    }

    public static AuthToken create(String baseUrl, long createTime, Map<String, String> params) {
        throw new NotImplementedException();
    }

    public String getToken() {
        throw new NotImplementedException();
    }

    public boolean isExpired() {
        throw new NotImplementedException();
    }

    public boolean match(AuthToken authToken) {
        throw new NotImplementedException();
    }
}
