package com.makaia.back4.jpamysql.repositories;

import com.makaia.back4.jpamysql.entities.Mensaje;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRepository extends CrudRepository<Mensaje, Long> {
}
