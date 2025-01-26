package masterclass.topic8.Encapsulation.video;

public class EnhancedPlayer {

    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName, 100, "Sword");
    }

    public EnhancedPlayer(String fullName, int healthPercentage, String weapon) {
        this.fullName = fullName;
        this.healthPercentage = (healthPercentage <= 0) ? 0 : (healthPercentage >= 100) ? 100 : healthPercentage;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.healthPercentage -= damage;
        if (this.healthPercentage <= 0){
            System.out.println("Player knocked out of game.");
        }
    }

    public void restoreHealth(int extraHealth){
        this.healthPercentage += extraHealth;
        if (this.healthPercentage >= 100){
            System.out.println("Player restored to 100%");
            this.healthPercentage = 100;
        }
    }

    public int healthRemaining(){
        return healthPercentage;
    }
}
