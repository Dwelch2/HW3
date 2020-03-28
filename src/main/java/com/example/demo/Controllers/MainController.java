package com.example.demo.Controllers;

import com.example.demo.Model.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
    @Autowired
    InventoryRepo inventoryRepo;

    public MainController() {
    }

    @RequestMapping({"/"})
    public ModelAndView doHome() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("inventorylist", this.inventoryRepo.findAll());
        return mv;
    }
}
