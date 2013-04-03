package pfriend;

/**
 * Java Lab 6
 * David Jackson
 * BIT 2013
 */
public class FriendApp {

    public static void main(String[] args) {
        // TODO code application logic here
        Friend friend1 = new Friend("Bob", "Marly");
        Friend friend2 = new Friend("Ivonna", "Humpalot", 1989, 2, 13);
        Friend friend3 = new Friend("Buck", "Rodgers", 1995, 10, 10, 'M', "Dunedin", "b@r.com", "single");
        
//        System.out.println(friend1.toString());
//        System.out.println(friend2.toString());
//        System.out.println(friend3.toString());
        
        FaceBook dave = new FaceBook("Dave", "Jackson", 10);
        System.out.println(dave.friendsAgedLessThan21());
        dave.addFriend(friend3);
        System.out.println(
        dave.friendsAgedLessThan21());
    }
}
