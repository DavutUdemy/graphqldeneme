package com.haydikodlayalim.graphql.Controller;

import com.haydikodlayalim.graphql.api.VehicleMutationResolver;
import com.haydikodlayalim.graphql.dto.VehicleDto;
import com.haydikodlayalim.graphql.entity.Vehicle;
import com.haydikodlayalim.graphql.repo.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class appService {
    private final VehicleMutationResolver vehicleMutationResolver;

    public appService(VehicleMutationResolver vehicleMutationResolver) {
        this.vehicleMutationResolver = vehicleMutationResolver;
    }

    public List<Vehicle> getService(VehicleRepository vehicleRepository) {
        return vehicleRepository.getByTypeLike("%%");
    }

    public Vehicle saveAll(VehicleRepository vehicleRepository, VehicleDto vehicleDto) {
        return vehicleMutationResolver.createVehicle(vehicleDto);
    }
    // public void

}
