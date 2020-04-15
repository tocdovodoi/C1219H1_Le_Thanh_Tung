package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/dictionary")
    public String greeting(){
       return "index";
    }

    @PostMapping("/dictionary")
    public String search(String search) {
        Map<String, String> dic = new HashMap<>();
        dic.put("hello","Xin chào");
        dic.put("book","Vở");
        dic.put("computer","Máy tính");
        dic.put("mouse","Chuột");
        dic.put("class","Lớp");
        dic.put("room","Phòng");
    }
}
