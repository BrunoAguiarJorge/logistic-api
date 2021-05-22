package aguiar.bruno.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import aguiar.bruno.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

	List<Client> findByNome(String nome);
	List<Client> findByNomeContaining(String nome);
	Optional<Client> findByEmail(String email);
}
