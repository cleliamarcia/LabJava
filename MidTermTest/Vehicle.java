package MidTermTest;
import java.util.Objects;

public abstract class Vehicle implements Steerable{

    private Integer Weight;
    private String  ProductId;


    public Vehicle (){};

    public Vehicle (String productId, Integer weight)
    {
        setWeight(weight);
        setProductId(productId);
    }


    public String getProductId (){
         return ProductId;
    }

    public Integer getWeight (){
        return Weight;
    }


    public void setProductId(String productId){
        this.ProductId = productId;
    }

    public void setWeight(Integer weight){
        if (weight >= 0){
            this.Weight = weight;
        }else{
            this.Weight = null;
        }
    }



        @Override
        public String toString() {
            return "Vehicle{" +
                    "productId=" + ProductId +
                    ", weight=" + Weight +
                    '}';
        }


        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Vehicle vehicle = (Vehicle) obj;
            return Objects.equals(ProductId, vehicle.ProductId);
        }


}

