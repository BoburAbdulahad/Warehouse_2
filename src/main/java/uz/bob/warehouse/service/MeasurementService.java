package uz.bob.warehouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.bob.warehouse.entity.Measurement;
import uz.bob.warehouse.payload.Result;
import uz.bob.warehouse.repository.MeasurementRepository;

@Service
public class MeasurementService {

    @Autowired
    MeasurementRepository measurementRepository;

    public Result addMeasurementService(Measurement measurement){
        boolean existsByName = measurementRepository.existsByName(measurement.getName());
        if (existsByName){
            Result result=new Result();
            result.setMessage("This measurement already exist");
            result.setSuccess(false);
//            return new Result("Already exist",false);
            return result;
        }
        Result result=new Result();
        result.setMessage("New measurement successfully added!");
        result.setSuccess(true);
//        return new Result("Successfully added",true);
        return result;
    }
}
