package masterclass.topic11.Generics;


public class Main {
    public static void main(String[] args) {
        // Criando times de basquete
        Team<BasketballPlayer> teamBasket1 = new Team<>("Lakers");
        Team<BasketballPlayer> teamBasket2 = new Team<>("Celtics");
        Team<BasketballPlayer> teamBasket3 = new Team<>("Golden States");

        // Criando times de futebol
        Team<FootballPlayer> teamFootball1 = new Team<>("Corinthians");
        Team<FootballPlayer> teamFootball2 = new Team<>("Real Madrid");
        Team<FootballPlayer> teamFootball3 = new Team<>("Santos");

        // Criando jogadores de basquete
        Player playerBasketball1 = new FootballPlayer("Lebron James", "Ala-Pivo");
        Player playerBasketball2 = new FootballPlayer("Tatum", "Ala-Armador");
        Player playerBasketball3 = new FootballPlayer("Stephen Curry", "Armador");


        // Criando jogadores de futebol
        Player playerFootball1 = new FootballPlayer("Rodrigo Garro", "Meio Campo");
        Player playerFootball2 = new FootballPlayer("Endrick", "Atacante");
        Player playerFootball3 = new FootballPlayer("Neymar", "Ponta esquerda");


        teamBasket1.addTeamMember(playerBasketball1);
        teamBasket2.addTeamMember(playerBasketball2);
        teamBasket3.addTeamMember(playerBasketball3);

        teamFootball1.addTeamMember(playerFootball1);
        teamFootball2.addTeamMember(playerFootball2);
        teamFootball3.addTeamMember(playerFootball3);

        teamBasket1.listTeamMembers();
        teamBasket2.listTeamMembers();
        teamBasket3.listTeamMembers();

        teamFootball1.listTeamMembers();
        teamFootball2.listTeamMembers();
        teamFootball3.listTeamMembers();
    }
}

