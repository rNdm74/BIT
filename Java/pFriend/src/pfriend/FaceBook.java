/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pfriend;

/**
 *
 * @author Dave
 */
public class FaceBook {
    
    private Friend[] fbFriends;
    
    private String firstName;
    private String surname;
    
    private int maxFriends;
    private int totalFriends;
    
    public FaceBook(String firstName, String surname, int maxFriends)
    {
        this.firstName = firstName;
        this.surname = surname;
        fbFriends = new Friend[maxFriends];
        this.maxFriends = maxFriends;
        this.totalFriends = 0;
    }
    
    public void addFriend(Friend friend)
    {
        if (totalFriends != maxFriends)
        {
            fbFriends[totalFriends] = friend;
            totalFriends++;
        }
    }
    
    public String friendData()
    {
        StringBuilder sb = new StringBuilder();
        
        if (totalFriends == 0)
        {
            sb.append("You have no friends.");
        }
        else
        {
            for (int i = 0; i < totalFriends; i++)
            {
                sb.append(fbFriends[i].toString()).append("\n");
            }
        }
        return sb.toString();
    }
    
    
    public int getTotalFriends()
    {      
        return totalFriends;    
    }
    
    public int getMaxFriends()
    {      
        return maxFriends;    
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public String friendsAgedLessThan21()
    {
        StringBuilder sb = new StringBuilder();
        
        if (totalFriends == 0)
        {
            sb.append("You have no friends.");
        }
        else
        {
            for (int i = 0; i < totalFriends; i++)
            {
                if (fbFriends[i].age() < 21)
                {
                    sb.append(fbFriends[i].getFirstName());
                    sb.append(" ");
                    sb.append(fbFriends[i].getLastName());
                    sb.append("\n");
                }                    
            }
        }
        return sb.toString();
    }
    
}
