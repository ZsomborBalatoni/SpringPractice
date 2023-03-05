package g2z.springframework.SpringPractice.repositories;

import g2z.springframework.SpringPractice.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
