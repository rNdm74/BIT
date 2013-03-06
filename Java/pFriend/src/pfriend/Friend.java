package pfriend;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Java Lab 6
 * David Jackson
 * BIT 2013
 */

public final class Friend {
    
    //Class vars
    private String firstName;
    private String lastName;
    private GregorianCalendar birthdate;
    private char gender;
    private String hometown;
    private String email;
    private String relationshipStatus;
    private GregorianCalendar dateAdded;
    
    //constructors
    public Friend(String firstName, String lastName)
    {
        this.SetName(firstName, lastName);
    }
    
    public Friend(String firstName, String lastName, int year, int month, int day)
    {
        this.SetName(firstName, lastName);
        birthdate = SetBirthdate(year, month, day);
    }
    
    public Friend(String firstName, String lastName, int year, int month, int day, 
            char gender, String hometown, String email, String relationshipStatus)
    {
        this.SetName(firstName, lastName);
        birthdate = SetBirthdate(year, month, day); 
        this.SetExtras(gender, hometown, email, relationshipStatus);
    }
    
    public GregorianCalendar SetBirthdate(int year, int month, int day)
    {
        return new GregorianCalendar(year, month - 1, day);
    }
    
    public boolean isTheSame(Friend friend)
    {
        return (friend.firstName.equals(this.firstName) && friend.lastName.equals(this.lastName) 
                && friend.birthdate == this.birthdate) ? true : false;
    }
    public void SetName(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateAdded = (GregorianCalendar) GregorianCalendar.getInstance();
    }
    
    public void SetExtras(char gender, String hometown, String email, String relationshipStatus)
    {
        this.gender = gender;
        this.hometown = hometown;
        this.email = email;
        this.relationshipStatus = relationshipStatus;
    }
    
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        if (gender != '\u0000')
        {
            if (gender == 'M')
            {
                sb.append("Mr.").append(" ");
            }
            else
            {
                sb.append("Ms.").append(" ");
            }
        }
        sb.append(firstName);
        sb.append(" ").append(lastName);
        if (birthdate != null)
        {
            sb.append(" ").append(this.getBirthdate());
        }
        if (hometown != null)
        {
            sb.append(" ").append(this.hometown);
        }
        if (email != null)
        {
            sb.append(" ").append(this.email);
        }
        if (relationshipStatus != null)
        {
            sb.append(" ").append(this.relationshipStatus);
        }
        sb.append(" ").append(this.getDateAdded());
                
        return sb.toString();
    }
            
    public int age()
    {
        int age = dateAdded.get(Calendar.YEAR) - birthdate.get(Calendar.YEAR);
        
        if (dateAdded.get(Calendar.MONTH) < birthdate.get(Calendar.MONTH) || 
                dateAdded.get(Calendar.MONTH) == birthdate.get(Calendar.MONTH)  )
        {
            age--;
        }
        
        if (dateAdded.get(Calendar.MONTH) == birthdate.get(Calendar.MONTH))
        {
            if (dateAdded.get(Calendar.DATE) > birthdate.get(Calendar.DATE) || 
                    dateAdded.get(Calendar.DATE) == birthdate.get(Calendar.DATE)  )
            {
                age++;
            }
        }
        return age;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the birthdate
     */
    public String getBirthdate() {
        if (birthdate == null) 
        {
            throw new NullPointerException("Birthdate is null");
        }
        else
        {
            return (String)(birthdate.get(GregorianCalendar.DATE) + "\\" +
                    (birthdate.get(GregorianCalendar.MONTH) + 1) + "\\" + 
                    birthdate.get(GregorianCalendar.YEAR));
        }
    }

    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(int day, int month, int year) {
        this.birthdate = new GregorianCalendar(year, month, day);
    }

    /**
     * @return the gender
     */
    public char getGender() {
        if (gender == ' ') 
        {
            throw new NullPointerException("Gender is null");
        }
        else
        {
            return gender;
        }
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
    }

    /**
     * @return the hometown
     */
    public String getHometown() {
        if (hometown == null) 
        {
            throw new NullPointerException("Hometown is null");
        }
        else
        {
            return hometown;
        }
    }

    /**
     * @param hometown the hometown to set
     */
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        if (email == null) 
        {
            throw new NullPointerException("email is null");
        }
        else
        {
            return email;
        }
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the relationshipStatus
     */
    public String getRelationshipStatus() {
        if (relationshipStatus == null) 
        {
            throw new NullPointerException("RelationShipStatus is null");
        }
        else
        {
            return relationshipStatus;
        }
    }

    /**
     * @param relationshipStatus the relationshipStatus to set
     */
    public void setRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
    }

    /**
     * @return the dateAdded
     */
    public String getDateAdded() {
        return (String)(dateAdded.get(GregorianCalendar.DATE) + "\\" + (dateAdded.get(GregorianCalendar.MONTH) + 1)
                + "\\" + dateAdded.get(GregorianCalendar.YEAR));
    }

    /**
     * @param dateAdded the dateAdded to set
     */
    public void setDateAdded(int day, int month, int year) {
        this.dateAdded = new GregorianCalendar(year, month, day);
    }
}
