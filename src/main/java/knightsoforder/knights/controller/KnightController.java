package knightsoforder.knights.controller;

import knightsoforder.knights.model.Knight;
import knightsoforder.knights.repository.KnightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class KnightController {

    @Autowired
    private KnightRepository knightRepository;

    @GetMapping("/createknight")
    public String addNewKnight(ModelMap map){
        map.put("new_knight", new Knight());
        return "/createknight";
    }

    @GetMapping("/knight")
    public String knightHome(){
        return "knight";
    }

    @GetMapping("/knightcreated")
    public String create(@ModelAttribute Knight knight){
        knightRepository.saveDefault(knight);
        return "created";
    }





}
