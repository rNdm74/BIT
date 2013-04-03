/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pfriend;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Dave
 */
public class FaceBookTest {
    
    public FaceBookTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addFriend method, of class FaceBook.
     */
    
    Friend friend1 = new Friend("Bob", "Marly");
    Friend friend2 = new Friend("Ivonna", "Humpalot", 1989, 2, 13);
    Friend friend3 = new Friend("Buck", "Rodgers", 1995, 10, 10, 'M', "Dunedin", "b@r.com", "single");
    
    @Test
    public void testAddFriend() {
        System.out.println("addFriend");
        FaceBook instance = new FaceBook("Dave","jackson",10);
        instance.addFriend(friend3);
        String expResult = friend3.toString() + "\n";
        String result = instance.friendData();
        assertEquals(expResult, result);
    }

    /**
     * Test of friendData method, of class FaceBook.
     */
    @Test
    public void testFriendData() {
        System.out.println("friendData");
        FaceBook instance = new FaceBook("Dave","jackson",10);
        instance.addFriend(friend3);
        String expResult = friend3.toString() + "\n";
        String result = instance.friendData();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFriendDataNoFriends() {
        System.out.println("friendData");
        FaceBook instance = new FaceBook("Dave","jackson",10);
        String expResult = "You have no friends.";
        String result = instance.friendData();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTotalFriends method, of class FaceBook.
     */

    @Test
    public void testGetTotalFriends() {
        System.out.println("getTotalFriends");
        FaceBook instance = new FaceBook("Dave","jackson",10);
        int expResult = 0;
        int result = instance.getTotalFriends();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMaxFriends method, of class FaceBook.
     */
    @Test
    public void testGetMaxFriends() {
        System.out.println("getMaxFriends");
        System.out.println("getTotalFriends");
        FaceBook instance = new FaceBook("Dave","jackson",10);
        int expResult = 10;
        int result = instance.getMaxFriends();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFirstName method, of class FaceBook.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        FaceBook instance = new FaceBook("Dave","jackson",10);
        String expResult = "Dave";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class FaceBook.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        FaceBook instance = new FaceBook("Dave","jackson",10);
        instance.setFirstName("Mike");
        String expResult = "Mike";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSurname method, of class FaceBook.
     */
    @Test
    public void testGetSurname() {
        System.out.println("getSurname");
        FaceBook instance = new FaceBook("Dave","jackson",10);
        String expResult = "jackson";
        String result = instance.getSurname();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSurname method, of class FaceBook.
     */
    @Test
    public void testSetSurname() {
        System.out.println("setSurname");
        FaceBook instance = new FaceBook("Dave","jackson",10);
        instance.setSurname("Topps");
        String expResult = "Topps";
        String result = instance.getSurname();
        assertEquals(expResult, result);
    }

    /**
     * Test of friendsAgedLessThan21 method, of class FaceBook.
     */
    @Test
    public void testFriendsAgedLessThan21() {
        System.out.println("friendsAgedLessThan21");
        FaceBook instance = new FaceBook("Dave","jackson",10);
        instance.addFriend(friend3);
        String expResult = "Buck Rodgers\n";
        String result = instance.friendsAgedLessThan21();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFriendsAgedLessThan21NoFriends() {
        System.out.println("friendsAgedLessThan21");
        FaceBook instance = new FaceBook("Dave","jackson",10);
        String expResult = "You have no friends.";
        String result = instance.friendsAgedLessThan21();
        assertEquals(expResult, result);
    }
}
