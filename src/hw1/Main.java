package hw1;

import hw1.user.Adress;
import hw1.user.Company;
import hw1.user.Geo;

public class Main {
    public static void main(String[] args) {

        Geo geo = new Geo();
        geo.setLat(321);
        geo.setLng(333);

        Adress adress = new Adress();
        adress.setStreet("Street");
        adress.setSuite("Suite");
        adress.setCity("city");
        adress.setZipcode(1380);
        adress.setGeo(geo);

        Company company = new Company();
        company.setName("Name");
        company.setCatchPhrase("Catch");
        company.setBs("Bs");

        User user = new User();
        user.setAdress(adress);
        user.setCompany(company);
        user.setId(90);
        user.setName("Kolya");
        user.setUsername("Koks");
        user.setEmail("sdf@gd.asd");
        user.setPhone(730213);
        user.setWebsite("sdfsf.com");
        System.out.println(user);
    }
}
