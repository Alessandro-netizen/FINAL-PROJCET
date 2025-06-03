public class Member {

    String name;
    boolean president;
    int meetingsAttended;
    int credits;
    int absences;
    int points;


    public Member(String n, boolean isPresident) {
        name = n;
        president = isPresident;
        meetingsAttended = 0;
        credits = 0;
        absences = 0;
        points = 0;
        if (president){
            points = -100000000;
            credits = 4;
        }
    }

    public void attendedMeeting(int p, int c) {
        meetingsAttended++;
        points += p;
        
        if (points%c == 0 && points>0){
            credits++;
        }
    }

    public void missedMeeting(int p, int a) {
        absences++;
        points -= p;
        if (absences%a==0){
            credits--;
        }
    }
    @Override
    public String toString() {
        return name + " | President: " + president + ", Attended: " + meetingsAttended +
               ", Absences: " + absences + ", Credits: " + credits + ", Points: " + points;
    }
}
