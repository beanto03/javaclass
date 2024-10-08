public class Exercise4 {

    public static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean hasPermission = false;
        if (!isLoggedIn || !hasPermission) {
            System.out.println("Cannot login because no permission.");
        } else {
            System.out.println("Can proceed to login");
        }
    }

}
