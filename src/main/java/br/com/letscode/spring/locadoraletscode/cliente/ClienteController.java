package br.com.letscode.spring.locadoraletscode.cliente;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/clientes")    //http://localhost:8080/clientes
public class ClienteController {

    private ClienteRepository repository;

    public ClienteController(ClienteRepository clienteRepository){
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

    //atualização de um dado
    @PostMapping
    public Cliente atualizaCliente(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }

    //inserir um dado
    @PutMapping
    public Cliente cadastraCliente(@RequestBody Cliente cliente) {
        return repository.save(cliente);
    }


    //inserir um dado em cadastro já existente
    @PutMapping("/{id}")
    public Cliente cadastraClientePorId(@RequestBody Cliente cliente, @PathVariable(value="id") long id) {
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

}




