public class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Sobreescribe toString para una salida legible (requisito 1)
    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + name + "'} \n";
    }

}
