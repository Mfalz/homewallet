package homewallet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    @GetMapping("/product")
    public String product(Model model){
        model.addAttribute("action", "view");
        return "product";
    }

    @RequestMapping(value="/product/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("action", "add");
        return "product";
    }

    @RequestMapping(value="/product/delete", method = RequestMethod.GET)
    public String delete(Model model) {
        model.addAttribute("action", "delete");
        return "product";
    }

    @RequestMapping(value="/product/update", method = RequestMethod.GET)
    public String update(Model model) {
        model.addAttribute("action", "update");
        return "product";
    }

}