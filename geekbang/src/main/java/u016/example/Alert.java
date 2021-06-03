package u016.example;


import java.util.ArrayList;
import java.util.List;

public class Alert {
    private List<AlertHandler> alertHandlerList = new ArrayList<>();


    public void addAlertHandler(AlertHandler alertHandler) {
        this.alertHandlerList.add(alertHandler);
    }

    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandler handler : alertHandlerList) {
            handler.check(apiStatInfo);
        }
    }

    /*public void check(String api, long requestCount, long errorCount, long durationOfSeconds) {
        long tps = requestCount / durationOfSeconds;
        if (tps > rule.getMatchedRule(api).getMaxTps()) {
            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
        }
        if (errorCount > rule.getMatchedRule(api).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }*/
}
