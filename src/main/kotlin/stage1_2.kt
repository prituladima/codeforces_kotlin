fun main() {
    var T = readln().toInt()
    while (T-- > 0) {
        var N = readln().toInt()
        var player1Score = 0;
        var player2Score = 0;
        var turn1 = true;
        while (N > 0) {
            var score = 0;
            if (N % 2 == 1) {
                score++
            } else if (N % 4 == 0) {
                score++
            } else {
                score += N / 2;
            }
            if (turn1) {
                player1Score += score;
            } else {
                player2Score += score;
            }
            turn1 = !turn1
            N -= score
        }
        print(player1Score)
    }
}