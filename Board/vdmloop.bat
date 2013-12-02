@echo off
rem Runs a collection of VDM++ test examples
rem Assumes specification is in Word RTF files

set S5=../Coord/Coord.rtf
set S0=../Piece/Piece.rtf
set S1=../Player/Player.rtf
set S2=Board.rtf
set S3=TestBoard.rtf

"C:\Program Files\The VDM++ Toolbox v9.0.2\bin\vppde" -p -R vdm.tc %S5% %S0% %S1% %S2% %S3%
for /R %%f in (*.arg) do call vdmtest "%%f"
