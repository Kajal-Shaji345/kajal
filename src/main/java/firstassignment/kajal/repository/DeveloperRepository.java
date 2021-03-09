package firstassignment.kajal.repository;

import firstassignment.kajal.model.Developers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface DeveloperRepository extends JpaRepository<Developers,Long> {

}
