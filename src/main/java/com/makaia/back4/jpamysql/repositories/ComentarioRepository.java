package com.makaia.back4.jpamysql.repositories;

import com.makaia.back4.jpamysql.entities.Comentario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends CrudRepository<Comentario, Long> {
}
