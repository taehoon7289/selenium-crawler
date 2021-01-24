package com.mango.crawler.controller;

import com.mango.crawler.service.NaverService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/naver")
public class NaverController {

    private NaverService naverService;

    @GetMapping("/")
    public ResponseEntity<String> getMain (HttpServletRequest request,
                                   HttpServletResponse response) {
        return ResponseEntity.ok(naverService.getMain());
    }

}
