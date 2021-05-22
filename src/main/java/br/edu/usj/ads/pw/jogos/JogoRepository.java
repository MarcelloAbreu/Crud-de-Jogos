package br.edu.usj.ads.pw.jogos;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
  
public interface JogoRepository extends CrudRepository<Jogos, Long> {
        List<Jogos> findAll();
}