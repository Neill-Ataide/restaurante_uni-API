package ap1.restaurante.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ap1.restaurante.models.Consumidor;
import ap1.restaurante.repositories.ConsumidorRepository;

@Service
public class ConsumidorService {

	@Autowired
	private ConsumidorRepository consumidorRepository;

	public Consumidor criar(Consumidor consumidor) {
		return consumidorRepository.save(consumidor);
	}

	public List<Consumidor> listar() {
		return consumidorRepository.findAll();
	}

	public void deletar(Long codigo) {
		consumidorRepository.deleteById(codigo);
	}

	public Consumidor buscarPorId(Long codigo) {
		Consumidor consumidor = consumidorRepository.findById(codigo).orElseThrow();
		return consumidor;
	}

	public Consumidor atualizar(Long codigo, Consumidor consumidor) {
		Consumidor consumidorSalva = consumidorRepository.findById(codigo).orElseThrow();
		BeanUtils.copyProperties(consumidor, consumidorSalva, "codigo");
		return consumidorRepository.save(consumidorSalva);
	}
}