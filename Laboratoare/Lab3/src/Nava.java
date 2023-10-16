abstract class Nava {
    private String name;
    private String pavilion;

    public Nava(String name, String pavilion) {
        this.name = name;
        this.pavilion = pavilion;
    }

    @Override
    public String toString() {
        return "nume=" + name + ", pavilion=" + pavilion;
    }

    abstract void utilizare();
}
