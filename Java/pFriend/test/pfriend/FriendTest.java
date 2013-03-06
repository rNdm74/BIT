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

/**
 *
 * @author Dave
 */
public class FriendTest {
    
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
    public void testSetBirthdate_3args_1() {
        System.out.println("SetBirthdate");
        int year = 0;
        int month = 0;
        int day = 0;
        Friend instance = null;
        GregorianCalendar expResult = null;
        GregorianCalendar result = instance.SetBirthdate(year, month, day);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isTheSame method, of class Friend.
     */
    @Test
    public void testIsTheSame() {
        System.out.println("isTheSame");
        Friend friend = null;
        Friend instance = null;
        boolean expResult = false;
        boolean result = instance.isTheSame(friend);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetName method, of class Friend.
     */
    @Test
    public void testSetName() {
        System.out.println("SetName");
        String firstName = "";
        String lastName = "";
        Friend instance = null;
        instance.SetName(firstName, lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SetExtras method, of class Friend.
     */
    @Test
    public void testSetExtras() {
        System.out.println("SetExtras");
        char gender = ' ';
        String hometown = "";
        String email = "";
        String relationshipStatus = "";
        Friend instance = null;
        instance.SetExtras(gender, hometown, email, relationshipStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Friend.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Friend instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of age method, of class Friend.
     */
    @Test
    public void testAge() {
        System.out.println("age");
        Friend instance = null;
        int expResult = 0;
        int result = instance.age();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Friend.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Friend instance = null;
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Friend.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Friend instance = null;
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Friend.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Friend instance = null;
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Friend.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Friend instance = null;
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBirthdate method, of class Friend.
     */
    @Test
    public void testGetBirthdate() {
        System.out.println("getBirthdate");
        Friend instance = null;
        String expResult = "";
        String result = instance.getBirthdate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBirthdate method, of class Friend.
     */
    @Test
    public void testSetBirthdate_3args_2() {
        System.out.println("setBirthdate");
        int day = 0;
        int month = 0;
        int year = 0;
        Friend instance = null;
        instance.setBirthdate(day, month, year);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGender method, of class Friend.
     */
    @Test
    public void testGetGender() {
        System.out.println("getGender");
        Friend instance = null;
        char expResult = ' ';
        char result = instance.getGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGender method, of class Friend.
     */
    @Test
    public void testSetGender() {
        System.out.println("setGender");
        char gender = ' ';
        Friend instance = null;
        instance.setGender(gender);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHometown method, of class Friend.
     */
    @Test
    public void testGetHometown() {
        System.out.println("getHometown");
        Friend instance = null;
        String expResult = "";
        String result = instance.getHometown();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHometown method, of class Friend.
     */
    @Test
    public void testSetHometown() {
        System.out.println("setHometown");
        String hometown = "";
        Friend instance = null;
        instance.setHometown(hometown);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Friend.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Friend instance = null;
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Friend.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Friend instance = null;
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRelationshipStatus method, of class Friend.
     */
    @Test
    public void testGetRelationshipStatus() {
        System.out.println("getRelationshipStatus");
        Friend instance = null;
        String expResult = "";
        String result = instance.getRelationshipStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRelationshipStatus method, of class Friend.
     */
    @Test
    public void testSetRelationshipStatus() {
        System.out.println("setRelationshipStatus");
        String relationshipStatus = "";
        Friend instance = null;
        instance.setRelationshipStatus(relationshipStatus);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDateAdded method, of class Friend.
     */
    @Test
    public void testGetDateAdded() {
        System.out.println("getDateAdded");
        Friend instance = null;
        String expResult = "";
        String result = instance.getDateAdded();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDateAdded method, of class Friend.
     */
    @Test
    public void testSetDateAdded() {
        System.out.println("setDateAdded");
        int day = 0;
        int month = 0;
        int year = 0;
        Friend instance = null;
        instance.setDateAdded(day, month, year);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
