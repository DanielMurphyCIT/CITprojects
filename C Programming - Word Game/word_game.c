#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
void display_game_state(char* pCurrent_letters,const int NUMBER_OF_LETTERS,
                        const int cursor_position, const int number_of_letter_changes, char* pTarget_letters)
{
 	printf("---Game State ---\n");
 	const char DASH = '-';
    const char SPACE = ' ' ;

 	int i;
 	printf("Target:");
    for(i=0;i<NUMBER_OF_LETTERS;i++){
        printf("%c",*pTarget_letters);
        pTarget_letters++;
    }
    printf("\n");
    for(i=0;i<NUMBER_OF_LETTERS;i++){
        printf("%c",*pCurrent_letters);
        pCurrent_letters++;
    }
    printf("\n");
    for(i=0;i<cursor_position;i++){
        printf("%c",SPACE);}
    printf("%c",DASH);

    printf("\nNumber of changes: %d",number_of_letter_changes);
 	//printf ("%p\n", pCurrent_letters);
 	//printf ("%c\n", *pCurrent_letters);
 	//pCurrent_letters = pCurrent_letters + 1;
    //printf ("%c\n", *pCurrent_letters);


}

void move_cursor_right(int* pPosition_of_cursor, const int max)
{
 if (*pPosition_of_cursor < (max - 1)){
    *pPosition_of_cursor = *pPosition_of_cursor + 1;
 }
 else{
    printf("\nCan no longer go right\n");
 }
}

void move_cursor_left(int* pPosition_of_cursor)
{
  if (*pPosition_of_cursor > 0){
    *pPosition_of_cursor = *pPosition_of_cursor - 1;
 }
  else{
     printf("\nCan no longer go left\n");
    }
}
void change_letter(char* pLetters, int position, char new_letter, int max)
{
 char* plocation_of_letter_to_change = pLetters + position;
 *plocation_of_letter_to_change = new_letter;

}
bool compare_letters(char* pCurrent_letters, char* pTarget_letters, int size)
{
        printf("\nCompare Letters \n");
    int i = 0;
    int matchLetter = 0;
    bool check = true;
    while(i < size){
        printf("%c %c\n",*pCurrent_letters, *pTarget_letters);
        if(*pCurrent_letters != *pTarget_letters)
            check = false;
        else
            matchLetter ++;
            pCurrent_letters++;
            pTarget_letters++;
            i++;
    }
    printf("\nYou've matched %d letters", matchLetter);
    return check;
}
