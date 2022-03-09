package tn.globebusiness.spring.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.globebusiness.spring.Entities.Travel;
@Repository
public interface TravelRepository extends CrudRepository<Travel,Long> {
	/*@Query("select t,sum(f.rating) as r from Travel t inner join t.feedBacks f where(t.id=f.travel) order by r")
	List<Travel> trierTravelByFeedBacks();*/
}
