package com.udemy.demo.borrow;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BorrowRepository extends CrudRepository<Borrow, Integer> {

    //Afficher les emprunt de l'utilisateur connecter
    List<Borrow>findByBorrowerId(Integer borrowerid);
    List<Borrow>findByBookId(Integer borrowerid);


}
