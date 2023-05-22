package be.ehb.jfcafemenu.controller;


import be.ehb.jfcafemenu.dao.DrinkDao;
import be.ehb.jfcafemenu.dao.TastingDAO;
import be.ehb.jfcafemenu.entities.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;

@Controller
public class DrinkController {

    private DrinkDao mDrinkDao;
    private TastingDAO mTastingDAO;

    @Autowired
    public DrinkController(DrinkDao mDrinkDao, TastingDAO mTastingDAO) {
        this.mDrinkDao = mDrinkDao;
        this.mTastingDAO = mTastingDAO;
    }

    @ModelAttribute("drinks")
    public Iterable<Drink> getAllDrinks(){
        return mDrinkDao.findAll();
    }

    @GetMapping({"/", "/index"})
    public String showIndex(ModelMap modelMap){
        //modelMap.put("drinks", mDrinkDao.findAll());
        return "index";
    }

    @GetMapping("/about")
    public String showAbout(){
        return "about";
    }
}
