#include <stdio.h>

#include <fstream>
#include <iostream>

class Test {
   public:
    Test(int s) : {};

   private:
};

void tst(int a) { printf("tst\n"); }

int main()
{
    if (true) {
        printf("testout\n");
    }
    else {
        printf("else out\n");
    }
    printf("what?");
}
