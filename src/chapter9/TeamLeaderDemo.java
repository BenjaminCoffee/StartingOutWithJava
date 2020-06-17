package chapter9;

public class TeamLeaderDemo {
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        teamLeader.setName("Philip");
        teamLeader.setHireDate("1-2-2019");
        teamLeader.setPayRate(20.05);
        teamLeader.setShift(1);

        System.out.println(teamLeader.toString());

    }
}

