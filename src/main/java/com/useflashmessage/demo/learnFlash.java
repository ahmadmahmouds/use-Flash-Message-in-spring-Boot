package com.useflashmessage.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class learnFlash {
    @RequestMapping("/")
    public String index(){
        return"index.jsp";
    }


    @RequestMapping(value="/check" ,method= RequestMethod.POST)
    public String checkCode(@RequestParam(value = "code") String code, RedirectAttributes e){
        if(code.equals("bushido")){
            return "allname.jsp";
        }
        else{
            e.addFlashAttribute("error","You must Train harder");
            return "redirect:/";

        }




    }


}
