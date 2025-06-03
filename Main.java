public class Main {
    public static void main(String[] args) {
        Club csClub = new Club("1N4", "Holmer", "Joker", 4, 10, 30, 5, 3, 3);
        

        Member joker = new Member("Joker", true);
        Member bruce = new Member("Bruce", false);
        Member robin = new Member("Robin", false);
        Member pete = new Member("Pete", false);
        
        csClub.addMember(joker);
        csClub.addMember(bruce);
        csClub.addMember(robin);
        csClub.addMember(pete);

        System.out.println(csClub);
        csClub.holdMeeting();
        csClub.holdMeeting();
        csClub.markAbsent("bruce");
        System.out.println("Member info with two meetings: ");
        csClub.printMembers();
        System.out.println("Semester reset");
        csClub.newSemester();
        csClub.holdMeeting();
        System.out.println("Semester Reset");
        csClub.newSemester();
        System.out.println("Member info new: ");
        csClub.printMembers();


        csClub.removeMember("Bruce");
        System.out.println();
        csClub.printMembers();

    }
}
