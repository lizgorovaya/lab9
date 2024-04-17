package repositories;

import models.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorsRepository extends JpaRepository<Authors,Long > {
    List<Authors> findByName(String title);
}
