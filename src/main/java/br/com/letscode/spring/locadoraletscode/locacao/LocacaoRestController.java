package br.com.letscode.spring.locadoraletscode.locacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/locacao")

public class LocacaoRestController {

    @Autowired
    private LocacaoRepository repository;


    public LocacaoRestController(LocacaoRepository locacaoRepository) {
        this.repository = locacaoRepository;
    }


    @GetMapping()
    public List<Locacao> listaLocacoes() {
        return repository.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Locacao> listaLocacaoPorId(@PathVariable(value = "id") long id) {
        return repository.findById(id);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Locacao salvarLocacao(@Valid @RequestBody Locacao locacao) {
        return repository.save(locacao);
    }

}

