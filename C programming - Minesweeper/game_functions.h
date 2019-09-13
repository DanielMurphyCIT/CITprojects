#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#ifndef GAME_FUNCTIONS_H_INCLUDED
#define GAME_FUNCTIONS_H_INCLUDED
#define DIM 4
#define UNKNOWN -1
#define BOMB -2

struct locations {
    int x;
    int y;
    bool found;
};
//void start_game(int bomb_location_info[][DIM], int size_of_grid, int players_info[][DIM], int no_of_bombs);
#endif
