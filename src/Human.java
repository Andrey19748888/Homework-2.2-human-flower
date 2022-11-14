public class Human {
    public String name;
    private String city;
    private int age;
    public String jobTitle;

    public Human(String name, String city, int age, String jobTitle) {
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (city == null) {
            this.city = "Информация не указана";
        } else {
            this.city = city;
        }
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;}
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.isEmpty()) {
            this.city = "Информация не указана";
        } else {
            this.city = city;}
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;}
    }

}
