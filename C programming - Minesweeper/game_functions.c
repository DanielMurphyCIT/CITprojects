//Daniel Murphy
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include "game_functions.h"
void display(int known_location_info[][DIM], int size)
{
int i;
int j;
    for(i =0;i<size;i++){
        for(j = 0;j<size;j++){


                if (known_location_info[i][j] == -1)
                {
                    printf("*");
                }
                else if(known_location_info[i][j] == -2)
                {
                    printf("B");
                }
                else
                {
                    printf("%d",known_location_info[i][j]);
                }
                if (j == 3)
                {
                    printf("\n");
                }

        }
    }

}
void info_copy(int bomb_location_info[][DIM],int known_location_info[][DIM],int row, int column)
{
    known_location_info[row][column] = bomb_location_info[row][column];
}
int get_user_char(letter)
{

    int  id =  letter - 'A';
    return id;

}
void check_found(int row, int col, struct locations bombs[], int size, bool* phase)
{
int i;
    for (i = 0; i < 2; i++) {
        if (bombs[i].x == row) {
            if (bombs[i].y == col) {
                    if(phase == true)
                    {
                    printf("Game Over");
                    exit(0);
                    }
                    else
                    {
                      printf("\nYou successfully identified a bomb\n");
                    }

            }
        else if (phase == false)
        {
           printf("Game Over");
                    exit(0);
        }
        }

    }
}
void start_game(struct locations* bombs,int bomb_location_info[][DIM], int size, int known_location_info[][DIM], int no_of_bombs)
{
 enum game_status { STILL_ALIVE, GAME_OVER};
 enum game_status status = STILL_ALIVE;
 int i;
 bool* check = true;
    for (i = 0; i < 1; i++)
    {

        if (status == STILL_ALIVE)
        {
            display(known_location_info,size);

            printf("Enter row: ");
            char row_input = getchar();
            int row = get_user_char(toupper(row_input));
            getchar();

            printf("\n");

            printf("Enter column: ");
            char column_input = getchar();
            int column = get_user_char(toupper(column_input));
            getchar();

            printf("\n");


            check_found(row,column,bombs,size,check);

            info_copy(bomb_location_info,known_location_info,row,column);

            printf("\n");
        }

    }
    check = false;
    printf("\nPhase 2\n");
    int k;
    for(k =0; k<2; k++)
    {
     printf("\nPlease input bomb location\n");
     printf("\n\nEnter row: ");
     char row_input = getchar();
     int row = get_user_char(toupper(row_input));
     getchar();

     printf("\n");

     printf("Enter column: ");
     char column_input = getchar();
     int column = get_user_char(toupper(column_input));
     getchar();
     printf("\n");
     check_found(row,column,bombs,size,check);

     known_location_info[row][column] = -2;
     display(known_location_info,size);
     if(k == 1)
     {
         status = GAME_OVER;
         printf("\nWinner\n");
         display(known_location_info,size);
         exit(0);
     }
    }

}
