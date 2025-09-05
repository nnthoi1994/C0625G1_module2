package case_study.furama_resort.repository;

import case_study.furama_resort.model.Facility;
import case_study.furama_resort.model.House;
import case_study.furama_resort.model.Room;
import case_study.furama_resort.model.Villa;

import java.util.LinkedHashMap;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {
    private static final Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static {
        Villa villa1 = new Villa("SVVL-0001", "Villa Beach Front", 250.0, 1000000, 10, "Day", "Vip", 80.0, 3);
        House house1 = new House("SVHO-0001", "House Standard", 100.0, 9000000, 5, "Month", "Standard", 2);
        Room room1 = new Room("SVRO-0001", "ROOM BASIC", 50.0, 100000, 4,  "Hour", "Water");
        facilityIntegerMap.put(villa1, 0);
        facilityIntegerMap.put(house1, 1);
        facilityIntegerMap.put(room1, 2);
    }

    public Map<Facility, Integer> getAllFacilities(){
        return facilityIntegerMap;
    }

    public void add(Facility facility){
        facilityIntegerMap.put(facility,0);
    }

    public Map<Facility, Integer> getMaintenanceFacilities(){
        Map<Facility, Integer> maintenanceMap = new LinkedHashMap<>();
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()){
            if(entry.getValue()>=5){
                maintenanceMap.put(entry.getKey(),entry.getValue());
            }
        }
        return maintenanceMap;
    }
}
