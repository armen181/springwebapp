package net.ddns.armen181.springwebapp.repositoies;

import net.ddns.armen181.springwebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
