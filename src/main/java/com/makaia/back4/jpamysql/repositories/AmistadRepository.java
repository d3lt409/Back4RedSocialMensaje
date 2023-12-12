package com.makaia.back4.jpamysql.repositories;

import com.makaia.back4.jpamysql.entities.Amistad;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmistadRepository extends CrudRepository<Amistad, Long> {
}
