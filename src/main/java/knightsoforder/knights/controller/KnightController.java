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
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KnightController {

    @Autowired
    private KnightRepository knightRepository;

    //page before knight home
    @GetMapping("/done")
    public String create(@ModelAttribute Knight knight, ModelMap map) {
        knightRepository.saveDefault(knight);
        map.put("knight", knight);
        return "done";
    }

    //knight main page
    @GetMapping("/knight/{id}")
    public String knightHome(@PathVariable Integer id, ModelMap map) {
        map.put("knight", knightRepository.findById(id).get());
        return "knight";
    }


    //missions
    @GetMapping("/mission/{id}")
    public String knightMission(@PathVariable Integer id, ModelMap map) {
        map.put("knight", knightRepository.findById(id).get());
        return "mission";
    }

    @GetMapping("/mission10/{id}")
    public String knightMission10(@PathVariable Integer id, ModelMap map) {
        map.put("knight", knightRepository.findById(id).get());
        return "mission10";
    }

    @GetMapping("/mission20/{id}")
    public String knightMission20(@PathVariable Integer id, ModelMap map) {
        map.put("knight", knightRepository.findById(id).get());
        return "mission20";
    }

    @GetMapping("/mission30/{id}")
    public String knightMission30(@PathVariable Integer id, ModelMap map) {
        map.put("knight", knightRepository.findById(id).get());
        return "mission30";
    }


    //work
    @GetMapping("/work/{id}")
    public String knightWork(@PathVariable Integer id, ModelMap map) {
        map.put("knight", knightRepository.findById(id).get());
        return "work";
    }

    @GetMapping("/work1/{id}")
    public String knightWork1(@PathVariable Integer id, ModelMap map) {
        map.put("knight", knightRepository.findById(id).get());
        return "work1";
    }

    @GetMapping("/work2/{id}")
    public String knightWork2(@PathVariable Integer id, ModelMap map) {
        map.put("knight", knightRepository.findById(id).get());
        return "work2";
    }


    //rank
    @GetMapping("/knightRank/{id}")
    public String knightKnightRank(@PathVariable Integer id, ModelMap map) {
        map.put("knight", knightRepository.findById(id).get());
        map.put("findedKnights", knightRepository.sortKnightsByName());
        return "knightRank";
    }

    //search
    @GetMapping("/knightRank/search/{id}")
    public String findKnight(@PathVariable Integer id, @RequestParam String name, ModelMap redirectAtribute){
        redirectAtribute.put("knight", knightRepository.findById(id).get());
        redirectAtribute.addAttribute("findedKnights",knightRepository.findKnightByName(name));


        if(knightRepository.findKnightByName(name).size()>0)
            redirectAtribute.addAttribute("message", "Znaleziony rycerza:");
        else
            redirectAtribute.addAttribute("message", "Nie znaleziono rycerza o tym imieniu.");

        return "knightRank";
    }


//    //Knight show
//    @GetMapping("/showKnight/{id)/{showId}")
//    public String showKnight(@PathVariable Integer id, @PathVariable Integer showId, ModelMap map) {
//        map.put("knight", knightRepository.findById(id).get());
//
//        return "showKnight";
//    }
}
