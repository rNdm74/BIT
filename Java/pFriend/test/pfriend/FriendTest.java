/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pfriend;

import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.experimental.categories.Categories;

/**
 *
 * @author Dave
 */
public class FriendTest {
    
    Friend friend1 = new Friend("Bob", "Marly", 2001,12,5,'M',"dunedin","b@m.com","Single");
    Friend friend2 = new Friend("Bob", "Marly", 2001,12,5);
    Friend friend3 = new Friend("Bob", "Schwarts", 2001,12,5);
    Friend friend4 = new Friend("Charlie", "Sheen");
    Friend friend5 = new Friend("Mike", "Myers", 1989,12,8);
    Friend friend6 = new Friend("Bob", "Marly", 2001,12,5,'F',"dunedin","b@m.com","Single");
    
    public FriendTest() {
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
     * Test of SetBirthdate method, of class Friend.
     */
    @Test
    public void testSetBirthdate() {
        System.out.println("SetBirthdate");
        int year = 2000;
        int month = 12;
        int day = 05;
        String expResult = "5\\12\\2000";
        friend4.setBirthdate(day, month, year);
        String result = friend4.getBirthdate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    /**
     * Test of isTheSame method, of class Friend.
     */
    @Test
    public void testIsTheSame() {
        System.out.println("isTheSame");
        
        boolean expResult = true;
        boolean result = friend1.isTheSame(friend2);
        assertEquals(expResult, result);
        
        System.out.println("isTheSame");
        expResult = false;
        result = friend2.isTheSame(friend3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of SetName method, of class Friend.
     */
    @Test
    public void testSetName() {
        System.out.println("SetName");
        String firstName = "Mike";
        String lastName = "Cars";
        friend1.SetName(firstName, lastName);
        String result = friend1.getFirstName() + friend1.getLastName();
        String expResult = "MikeCars";
        assertEquals(expResult, result);
    }

    /**
     * Test of SetExtras method, of class Friend.
     */
    @Test
    public void testSetExtras() {
        System.out.println("SetExtras");
        char gender = 'M';
        String hometown = "LA";
        String email = "charlesheen@ilovecoke.com";
        String relationshipStatus = "Complicated";
        friend4.SetExtras(gender, hometown, email, relationshipStatus);
        String result = friend4.getGender() + friend4.getHometown() + friend4.getEmail() + friend4.getRelationshipStatus();
        String expResult = "MLAcharlesheen@ilovecoke.comComplicated";
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Friend.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Mr. Bob Marly 5\\12\\2001 dunedin b@m.com Single 27\\3\\2013";
        String result = friend1.toString();
        assertEquals(expResult, result);
        expResult = "Ms. Bob Marly 5\\12\\2001 dunedin b@m.com Single 27\\3\\2013";
        result = friend6.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of age method, of class Friend.
     */
    @Test
    public void testAge() {
        System.out.println("age");
        int expResult = 11;
        int result = friend1.age();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testAgeToday() {
        System.out.println("age");
        Friend n1 = new Friend("num", "num", 2000, 3, 27);
        int expResult = 13;
        int result = n1.age();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testAgeYesterday() {
        System.out.println("age");
        Friend n1 = new Friend("num", "num", 2000, 3, 26);
        int expResult = 13;
        int result = n1.age();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test
    public void testAgeTomorrow() {
        System.out.println("age");
        Friend n1 = new Friend("num", "num", 2000, 3, 27);
        int expResult = 13;
        int result = n1.age();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFirstName method, of class Friend.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        String expResult = "Bob";
        String result = friend1.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Friend.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "Bobina";
        friend6.setFirstName(firstName);
        String result = friend6.getFirstName();
        String expResult = "Bobina";
        assertEquals(expResult, result);
    }

    /**
     * Test of getLastName method, of class Friend.
     */

    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        String expResult = "Marly";
        String result = friend1.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Friend.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "Bobina";
        friend6.setLastName(lastName);
        String result = friend6.getLastName();
        String expResult = "Bobina";
        assertEquals(expResult, result);
    }

    /**
     * Test of getBirthdate method, of class Friend.
     */

    @Test
    public void testGetBirthdate() {
        System.out.println("getBirthdate");
        String expResult = "5\\12\\2001";
        String result = friend2.getBirthdate();
        assertEquals(expResult, result);

    }
    
    @Test (expected = NullPointerException.class)
    public void testGetBirthdateNull() {
        System.out.println("getBirthdate");
        String expResult = null;
        String result = friend4.getBirthdate();
        assertEquals(expResult, result);

    }

    /**
     * Test of getGender method, of class Friend.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        char expResult = 'M';
        char result = friend1.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setGender method, of class Friend.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        char gender = 'M';
        friend4.setGender(gender);
        char result = friend4.getGender();
        char expResult = 'M';
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getHometown method, of class Friend.
     */
    @Test
    public void testGetHometown() {
        System.out.println("getHometown");
        String expResult = "dunedin";
        String result = friend1.getHometown();
        assertEquals(expResult, result);
    }
    
    @Test (expected = NullPointerException.class)
    public void testGetHometownNull() {
        System.out.println("getHometown");
        String expResult = null;
        String result = friend5.getHometown();
        assertEquals(expResult, result);
    }


    /**
     * Test of setHometown method, of class Friend.
     */
    @Test
    public void testSetHometown() {
        System.out.println("setHometown");
        String hometown = "auckland";
        friend1.setHometown(hometown);
        String result = friend1.getHometown();
        String expResult = "auckland";
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmail method, of class Friend.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        String expResult = "b@m.com";
        String result = friend1.getEmail();
        assertEquals(expResult, result);
    }
    
    @Test (expected = NullPointerException.class)
    public void testGetEmailNull() {
        System.out.println("getEmail");
        String expResult = null;
        String result = friend5.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class Friend.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "charle@sheen.com";
        friend4.setEmail(email);
        String result = friend4.getEmail();
        String expResult = "charle@sheen.com";
        assertEquals(expResult, result);
    }

    /**
     * Test of getRelationshipStatus method, of class Friend.
     */
    @Test
    public void testGetRelationshipStatus() {
        String expResult = "Single";
        String result = friend1.getRelationshipStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
    @Test (expected = NullPointerException.class)
    public void testGetRelationshipStatusNull() {
        String expResult = null;
        String result = friend4.getRelationshipStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRelationshipStatus method, of class Friend.
     */
    @Test
    public void testSetRelationshipStatus() {
        System.out.println("setRelationshipStatus");
        String relationshipStatus = "Married";
        friend4.setRelationshipStatus(relationshipStatus);
        String result = friend4.getRelationshipStatus();
        String expResult = "Married";
        assertEquals(expResult, result);
    }

    /**
     * Test of getDateAdded method, of class Friend.
     */
    @Test
    public void testGetDateAdded() {
        System.out.println("getDateAdded");
        String expResult = "27\\3\\2013";
        String result = friend1.getDateAdded();
        assertEquals(expResult, result);
    }
    }


