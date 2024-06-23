package dev.riteesh.BookMyShow.service;

import dev.riteesh.BookMyShow.dto.CityRequestDTO;
import dev.riteesh.BookMyShow.model.City;
import dev.riteesh.BookMyShow.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public City saveCity(String cityName){
        City city = new City();
        city.setName(cityName);
        return cityRepository.save(city);
    }


}
