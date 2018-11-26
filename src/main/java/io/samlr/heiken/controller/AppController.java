package io.samlr.heiken.controller;

import io.samlr.heiken.entity.Computer;
import io.samlr.heiken.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class AppController {

    @Autowired
    ComputerService computerService;

    @RequestMapping("/")
    public String getHelloPage() {

        return "helloPage";
    }

    @RequestMapping("/adminpage")
    public String getAdminPage() {

        return "adminPage";
    }

    @RequestMapping("/all_computers")
    public String getAllComputers(Model model) {
        model.addAttribute("computer", computerService.getAllComputers());

        return "all_computers";
    }

    @RequestMapping(value = {"/edit-computer-{id}"}, method = RequestMethod.GET, produces = "application/json;charset=utf-8")
    public String editComputer(@PathVariable String id, ModelMap model) {
        Computer computer = computerService.getComputerById(Long.parseLong(id));
        model.addAttribute("computer", computer);
        model.addAttribute("edit", true);
        return "registration";
    }

    /**
     * This method will be called on form submission, handling POST request for
     * updating computer in database. It also validates the computer input
     */
    @RequestMapping(value = {"/edit-computer-{id}"}, method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public String updateComputer(@Valid Computer computer, BindingResult result, ModelMap model) {

        if (result.hasErrors()) {
            return "registration";
        }

        computerService.updateComputer(computer);

        model.addAttribute("success", "Computer " + computer.getArmName() + " updated successfully");
        return "registrationSuccess";
    }
}
