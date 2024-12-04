public class Inheritance extends Encapsulation {
    private String skill;
    private String profession;

    // Parameterized Constructor
    public Inheritance(int objId, String objName, int objAge, String objSkill, String objProfession) {
        super(objId, objName, objAge);
        this.skill = objSkill;
        this.profession = objProfession;
    }

    // Getter Method
    public String getSkill() {
        return this.skill;
    }

    public String getProfession() {
        return this.profession;
    }

    // Setter Method
    public void setSkill(String newSkill) {
        this.skill = newSkill;
    }

    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }

    public void study() {
        System.out.println(super.getName() + " Studying");
    }

}