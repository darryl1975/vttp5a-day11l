package sg.edu.nus.iss.vttp5a_day11l.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @ResponseBody
    @RequestMapping(path="/log", method=RequestMethod.GET)
    public String home() {

        logger.info("This is info message");
        logger.warn("This is warning message");
        logger.error("This is error message");
        logger.debug("This is debug message");
        logger.trace("This is trace message");


        return "Log in HomeController called...";
    }
}
