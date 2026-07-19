package ac.rs.singidunum.itws.repo;

import ac.rs.singidunum.itws.entity.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Integer> {
}
