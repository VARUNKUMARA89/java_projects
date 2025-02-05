interface IosInt{
    void greet();
    void setDescription(String model, String camera, String display, String battery, String chip, boolean audioJack, boolean fingerprint);
    void setIosVersion(String IosVersion);
    void getDetails();
}

interface AndroidInt{
    void greet();
    void setDescription(String model, String camera, String display, String battery, String chip, boolean audioJack, boolean fingerprint);
    void setAndroidVersion(String IosVersion);
    void getDetails();
}

class Ios implements IosInt{
    String model, camera, display, battery, chip;
    boolean audioJack, fingerprint;
    public void setDescription(String model, String camera, String display, String battery, String chip, boolean audioJack, boolean fingerprint){
        this.model = model;
        this.camera = camera;
        this.display = display;
        this.battery = battery;
        this.chip = chip;
        this.audioJack = audioJack;
        this.fingerprint = fingerprint;

    }
    String iosVersion;
    boolean appleSubscription;
    public void greet(){
        System.out.println("Welcome to I planet");
    }
    public void setIosVersion(String iosVersion){
        this.iosVersion = iosVersion;
    }
    public void setAppleSubscription(boolean appleSubscription){
        this.appleSubscription = appleSubscription;
    }
    public void getDetails(){
        this.greet();
        System.out.println("model: " + model);
        System.out.println("camera: " + camera);
        System.out.println("display: " + display);
        System.out.println("battery: " + battery);
        System.out.println("chip: " + chip);
        System.out.println("audio jack: " + audioJack);
        System.out.println("finger print sensor: " + fingerprint);
        System.out.println("IOS version: " + iosVersion);
        System.out.println("apple subscription: " + appleSubscription);

    }
}

class Android implements AndroidInt{
    String model, camera, display, battery, chip;
    boolean audioJack, fingerprint;
    public void setDescription(String model, String camera, String display, String battery, String chip, boolean audioJack, boolean fingerprint){
        this.model = model;
        this.camera = camera;
        this.display = display;
        this.battery = battery;
        this.chip = chip;
        this.audioJack = audioJack;
        this.fingerprint = fingerprint;

    }
    String androidVersion;
    boolean googleSubscription;
    public void greet(){
        System.out.println("Welcome to Android world");
    }
    public void setAndroidVersion(String androidVersion){
        this.androidVersion = androidVersion;
    }
    public void setgoogleSubscription(boolean googleSubscription){
        this.googleSubscription = googleSubscription;
    }
    public void getDetails(){
        this.greet();
        System.out.println("model: " + model);
        System.out.println("camera: " + camera);
        System.out.println("display: " + display);
        System.out.println("battery: " + battery);
        System.out.println("chip: " + chip);
        System.out.println("audio jack: " + audioJack);
        System.out.println("finger print sensor: " + fingerprint);
        System.out.println("Android version: " + androidVersion);
        System.out.println("google subscription: " + googleSubscription);

    }
}
public class SmartPhone{
    public static void main(String[] args) {
        Android a = new Android();
        a.setDescription("Samsung S22", "120mp", "Amoled", "5000mah", "gen 3", true, true);
        a.setgoogleSubscription(true);
        a.setAndroidVersion("14");
        a.getDetails();
    }


}
