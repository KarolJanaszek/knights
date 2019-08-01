package knightsoforder.knights.controller;

import knightsoforder.knights.model.Knight;
import knightsoforder.knights.repository.KnightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class KnightController {

    @Autowired
    private KnightRepository knightRepository;

    @GetMapping("/create")
    public String addNewKnight(ModelMap map){
        map.put("newKnight", new Knight());
        return "create";
    }

    @GetMapping("/done")
    public String create(@ModelAttribute Knight knight,ModelMap map){
        knightRepository.saveDefault(knight);
        map.put("knight",knight);
        return "done";
    }

    @GetMapping("/knight/{id}")
    public String knightHome(@PathVariable Integer id, ModelMap map){
        map.put("knight",knightRepository.findById(id).get());
        return "knight";
    }






}
