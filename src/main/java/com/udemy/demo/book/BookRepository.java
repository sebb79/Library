package com.udemy.demo.book;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//Permet de faire des action sur la base de données
public interface BookRepository extends CrudRepository<Book, Integer> {
//Permet de requeter la table Book

    // Requete spécifique a notre besoin
    List<Book> findByStatusAndUserIdNotAndDeleteFalse(BookStatus status, Integer userId);
    List<Book>findByUserIdAndDeleteFalse(Integer id);
}
