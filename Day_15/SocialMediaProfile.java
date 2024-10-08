public class SocialMediaProfile {

    public void createProfile(String username, int age, String bio){
        System.out.println("Username: " + username);
        System.out.println("Age: " + age);
        System.out.println("Bio: " + bio);
    }

    public static void main(String[] args) {
        String username = "amirasid.b";
        int age = 20;
        String bio = "Dormant account. Pls reconsider to follow.";

        try {
            if (!username.isBlank())
            {
            System.out.println(username);
            }
        } catch ( IllegalArgumentException e) {
            System.out.println("Error message : " + e);
        }

        try {
            if (age > 13 && age <120){
                System.out.println("Valid input");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error message : " + e);
        }

        try {
            if (bio.trim().length() < 160) {
                System.out.println("Bio is ok");
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error message : " + e);
        }
       
    }
}
