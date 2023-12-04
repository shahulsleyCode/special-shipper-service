package com.shahulsleycode.poc.specialshipperservice.specialshipperservice;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreShipperController {
    
    @RequestMapping("/")
    public String welcome(){
        return "Hi, Welcome to Special Shipper Service";
    }

    @RequestMapping("/recieveShipper")
    public RecieveShipper storeShipper(){
        return new RecieveShipper("A666YY",
         "2023-11-30-18.30.00.000000",
         "TSX3QMJ",
         540);
    }

    
    

}
