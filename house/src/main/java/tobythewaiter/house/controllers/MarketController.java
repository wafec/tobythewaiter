package tobythewaiter.house.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tobythewaiter.house.model.MarketCreateForm;

@Controller
@RequestMapping("/market")
public class MarketController {
    @GetMapping("/index")
    public String index() {
        return "views/market/index";
    }

    @GetMapping("/details/{id}")
    public String details(@PathVariable Integer id, Model model) {
        return "views/market/details";
    }

    @GetMapping("/create")
    public String create() {
        return "views/market/create";
    }

    @PostMapping("/create")
    public String create(@RequestBody MarketCreateForm marketCreateForm) {
        return "redirect:/index";
    }
}
