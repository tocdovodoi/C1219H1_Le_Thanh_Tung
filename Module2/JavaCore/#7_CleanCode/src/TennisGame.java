public class TennisGame {
//    String playerOneName;
//    String playerTwoName;

    public static String getScore() {
        int playerOneScore = 0;
        int playerTwoScore = 0;
        String score = "";
        int tempScore = 0;
        if (playerOneScore == playerTwoScore) {
            switch (playerOneScore) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else if (playerOneScore >= 4 || playerTwoScore >= 4) {
            int minusResult = playerOneScore - playerTwoScore;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = playerOneScore;
                else {
                    score += "-";
                    tempScore = playerTwoScore;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}
