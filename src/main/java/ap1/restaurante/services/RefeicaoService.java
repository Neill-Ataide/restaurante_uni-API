package ap1.restaurante.services;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ap1.restaurante.models.Refeicao;
import ap1.restaurante.repositories.RefeicaoRepository;

@Service
public class RefeicaoService {

	@Autowired
	private RefeicaoRepository refeicaoRepository;

	public Refeicao criar(Refeicao refeicao) {
		return refeicaoRepository.save(refeicao);
	}

	public List<Refeicao> listar() {
		return refeicaoRepository.findAll();
	}

	public void deletar(Long codigo) {
		refeicaoRepository.deleteById(codigo);
	}

	public Refeicao buscarPorId(Long codigo) {
		Refeicao refeicao = refeicaoRepository.findById(codigo).orElseThrow();
		return refeicao;
	}

	public Refeicao atualizar(Long codigo, Refeicao refeicao) {
		Refeicao refeicaoSalva = refeicaoRepository.findById(codigo).orElseThrow();
		BeanUtils.copyProperties(refeicao, refeicaoSalva, "codigo");
		return refeicaoRepository.save(refeicaoSalva);
	}
}