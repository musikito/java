public class Team{
    Member member;
    public Team(Member member){
        this.member = member;
    }

    // main method, entry point of program
    public static void main(String[] args){
        Member myMember = new Member("Jose","Dominican",100,1000);

        //add member to team
        Team myTeam = new Team(myMember);

        // print it
        System.out.println(myTeam.member.getName());
        System.out.println(myTeam.member.getType());
        System.out.println(myTeam.member.getLevel());
        System.out.println(myTeam.member.getRank());
        

    }


} // End of Team class

class Member{
    private String name;
    private String type;
    private int level;
    private int rank;

    public Member(String name, String type, int level, int rank){
        // bind the vars
        this.name = name;
        this.type = type;
        this.level = level;
        this.rank = rank;
    } //end of Menber

    /* define the getters functions */
    public String getName(){
        return this.name;
    }
    public String getType(){
        return this.type;
    }
    public int getLevel(){
        return this.level;
    }
    public int getRank(){
        return this.rank;
    }


} // end of class Member