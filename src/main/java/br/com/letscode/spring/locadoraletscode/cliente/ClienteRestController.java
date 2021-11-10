package br.com.letscode.spring.locadoraletscode.cliente;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

    private ClienteRepository repository;

    public ClienteRestController(ClienteRepository clienteRepository){
        this.repository = clienteRepository;

    }

    //listar todos
    @GetMapping
    public List<Cliente> listaClientes(){
        return repository.findAll();
    }

    //listar por Id
    @GetMapping("/{id}")
    public Optional<Cliente> listaClientePorId (@PathVariable(value="id") long id){
        return repository.findById(id);
    }

    //cadastrar
    @PostMapping("/salvar")
    public Cliente cadastraCliente(@RequestBody @Valid Cliente cliente) {
        return repository.save(cliente);
    }



    //inserir um dado em cadastro já existente
    @PutMapping("/{id}")
    public Cliente cadastraDadoCliente(@RequestBody Cliente cliente, @PathVariable(value="id") long id) {
        cliente.setId(id);
        return repository.save(cliente);
    }

    //deletar cadastro
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletaClientePorId(@PathVariable(value="id") long id) {
        return repository.findById(id)
                .map(record -> {
                    repository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

    //mensagem erro
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



