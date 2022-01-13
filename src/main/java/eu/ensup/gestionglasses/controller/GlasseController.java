package eu.ensup.gestionglasses.controller;

import eu.ensup.gestionglasses.dao.IGlasseDao;
import eu.ensup.gestionglasses.domain.Glasse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/new")
    public String viewGlasses(Model model) {
        model.addAttribute("glasse", new Glasse());
        return "new";
    }

    @PostMapping("/glasses/save")
    public String saveGlasses(@ModelAttribute Glasse glasse) {
        iGlasseDao.save(glasse);
        return "redirect:/glasses/list";
    }

    @RequestMapping(value = "/{id}", method= RequestMethod.GET)
    public String getGlasses(Model model, @PathVariable("id") Integer id) {
        Glasse glasses = iGlasseDao.getById(id);
        model.addAttribute("theGlasses", glasses);
        return "glasses";
    }

    @RequestMapping("/delete/{id}")
    public String deleteGlasses(@PathVariable(name = "id") Integer id) {
        iGlasseDao.deleteById(id);
        return "redirect:/glasses/list";
    }

}
