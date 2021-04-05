public class Product {
    private int id;
    private String name;
    private float coast;


    public Product(int id, String name, float coast){
        this.id = id;
        this.name = name;
        this.coast = coast;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public float getCoast(){
        return coast;
    }
}
