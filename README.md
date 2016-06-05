# MiniJava Compiler
This is a real compiler that can translate the Minijava language into x86 Assembly language.
The compiler is written in Java. It is designed to run on Windows platform.
It should be able to run on windows XP/7/8/10.
To make it run, all you need to have is a java runtime environment.

The formal grammar definition of Minijava can be found at 
[the jtb file](eMiniJava/src/mini/minijava.jtb).


There are 3 folders in the project.
### Folder "eMiniJava"
The source code of the parser is located in the folder "eMiniJava".
The main function of the parser is in the folder named "eMiniJava/src/mini/test".
Most of the code regarding the translation from MiniJava to x86 Assembly is located in the folder
"eMiniJava/src/mini/compiler".
The parser is generated by the JTB, a tool for syntax tree builder.
The tool generated classes based on the Object-Oriented design of visitor pattern.
All auto-generated files are in the folder "eMiniJava/src/mini/syntaxtree" and "eMiniJava/src/mini/visitor".

### Folder "binMiniJava"
A runnable compiler is in the folder "binMiniJava", called "MiniJava.jar". The jar file is compiled from the source code in "eMiniJava". If you want to use MiniJava directly without compiling from source code, you can use "MiniJava.jar" to run some MiniJava codes.
In this "binMiniJava" folder, there are some other files, such as "nmake.exe". These files are from MASM32, the development kit of 32-bit Microsoft assembler. MiniJava translates the MiniJava code into x86 Assembly code. Then MASM32 compiles assembly code into exe file.
You can compile some MiniJava source codes for the purpose of testing.

In the folder "binMiniJava", the file "mul.java" is written by MiniJava to calculate factorial, for example, the 5!=5*4*3*2*1= is 120, 6!=6*5*4*3*2*1 is 720. To compile the "mul.java", run a command line, "cd" to the folder "binMiniJava", then run the compiler by the command:
```
>java -jar MiniJava.jar mul
```
At the same folder, you will get "mul.exe" and "mul.asm", the executable file and the assembly file, respectively.
Run "mul.exe", enter a number, it will output the factorial result of the number.
Open "mul.asm" file, you can check the generated assembly code by the compiler.

Moreover, there is a more interesting example. I use MiniJava language implemented a simple classical game, "Greedy Snake",
with graphic interface.
Check out the file "snake.java" to view the source code of MiniJava for the game. This game shows the powerful of the designed language. Not like other simple languages that were built for the study of compiler theory course, this one can accept keyboard event, and do some graphic rendering on the screen. I designed the language that can do some real things. To compile the snake game, run the command:
```
>java -jar MiniJava.jar snake
```
The generated assembly code is in the file "snake.asm".
The executable file is "snake.exe".
Run the "snake.exe" to play the game. There is a console window behind the game window to show the score you get from eating blocks.
Eating a flashing block can earn more score than a static block. If the snake touches itself, the game is over.

### Folder "minijavaRunTimeDll_Src"
This folder contains runtime dll of MiniJava language to support some system calls. The dll file is written by c language in Visual Studio. It gives a detailed implementation to support the I/O functions of MiniJava, such as getting keyboard states, creating a window, drawing on a screen, printing text, and thread wating.

### Contact
If you are interested in the project, please let me know by minicpp@gmail.com.

If you want to know more about other interesting projects, visit my website: http://handong.me . 
