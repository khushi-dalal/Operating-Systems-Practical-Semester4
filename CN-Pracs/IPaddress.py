ip = str(input("Enter your IP Address: "))
print("IP Address: " + ip)

if(ip[0:3].count('.')==1):
    x=int(ip[0:1])
elif(ip[0:3].count('.')==2):
    x=int(ip[0:2])
else:
    x = int(ip[0:3])
ip_subnet = "Reserved Class"

if x < 128:
    ip_class = "A"
    ip_subnet = "255.0.0.0"
elif x < 192:
    ip_class = "B"
    ip_subnet = "255.255.0.0"
elif x < 224:
    ip_class = "C"
    ip_subnet = "255.255.255.0"
elif x < 239:
    ip_class = "D"
else:
    ip_class = "E"

print("Class: " + ip_class)
print("Subnet Mask: " + ip_subnet)

val1= ip.split('.')
val2= ip_subnet.split('.')

x = str(int(val1[0]) & int(val2[0])) + '.' + str(int(val1[1]) & int(val2[1])) + '.' + str(int(val1[2]) & int(val2[2])) + '.' + str(int(val1[3]) & int(val2[3]))
print("Network Identifier: " + x)

broadcast_address = str(int(val1[0]) | (255 - int(val2[0]))) + '.' + str(int(val1[1]) | (255 - int(val2[1]))) + '.' + str(int(val1[2]) | (255 - int(val2[2]))) + '.' + str(int(val1[3]) | (255 - int(val2[3])))
print('Broadcast Address: ' + broadcast_address)
