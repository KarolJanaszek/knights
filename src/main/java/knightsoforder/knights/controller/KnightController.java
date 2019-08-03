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


    //zakładki
    @GetMapping("/mission/{id}")
    public String knightMission(@PathVariable Integer id, ModelMap map){
        map.put("knight",knightRepository.findById(id).get());
        return "mission";
    }

    @GetMapping("/mission/mission10/{id}")
    public String knightMission10(@PathVariable Integer id, ModelMap map){
        map.put("knight",knightRepository.findById(id).get());
        return "mission10";
    }

    @GetMapping("/mission/mission20/{id}")
    public String knightMission20(@PathVariable Integer id, ModelMap map){
        map.put("knight",knightRepository.findById(id).get());
        return "mission10";
    }


    //praca
    @GetMapping("/work/{id}")
    public String knightWork(@PathVariable Integer id, ModelMap map){
        map.put("knight",knightRepository.findById(id).get());
        return "work";
    }


    //ranking
    @GetMapping("/knightRank/{id}")
    public String knightKnightRank(@PathVariable Integer id, ModelMap map){
        map.put("knight",knightRepository.findById(id).get());
        map.put("knights",knightRepository.sortKnightsByName());
        return "knightRank";
    }



}
