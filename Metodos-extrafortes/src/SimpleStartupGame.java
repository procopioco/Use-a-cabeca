public class SimpleStartupGame {
    public static void main(String[] args) {
        // Contador de tentativas do jogador
        int numOfGuesses = 0;

        // Helper para capturar input do usuário
        GameHelper helper = new GameHelper();

        // Objeto do "alvo" que o jogador precisa acertar
        SimpleStartup theStartup = new SimpleStartup();

        // Gera número aleatório entre 0 e 4
        int randomNum = (int) (Math.random() * 5);

        // Define 3 células consecutivas como posição do alvo
        int[] locations = {randomNum, randomNum+1, randomNum+2};

        theStartup.setLocationCells(locations);

        // Controla se o jogo continua
        boolean isAlive = true;

        while (isAlive) {
            // Lê o chute do jogador
            int guess = helper.getUserInput("enter a number");

            // Verifica se acertou: retorna "hit", "miss" ou "kill"
            String result = theStartup.checkYourself(guess);

            numOfGuesses++;

            // "kill" = todas as células acertadas, jogo encerra
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took "+numOfGuesses+" guesses.");
            }
        }
    }
}