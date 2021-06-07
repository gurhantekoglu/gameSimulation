package concrete;

import java.rmi.RemoteException;

import abstracts.UserCheckService;
import abstracts.UserService;
import entities.User;

public class UserManager implements UserService {

	UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User user) throws RemoteException {
		if (userCheckService.checkIfRealPerson(user)) {
			System.out.println(user.getFirstName() + " " + user.getLastName() + " registered.");
		} else {
			System.out.println("Not a valid person");
		}
	}

	@Override
	public void update(User user) {
		System.out.println("User information has been updated.");

	}

	@Override
	public void delete(User user) {
		System.out.println("User record has been deleted.");

	}

}
