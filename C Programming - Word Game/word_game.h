#ifndef WORD_GAME_H_INCLUDED
#define WORD_GAME_H_INCLUDED

void display_game_state(char* pCurrent_letters, const int NUMBER_OF_LETTERS,
                        const int cursor_position, const int number_of_letter_changes,char* pTarget_letters);

void move_cursor_right(int* pPosition_of_cursor, const int max);

void move_cursor_left(int* pPosition_of_cursor);

void change_letter(char* pLetters, int position, char new_letter, int max);

bool compare_letters(char* pCurrent_letters, char* pTarget_letters, int size_of_array);
#endif // WORD_GAME_H_INCLUDED
