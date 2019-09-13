#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include "word_game.h"
int main()
{
char current_letters[] = {'b', 'e', 'l', 'l'};
char target_letters[] = {'c', 'o', 'a', 't'};

int position_of_cursor = 0;
const int NUMBER_OF_LETTERS = 4;
bool game_finished = false;
start_game(current_letters, target_letters, NUMBER_OF_LETTERS);
//display_game_state (current_letters,NUMBER_OF_LETTERS, position_of_cursor, number_of_letter_changes, target_letters);
//compare_letters(current_letters, target_letters, NUMBER_OF_LETTERS);
//move_cursor_right( &position_of_cursor, NUMBER_OF_LETTERS);
//move_cursor_right( &position_of_cursor, NUMBER_OF_LETTERS);
//move_cursor_left( &position_of_cursor);
//change_letter(current_letters,position_of_cursor,target_letters[position_of_cursor],NUMBER_OF_LETTERS);
//printf("\n");
//display_game_state (current_letters, NUMBER_OF_LETTERS, position_of_cursor, number_of_letter_changes, target_letters);
return 0;
}
void start_game(char * pCurrent,  char* pTarget, const int size_of_word)
    {
        int position_of_cursor = 0;
        bool game_finished = false;
        int number_of_letter_changes = 0;

        while(game_finished == false){
            display_game_state (pCurrent, size_of_word, position_of_cursor,number_of_letter_changes, pTarget);
            printf("\n");
            char move = getchar();
            const int MAX_GUESSES = 8;
            getchar();
            if (move == 60){
                move_cursor_left(&position_of_cursor);
            }
            else if(move == 62){
                move_cursor_right(&position_of_cursor, size_of_word);
            }
            else
            {
                char new_letter = move;
                change_letter(pCurrent, position_of_cursor, new_letter, size_of_word);
                number_of_letter_changes++;

            }
            game_finished = (compare_letters(pCurrent, pTarget, size_of_word) | (number_of_letter_changes == MAX_GUESSES));
        }
    }
