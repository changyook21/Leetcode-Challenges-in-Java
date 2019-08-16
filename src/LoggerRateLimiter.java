public class LoggerRateLimiter {

    /*
    Design a logger system that receive stream of messages along with its timestamps, each message should be printed if and only if it is not printed in the last 10 seconds.

    Given a message and a timestamp (in seconds granularity), return true if the message should be printed in the given timestamp, otherwise returns false.

    It is possible that several messages arrive roughly at the same time.
    */
    class Logger {
        /** Initialize your data structure here. */
        HashMap<String, Integer> map;
        public Logger() {
            map = new HashMap<>();
        }

        /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
         If this method returns false, the message will not be printed.
         The timestamp is in seconds granularity. */
        public boolean shouldPrintMessage(int timestamp, String message) {
            if (!map.containsKey(message)) {
                map.put(message, timestamp);
                return true;
            }
            else {
                if (timestamp - map.get(message) < 10) {
                    return false;
                }
                else {
                    map.replace(message, timestamp);
                    return true;
                }
            }
        }
    }

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */
}
