package service;

import db.DataBase;
import enumClass.Brands;
import model.Phone;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class PhoneServiceImpl implements PhoneService {
    private DataBase dataBase;

    public PhoneServiceImpl(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public String addPhone(List<Phone>phones) {
        dataBase.getPhone().addAll(phones);
        return "Phones are successfully saved!!! ";
    }

    @Override
    public Phone getPhoneById(Long phoneId) {
        Stream<Phone>phoneStream = dataBase.getPhone().stream();
        phoneStream.filter(phone -> phone.getId().equals(phoneId)).forEach(System.out::println);
        return null;
    }

    @Override
    public Phone updatePhoneNameById(Long phoneId, String newName) {
        dataBase.getPhone().stream().filter(phone -> phone.getId().equals(phoneId)).forEach(phone -> phone.setName(newName));
        dataBase.getPhone().stream().forEach(System.out::println);
        return null;
    }

    @Override
    public List<Phone> getAllPhones() {
        dataBase.getPhone().stream().forEach(System.out::println);
        return null;
    }

    @Override
    public List<Phone> getAllPhonesByBrand(String brand) {
        List<Phone>phones = dataBase.getPhone();
       phones.stream().filter(phone -> phone.getBrands().equals(brand)).forEach(System.out::println);
        return null;
    }

    @Override
    public void deletePhoneById(Long phoneId) {
        List<Phone>phones = dataBase.getPhone();
        phones.removeIf(phone -> Objects.equals(phone.getId(), phoneId));
        System.out.println("-----");

    }
}
