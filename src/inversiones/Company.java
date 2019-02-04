/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiones;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author hquiroga
 */
public class Company {
    private String name;
    private ArrayList<Asset> assets;
    private HashMap<Integer, Client> clients;

    public Company(String name) {
        this.name = name;
        this.assets = new ArrayList<>();
        this.clients = new HashMap<>();
    }
    
    public boolean addClient(int id, String name, String lastName, String phoneNumber, int age, String email) {
        Client client;
        client = new Client(id, name, lastName, phoneNumber, age, email);
        clients.put(id, client);
        return clients.get(id) == client;
    }
    
    public boolean addCash(double amount, int id) {
        Cash cash;
        cash = new Cash(amount);
        return clients.get(id).addAsset(cash);
    }
    
    public boolean addStock(int totalShares, String symbol, double totalCost, double currentPrice, int id) {
        Stock stock;
        stock = new Stock(totalShares, symbol, totalCost, currentPrice);
        
        return clients.get(id).addAsset(stock);
    }
    
    public double getAllMarketValue() {
        double marketValue = 0;
        for (Client client : clients.values()) {
            for(Asset asset : client.getAssets()){
                marketValue += asset.getMarketValue();
            }
        }
        return marketValue;
    }
    
    public double getAllProfit() {
        double profit = 0;
        for (Client client : clients.values()) {
            for(Asset asset : client.getAssets()){
                profit += asset.getProfit();
            }
        }
        return profit;
    }
    
    public double marketValueByType(){
        double profit = 0;
        for(Asset assets : )
    }
}

