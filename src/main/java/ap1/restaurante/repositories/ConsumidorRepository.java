package ap1.restaurante.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ap1.restaurante.models.Consumidor;

public interface ConsumidorRepository extends JpaRepository<Consumidor, Long> {

}

