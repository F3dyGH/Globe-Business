package tn.globebusiness.spring.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.globebusiness.spring.Entities.Travel;
@Repository
public interface TravelRepository extends CrudRepository<Travel,Long> {
	@Query("select t from Travel t join FeedBack f on(t.id=f.idF) order by sum(f.rating)")
	List<Travel> trierTravelByFeedBacks();
}
