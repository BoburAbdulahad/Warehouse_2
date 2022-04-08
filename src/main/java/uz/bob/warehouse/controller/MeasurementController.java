package uz.bob.warehouse.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.bob.warehouse.payload.Result;

@RestController
@RequestMapping("/measurement")
public class MeasurementController {


    @PostMapping
    public Result addMeasurement(@RequestBody){

    }
}
