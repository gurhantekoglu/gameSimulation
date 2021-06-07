package concrete;

import abstracts.CampaignService;
import abstracts.SaleService;
import entities.Campaign;
import entities.Game;
import entities.User;

public class SaleManager implements SaleService {

	CampaignService campaignService;

	public SaleManager(CampaignService campaignService) {
		this.campaignService = campaignService;
	}

	@Override
	public void sale(Game game, User user) {
		System.out.println(
				game.getName() + " game has been bought by " + user.getFirstName() + " " + user.getLastName() + ".");

	}

	@Override
	public void saleWithCampaign(Game game, Campaign campaign) {
		System.out.println(game.getName() + " game has been bought with the " + campaign.getName() + " campaign and %"
				+ campaign.getDiscountRate() + " discount applied.");

	}

}
