
package foodcostcaluculator_test;

public class valueInputs {
    private int itemCount;
    private double taxRate = 8.875, tipRate, itemCost, preTaxMeal,finalTax,finalTip;
    //private final double taxPercent;
    //private final double tipPercent;

    //public valueInputs() {
    //    this.taxPercent = taxRate/100;
    //    this.tipPercent = tipRate/100;
    //}
    
    // ** The commented portion breaks the code giving invalid tax and tip values. Private final prevents a rewrite. Since
    //    the private variables taxRate and tipRate are not initialized, their default is set to 0. Since both taxPercent and
    //    tipPercent are set to final, their defaults are enforced to 0. This prevents them from being rewritten later on.
    
    public int getItemCount(){
        return itemCount;
    }
    public void setItemCount(int count){
        itemCount = count;
    }
    public double getItemCost(){
        return itemCost;
    }
    public void setItemCost(double cost){
        itemCost = cost;
    }
    public void setTipRate(double tip){
        tipRate = tip;
    }
    public void setTaxRate(double tax){
        taxRate = tax;
    }
    public double holdPreTaxMeal(){
        preTaxMeal = preTaxMeal + itemCost;
        return preTaxMeal;
    }
    public double getFinalTip(){
        finalTip = (preTaxMeal*tipPercent);
        return finalTip;
    }
    public double getFinalTax(){
        finalTax = (preTaxMeal*taxPercent)+preTaxMeal;
        return finalTax;
    }
    public double getFinalBill(){
        double finalBill = finalTip+finalTax;
        return finalBill;
    }
}

