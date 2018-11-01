package tobythewaiter.food.repos;

import org.springframework.data.repository.CrudRepository;
import tobythewaiter.food.model.Market;

public interface MarketRepository extends CrudRepository<Market, Integer> {
}
