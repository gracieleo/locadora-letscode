package br.com.letscode.spring.locadoraletscode.filme;


import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("/filmes")

public class FilmeRestController {

    private FilmeRepository repository;

    public FilmeRestController(FilmeRepository filmeRepository){
        this.repository = filmeRepository;
    }


    @GetMapping
    public List<Filme> listaFilmes(){
        return repository.findAll();
    }


    @GetMapping("/{codigoFilme}")
    public Optional<Filme> listaFilmePorId (@PathVariable(value="codigoFilme") Integer codigoFilme){
        return repository.findById(codigoFilme);
    }


    @GetMapping("/{categoria}")
    public List<Filme> listaFilmePorGenero (){
        return repository.findAll();
    }


    @PostMapping("/salvar")
    public Filme inserirFilme(@RequestBody @Valid Filme filme) {
        return repository.save(filme);
    }


    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> handleValidationException(MethodArgumentNotValidException ex){
        Map<String,String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((error)->{
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName,errorMessage);
        });

        return errors;

    }

}
