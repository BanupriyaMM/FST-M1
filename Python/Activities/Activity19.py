import pandas

from pandas import ExcelFile
from pandas import ExcelWriter

	
# Create a dictionary that will be used to create the DataFrame
data={
    "FirstName":["user1","user2","user3"],
    "LastName":["test1","test2", "test3"],
    "Email":["usrtest1@example.com","usrtest2@example.com","usrtest3@example.com"],
    "PhoneNumber":["9876789898","8989876567","8981231234"]
}

# Create the DataFrame that will be written to the excel file
dataframe = pandas.DataFrame(data)

	
# Print the dataframe
print(dataframe)

# Write the dataframe to a Excel file
writer = ExcelWriter('sample.xlsx')
dataframe.to_excel(writer, 'Sheet1', index = False)

# Commit data to the Excel file
writer.save()