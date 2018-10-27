package be.bytecode.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {

    @Value("${build.version}")
    private String version;

    @RequestMapping("/demo")
    public String demo() {
        return "Another version: " + version + "@" + new Date().toString();
    }
}
