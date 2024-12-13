public class NullCustomer extends AbstractCustomer {

   @Override
   public String getName() {
      return "Not Available";
   }

   @Override
   public boolean isNil() {
      return true;
   }
}