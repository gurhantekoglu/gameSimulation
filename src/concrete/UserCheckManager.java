package concrete;

import java.rmi.RemoteException;

import abstracts.UserCheckService;
import entities.User;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) throws RemoteException {
		return true;

	}

}
