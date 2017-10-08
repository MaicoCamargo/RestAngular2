package br.csi.controller;

import br.csi.model.Atividade;
import br.csi.model.Tarefa;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
/*@RequestMapping(value = "tarefa")*/
public class TarefaController {

    @RequestMapping(value = "tarefa",method = RequestMethod.GET)
    public ArrayList<Tarefa> getTarefas() {
        ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
        Atividade eng1 = new Atividade(1, "engen A");
        Atividade eng2 = new Atividade(2, "enge B");
        Atividade padproj = new Atividade(3, "padproj");
        Atividade pp = new Atividade(4, "pp");
        Tarefa t1 = new Tarefa(1, "at", true, eng1);
        Tarefa t2 = new Tarefa(2, "at2", false, eng2);
        Tarefa t3 = new Tarefa(3, "at3", true, padproj);
        tarefas.add(t1);
        tarefas.add(t2);
        tarefas.add(t3);
        System.out.println("array com as tarefas");
        return tarefas;
    }

}
