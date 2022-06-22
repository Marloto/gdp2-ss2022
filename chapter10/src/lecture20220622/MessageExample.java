package lecture20220622;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

class Message {
    private long time;
    private String message;

    public Message(long time, String message) {
        this.time = time;
        this.message = message;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public String toFormattedTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY hh:mm:ss");
        return sdf.format(new Date(time));
    }

    public String toString() {
        return toFormattedTime() + ": " + message;
    }
}

public class MessageExample {
    public static Message last = null;

    public static void main(String[] args) {
        List<String> messages = Arrays.asList(
            "1581697831661:Message 1", 
            "1581553746009:Message 2",
            "1588854263313:Message 3", 
            "1589381962905:Message 4", 
            "1589379566771:Message 5");
        handleList(messages);
    }

    public static void handleList(List<String> messages) {
        messages.stream()
            .map(m -> m.split(":"))
            .map(parts -> new Message(Long.valueOf(parts[0]), parts[1]))
            .filter(m -> last == null || last.getTime() < m.getTime())
            .peek(m -> last = m)
            .forEach(m -> System.out.println(m.toString()));
        
    }

    public static void handleList2(List<String> messages) {
         // ... ohne Lambda-Ausdrücke?
        for(String line : messages) {
            String[] parts = line.split(":");
            Message m = new Message(Long.valueOf(parts[0]), parts[1]);
            if(last == null || last.getTime() < m.getTime()) {
                last = m;
                System.out.println(m.toString());
            }
        }
    }

}
