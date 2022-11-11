import pandas

dataframe=pandas.read_csv("sample.csv")
print("File data:")
print(dataframe)
	
# Print the values in the Usernames column only
print("==================================")
print("Usernames: ")
print(dataframe["Usernames"])

# Print the username and password of the second row
print("==================================")
print("2nd row: ")
print("Username: ", dataframe["Usernames"][1], " | ", "Password: ", dataframe["Passwords"][1])
	
	
#Sort the Usernames column in ascending order
	
print("====================================")
print("Data sorted in ascending order")
print(dataframe.sort_values("Usernames"))

#Sort the Passwords column in descending order and print data
print("====================================")
print("Data Sorted in descending order")
print(dataframe.sort_values("Passwords",ascending=False))