package masterclass.topic11.Generics;

import java.util.ArrayList;
import java.util.List;

public class Team<T> {
    private String teamName;
    private List<Player> teamPlayers = new ArrayList<>();

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(Player t) {
        if (teamPlayers.contains(t)) {
            System.out.println("Jogador já existe.");
            return;
        }
        teamPlayers.add(t);
    }

    public void listTeamMembers() {
        if (teamPlayers.isEmpty()) {
            System.out.println("Sem jogadores");
            return;
        }

        for (Player player : teamPlayers) {
            System.out.println("-----------------------------");
            System.out.println("Jogadores do " + teamName + ":");
            System.out.println(player.getName() + " jogando de " + player.getPosition());
        }
    }
}
