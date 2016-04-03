
package foodcostcaluculator_test;

public class valueInputs {
    private int itemCount;
    private double taxRate = 8.875, tipRate, itemCost, preTaxMeal,finalTax,finalTip;
    private final double taxPercent;
    private final double tipPercent;

    public valueInputs() {
        this.taxPercent = taxRate/100;
        this.tipPercent = tipRate/100;
    }
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

