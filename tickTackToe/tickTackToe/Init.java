package tickTackToe;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.List;

public class Init {
  private boolean play = true; // this will be in charge of init the game, if it is false the game stops
  private boolean finished; // if game is finished because a winner or a Draw
  private int currentTurn = 1;
  private char currentChar = 'X';
  private char[][] grid; // empty grid
  private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

  // This are the rules for a winner, horizontals, verticals or diagonals
  private static final int[][] WINNING_COMBINATIONS = {
    {0, 0, 0, 1, 0, 2}, {1, 0, 1, 1, 1, 2}, {2, 0, 2, 1, 2, 2}, // Rows
    {0, 0, 1, 0, 2, 0}, {0, 1, 1, 1, 2, 1}, {0, 2, 1, 2, 2, 2}, // Columns
    {0, 0, 1, 1, 2, 2}, {0, 2, 1, 1, 2, 0}  // diagonals
  };

  public Init() {
    System.out.println("Wellcome to tick tack toe game");
    initGrid();
    runGame();
  }

  private void initGrid() {
    grid = new char[][]{new char[]{'-','-','-'}, new char[]{'-','-','-'}, new char[]{'-','-','-'}};
    currentTurn = 1;
    currentChar = 'X';
    finished = false;
  }

  private void runGame() {
    while (play) {
      renderMenu();
      try {
        String option = input.readLine();

        if (option.equals("1")) {
          instructions();
        } else if(option.equals("2")) {
          initGrid();
          playGame();
        } else if(option.equals("3")) {
          initGrid();
        } else if(option.equals("4")) {
          play = false;
        }
      } catch (Exception e) {
        System.out.printf("error on running game %s", e.getMessage());
      }
    }
  }

  private void renderMenu() {
    System.out.println("""
        This are the options:
          1. Show instructions
          2. Play the game
          3. Restart the game
          4. Exit
      """);
  }

  private void playGame() {
    while (!finished) {
      renderGrid();
      renderTurn();
      try {
        int[] positions = validateInput();
  
        // if validate input return -1 this means restart game
        if (positions[0] == -1) {
          initGrid();
          return;
        }

        if (grid[positions[0] - 1][positions[1] - 1] != '-') {
          throw new Exception("This coordinate is already taken");
        }

        grid[positions[0] - 1][positions[1] - 1] = currentChar;

        if (validateWinner()) return;

        if (validateFullGrid()) {
          System.out.println("It's a Draw");
          finished = true;
          return;
        }

        currentChar = (currentChar == 'X') ? 'O' : 'X';
        currentTurn = (currentTurn == 1) ? 2 : 1;
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }

  private int[] validateInput() throws Exception {
    String option = input.readLine().trim();
    
    if (option.equals("3")) {
        return new int[]{-1, -1}; // Special case for restart
    }

    // Validate with regex in order to know if first number is between 1 and 3
    // there is a comma after first number
    // If third character is between 1 and 3
    if (!option.matches("[1-3][,\\s][1-3]")) {
        throw new Exception("Invalid input format. Use row,col (e.g., 1,2)");
    }

    String[] parts = option.split("[,\\s]");
    return new int[]{Integer.parseInt(parts[0]), Integer.parseInt(parts[1])};
  }

  private void renderGrid() {
    for (int i = 0; i < grid.length; i++) {
        System.out.println("+---+---+---+");
        for (int j = 0; j < grid[i].length; j++) {
            System.out.printf("| %s ", grid[i][j]);
        }
        System.out.println("|");
    }
    System.out.println("+---+---+---+");
  }

  private boolean validateWinner() {
    for (int[] combo : WINNING_COMBINATIONS) {
        if (grid[combo[0]][combo[1]] != '-' && 
            grid[combo[0]][combo[1]] == grid[combo[2]][combo[3]] &&
            grid[combo[2]][combo[3]] == grid[combo[4]][combo[5]]) {
            System.out.printf("Player %d wins!\n", currentTurn);
            renderGrid();
            finished = true;
            return true;
        }
    }
    return false;
  }

  private boolean validateFullGrid() {
    for (char[] row : grid) {
        for (char cell : row) {
            if (cell == '-') return false;
        }
    }
    return true;
  }

  private void renderTurn() {
    System.out.printf("Is the player %d turn where does the %s goes \n", currentTurn, currentChar);
  }

  private void instructions() {
    System.out.println("""
        Players take turns entering coordinates (1-3) for row and column.
        Example: Player 1's turn => 1,3 places X in row 1, column 3.
        """);
  }
}
