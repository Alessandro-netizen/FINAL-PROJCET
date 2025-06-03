import java.util.ArrayList;

public class Club {
    String room;
    String advisor;
    String president;
    int capacity;
    int meetings;
    ArrayList<Member> members;
    int pointsForMeeting;
    int pointsForCredit;
    int penalty;
    int absencesForCredit;
    int target;

    public Club(String ro, String adv, String pres, int cap, int pm, int pc, int pen, int abc, int t) {
        room = ro;
        advisor = adv;
        president = pres;
        capacity = cap;
        meetings = 0;
        members = new ArrayList<>();
        pointsForMeeting = pm;
        pointsForCredit = pc;
        penalty = pen;
        absencesForCredit = abc;
        target = t;
    }

    public boolean addMember(Member m) {
        if (members.size() >= capacity) {
            return false;
        }
        members.add(m);
        return true;
    }

    public void holdMeeting() {
        meetings++;
        for (Member m : members) {
            m.attendedMeeting(pointsForMeeting, pointsForCredit); 
        }
    }

    public void markAbsent(String memberName) {
        for (Member m : members) {
            if (m.name.equals(memberName)) {
                m.missedMeeting(penalty, absencesForCredit);
                return;
            }
        }
    }
    public void removeMember(String memberName) {
    for (int i = 0; i < members.size(); i++) {
        if (members.get(i).name.equals(memberName)) {
            members.remove(i);
        }
    }
    }

    public void printMembers() {
        for (Member m : members) {
            System.out.println(m);
        }
    }
    @Override
    public String toString() {
    String result = "Club Info: \n";
    result += "Room: " + room + " \n";
    result += "Advisor: " + advisor + " \n";
    result += "President: " + president + " \n";
    result += "Capacity: " + capacity + " \n";
    result += "Meetings Held: " + meetings + " \n";
    result += "Total Members: " + members.size() + " \n";
    result += "Member List: \n";
    for (Member m : members) {
        result += "- " + m.name + "\n";
    }

    return result;
    }
    
    public void newSemester() {
    if (meetings < target) {
        System.out.println(target + " meetings required before next semester.");
        return;
    }
    for (Member m : members) {
            m.points = 0;
            m.credits = 0;
            m.meetingsAttended = 0;
        
    }

    meetings = 0;
    System.out.println("Semester has been reset.");
    }


}


