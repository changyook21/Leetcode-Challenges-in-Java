public class MeetingRooms {
/*
Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), determine if a person could attend all meetings.

Example 1:

Input: [[0,30],[5,10],[15,20]]
Output: false
*/

    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (interval1, interval2) -> (interval1[0] - interval2[0]) );
        if (intervals.length == 0) {
            return true;
        }
        int min = intervals[0][0];
        int max = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= max ) {
                max = intervals[i][1];
            }
            else if (intervals[i][1] <= min) {
                min = intervals[i][0];
            }
            else {
                return false;
            }
        }
        return true;
    }

}
