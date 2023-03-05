package g2z.springframework.SpringPractice.repositories;

import g2z.springframework.SpringPractice.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
