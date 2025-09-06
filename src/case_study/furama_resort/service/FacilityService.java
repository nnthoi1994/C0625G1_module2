package case_study.furama_resort.service;

import case_study.furama_resort.model.Facility;
import case_study.furama_resort.repository.FacilityRepository;
import case_study.furama_resort.repository.IFacilityRepository;

import java.util.Map;

public class FacilityService implements IFacilityService{
    private final IFacilityRepository facilityRepository = new FacilityRepository();

    @Override
    public void display() {
        Map<Facility, Integer> facilityIntegerMap = facilityRepository.getAllFacilities();
        if(facilityIntegerMap.isEmpty()){
            System.out.println("LIST FACILITIES IS EMPTY");
            return;
        }
        System.out.println("---LIST FACILITIES---");
        for(Map.Entry<Facility,Integer> entry : facilityIntegerMap.entrySet()){
            System.out.println("Service: "+ entry.getKey()+ " | Numbers of times used: "+ entry.getValue());
        }
    }

    @Override
    public void add(Facility facility) {
        facilityRepository.add(facility);
        System.out.println("Add facility successfully");
    }

    @Override
    public void displayMaintenance() {
        Map<Facility, Integer> maintenanceMap = facilityRepository.getMaintenanceFacilities();
        if(maintenanceMap.isEmpty()){
            System.out.println("LIST MAINTENANCE FACILITIES IS EMTY");
            return;
        }
//        for(Map.Entry<Facility,Integer> entry :)

    }
}
