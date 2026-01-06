package com.coding.projects.airBnbApp.service;

import com.coding.projects.airBnbApp.dto.HotelDto;
import com.coding.projects.airBnbApp.dto.HotelInfoDto;
import com.coding.projects.airBnbApp.dto.HotelInfoRequestDto;

import java.util.List;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto  updateHotelById(Long id,HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long id);

    HotelInfoDto getHotelInfoById(Long hotelId,  HotelInfoRequestDto hotelInfoRequestDto);
    List<HotelDto> getAllHotels();
}
