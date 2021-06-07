package abstracts;

import java.rmi.RemoteException;

import entities.User;

public interface UserService {
	void add(User user) throws RemoteException;

	void update(User user);

	void delete(User user);
}
