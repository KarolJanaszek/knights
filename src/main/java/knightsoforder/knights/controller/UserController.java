package knightsoforder.knights.controller;

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
    public String registeration(ModelMap map){
        map.put("new_user",new User());
        return "registration";
    }

    @PostMapping("/create_knight")
    public String create(@ModelAttribute User user){
        userRepository.save(user);
        return "create_knight";
    }
}
