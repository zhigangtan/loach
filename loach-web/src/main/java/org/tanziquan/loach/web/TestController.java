package org.tanziquan.loach.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestC
 *
 * @author
 * @version 0.0.1
 */
@RestController
public class TestController {


    @RequestMapping("/test")
    public ResponseEntity<?> test() {
        return ResponseEntity.ok("String");
    }
}
