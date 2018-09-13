package com.example.opilane.listview;

import java.util.ArrayList;
import java.util.List;

public class Zipcodes {

    private final List<Zipcode> list= new ArrayList<>();

    private static final String[][] codes= {
            {"10115","Berlin-Mitte"},
            {"10243","Friedrichshain"},
            {"10318","Lichtenberg"},
            {"10405","Prenzlauer Berg"},
            {"10823","Tempelhof"},
            {"12157","Steglitz"},
            {"10707","Wilmersdorf"},
            {"12043","Neukölln"}
    };

    //lisan väärtused listi
    public Zipcodes(){
        for (String[] code:codes) list.add(new Zipcode(code[0],code[1]));
    }

    //teeme oma search() meetodi, et otsida zipcode
    public List<Zipcode> search(String code, String city){
        city=city.toLowerCase();
        List<Zipcode> lines=new ArrayList();
        for (Zipcode z:list)
            if (z.getCode().startsWith(code)&&z.getCity().toLowerCase().contains(city))lines.add(z);
        return lines;
    }
}

