package com.haydikodlayalim.graphql.Controller;

import com.haydikodlayalim.graphql.dto.VehicleDto;
import com.haydikodlayalim.graphql.entity.Vehicle;
import com.haydikodlayalim.graphql.repo.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "api/v1/shoe")
public class appController {
    @Autowired
    private final appService appService;
    private final VehicleRepository vehicleRepository;

    public appController(com.haydikodlayalim.graphql.Controller.appService appService, VehicleRepository vehicleRepository) {
        this.appService = appService;
        this.vehicleRepository = vehicleRepository;
    }


    @GetMapping
    public List<Vehicle> getShoes(){
        return appService.getService(vehicleRepository);
    }
    @PostMapping
    public Vehicle createVehicle(VehicleDto vehicleDto) {

        return appService.saveAll(vehicleRepository,vehicleDto);
    }

}
