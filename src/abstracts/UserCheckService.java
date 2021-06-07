package abstracts;

import java.rmi.RemoteException;

import entities.User;

public interface UserCheckService {
	boolean checkIfRealPerson(User user) throws RemoteException;
}
