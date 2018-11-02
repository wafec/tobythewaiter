package tobythewaiter.toy.client;

import tobythewaiter.bone.viewmodel.MarketCreate;
import tobythewaiter.bone.viewmodel.MarketView;

public class MarketClient extends BaseClient<MarketCreate, MarketView, MarketView> {
    public MarketClient(String url) {
        super(url, MarketView.class, MarketView.class);
    }

    public static void main(String[] args) {
        MarketClient client = new MarketClient("http://localhost:8080/market/");
        MarketCreate marketCreate = new MarketCreate();
        MarketView marketView = client.get(2);
        System.out.println(marketView.toString());
    }
}
