package com.crytek.crysis.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crytek.crysis.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{
    
    Author findById(long id);

    List<Author> findAll();

}
