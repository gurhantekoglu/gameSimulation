package abstracts;

import entities.Campaign;
import entities.Game;
import entities.User;

public interface SaleService {
	void sale(Game game, User user);

	void saleWithCampaign(Game game, Campaign campaign);
}
