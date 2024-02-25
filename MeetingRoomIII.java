import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * MeetingRoomIII
 */

class Meeting {
    int start, end, room;

    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
        this.room = -1;
    }

    Meeting(int start, int end, int room) {
        this.start = start;
        this.end = end;
        this.room = room;
    }
}

class StartTimeComparator implements Comparator<Meeting> {
    @Override
    public int compare(Meeting o1, Meeting o2) {
        return o1.start - o2.start;
    }
}

class EndTimeComparator implements Comparator<Meeting> {
    @Override
    public int compare(Meeting o1, Meeting o2) {
        if (o1.end == o2.end) {
            return o1.start - o2.start;
        }
        return o1.end - o2.end;
    }
}

public class MeetingRoomIII {

    public int mostBooked(int n, int[][] meetings) {
        int[] totalMeetingsInRoom = new int[n];
        PriorityQueue<Integer> meetingRooms = new PriorityQueue<>();
        PriorityQueue<Meeting> runningMeetings = new PriorityQueue<>(new EndTimeComparator());
        LinkedList<Meeting> meetingList = new LinkedList<>();
        LinkedList<Meeting> completedMeetingList = new LinkedList<>();

        for (int i = 0; i < meetings.length; i++) {
            meetingList.add(new Meeting(meetings[i][0], meetings[i][1]));
        }

        meetingList.sort(new StartTimeComparator());

        while (meetingRooms.size() != 0) {
            Meeting meetingToStart = meetingList.pop();
            meetingToStart.room = meetingRooms.poll();
            totalMeetingsInRoom[meetingToStart.room] += 1;
            runningMeetings.add(meetingToStart);
        }

        while (completedMeetingList.size() != meetings.length) {
            Meeting meetingToBeCompleted = runningMeetings.poll();
            completedMeetingList.add(meetingToBeCompleted);
            Meeting meetingToStart = meetingList.pop();
            meetingToStart.room = meetingToBeCompleted.room;
            totalMeetingsInRoom[meetingToStart.room] += 1;
            runningMeetings.add(meetingToStart);
        }

        int maxAt = 0;
        for (int i = 0; i < totalMeetingsInRoom.length; i++) {
            maxAt = totalMeetingsInRoom[i] > totalMeetingsInRoom[maxAt] ? i : maxAt;
        }

        return maxAt;
    }

    public static void main(String[] args) {

    }
}