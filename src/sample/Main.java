package sample;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    static int[] getrule(int x)
    {
        int[] tab = new int[8];
        int i;
        System.out.println(tab.length);
        for(i = 0; i<tab.length; i++)
        {
            tab [i] = x%2;
            x = x/2;
            System.out.print(tab[i]+" ");
        }
        System.out.println();
        return tab;
    }
     static int[][] initialize_maintab( double width, double  length)
    {

        int x = (int) (width/20);
        int y = (int) (length/20);
        int[][] maintab = new int[x][y];

        int i, j;
        for(i = 0; i<maintab.length; i++)
        {
            for(j = 0; j<maintab[0].length; j++)
            {
                if(i ==0 && j ==y/2)
                {
                    maintab[i][j] = 1;
                }
                else {
                    maintab[i][j] = 0;
                }
            }
        }
        return maintab;
    }
    static void bigfunction(int[] tab, int[][] maintab, GraphicsContext graphicsContext, Canvas canvas, boolean periodic) {
        graphicsContext.clearRect(0, 0, canvas.getWidth(), canvas.getWidth());
        graphicsContext.setFill(Color.BLUE);
        graphicsContext.setStroke(Color.BLACK);
        int[] tab1 = {1, 1, 1, tab[7]};
        int[] tab2 = {1, 1, 0, tab[6]};
        int[] tab3 = {1, 0, 1, tab[5]};
        int[] tab4 = {1, 0, 0, tab[4]};
        int[] tab5 = {0, 1, 1, tab[3]};
        int[] tab6 = {0, 1, 0, tab[2]};
        int[] tab7 = {0, 0, 1, tab[1]};
        int[] tab8 = {0, 0, 0, tab[0]};
        int i, j, b, d, c;
        if(periodic) {
            for (i = 0; i < maintab.length; i++) {
                for (j = 0; j < maintab[0].length; j++) {

                    b = j - 1;
                    if (b < 0) {
                        b = maintab[0].length - 1;
                    }
                    d = j + 1;
                    if (d > maintab[0].length - 1) {
                        d = 0;
                    }
                    c = i + 1;
                    if (c > maintab.length - 1) {
                        break;
                    }

                    if (maintab[i][b] == tab1[0] && maintab[i][j] == tab1[1] && maintab[i][d] == tab1[2]) {
                        maintab[c][j] = tab1[3];
                    } else if (maintab[i][b] == tab2[0] && maintab[i][j] == tab2[1] && maintab[i][d] == tab2[2]) {
                        maintab[c][j] = tab2[3];
                    } else if (maintab[i][b] == tab3[0] && maintab[i][j] == tab3[1] && maintab[i][d] == tab3[2]) {
                        maintab[c][j] = tab3[3];
                    } else if (maintab[i][b] == tab4[0] && maintab[i][j] == tab4[1] && maintab[i][d] == tab4[2]) {
                        maintab[c][j] = tab4[3];
                    } else if (maintab[i][b] == tab5[0] && maintab[i][j] == tab5[1] && maintab[i][d] == tab5[2]) {
                        maintab[c][j] = tab5[3];
                    } else if (maintab[i][b] == tab6[0] && maintab[i][j] == tab6[1] && maintab[i][d] == tab6[2]) {
                        maintab[c][j] = tab6[3];
                    } else if (maintab[i][b] == tab7[0] && maintab[i][j] == tab7[1] && maintab[i][d] == tab7[2]) {
                        maintab[c][j] = tab7[3];
                    } else if (maintab[i][b] == tab8[0] && maintab[i][j] == tab8[1] && maintab[i][d] == tab8[2]) {
                        maintab[c][j] = tab8[3];
                    }


                    System.out.print(maintab[i][j] + " ");
                    if (maintab[i][j] == 1) {
                        graphicsContext.fillRect(j * 20, i * 20, 20, 20);
                        graphicsContext.strokeRect(j * 20, i * 20, 20, 20);
                    } else if (maintab[i][j] == 0) {
                        graphicsContext.strokeRect(j * 20, i * 20, 20, 20);
                    }

                }
                System.out.println();
            }
        }
        else
            for (i = 0; i < maintab.length; i++) {
                for (j = 0; j < maintab[0].length; j++) {
                    if(j!=0 && j!=maintab[0].length-1) {

                        b = j - 1;
                        if (b < 0) {
                            b = 0;
                            maintab[i][b] = 1;
                        }
                        d = j + 1;
                        if (d > maintab[0].length - 1) {
                            maintab[i][d] = 1;
                        }
                        c = i + 1;
                        if (c > maintab.length - 1) {
                            break;
                        }

                        if (maintab[i][b] == tab1[0] && maintab[i][j] == tab1[1] && maintab[i][d] == tab1[2]) {
                            maintab[c][j] = tab1[3];
                        } else if (maintab[i][b] == tab2[0] && maintab[i][j] == tab2[1] && maintab[i][d] == tab2[2]) {
                            maintab[c][j] = tab2[3];
                        } else if (maintab[i][b] == tab3[0] && maintab[i][j] == tab3[1] && maintab[i][d] == tab3[2]) {
                            maintab[c][j] = tab3[3];
                        } else if (maintab[i][b] == tab4[0] && maintab[i][j] == tab4[1] && maintab[i][d] == tab4[2]) {
                            maintab[c][j] = tab4[3];
                        } else if (maintab[i][b] == tab5[0] && maintab[i][j] == tab5[1] && maintab[i][d] == tab5[2]) {
                            maintab[c][j] = tab5[3];
                        } else if (maintab[i][b] == tab6[0] && maintab[i][j] == tab6[1] && maintab[i][d] == tab6[2]) {
                            maintab[c][j] = tab6[3];
                        } else if (maintab[i][b] == tab7[0] && maintab[i][j] == tab7[1] && maintab[i][d] == tab7[2]) {
                            maintab[c][j] = tab7[3];
                        } else if (maintab[i][b] == tab8[0] && maintab[i][j] == tab8[1] && maintab[i][d] == tab8[2]) {
                            maintab[c][j] = tab8[3];
                        }
                    }
                        else if(j==0)
                        {
                            d = j + 1;
                            if (d > maintab[0].length - 1) {
                                maintab[i][d] = 1;
                            }
                            c = i + 1;
                            if (c > maintab.length - 1) {
                                break;
                            }
                            if (1 == tab1[0] && maintab[i][j] == tab1[1] && maintab[i][d] == tab1[2]) {
                                maintab[c][j] = tab1[3];
                            } else if (1 == tab2[0] && maintab[i][j] == tab2[1] && maintab[i][d] == tab2[2]) {
                                maintab[c][j] = tab2[3];
                            } else if (1 == tab3[0] && maintab[i][j] == tab3[1] && maintab[i][d] == tab3[2]) {
                                maintab[c][j] = tab3[3];
                            } else if (1 == tab4[0] && maintab[i][j] == tab4[1] && maintab[i][d] == tab4[2]) {
                                maintab[c][j] = tab4[3];
                            } else if (1 == tab5[0] && maintab[i][j] == tab5[1] && maintab[i][d] == tab5[2]) {
                                maintab[c][j] = tab5[3];
                            } else if (1 == tab6[0] && maintab[i][j] == tab6[1] && maintab[i][d] == tab6[2]) {
                                maintab[c][j] = tab6[3];
                            } else if (1 == tab7[0] && maintab[i][j] == tab7[1] && maintab[i][d] == tab7[2]) {
                                maintab[c][j] = tab7[3];
                            } else if (1 == tab8[0] && maintab[i][j] == tab8[1] && maintab[i][d] == tab8[2]) {
                                maintab[c][j] = tab8[3];
                            }

                        }
                        else if(j == maintab[0].length-1)
                    {
                        b = j - 1;
                        if (b < 0) {
                            b = 0;
                            maintab[i][b] = 1;
                        }
                        c = i + 1;
                        if (c > maintab.length - 1) {
                            break;
                        }
                        if (maintab[i][b] == tab1[0] && maintab[i][j] == tab1[1] && 1 == tab1[2]) {
                            maintab[c][j] = tab1[3];
                        } else if (maintab[i][b] == tab2[0] && maintab[i][j] == tab2[1] && 1 == tab2[2]) {
                            maintab[c][j] = tab2[3];
                        } else if (maintab[i][b] == tab3[0] && maintab[i][j] == tab3[1] && 1 == tab3[2]) {
                            maintab[c][j] = tab3[3];
                        } else if (maintab[i][b] == tab4[0] && maintab[i][j] == tab4[1] && 1 == tab4[2]) {
                            maintab[c][j] = tab4[3];
                        } else if (maintab[i][b] == tab5[0] && maintab[i][j] == tab5[1] && 1== tab5[2]) {
                            maintab[c][j] = tab5[3];
                        } else if (maintab[i][b] == tab6[0] && maintab[i][j] == tab6[1] && 1 == tab6[2]) {
                            maintab[c][j] = tab6[3];
                        } else if (maintab[i][b] == tab7[0] && maintab[i][j] == tab7[1] && 1== tab7[2]) {
                            maintab[c][j] = tab7[3];
                        } else if (maintab[i][b] == tab8[0] && maintab[i][j] == tab8[1] && 1 == tab8[2]) {
                            maintab[c][j] = tab8[3];
                        }
                    }


                    System.out.print(maintab[i][j] + " ");
                    if (maintab[i][j] == 1) {
                        graphicsContext.fillRect(j * 20, i * 20, 20, 20);
                        graphicsContext.strokeRect(j * 20, i * 20, 20, 20);
                    } else if (maintab[i][j] == 0) {
                        graphicsContext.strokeRect(j * 20, i * 20, 20, 20);
                    }

                }
                System.out.println();
            }
    }

    static void rescale_mesh(Canvas canvas, int width, int height, GraphicsContext graphicsContext)
    {
        System.out.println(width);
        System.out.println(height);
        canvas.setWidth(width);
        canvas.setHeight(height);
        graphicsContext.setFill(Color.LIGHTBLUE);
        graphicsContext.fillRect(0,0,width, height);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene GUI = new Scene(root);
        primaryStage.setTitle("Cellular Automata");
        primaryStage.setScene(GUI);
        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
