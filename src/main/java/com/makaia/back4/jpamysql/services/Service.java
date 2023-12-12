package com.makaia.back4.jpamysql.services;

import com.makaia.back4.jpamysql.dtos.CrearDTO;
import com.makaia.back4.jpamysql.entities.Mensaje;
import com.makaia.back4.jpamysql.entities.Usuario;
import com.makaia.back4.jpamysql.exceptions.RedSocialApiException;
import com.makaia.back4.jpamysql.publisher.Publisher;
import com.makaia.back4.jpamysql.repositories.MensajeRepository;
import com.makaia.back4.jpamysql.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.StreamSupport;

@org.springframework.stereotype.Service
public class Service {

    MensajeRepository repository;
    UsuarioRepository usuarioRepository;

    @Autowired
    Publisher publisher;

    @Autowired
    public Service(MensajeRepository repository, UsuarioRepository usuarioRepository) {
        this.repository = repository;
        this.usuarioRepository = usuarioRepository;
    }

    public Mensaje crear(CrearDTO dto) {
        Usuario emisor = this.usuarioRepository
                .findById(dto.getEmisor_id())
                .orElseThrow(
                        () -> new RedSocialApiException("El usuario no existe y no puede enviar mensajes"));
        Usuario receptor = this.usuarioRepository
                .findById(dto.getReceptor_id())
                .orElseThrow(
                        () -> new RedSocialApiException("El usuario no existe y no puede recibir mensaje"));
        Mensaje nuevoMensaje = new Mensaje(dto.getContenido(),dto.getFechaEnvio(),emisor, receptor);
        publisher.send(emisor.getId(), receptor.getId());
        return this.repository.save(nuevoMensaje);
    }

    public List<Mensaje> listar() {
        return StreamSupport
                .stream(this.repository.findAll().spliterator(), false)
                .toList();
    }
}
