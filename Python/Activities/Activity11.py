fruit_shop = {
    "grape": 10,
    "mango": 15,
    "orange": 8,
    "apple": 15}
key_to_check = input("What are you looking for? ")
if(key_to_check in fruit_shop):
    print("Yes, fruit is available")
else:
    print("No, fruit is not available") 