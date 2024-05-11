d = {
    "Name": "Manas",
    "Age": 11,
    "Birth-Date": "27/2/2024"
}

print (d["Name"])
print (d.get("Age"))
print (d.keys())

for key in d.keys():
    print (f"{key}:", d[key])

print (d.items())

for key, value in d.items():
    print (f"{key}: {value}")

d.update({"Addreas": "Varangaon"})
print (d)
# del d['Name'] => removes k and v of given k
# del d, d.clear() => removes entire dictonary
print (d.pop("Name"))