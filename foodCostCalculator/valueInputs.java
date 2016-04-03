
package foodcostcaluculator_test;

public class valueInputs {
    private int itemCount;
    private double taxRate, tipRate, itemCost, preTaxMeal,finalTax,finalTip;

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
        tipRate = tip/100;
    }
    public void setTaxRate(double tax){
        taxRate = tax/100;
    }
    public double holdPreTaxMeal(){
        preTaxMeal = preTaxMeal + itemCost;
        return preTaxMeal;
    }
    public double getFinalTip(){
        finalTip = (preTaxMeal*tipRate);
        return finalTip;
    }
    public double getFinalTax(){
        finalTax = (preTaxMeal*taxRate)+preTaxMeal;
        return finalTax;
    }
    public double getFinalBill(){
        double finalBill = finalTip+finalTax;
        return finalBill;
    }
}

