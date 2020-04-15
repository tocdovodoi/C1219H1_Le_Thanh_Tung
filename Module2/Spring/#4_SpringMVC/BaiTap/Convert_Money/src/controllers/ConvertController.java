package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/convert")
    public String convert(@RequestParam float usd, Model modle) {
        modle.addAttribute("usd", usd);
        return "index";
    }
}
