// Ly Pham
public class food{
   String name;
   int calories, servings;
   public food(String name, int calories, int servings){
      super();
      this.name = name;
      this.calories = calories; 
      this.servings = servings;
   }
   public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getCalories(){
        return calories;
    }
    public void setCalories(int calories){
        this.calories = calories;
    }
    public int getServing(){
        return servings;
    }
    public void setServing(int servings){
        this.servings = servings;
    }
}