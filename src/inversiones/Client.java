/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiones;

/**
 *
 * @author hquiroga
 */
public class Client {
    private int id;
    private String name;
    private String lastName;
    private String phoneNumber;
    private int age;
    private String email;
    private Asset[] assets;
    
    private int i = 0;

    public Client(int id, String name, String lastName, String phoneNumber, int age, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
        this.assets = new Asset[10];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Asset[] getAssets() {
        return assets;
    }

    public void setAssets(Asset[] assets) {
        this.assets = assets;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
    
    
    
    public boolean addAsset(Asset asset) {
        
        this.assets[i] = asset;
        i++;
        if(i == 9) i = 0;
        return assets[i-1] == asset;
    }
}
