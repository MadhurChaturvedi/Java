package class26;

class Laptop {
    String model;
    int price;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    public String toString() {
        return model + " : " + price;
    }
}

// Object class equeal toString hashcode in java
public class Demo {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo";
        obj.price = 5000;

        System.out.println(obj.toString());
    }
}
