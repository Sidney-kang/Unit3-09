# Created by : Sidney Kang
# Created on : 23 Oct. 2017
# Created for : ICS3UR
# Daily Assignment - Unit3-09
# This program displays a nested loop program that prints capital letters
#   from A - Z and lower case

for code in range(65,91):
    for code_2 in range(97,123):     
           print(str(unichr(code)) + " => " + str(unichr(code_2)))
