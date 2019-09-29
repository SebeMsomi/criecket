package me.cricket.controller;


import me.cricket.domain.ResponseObj;
import me.cricket.domain.member.Batsman;
import me.cricket.factory.BatsmanFactory;
import me.cricket.factory.ResponseFactory;
import me.cricket.service.member.BatsmanService;
import me.cricket.service.member.impl.BatsmanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/cricket/lookup/batsman")
public class BatsmanController {

    @Autowired
    private BatsmanService batsmanService;


    @PostMapping(value = "/create/{gender}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity createBatman(@PathVariable String batman) {
        System.out.println("Entered Value: " + batman);
        ResponseObj responseObj = ResponseFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Batsman created!");
        Batsman savedBatman;
        if (batman == null || batman.trim().isEmpty() || batman.trim().equalsIgnoreCase("null")) {
            responseObj.setResponseCode(HttpStatus.PRECONDITION_FAILED.toString());
            responseObj.setResponseDescription("Provide a batman!");
        } else {
            savedBatman = (Batsman) batsmanService.getAll();
            if (savedBatman != null) {
                responseObj.setResponseDescription("batman already exist!");
            } else {
                savedBatman = BatsmanFactory.getBatsman(batman);
                savedBatman = batsmanService.create(savedBatman);
            }
            responseObj.setResponse(savedBatman);
        }
        return ResponseEntity.ok(responseObj);
    }

    @GetMapping(value = "/getall", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAll(){
        ResponseObj responseObj = ResponseFactory.buildGenericResponseObj(HttpStatus.OK.toString(), "Success");
        Set<Batsman> batsmen = BatsmanServiceImpl.getGenderService().getAll();
        responseObj.setResponse(batsmen);
        return ResponseEntity.ok(responseObj);
    }



}
