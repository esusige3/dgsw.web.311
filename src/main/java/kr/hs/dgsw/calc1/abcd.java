package kr.hs.dgsw.calc1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class abcd {
    @GetMapping
    public String sayABCD(){
        return "ABDC :)";
    }
}
//1ac892b44907fea30ac9d348a8ac9f590e789416 github token