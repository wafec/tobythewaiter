package tobythewaiter.food.services;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tobythewaiter.bone.viewmodel.MarketCreate;
import tobythewaiter.bone.viewmodel.MarketView;
import tobythewaiter.food.model.Market;
import tobythewaiter.food.repos.MarketRepository;

import java.util.Optional;

@RestController
@RequestMapping("/market")
public class MarketController {
    private static final Logger LOGGER = LogManager.getLogger(MarketController.class);
    @Autowired
    private MarketRepository marketRepository;
    @Autowired
    Mapper mapper;

    @GetMapping("/{id}")
    public MarketView get(@PathVariable Integer id) {
        LOGGER.debug("GET SEARCH: " + id);
        Optional<Market> marketSearch = marketRepository.findById(id);
        MarketView marketView = mapper.map(marketSearch.get(), MarketView.class);
        LOGGER.debug("GET RESULT: " + marketView.toString());
        return marketView;
    }

    @PostMapping("/")
    public MarketView post(@RequestBody MarketCreate newMarket) {
        LOGGER.debug("POST: " + newMarket.toString());
        Market market = mapper.map(newMarket, Market.class);
        market = marketRepository.save(market);

        MarketView marketView = mapper.map(market, MarketView.class);
        LOGGER.debug("SAVED: " + marketView.toString());
        return marketView;
    }
}
