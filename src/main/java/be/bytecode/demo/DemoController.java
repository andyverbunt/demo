package be.bytecode.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {
    @RequestMapping("/demo")
    public String demo() {
        return new Date().toString();
    }
}
