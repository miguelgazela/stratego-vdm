@echo off
rem Runs a collection of VDM++ test examples
rem Assumes specification is in Word RTF files

set S0=../Coord/Coord.rtf
set S1=../Piece/Piece.rtf
set S2=../Player/Player.rtf
set S3=../Board/Board.rtf
set S4=Stratego.rtf
set S5=TestStratego.rtf

"C:\Program Files\The VDM++ Toolbox v9.0.2\bin\vppde" -p -R vdm.tc %S0% %S1% %S2% %S3% %S4% %S5%
for /R %%f in (*.arg) do call vdmtest "%%f"
