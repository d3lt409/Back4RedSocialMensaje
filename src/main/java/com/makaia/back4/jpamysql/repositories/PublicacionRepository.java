package com.makaia.back4.jpamysql.repositories;

import com.makaia.back4.jpamysql.entities.Publicacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicacionRepository extends CrudRepository<Publicacion, Long> {
}
