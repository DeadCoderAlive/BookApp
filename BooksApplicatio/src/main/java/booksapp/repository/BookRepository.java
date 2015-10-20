package booksapp.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import booksapp.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,String> {

}
