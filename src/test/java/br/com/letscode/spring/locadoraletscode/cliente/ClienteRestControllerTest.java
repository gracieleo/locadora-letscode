package br.com.letscode.spring.locadoraletscode.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.httpBasic;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@SpringBootTest
@AutoConfigureMockMvc

public class ClienteRestControllerTest {

    @Autowired
    MockMvc mockMvc;

    //usuário e senha corretos
    @Test
    void listarTodos_ok() throws Exception {

     mockMvc.perform(
              get("/clientes")
                     .with(httpBasic("user", "password"))
       ).andExpect(status().isOk());
   }


    //usuário e|ou senha incorretos
    @Test
    void listarTodos_falha() throws Exception {

        mockMvc.perform(
                get("/clientes")
                        .with(httpBasic("user", "password1"))
        ).andExpect(status().isOk());
    }


    //toda lista
    @WithMockUser
    @Test
    void listarTodos() throws Exception {
        mockMvc.perform(get("/clientes"))
                .andExpect(status().isOk());
    }


}
