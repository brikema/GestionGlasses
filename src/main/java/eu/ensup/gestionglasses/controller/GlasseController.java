package eu.ensup.gestionglasses.controller;

import eu.ensup.gestionglasses.dao.IGlasseDao;
import eu.ensup.gestionglasses.domain.Glasse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/glasses")
public class GlasseController {

    private IGlasseDao iGlasseDao;

    @Autowired
    public GlasseController(IGlasseDao IGlasseDao){
        this.iGlasseDao = IGlasseDao;
    }

    @RequestMapping(value = "/list", method= RequestMethod.GET)
    public String listOfGlasses(Model model){
        List<Glasse> listGlasses = iGlasseDao.findAll();
        model.addAttribute("listGlasses", listGlasses);
        return "list";
    }
}
