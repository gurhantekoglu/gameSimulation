package adapters;

import java.rmi.RemoteException;

import abstracts.UserCheckService;
import entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) throws RemoteException {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		return client.TCKimlikNoDogrula(Long.parseLong(user.getNationalityId()), user.getFirstName(),
				user.getLastName(), user.getYearOfBirth());
	}

}
