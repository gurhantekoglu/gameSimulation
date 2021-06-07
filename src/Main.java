import java.rmi.RemoteException;

import adapters.MernisCheckAdapter;
import concrete.CampaignManager;
import concrete.GameManager;
import concrete.SaleManager;
import concrete.UserManager;
import entities.Campaign;
import entities.Game;
import entities.User;

public class Main {

	public static void main(String[] args) throws RemoteException {
		User user = new User(1, "Gürhan", "Tekoðlu", 2000, "12345678901");

		Game game = new Game(1, "Call of Duty: Modern Warfare", 200.00);

		Campaign campaign = new Campaign(1, "Summer Sale", 15);

		UserManager userManager = new UserManager(new MernisCheckAdapter());
		userManager.add(user);

		System.out.println("\n");

		GameManager gameManager = new GameManager();
		gameManager.add(game);

		System.out.println("\n");

		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign);

		System.out.println("\n");

		SaleManager saleManager = new SaleManager(new CampaignManager());
		saleManager.sale(game, user);
		saleManager.saleWithCampaign(game, campaign);

	}

}
