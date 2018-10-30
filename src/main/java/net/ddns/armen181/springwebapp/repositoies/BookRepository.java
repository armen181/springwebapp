package net.ddns.armen181.springwebapp.repositoies;

import net.ddns.armen181.springwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
