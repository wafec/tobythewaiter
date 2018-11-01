package tobythewaiter.food.services;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tobythewaiter.food.model.Market;
import tobythewaiter.food.repos.MarketRepository;
import tobythewaiter.food.viewmodel.MarketCreate;
import tobythewaiter.food.viewmodel.MarketView;

import java.util.Optional;

@RestController
@RequestMapping("/market")
public class MarketController {
    @Autowired
    private MarketRepository marketRepository;
    @Autowired
    Mapper mapper;

    @GetMapping("/{id}")
    public Market get(@PathVariable Integer id) {
        Optional<Market> marketSearch = marketRepository.findById(id);
        return marketSearch.get();
    }

    @PostMapping("/")
    public MarketView post(@RequestBody MarketCreate newMarket) {
        Market market = mapper.map(newMarket, Market.class);
        market = marketRepository.save(market);
        return mapper.map(market, MarketView.class);
    }
}
