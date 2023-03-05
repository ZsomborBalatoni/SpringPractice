package g2z.springframework.SpringPractice.repositories;

import g2z.springframework.SpringPractice.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
