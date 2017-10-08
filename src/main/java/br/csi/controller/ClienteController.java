package br.csi.controller;
import java.net.URI;
import java.util.ArrayList;

import br.csi.model.Cliente;
import br.csi.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

/**
 *
 * @author alencarmachado
 */
@RestController
@RequestMapping(value = "/cliente")
public class ClienteController {

    private static final ClienteService service = new ClienteService();

    /*@RequestMapping(value = "atualizalatlng", method = RequestMethod.POST)
    public ResponseEntity<?> autalizaCoordenadas(@RequestBody Cliente cliente) throws Exception{
        if (service.autalizaCoordenadas(cliente)){
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.unprocessableEntity().build();
        }
    }*/
/*

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> inserir(@RequestBody Cliente cliente) throws Exception{

        System.out.println("nome: "+cliente.getNome());
        System.out.println("numero: "+cliente.getNumero());


        service.inserir(cliente);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(String.valueOf(cliente.getId())).buildAndExpand(cliente.getId()).toUri();
        System.out.println("location : "+location.getPath());

        return ResponseEntity.created(location).build();
    }

    @RequestMapping(value = "clientes", method = RequestMethod.GET)
    public ArrayList<Cliente> getClientes() throws Exception{
        System.out.println("Vai retornar os clientes");
        return service.getClientes();
    }
*/

}