package com.bridgelab;

public class StockAccountManagement {
    String stockName;
    int noOfShares;
    double sharePrice;

    public StockAccountManagement(String stockName, int noOfStocks, double stockPrice) {
    }

    public void stockDetails(String shareName, int noOfShares, double sharePrice){
        this.stockName = shareName;
        this.noOfShares = noOfShares;
        this.sharePrice = sharePrice;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public String toString(){
        return stockName +" "+noOfShares+" "+sharePrice+" "+(noOfShares * sharePrice)+" "+"\n";
    }

}

