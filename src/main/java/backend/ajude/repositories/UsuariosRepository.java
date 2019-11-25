package backend.ajude.repositories;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backend.ajude.entidades.Usuario;

@Repository
public interface UsuariosRepository<T, ID extends Serializable> extends JpaRepository<Usuario, String> {

	//@Query()
	Optional<Usuario> findByEmail(String email);
}