package practice_3;

public class GameSettings {
    public static void main(String[] args){
        GameSettings footbol = new GameSettings("Футбол", 8);

        GameSettings pryatki = new  GameSettings("Прятки", 5);

        GameSettings.setMaxPlayers(11);
        System.out.println("Новое общее количество игроков: " + GameSettings.maxPlayers);

        footbol.addPlayer();
        footbol.printGameStatus();

        footbol.addPlayer();
        footbol.printGameStatus();

        footbol.addPlayer();
        footbol.printGameStatus();

        footbol.addPlayer();
        footbol.printGameStatus();


    }
    static int maxPlayers = 10; //— общее ограничение игроков
    final String gameName;// — название (нельзя менять)
    int currentPlayers;

    GameSettings(String newGameName, int newCurrentPlayers){
        this.gameName = newGameName;
        this.currentPlayers = newCurrentPlayers;
    }

    static void setMaxPlayers(int someMaxPlayers){
        GameSettings.maxPlayers = someMaxPlayers;
    }

    void addPlayer(){
        if (currentPlayers < maxPlayers){
            currentPlayers++;
        }
        else {
            System.out.println("Ошибка: достигнут лимит игроков");
        }
    }

//    void setCurrentPlayers(int newCurrentPlayers){
//        this.currentPlayers = newCurrentPlayers;
//    }

    void printGameStatus(){
        System.out.println("название: " +  this.gameName + ", текущее кол-во игроков: " + this.currentPlayers + ", MAX.кол-во игроков: " + GameSettings.maxPlayers);
    }
}
