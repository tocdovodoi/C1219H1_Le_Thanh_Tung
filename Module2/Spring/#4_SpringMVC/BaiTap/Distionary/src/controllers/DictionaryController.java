package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String greeting(){
       return "index";
    }

    @RequestMapping(value = "/dictionary", method = RequestMethod.POST)
    public String search(@RequestParam("name") String name, Model model) {
         Map<String, String> dic = new HashMap<>();
        dic.put("hello","Xin chào");
        dic.put("book","Vở");
        dic.put("computer","Máy tính");
        dic.put("mouse","Chuột");
        dic.put("class","Lớp");
        dic.put("room","Phòng");
        String word = dic.get(name);
        if (word == null){
            model.addAttribute("word","Not Found");
        }else {
            model.addAttribute("name",name);
            model.addAttribute("word", word);
        }
        return "index";
    }
}
