package ro.ase.csie.cts.g1094.dp.facade;

public class UserAccount {
public void login(String username, String pass) {
	System.out.println("Checking credintials...");
}

public UserProfile downloadUserProfile() {
	return new UserProfile();
}

}
