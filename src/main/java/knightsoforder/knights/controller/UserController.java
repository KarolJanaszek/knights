package knightsoforder.knights.controller;

import knightsoforder.knights.model.Knight;
import knightsoforder.knights.model.User;
import knightsoforder.knights.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home (){
        return "logsite";
    }

    @GetMapping("/registration")
    public String registeration(ModelMap map){
        User user = new User();
        map.put("newUser", user);
        return "registration";
    }

    @GetMapping("/create")
    public String createUser(@ModelAttribute User user, ModelMap map){
        userRepository.save(user);
        Knight knight = new Knight();
        knight.setUser(user);
        map.put("knight", knight);
        map.put("myUser", user);
        return "create";
    }
}
