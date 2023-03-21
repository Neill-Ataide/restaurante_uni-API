package ap1.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ap1.restaurante.models.Refeicao;

public interface RefeicaoRepository extends JpaRepository<Refeicao, Long> {

}

