
public class Player {

        private int playerJerseyNumber;
        private int playerRanking;

        public Player (int playerJerseyNumber, int playerRanking){
            this.playerJerseyNumber = playerJerseyNumber;
            this.playerRanking = playerRanking;
        }

            public int getPlayerJerseyNumber(){ return playerJerseyNumber;}
            public void setPlayerJerseyNumber(int playerJerseyNumber) {this.playerJerseyNumber = playerJerseyNumber;}

            public int getPlayerRanking(){return playerRanking;}
            public void setPlayerRanking(int playerRanking){this.playerRanking= playerRanking;}

            @Override
            public String toString(){ return playerJerseyNumber + ":" + "," + playerRanking + ":";

            }
        }









