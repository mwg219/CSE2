///////////////////////////////////////////////////////////////////////////////////////
//Will Gilbert
//hw02
//September 8, 2015
//CSE 02
//first compile program
//      javac Arithmetic.java
//run the program 
//      java Arithmetic//
public class Arithmetic{
    public static void main(String[] args) {
        
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //('$' is part of the variable name)
        double sockCost$=2.58;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes 
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06; //percent of sales tax
        
        System.out.println("The number of pairs of socks you bought is " + nSocks + " pairs");
        System.out.println("The socks cost $" + sockCost$ + " per pair");
        double totalSockCost = (nSocks * sockCost$); //the total cost of the 3 pairs of socks before sales tax. 
        System.out.println("The total cost of socks = $" + totalSockCost);
        double taxSocks = Math.floor((taxPercent * totalSockCost) * 100) / 100; //the sales tax of the total cost of the 3 pairs of socks. 
        System.out.println("The sales tax on the pairs of socks = $" + taxSocks); 
        double finalSockCost = Math.floor(totalSockCost + taxSocks); //total cost of the pairs of socks plus the sales tax. 
        System.out.println("The final cost of the pairs of socks = $" + finalSockCost); 
        System.out.println("The number of drinking glasses you bought is " + nGlasses + " glasses");
        System.out.println("The glasses cost $" + glassCost$ + " per glass");
        double totalGlassesCost = (nGlasses * glassCost$); //total cost of drinking glasses before sales tax.
        System.out.println("The total cost of drinking glasses = $" + totalGlassesCost);
        double taxGlass = Math.floor((taxPercent * totalGlassesCost) * 100) / 100; //sales tax of total cost of drinking glasses.
        System.out.println("The sales tax on the drinking glasses = $" + taxGlass);
        double finalGlassCost = Math.floor(totalGlassesCost + taxGlass); //total cost of drinking glasses plus sales tax.
        System.out.println("The final cost of the drinking glasses = $" + finalGlassCost);
        System.out.println("The number of boxes of envelopes you bought is " + nEnvelopes + " box"); 
        System.out.println("The boxes cost $" + envelopeCost$ + " per box");
        double totalenvelopeCost = (nEnvelopes * envelopeCost$); //total cost of box of envelopes before sales tax.
        System.out.println("The total cost of box of envelopes = $" + totalenvelopeCost);
        double taxBox = Math.floor((taxPercent * totalenvelopeCost) * 100) / 100; //sales tax of box of envelopes. 
        System.out.println("The sales tax on box of envelopes = $" + taxBox);
        double finalenvelopeCost = Math.floor(totalenvelopeCost + taxBox); //total cost of box of envelopes plus the sales tax.
        System.out.println("The final cost of the box of envelopes = $" + finalenvelopeCost);
        
        double totalPurchase = Math.floor(totalenvelopeCost + totalGlassesCost + totalSockCost); //total purchase of items before sales tax.
        System.out.println("The total purchase of items before sales tax = $" + totalPurchase);
        double totalTax = Math.floor(taxBox + taxSocks + taxGlass); //total sales tax of items.
        System.out.println("The total sales tax of items purchased = $" + totalTax);
        double finalPurchase = Math.floor(finalGlassCost + finalSockCost +finalenvelopeCost); //final cost of all items plus the total sales tax of items.
        System.out.println("The final purchase of all items with sales tax = $" + finalPurchase);
    }
}