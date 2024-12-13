public interface Item {
   public String name();
   public Packing packing();
   public float price();
}

public interface Packing {
   public String pack();
}