package com.feed.news_api_service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/news/api")
public class NewsApiController {

    @GetMapping("/test")
    ResponseEntity<Map<String, String>> test() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(Map.of("key","value"));
    }
}
