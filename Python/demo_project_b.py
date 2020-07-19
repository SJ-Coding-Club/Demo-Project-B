'''
Demo Project B - Weather and Conditionals
Made by Jack Donofrio
3:25 PM July 18 2020
'''

# given temp in celsius, returns kelvin
# K = C + 273.15
def celsius_to_kelvin(temperature_in_celsius):
    return 0.0

# given temp in F, returns C
# c = (5 / 9) * (F - 32)
def fahrenheit_to_celsius(temperature_in_fahrenheit):
    return 0.0


# given temp in C, returns F
# F = (9 / 5) * C + 32
def celsius_to_fahrenheit(temperature_in_celsius):
    return 0.0

# Return the absolute difference between two temperatures
# Basically find |x - y|
# Hint: abs(number) returns absolute value of 'number'
def difference_in_temperatures(mondayTemperature, tuesdayTemperature):
    return 0.0


# Return the average temperature, given the temperature of each day
# average = (sum of values) / (number of values)
def average_temperature(mon, tue, wed, thurs, fri, sat, sun):
    return 0.0

# Given three temperatures, return the highest
# You can use if/else, or you can use max()
# max(a,b) returns the greater value
# max(a, max(b, c)) returns the greatest of three values
def high_temperature(mon, tue, wed):
    return 0.0

# Returns whether water can freeze at this temperature
# Hint: water freezes at 0 celsius and below, but the given temp is in Fahrenheit
# Either hard-code the conversion in, or simply use the converter function you wrote before
def water_can_freeze(temperature_in_fahrenheit):
    return False

# Returns whether water boils at this temperature
# Hint: Water boils at 100 C and higher
# Use the conversion function you wrote to change F to C here.
def water_can_boil(temperature_in_fahrenheit):
    return False




## Tests ##

def celsius_to_kelvin_test():
    assert(celsius_to_kelvin(0) == 273.15)
    assert(celsius_to_kelvin(15) == 288.15)
    assert(celsius_to_kelvin(-15.4) == 257.75)

def celsius_to_fahrenheit_test():
    assert(celsius_to_fahrenheit(0) == 32)
    assert(celsius_to_fahrenheit(15) == 59)
    assert(celsius_to_fahrenheit(-11) == 12.2)

def fahrenheit_to_celsius_test():
    assert(fahrenheit_to_celsius(32) == 0)
    assert(int(fahrenheit_to_celsius(121) * 100) / 100.0 == 49.44)
    assert(int(fahrenheit_to_celsius(10.5) * 100) / 100.0 == -11.94)

def difference_in_temperatures_test():
    assert(difference_in_temperatures(50, 100) == 50)
    assert(difference_in_temperatures(125.2, 1200.4) == 1075.2)
    assert(difference_in_temperatures(64, 95.22) == 31.22)

def high_temperature_test():
    assert(high_temperature(45.6, 62.24, 79) == 79)
    assert(high_temperature(24.76, 96.3, 66.1) == 96.3)
    assert(high_temperature(21.6, 20.4, 10.23) == 21.6)

def water_can_freeze_test():
    assert(water_can_freeze(32) == True)
    assert(water_can_freeze(32.9) == False)
    assert(water_can_freeze(20.1) ==  True)

def water_can_boil_test(): # input is in F
    assert(water_can_boil(100) == False)
    assert(water_can_boil(215) == True)
    assert(water_can_boil(300) == True)

def average_test():
    assert(int(average_temperature(97.2, 94.3, 90.1, 84.3, 80.1, 90.5, 87.7) * 1000) / 1000.0 == 89.171)
    assert(int(average_temperature(44.2, 52.1, 33.7, 42.1, 31.4, 46.3, 28.2) * 1000) / 1000.0 == 39.714)

try:
    celsius_to_kelvin_test()
    print("Passed Celsius to Kelvin")
except:
    print("Failed Celsius to Kelvin")

try:
    celsius_to_fahrenheit_test()
    print("Passed Celsius to Fahrenheit")
except:
    print("Failed Celsius to Fahrenheit")

try:
    fahrenheit_to_celsius_test()
    print("Passed Fahrenheit to Celsius")
except:
    print("Failed Fahrenheit to Celsius")

try:
    difference_in_temperatures_test()
    print("Passed Difference in Temperatures")
except:
    print("Failed Difference in Temperatures")

try:
    high_temperature_test()
    print("Passed High Temperature")
except:
    print("Failed High Temperature")

try:
    water_can_freeze_test()
    print("Passed Water Can Freeze")
except:
    print("Failed Water Can Freeze")

try:
    water_can_boil_test()
    print("Passed Water Can Boil")
except:
    print("Failed Water Can Boil")

try:
    average_test()
    print("Passed Average")
except:
    print("Failed Average")