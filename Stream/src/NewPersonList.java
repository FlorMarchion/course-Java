public class NewPersonList {
    public String name;

    public NewPersonList() {
    }

    public NewPersonList(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NewPersonList{" +
                "name='" + name + '\'' +
                '}';
    }

    public static NewPersonList map(Persona persona){
        return new NewPersonList(
                persona.getNombre()
        );
    }
}
