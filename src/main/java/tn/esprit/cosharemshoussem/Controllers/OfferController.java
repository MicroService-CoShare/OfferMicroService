package tn.esprit.cosharemshoussem.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.cosharemshoussem.Entities.Offer;
import tn.esprit.cosharemshoussem.Repositories.OfferRepository;
import tn.esprit.cosharemshoussem.Services.OfferService;

import javax.annotation.security.RolesAllowed;

@RestController
public class OfferController {
    private String title="hello , im the product microservice";

    @Autowired
    private OfferService offerService;

    @RequestMapping("/hello")
    @RolesAllowed("ADMIN")
    public String sayHello(){
        System.out.println(title);
        return title;
    }
    @RequestMapping("/hello2")
    @RolesAllowed("admin")
    public String sayHelloo(){
        System.out.println(title);
        return title;
    }
    @RequestMapping("/hello3")
    @RolesAllowed("ROLE_ADMIN")
    public String sayHellooo(){
        System.out.println(title);
        return title;
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Offer> addOffer(@RequestBody Offer offer) {
        return new ResponseEntity<>(offerService.addOffer(offer), HttpStatus.OK);
    }

}
