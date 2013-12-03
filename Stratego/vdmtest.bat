@echo off
rem Tests the date book specification for one test case (argument)
rem -- Output the argument to stdout (for redirect) and "con" (for user feedback)
echo VDM Test: '%1' > con
echo VDM Test: '%1'

rem short names for specification files in Word RTF Format
set S0=../Coord/Coord.rtf
set S1=../Piece/Piece.rtf
set S2=../Player/Player.rtf
set S3=../Board/Board.rtf
set S4=Stratego.rtf
set S5=TestStratego.rtf

rem -- Calls the interpreter for this test case
"C:\Program Files\The VDM++ Toolbox v9.0.2\bin\vppde" -i -D -I -P -Q -R vdm.tc -O %1.res %1 %S0% %S1% %S2% %S3% %S4% %S5%

rem -- Check for difference between result of execution and expected result.
if EXIST %1.exp fc /w %1.res %1.exp

:end
