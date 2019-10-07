import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;



public final class TrueGrid extends JFrame {

    public static int ROWS = 75;
    public static int COLS = 75;


    public static int cellSize = 15; 
    public static int canvasWidth = cellSize * COLS + (ROWS *4) ;
    public static int canvasHeight = cellSize * ROWS ; 
    public static int gridWidth = 1; 
    public static int halfGridWidth = gridWidth / 2;

    public static int cellPadding = cellSize / 5;
    public static int symbolSize = cellSize - cellPadding * 2; 
    public static int symbolStrokeWidth = 3; 
    private boolean ColumnPals;

    public enum GameState{
        ACTIVE, DRAW, RED_CIRCLE_WINS, BLUE_CIRCLE_WINS
    }

    private GameState actualState;

    public enum Token{
        VIDE, RED_CIRCLE, BLUE_CIRCLE
    }

    private Token actualPlayer;

    private Token[][] board;
    private final DrawCanvas canvas; 
    private JLabel statusBar; 
   

    public TrueGrid(){

        canvas = new DrawCanvas(); 
        canvas.setPreferredSize(new Dimension(canvasWidth, canvasHeight));


        canvas.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) { 
        int x = e.getX();
        int y = e.getY();

        int selectedRow = y / cellSize;
        int selectedCol;
            selectedCol = x / cellSize;


        if(actualState == GameState.ACTIVE){
            if(selectedRow >= 0 && selectedRow < ROWS && selectedCol >= 0
                    && selectedCol < COLS &&
                    board[selectedRow][selectedCol] == Token.VIDE){
                board[selectedRow][selectedCol] = actualPlayer; 
                updateGame(actualPlayer, selectedRow, selectedCol); 
                actualPlayer = (actualPlayer == Token.BLUE_CIRCLE)? Token.RED_CIRCLE : Token.BLUE_CIRCLE;

                neighbors(selectedRow, selectedCol);
            }
        } else { 
            initGame(); 
        }

        repaint();
    }

  });

    statusBar = new JLabel("  ");
    statusBar.setFont(new Font(Font.DIALOG_INPUT, Font.ITALIC, 15));
    statusBar.setBorder(BorderFactory.createEmptyBorder(2, 5, 4, 5));

    Container cp = getContentPane();
    cp.setLayout(new BorderLayout());
    cp.add(canvas, BorderLayout.EAST);
    cp.add(statusBar, BorderLayout.NORTH);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack(); 
    setTitle("Noah's Grid Experiment");
    setVisible(true); 

    board = new Token[ROWS][COLS]; 
    initGame();   
}

    public void initGame(){
        for(int line = 0; line < ROWS; ++line){
            for(int column = 0; column < COLS; ++column){
                board[line][column] = Token.VIDE; 
            }
        }
        actualState = GameState.ACTIVE;
        actualPlayer = Token.RED_CIRCLE;
    }

    public void updateGame(Token theSeed, int lineSelection, int columnSelection) {
      if (aGagne(theSeed, lineSelection,columnSelection)) {  
         actualState= (theSeed == Token.RED_CIRCLE) ? GameState.RED_CIRCLE_WINS : GameState.BLUE_CIRCLE_WINS;
      } else if (isDraw()) { 
         actualState = GameState.BLUE_CIRCLE_WINS;       
      }

   }
 public boolean isDraw() {
      return false; 
   }

   public boolean aGagne(Token token, int lineSelection, int columnSelection) {
      return false; 

}


   public void neighbors(int  row, int col) {
           
   System.out.println("10 Column members of "+ col + " " + row + " are: ");
       
   for (int rowNum = row - 1 ; rowNum <= (row + 1) ; rowNum +=1  ) {
       
        for (int colNum = col - 1 ; colNum <= (col + 0) ; colNum +=1){

            if(!((colNum == col) && (rowNum == row))) {

                if(withinGrid (rowNum, colNum ) /*&& ColumnPals(colNum, rowNum,row, col))*/){
                   
                    
                    if(colNum == col&& rowNum > row){
                        
                        
                        for(int x = 0; x<10; x++){
                            
                        
                        System.out.println("                     "+ colNum +" " + rowNum );
                        rowNum++;
                       
                    }
                }
            }
        }
    }
}
   }

private boolean withinGrid(int colNum, int rowNum) {

    if((colNum < 0) || (rowNum <0) ) {
        return false;
    }
    if((colNum >= COLS) || (rowNum >= ROWS)) {
        return false;
    }
    return true;
}

class DrawCanvas extends JPanel{

        @Override
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            setBackground(Color.WHITE); 


            g.setColor(Color.BLACK);
            for(int line = 1; line < ROWS; ++line){
                g.fillRoundRect(0, cellSize * line - halfGridWidth, canvasWidth - 1,
                        gridWidth, gridWidth, gridWidth);
            }
            for(int column = 1; column < COLS; ++column){
                g.fillRoundRect(cellSize * column - halfGridWidth, 0
                        , gridWidth, canvasHeight - 1,
                        gridWidth, gridWidth);
            }


            Graphics2D g2d = (Graphics2D)g;
            g2d.setStroke(new BasicStroke(symbolStrokeWidth,
                    BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND)); 
            for(int line = 0; line < ROWS; ++line){
                for(int column = 0; column < COLS; ++column){
                    int x1 = column * cellSize + cellPadding;
                    int y1 = line * cellSize + cellPadding;

                    if(board[line][column] == Token.RED_CIRCLE){
                        g2d.setColor(Color.RED);
                        g2d.drawOval(x1, y1, symbolSize, symbolSize);
                        g2d.fillOval(x1, y1, symbolSize, symbolSize);
                    } else
                        if(board[line][column] == Token.BLUE_CIRCLE){
                            int x2 = column * cellSize + cellPadding;
                            g2d.setColor(Color.BLUE);
                            g2d.drawOval(x1, y1, symbolSize, symbolSize);
                            g2d.fillOval(x2, y1, symbolSize, symbolSize);
                        }
                }

            }
        }
       
private boolean ColumnPals(int colNum, int rowNum, int row, int col){
    
    int rowplus = row+1;
     if((colNum == col) && (rowplus == rowNum) ) {
        return true;
    }      
   
     return false;
}
}

    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            TrueGrid pha = new TrueGrid();
        });
    }
}
