package lab.assignment.afterrefactoring;

public abstract class CoffeeTemplate{

    public final void makeCoffee(){
        boilWater();
        brewEspresso();
        addIngredients();
        finalTouch();
        System.out.println("Coffee is made.");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void brewEspresso() {
        System.out.println("Brewing espresso");
    }

    protected abstract void addIngredients();
    protected abstract void finalTouch();

}
