package com.company;


    public class Passenger {
        private static int idCounter = 0;
        private int id;

        private static class Address {//Inner static Address class for composition relationship
            String street, city, state;

            Address(String street, String city, String state) {//Address construction to initialize
                this.street = street;
                this.city = city;
                this.state = state;
            }
        }
        private Address address;//reference variable of Address type

        private static class Contact {//Inner static Contact class for composition relationship
            String name, phone, email;

            Contact(String name, String phone, String email) {//Contact construction to initialize
                this.name = name;
                this.phone = phone;
                this.email = email;
            }
        }
        private Contact contact;//reference variable of Contact type
        //Passenger constructor for initializing values
        public Passenger(String street, String city, String state, String name, String phone, String email) {
            this.id = ++idCounter;
            this.address = new Address(street, city, state);
            this.contact = new Contact(name, phone, email);
        }

        public int getId() { //getter for ID
            return this.id;
        }

        public String getAddressDetails() { //get for Address details
            return "Street: " + address.street + "\nCity: " + address.city + "/nState: " + address.state;
        }

        public String getContactDetails() { //getter for Contact details
            return "Name: " + contact.name + "\nPhone: " + contact.phone + "\nEmail: " + contact.email;
        }

        public static int getPassengerCount() {
            return idCounter;
        }
    }


