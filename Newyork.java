// Class NewYork
class NewYorkCity {
    public void methodNewYorkCity() {
        System.out.println("Method from Class NewYorkCity");
    }
}

// Class Tokyo
class Tokyo {
    public void methodTokyo() {
        System.out.println("Method from Class Tokyo");
    }
}

// Class Sydney
class Sydney {
    public void methodSydney() {
        System.out.println("Method from Class Sydney");
    }
}

// Class Paris
class Paris {
    public void methodParis() {
        System.out.println("Method from Class Paris");
    }
}

// Cars class to create objects and call methods from NewYorkCity, Tokyo,
// Sydney, and Paris
class Cars {
    public static void main(String[] args) {
        NewYorkCity objNewYorkCity = new NewYorkCity();
        Tokyo objTokyo = new Tokyo();
        Sydney objSydney = new Sydney();
        Paris objParis = new Paris();

        // Calling methods from each class
        objNewYorkCity.methodNewYorkCity();
        objTokyo.methodTokyo();
        objSydney.methodSydney();
        objParis.methodParis();
    }
}
