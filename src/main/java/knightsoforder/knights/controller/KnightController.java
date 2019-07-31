package knightsoforder.knights.controller;

import knightsoforder.knights.model.Knight;
import knightsoforder.knights.model.User;
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

    @GetMapping("/create_knight")
    public String addNewKnight(ModelMap map){
        map.put("new_knight", new Knight());
        return "create_knight";
    }

    @GetMapping("/knight")
    public String knightHome(){
        return "knight";
    }

    @GetMapping("/knight_created")
    public String create(@ModelAttribute Knight knight){
        knightRepository.save(knight);
        return "created";
    }





}
