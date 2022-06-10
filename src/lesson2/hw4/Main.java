package lesson2.hw4;

public class Main {
    public static void main(String[] args) {
        AddSkills addSkills = new AddSkills();

        Skills skills = new Skills();
        skills.setSkillsTitle(SkillsTitle.Basic);
        skills.setExp(9);
        addSkills.addSkill(skills.toString());

        skills.setSkillsTitle(SkillsTitle.QBASIC);
        skills.setExp(9);
        addSkills.addSkill(skills.toString());

        skills.setSkillsTitle(SkillsTitle.JOVIAL);
        skills.setExp(10);
        addSkills.addSkill(skills.toString());

        skills.setSkillsTitle(SkillsTitle.php);
        skills.setExp(12);
        addSkills.addSkill(skills.toString());

        Car car = new Car();
        car.setModel("tayota");
        car.setYear(2021);
        car.setPower(90);

        Card card = new Card();
        card.setAge(12);
        card.setEmail("qwe@qwe.qwe");
        card.setGender("male");
        card.setId(1);
        card.setName("Sasha");
        card.setSurname("Tipov");
        card.setSkills(addSkills);
        card.setCar(car);
        System.out.println(card);
    }
}
