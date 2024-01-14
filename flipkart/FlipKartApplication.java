package com.xworkz.emarketapp.flipkart;

import com.xworkz.emarketapp.users.Users;

import java.util.Arrays;

public class FlipKartApplication {
    Users[] users;
    int index;
    int id;

    public FlipKartApplication(int sizeOfArray){
        users=new Users[sizeOfArray];
    }

    public boolean addUserDetails(Users user){
        boolean isAdded=false;

        if (user!=null){
                this.users[index]=user;
                users[index].setUserId(++id);
                index++;
                isAdded=true;
        }
        return isAdded;
    }

    public void getAllDetailsOfUsers(){
        System.out.println("getAllDetailsOfUsers method is invoked");

        for (int num=0;num<users.length;num++) {
            System.out.println("User name is:" + users[num].getUserName()
                   +"\n" + "User id :" + users[num].getUserId()
                    +"\n" + "User address: " + users[num].getAddress()
                    +"\n"  + "User email: " + users[num].getEmail()
                    +"\n" + "User phone number" + users[num].getPhoneNumber()
                    +"\n" + "User gender: " + users[num].getGender()
                    +"\n"  + "User age: " + users[num].getAge()
                    +"\n"+ "User Passward: " + users[num].getPassward()
                    +"\n" + "User confirmPassward:" + users[num].getConfirmPassward()
                    +"\n" + "User debit card number: " + users[num].getDebitCard());
            System.out.println("-----------------------------------");
        }
    }

    public boolean updateAgeById(int id,int newAge){
        System.out.println("updateAgeById method is invoked:");
        boolean isUpdated=false;
        System.out.println("updateAgeById method is invoked:");
        for (int num=0;num<users.length;num++){
            if (users[num].getUserId()==id){
                users[num].setAge(newAge);
            }
        }
        return isUpdated;
    }

    public void deleteById(int id){
        System.out.println("deleteById method is invoked:");
        int index;
        int newIndex;
        for (index=0,newIndex=0;index<users.length;index++){
            if (users[index].getUserId()!=id){
                users[newIndex++]=users[index];
            }
        }
      users=Arrays.copyOf(users,newIndex);
        newUsersAfterDeleted(users);
    }

    private void newUsersAfterDeleted(Users[] users) {
        for (int num=0;num<users.length;num++){
            System.out.println("User name is:" + users[num].getUserName()
                    +"\n" + "User id :" + users[num].getUserId()
                    +"\n" + "User address: " + users[num].getAddress()
                    +"\n"  + "User email: " + users[num].getEmail()
                    +"\n" + "User phone number" + users[num].getPhoneNumber()
                    +"\n" + "User gender: " + users[num].getGender()
                    +"\n"  + "User age: " + users[num].getAge()
                    +"\n"+ "User Passward: " + users[num].getPassward()
                    +"\n" + "User confirmPassward:" + users[num].getConfirmPassward()
                    +"\n" + "User debit card number: " + users[num].getDebitCard());
            System.out.println("-----------------------------------");
        }
    }

    public void getUserInformationById(int id){
        System.out.println("getUserInformationById method is invoked:");
        for (int num=0;num< users.length;num++){
            if (users[num].getUserId()==id){
                System.out.println("User name is:" + users[num].getUserName()
                        +"\n" + "User id :" + users[num].getUserId()
                        +"\n" + "User address: " + users[num].getAddress()
                        +"\n"  + "User email: " + users[num].getEmail()
                        +"\n" + "User phone number" + users[num].getPhoneNumber()
                        +"\n" + "User gender: " + users[num].getGender()
                        +"\n"  + "User age: " + users[num].getAge()
                        +"\n"+ "User Passward: " + users[num].getPassward()
                        +"\n" + "User confirmPassward:" + users[num].getConfirmPassward()
                        +"\n" + "User debit card number: " + users[num].getDebitCard());
                System.out.println("-----------------------------------");
            }
        }
    }

}
